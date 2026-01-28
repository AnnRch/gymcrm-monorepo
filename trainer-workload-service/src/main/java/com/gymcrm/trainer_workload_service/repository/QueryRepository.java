package com.gymcrm.trainer_workload_service.repository;

import com.gymcrm.trainer_workload_service.entity.TrainerWorkload;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueryRepository extends MongoRepository<TrainerWorkload, String> {
    TrainerWorkload findByUsername(String userName);
}
