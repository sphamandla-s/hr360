package com.ssm.hr360.recruitment;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecruitmentRepository extends MongoRepository<Recruitment, ObjectId> {
}
