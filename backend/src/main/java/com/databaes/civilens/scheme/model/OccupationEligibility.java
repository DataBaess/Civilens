package com.databaes.civilens.scheme.model;

import com.databaes.civilens.common.enums.core.OccupationType;
import com.databaes.civilens.scheme.model.occupation.FarmerEligibility;
import com.databaes.civilens.scheme.model.occupation.SelfEmployedEligibility;
import com.databaes.civilens.scheme.model.occupation.StudentEligibility;
import com.databaes.civilens.scheme.model.occupation.WorkerEligibility;
import lombok.Data;

import java.util.List;

@Data
public class OccupationEligibility {

    private List<OccupationType> allowedTypes;

    private FarmerEligibility farmerEligibility;
    private WorkerEligibility workerEligibility;
    private StudentEligibility studentEligibility;
    private SelfEmployedEligibility selfEmployedEligibility;
}
