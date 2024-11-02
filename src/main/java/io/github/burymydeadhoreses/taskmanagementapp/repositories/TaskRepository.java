package io.github.burymydeadhoreses.taskmanagementapp.repositories;

import io.github.burymydeadhoreses.taskmanagementapp.entities.Task;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class TaskRepository {
    List<Task> tasks = new ArrayList<>();

    public void add(Task task) {
        tasks.add(task);
    }

    public void update(Task task) {
        var searchResult = tasks.stream().filter(t -> t.getId().equals(task.getId())).findFirst().orElse(null);

        if(searchResult == null)
            throw new RuntimeException("Task not found");

        searchResult.setDescription(task.getDescription());
        searchResult.setStatus(task.getStatus());
    }

    public void delete(Task task) {
        tasks.remove(task);
    }

    public Task get(UUID id) {
        return tasks.stream().filter(task -> task.getId().equals(id)).findFirst().orElse(null);
    }

    public List<Task> list() {
        return List.copyOf(tasks);
    }
}
