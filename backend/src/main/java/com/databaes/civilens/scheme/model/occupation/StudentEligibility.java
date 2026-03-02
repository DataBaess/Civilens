package com.databaes.civilens.scheme.model.occupation;

import com.databaes.civilens.common.enums.student.EducationLevel;
import com.databaes.civilens.common.enums.student.InstitutionType;
import com.databaes.civilens.common.enums.student.StreamType;
import lombok.Data;

import java.util.List;

@Data
public class StudentEligibility {

    private List<EducationLevel> allowedEducationLevels;
    private List<InstitutionType> allowedInstitutionTypes;
    private List<StreamType> allowedStreams;
}
