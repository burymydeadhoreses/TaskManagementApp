package io.github.burymydeadhoreses.taskmanagementapp.services;

import io.github.burymydeadhoreses.taskmanagementapp.entities.Task;
import io.github.burymydeadhoreses.taskmanagementapp.factory.TaskFactory;
import io.github.burymydeadhoreses.taskmanagementapp.repositories.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;

    public void add(Task task, int weight) {
        var createdTask = TaskFactory.createTask(weight);
        createdTask.setDescription(task.getDescription());
        createdTask.setStatus(task.getStatus());

        taskRepository.add(createdTask);
    }

    public void update(Task task) {
        taskRepository.update(task);
    }

    public void delete(Task task) {
        taskRepository.delete(task);
    }

    public Task get(UUID id) {
        return taskRepository.get(id);
    }

    public List<Task> list() {
        return taskRepository.list();
    }
}
