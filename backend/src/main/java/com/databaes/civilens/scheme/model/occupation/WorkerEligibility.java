package com.databaes.civilens.scheme.model.occupation;

import com.databaes.civilens.common.enums.selfemployed.EmploymentCategory;
import com.databaes.civilens.common.enums.selfemployed.IndustryType;
import lombok.Data;

import java.util.List;

@Data
public class WorkerEligibility {

    private List<EmploymentCategory> allowedEmploymentCategories;
    private List<IndustryType> allowedIndustryTypes;

    private Boolean migrantWorkerRequired;
}
