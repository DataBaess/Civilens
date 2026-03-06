package com.databaes.civilens.detect.service;

import com.databaes.civilens.persona.model.Persona;
import com.databaes.civilens.scheme.model.Scheme;

import java.util.List;

public interface DetectService {
    List<Scheme> detectSchemes(Persona persona);
}
