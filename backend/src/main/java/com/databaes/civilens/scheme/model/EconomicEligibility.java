package com.databaes.civilens.scheme.model;

import com.databaes.civilens.common.enums.core.IncomeBracket;
import lombok.Data;

import java.util.List;

@Data
public class EconomicEligibility {

    private List<IncomeBracket> allowedIncomeBrackets;

    private Boolean bplRequired;
}
