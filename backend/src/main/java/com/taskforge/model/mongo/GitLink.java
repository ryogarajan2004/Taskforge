package com.taskforge.model.mongo;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
@Data
public class GitLink {
    //P
    @Id
    private String id;
    private Long taskId;
    private String repoUrl;
    private String commitHash;
    private String message;

    private LocalDate linkedAt;
}
