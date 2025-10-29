package com.taskforge.service;

import com.taskforge.model.mongo.TaskNote;
import com.taskforge.repository.TaskNoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class TaskNoteService {


    private final TaskNoteRepository taskRepository;

  public   List<TaskNote> getAll() {
        return taskRepository.findAll();
    }

    public Optional<TaskNote> getById(String id) {
        return taskRepository.findById(id);
    }

    public TaskNote create(TaskNote taskNote) {
        return taskRepository.save(taskNote);
    }

    public void deleteById(String  id) {
        taskRepository.deleteById(id);
    }
}
