package com.databaes.civilens.detect.service;

import com.databaes.civilens.common.exception.UpstreamServiceException;
import com.databaes.civilens.detect.dto.DetectResponse;
import com.databaes.civilens.persona.model.Persona;
import com.databaes.civilens.scheme.model.Scheme;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestClientResponseException;

import java.util.Collections;
import java.util.List;

@Service
public class DetectServiceImpl implements DetectService {

    private static final ParameterizedTypeReference<DetectResponse> DETECT_RESPONSE_TYPE = new ParameterizedTypeReference<>() {
    };

    private final RestClient restClient;
    private final String detectEndpoint;

    public DetectServiceImpl(RestClient restClient,
            @Value("${external.detect.endpoint:/detect}") String detectEndpoint) {
        this.restClient = restClient;
        this.detectEndpoint = detectEndpoint;
    }

    @Override
    public DetectResponse detectSchemes(Persona persona) {
        try {
            DetectResponse detectResponse = restClient.post()
                    .uri(detectEndpoint)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(persona)
                    .retrieve()
                    .body(DETECT_RESPONSE_TYPE);

            return normalizeResponse(detectResponse);
        } catch (RestClientResponseException ex) {
            throw new UpstreamServiceException(
                    "External detect API returned status " + ex.getStatusCode().value(), ex);
        } catch (RestClientException ex) {
            throw new UpstreamServiceException("Failed to reach external detect API", ex);
        }
    }

    private DetectResponse normalizeResponse(DetectResponse detectResponse) {
        DetectResponse response = detectResponse == null ? new DetectResponse() : detectResponse;
        List<Scheme> schemes = response.getSchemes() == null ? Collections.emptyList() : response.getSchemes();

        response.setSchemes(schemes);
        response.setCount(response.getCount() > 0 ? response.getCount() : schemes.size());
        return response;
    }
}
