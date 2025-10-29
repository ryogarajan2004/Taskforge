package com.taskforge.service;

import com.taskforge.model.mongo.GitLink;
import com.taskforge.repository.GitLinkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GitLinkService {


    private final GitLinkRepository gitLinkRepository;

 public    List<GitLink> getAll() {
        return  gitLinkRepository.findAll();
    }

   public Optional<GitLink> getById(String  id) {
        return gitLinkRepository.findById(id);
    }

    public GitLink create(GitLink gitLink) {
        return gitLinkRepository.save(gitLink);
    }

    public void deleteById(String  id) {
        gitLinkRepository.deleteById(id);
    }
}
