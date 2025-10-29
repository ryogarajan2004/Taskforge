package com.taskforge.model.mongo;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document
public class Comment {

    @Id
    private String  id;

  private   Long taskId;

    private Long authorId; //User

    private String content;

    private LocalDateTime createdAt;


    private List<Comment> replies;
}
