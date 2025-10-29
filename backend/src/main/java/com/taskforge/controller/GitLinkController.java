package com.taskforge.controller;

import com.taskforge.model.mongo.GitLink;
import com.taskforge.service.GitLinkService;
import com.taskforge.service.WorkspaceMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/gitlink")
@RequiredArgsConstructor
public class GitLinkController {
    private final GitLinkService gitLinkService;

    @GetMapping
    public ResponseEntity<List<GitLink>> getAll() {
        return ResponseEntity.ok(gitLinkService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<GitLink> getById(@PathVariable String id) {
        return gitLinkService.getById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<GitLink> save(@RequestBody GitLink gitLink) {
        return ResponseEntity.ok(gitLinkService.create(gitLink));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        gitLinkService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
