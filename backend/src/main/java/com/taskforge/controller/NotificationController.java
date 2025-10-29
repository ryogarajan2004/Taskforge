package com.taskforge.controller;

import com.taskforge.model.mongo.Notification;
import com.taskforge.service.CommentService;
import com.taskforge.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/notification")
@RequiredArgsConstructor
public class NotificationController {

    private final NotificationService notificationService;

    @GetMapping
    public ResponseEntity<List<Notification>> findAll() {
        return ResponseEntity.ok(notificationService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Notification> findById(@PathVariable String id) {
        return notificationService.getById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    ResponseEntity<Notification> save(@RequestBody Notification notification) {
        return ResponseEntity.ok(notificationService.create(notification));
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable String id) {
        notificationService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
