package com.taskforge.controller;

import com.taskforge.model.mongo.Task;
import com.taskforge.service.TaskService;
import com.taskforge.service.WorkspaceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/task")
@RequiredArgsConstructor
public class TaskController {
    private final TaskService taskService;

    @GetMapping
    public ResponseEntity<List<Task>> findAll() {
        return ResponseEntity.ok(taskService.getAll());
    }

    @GetMapping("/{id}")
            public ResponseEntity<Task> findById(@PathVariable String  id) {
        return taskService.getById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Task> save(@RequestBody Task task) {
        return ResponseEntity.ok(taskService.create(task));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        taskService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
