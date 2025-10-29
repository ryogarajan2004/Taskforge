package com.taskforge.service;

import com.taskforge.model.postgres.ProjectMember;
import com.taskforge.repository.ProjectMemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ProjectMemberService {


    private final ProjectMemberRepository projectMemberRepository;

    public List<ProjectMember> getAll() {
        return projectMemberRepository.findAll();
    }

    public Optional<ProjectMember> getById(Long id) {
        return projectMemberRepository.findById(id);
    }

    public ProjectMember create(ProjectMember projectMember) {
        return projectMemberRepository.save(projectMember);
    }

    public void deleteById(Long id) {
        projectMemberRepository.deleteById(id);
    }


}
