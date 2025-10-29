package com.taskforge.service;

import com.taskforge.model.postgres.WorkspaceMember;
import com.taskforge.repository.WorkspaceMemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class WorkspaceMemberService {


    private final WorkspaceMemberRepository workspaceMemberRepository;

    public List<WorkspaceMember> getAll() {
        return workspaceMemberRepository.findAll();
    }

    public Optional<WorkspaceMember> getById(Long id) {
        return workspaceMemberRepository.findById(id);
    }

    public WorkspaceMember create(WorkspaceMember workspaceMember) {
        return workspaceMemberRepository.save(workspaceMember);
    }

    public void deleteById(Long id) {
        workspaceMemberRepository.deleteById(id);
    }
}
