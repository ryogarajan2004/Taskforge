package com.taskforge.model.mongo;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document
public class TaskNote {

   @Id
    private String  id;

    private Long    taskId;
    private Long projectId;
    private String  title;
    private String content;

    private Long createdBy; //User
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
