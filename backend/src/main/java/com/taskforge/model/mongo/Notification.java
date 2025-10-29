package com.taskforge.model.mongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@Data
public class Notification {

    @Id
    private String notificationId;
    private Long userId;

    private NotificationType notificationType;

    private String message;
    private boolean isRead;
    private LocalDateTime createdAt;


}


enum NotificationType {
    COMMENT, ASSIGNMENT, STATUS_CHANGE, MENTION
}