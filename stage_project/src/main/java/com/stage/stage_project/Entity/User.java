package com.stage.stage_project.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //generate getters and setters
@AllArgsConstructor //generate a constructor with 1 param in each field
@NoArgsConstructor //generate a constructor with no params
@Entity
@Table(name = "user_app")
public class User {

    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment the id
    private Long id;
    private String FirstName;
    private String LastName;
    private Long phone;
    private String username;
    private String password;
    private String role;

}
