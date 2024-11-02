package io.github.burymydeadhoreses.taskmanagementapp.services;

import io.github.burymydeadhoreses.taskmanagementapp.interfaces.TaskObserver;
import io.github.burymydeadhoreses.taskmanagementapp.repositories.LogRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LogService implements TaskObserver {
    private final LogRepository logRepository;

    public List<String> list() {
        return logRepository.list();
    }

    @Override
    public void controllerRequested(String name) {
        logRepository.add(name + " requested");
    }
}
