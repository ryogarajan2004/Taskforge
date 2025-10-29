package com.taskforge.model.mongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Document
public class Task {
    @Id
    private String id;
    private String title;
    private String description;
    private TaskStatus status;

    private Long assigneeId;//User

    private Long reporterId; //User

    private Long projectId;

    List<String> tags;

    LocalDate dueDate;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;


}

enum TaskStatus {
    TODO,
    IN_PROGRESS,
    DONE
}
