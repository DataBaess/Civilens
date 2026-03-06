package com.databaes.civilens.detect.service;

import com.databaes.civilens.detect.dto.DetectResponse;
import com.databaes.civilens.persona.model.Persona;

public interface DetectService {
    DetectResponse detectSchemes(Persona persona);
}
