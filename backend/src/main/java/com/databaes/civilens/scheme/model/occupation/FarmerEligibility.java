package com.databaes.civilens.scheme.model.occupation;

import com.databaes.civilens.common.enums.farmer.CropCategory;
import com.databaes.civilens.common.enums.farmer.IrrigationType;
import com.databaes.civilens.scheme.model.embedded.LandHoldingRange;
import lombok.Data;

import java.util.List;

@Data
public class FarmerEligibility {

    private LandHoldingRange landHolding;

    private List<IrrigationType> allowedIrrigationTypes;

    private List<CropCategory> allowedPrimaryCropCategories;
}
