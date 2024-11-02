package io.github.burymydeadhoreses.taskmanagementapp.factory;

import io.github.burymydeadhoreses.taskmanagementapp.entities.RegularTask;
import io.github.burymydeadhoreses.taskmanagementapp.entities.Task;
import io.github.burymydeadhoreses.taskmanagementapp.entities.UrgentTask;

public class TaskFactory {
    public static Task createTask(int weight) {
        return switch (weight) {
            case 0 -> new RegularTask();
            case 1 -> new UrgentTask();
            default -> throw new IllegalArgumentException("Invalid task weight");
        };
    }
}
