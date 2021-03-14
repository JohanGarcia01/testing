package com.endava.backendFrontchallenge.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "users")
public class Job {
    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";

    @Id
    private String _id;
    private String name;
    private boolean state;
    private String _idUser;
}
