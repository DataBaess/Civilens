package com.databaes.civilens.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestClient;

@Configuration
public class DetectClientConfig {

    @Bean
    RestClient.Builder restClientBuilder() {
        return RestClient.builder();
    }

    @Bean
    RestClient detectRestClient(RestClient.Builder builder,
                                @Value("${external.detect.base-url}") String detectBaseUrl,
                                @Value("${external.detect.connect-timeout-ms:3000}") int connectTimeoutMs,
                                @Value("${external.detect.read-timeout-ms:8000}") int readTimeoutMs) {

        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(connectTimeoutMs);
        requestFactory.setReadTimeout(readTimeoutMs);

        return builder
                .baseUrl(detectBaseUrl)
                .requestFactory(requestFactory)
                .build();
    }
}
