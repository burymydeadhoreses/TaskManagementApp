package io.github.burymydeadhoreses.taskmanagementapp.controllers;

import io.github.burymydeadhoreses.taskmanagementapp.entities.Task;
import io.github.burymydeadhoreses.taskmanagementapp.entities.UrgentTask;
import io.github.burymydeadhoreses.taskmanagementapp.services.LogService;
import io.github.burymydeadhoreses.taskmanagementapp.services.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@AllArgsConstructor
public class TaskController {
    private final TaskService taskService;
    private final LogService logService;

    @GetMapping
    public List<Task> list() {
        logService.controllerRequested("tasks list");

        return taskService.list();
    }

    @PostMapping
    public void add(@RequestParam int weight, @RequestBody UrgentTask task) {
        taskService.add(task, weight);

        logService.controllerRequested("task create");
    }

    @PutMapping
    public void update(@RequestBody Task task) {
        taskService.update(task);

        logService.controllerRequested("task update");
    }
}

