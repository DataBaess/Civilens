package com.databaes.civilens.scheme.model;

import com.databaes.civilens.common.enums.core.AreaType;
import com.databaes.civilens.common.enums.core.IndianState;
import lombok.Data;

import java.util.List;

@Data
public class GeographicEligibility {

    private List<IndianState> allowedStates;

    private List<String> allowedDistricts;

    private List<AreaType> allowedAreaTypes;
}
