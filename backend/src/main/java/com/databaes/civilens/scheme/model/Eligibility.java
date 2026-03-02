package com.databaes.civilens.scheme.model;

import lombok.Data;

@Data
public class Eligibility {

    private DemographicsEligibility demographics;
    private EconomicEligibility economic;
    private GeographicEligibility geographic;
    private OccupationEligibility occupation;
}
