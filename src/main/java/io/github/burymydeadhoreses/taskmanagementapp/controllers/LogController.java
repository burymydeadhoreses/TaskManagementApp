package io.github.burymydeadhoreses.taskmanagementapp.controllers;

import io.github.burymydeadhoreses.taskmanagementapp.entities.Task;
import io.github.burymydeadhoreses.taskmanagementapp.services.LogService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/logs")
@AllArgsConstructor
public class LogController {
    private final LogService logService;

    @GetMapping
    public List<String> list() {
        return logService.list();
    }
}
