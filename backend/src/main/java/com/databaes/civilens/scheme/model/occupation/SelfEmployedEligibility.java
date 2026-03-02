package com.databaes.civilens.scheme.model.occupation;

import com.databaes.civilens.common.enums.worker.AnnualTurnoverBracket;
import com.databaes.civilens.common.enums.worker.EnterpriseSize;
import com.databaes.civilens.common.enums.worker.Sector;
import lombok.Data;

import java.util.List;

@Data
public class SelfEmployedEligibility {

    private List<Sector> allowedSectors;

    private Integer minYearsOperational;
    private Integer maxYearsOperational;

    private List<EnterpriseSize> allowedEnterpriseSizes;
    private List<AnnualTurnoverBracket> allowedTurnoverBrackets;
}
