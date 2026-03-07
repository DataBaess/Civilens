package com.databaes.civilens.detect.controller;

import com.databaes.civilens.detect.dto.DetectResponse;
import com.databaes.civilens.detect.service.DetectService;
import com.databaes.civilens.persona.model.Persona;
import io.github.sathwikhbhat.apiexecutiontracker.annotation.TrackExecutionTime;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@TrackExecutionTime
@RestController
@Tag(name = "Scheme Detection", description = "APIs for detecting eligible schemes from an external engine")
public class DetectController {

    private final DetectService detectService;

    public DetectController(DetectService detectService) {
        this.detectService = detectService;
    }

    @PostMapping("/detect")
    @Operation(summary = "Detect schemes", description = "Sends persona details to an external detect API and returns matched schemes")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Schemes detected successfully", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = DetectResponse.class))),
            @ApiResponse(responseCode = "400", description = "Invalid persona payload", content = @Content),
            @ApiResponse(responseCode = "502", description = "External detect API failed", content = @Content),
            @ApiResponse(responseCode = "503", description = "External detect API unreachable", content = @Content)
    })
    public ResponseEntity<DetectResponse> detect(
            @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Persona used for scheme detection", required = true) @Valid @RequestBody Persona persona) {
        return ResponseEntity.ok(detectService.detectSchemes(persona));
    }
}
