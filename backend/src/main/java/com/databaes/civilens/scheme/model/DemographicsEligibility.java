package com.databaes.civilens.scheme.model;

import com.databaes.civilens.common.enums.core.Category;
import com.databaes.civilens.common.enums.core.Gender;
import lombok.Data;

import java.util.List;

@Data
public class DemographicsEligibility {

    private Integer minAge;
    private Integer maxAge;

    private List<Gender> allowedGenders;
    private List<Category> allowedCategories;

    private Integer minFamilySize;
    private Integer maxFamilySize;
}
