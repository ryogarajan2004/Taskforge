package com.taskforge.repository;

import com.taskforge.model.mongo.TaskNote;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskNoteRepository extends MongoRepository<TaskNote, String> {
}
