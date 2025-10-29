package com.taskforge.service;

import com.taskforge.model.postgres.Project;
import com.taskforge.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ProjectService {


    private final ProjectRepository projectRepository;

  public   List<Project> getAll() {
        return projectRepository.findAll();

    }

    public Optional<Project> getById(Long id) {
        return projectRepository.findById(id);
    }

    public Project create(Project project) {

        return projectRepository.save(project);
    }

    public void deleteById(Long id) {
        projectRepository.deleteById(id);
    }
}
