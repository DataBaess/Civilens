package com.databaes.civilens.detect.dto;

import com.databaes.civilens.scheme.model.Scheme;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
public class DetectResponse {

    @Schema(description = "Total number of matched schemes")
    private int count;

    @ArraySchema(schema = @Schema(implementation = Scheme.class))
    private List<Scheme> schemes;
}
