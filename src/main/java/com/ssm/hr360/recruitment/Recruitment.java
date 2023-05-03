package com.ssm.hr360.recruitment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.List;

@Document(collation = "animalShelter")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recruitment {
    @Id
    private ObjectId id;
    private String department;
    private String description;
    private List<String> minRequirements;
    private List<String> performanceArea;
    private String additionalInfo;

}
