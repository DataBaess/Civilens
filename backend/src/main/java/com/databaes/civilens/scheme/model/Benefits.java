package com.databaes.civilens.scheme.model;

import com.databaes.civilens.common.enums.core.BenefitType;
import lombok.Data;

@Data
public class Benefits {

    private BenefitType type;
    private String description;
}
