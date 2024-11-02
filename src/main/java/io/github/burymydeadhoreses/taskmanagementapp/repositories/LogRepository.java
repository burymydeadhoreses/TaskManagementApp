package io.github.burymydeadhoreses.taskmanagementapp.repositories;

import io.github.burymydeadhoreses.taskmanagementapp.entities.Task;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class LogRepository {
    List<String> logs = new ArrayList<>();

    public void add(String row) {
        logs.add(row);
    }

    public List<String> list() {
        return List.copyOf(logs);
    }
}
