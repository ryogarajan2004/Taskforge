package com.taskforge.service;

import com.taskforge.model.mongo.Notification;
import com.taskforge.repository.NotificationRepository;
import com.taskforge.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class NotificationService {


  private final   NotificationRepository notificationRepository;

   public List<Notification> getAll() {
        return notificationRepository.findAll();
    }

public     Optional<Notification> getById(String id) {
        return notificationRepository.findById(id);
    }

  public   Notification create(Notification notification) {
        return notificationRepository.save(notification);
    }

   public void deleteById(String id) {
        notificationRepository.deleteById(id);
    }
}
