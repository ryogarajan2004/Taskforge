package com.taskforge.controller;

import com.taskforge.model.postgres.Workspace;
import com.taskforge.service.UserService;
import com.taskforge.service.WorkspaceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/workspace")
public class WorkspaceController {

    private final WorkspaceService workspaceService;

    @GetMapping
    public ResponseEntity<List<Workspace>> getAll() {
        return ResponseEntity.ok(workspaceService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Workspace> getById(@PathVariable Long id) {
        return workspaceService.getById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Workspace> create(@RequestBody Workspace workspace) {
        return ResponseEntity.ok(workspaceService.create(workspace));
    }

    @DeleteMapping("?{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        workspaceService.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}
