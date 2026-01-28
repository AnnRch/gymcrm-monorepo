package com.gymcrm.trainer_workload_service.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "trainer_workload")
public class TrainerWorkload {
    @Id
    private String username;
    private String firstName;
    private String lastName;
    private String status;
    private List<YearSummary> years;
}