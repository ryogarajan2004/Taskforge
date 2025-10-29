package com.taskforge.controller;

import com.taskforge.model.postgres.ProjectMember;
import com.taskforge.service.ProjectMemberService;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.annotation.DeclareError;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/project_member")
@RequiredArgsConstructor
public class ProjectMemberController {
    private final ProjectMemberService projectMemberService;

    @GetMapping
    public ResponseEntity<List<ProjectMember>> getAll() {
        return  ResponseEntity.ok(projectMemberService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjectMember> getById(@PathVariable Long id) {
        return projectMemberService.getById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ProjectMember> create(@RequestBody ProjectMember projectMember) {
        return ResponseEntity.ok(projectMemberService.create(projectMember));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        projectMemberService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
