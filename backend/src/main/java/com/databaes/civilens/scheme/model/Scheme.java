package com.databaes.civilens.scheme.model;

import com.databaes.civilens.common.enums.core.ApplicationMode;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.List;

@Data
@Document(collection = "schemes")
public class Scheme {

    @Id
    private String id;

    private String schemeId;
    private String title;
    private String category;

    private String officialLink;
    private String sourcePortal;

    private String summary;
    private String semanticContent;

    private Eligibility eligibility;

    private Benefits benefits;

    private List<String> documentsRequired;

    private ApplicationMode applicationMode;

    private Boolean isActive;

    private Instant lastUpdated;
}
