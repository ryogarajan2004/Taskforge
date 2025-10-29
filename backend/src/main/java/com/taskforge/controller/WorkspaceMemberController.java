package com.taskforge.controller;

import com.taskforge.model.postgres.Workspace;
import com.taskforge.model.postgres.WorkspaceMember;
import com.taskforge.service.WorkspaceMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/workspace_member")
@RequiredArgsConstructor
public class WorkspaceMemberController {
    private final WorkspaceMemberService workspaceMemberService;

    @GetMapping
    public ResponseEntity<List<WorkspaceMember>> getAll() {
        return ResponseEntity.ok(workspaceMemberService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<WorkspaceMember> getById(@PathVariable Long id) {
        return workspaceMemberService.getById(id).map(workspaceMember -> ResponseEntity.ok(workspaceMember)).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<WorkspaceMember> create(@RequestBody WorkspaceMember workspaceMember) {
        return ResponseEntity.ok(workspaceMemberService.create(workspaceMember));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        workspaceMemberService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
