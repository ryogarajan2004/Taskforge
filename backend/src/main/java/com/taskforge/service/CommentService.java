package com.taskforge.service;

import com.taskforge.model.mongo.Comment;
import com.taskforge.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;

   public List<Comment> getAll() {
        return commentRepository.findAll();
    }

  public   Optional<Comment> getById(String id) {
        return commentRepository.findById(id);
    }

   public Comment create(Comment comment) {
        return commentRepository.save(comment);
    }

  public   void deleteById(String id) {
        commentRepository.deleteById(id);
    }
}
