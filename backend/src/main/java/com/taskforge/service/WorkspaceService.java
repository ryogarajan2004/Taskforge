package com.taskforge.service;

import com.taskforge.model.postgres.Workspace;
import com.taskforge.repository.WorkspaceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class WorkspaceService {


    private final WorkspaceRepository workspaceRepository;

    public List<Workspace> getAll() {
        return workspaceRepository.findAll();
    }

    public Optional<Workspace> getById(Long id) {
        return workspaceRepository.findById(id);
    }

    public Workspace create(Workspace workspace) {
        return workspaceRepository.save(workspace);
    }

    public void deleteById(Long id) {
        workspaceRepository.deleteById(id);
    }

}
