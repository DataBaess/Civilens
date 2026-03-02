package com.databaes.civilens.scheme.model.embedded;

import com.databaes.civilens.common.enums.farmer.LandUnit;
import lombok.Data;

@Data
public class LandHoldingRange {

    private Double min;
    private Double max;
    private LandUnit unit;
}
