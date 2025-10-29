package com.taskforge.service;

import com.taskforge.model.mongo.Task;
import com.taskforge.repository.ProjectRepository;
import com.taskforge.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class TaskService {


    private final TaskRepository taskRepository;

  public   List<Task> getAll() {
        return taskRepository.findAll();
    }

 public    Optional<Task> getById(String id) {
        return taskRepository.findById(id);

    }

 public     Task create(Task task) {

        return taskRepository.save(task);
    }

  public   void deleteById(String id) {
        taskRepository.deleteById(id);
    }
}
