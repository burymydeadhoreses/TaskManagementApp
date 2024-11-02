package io.github.burymydeadhoreses.taskmanagementapp.entities;

import lombok.Data;

import java.util.UUID;

@Data
public class Task {
    private UUID id = UUID.randomUUID();
    private String status;
    private String description;
}