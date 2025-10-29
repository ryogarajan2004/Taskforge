package com.taskforge.controller;

import ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import com.taskforge.model.mongo.TaskNote;
import com.taskforge.service.CommentService;
import com.taskforge.service.TaskNoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tasknote")
@RequiredArgsConstructor
public class TaskNoteController {

    private final TaskNoteService taskNoteService;

    @GetMapping
    public ResponseEntity<List<TaskNote>> getAll() {
        return ResponseEntity.ok(taskNoteService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TaskNote> getById(@PathVariable String id) {
        return taskNoteService.getById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<TaskNote> save(@RequestBody TaskNote note) {
        return ResponseEntity.ok(taskNoteService.create(note));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        taskNoteService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
