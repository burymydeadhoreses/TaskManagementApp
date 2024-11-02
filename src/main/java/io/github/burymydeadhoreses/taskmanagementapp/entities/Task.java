package io.github.burymydeadhoreses.taskmanagementapp.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Task extends Observable {
    private UUID id = UUID.randomUUID();
    private String status;
    private String description;

    public void setStatus(String status) {
        this.status = status;
        notifyObservers("Task status changed to: " + status);
    }
}