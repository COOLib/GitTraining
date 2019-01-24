package com.example.demo;

import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class NewService {

    private Long longField;
    private String stringField;
    private Boolean aBooleanField;
    private Character characterField;
}
