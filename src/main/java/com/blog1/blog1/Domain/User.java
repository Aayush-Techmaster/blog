package com.blog1.blog1.Domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String password;
    private  String name;

    @OneToMany(mappedBy = "author")
    private List<Post> posts=new ArrayList<>();
    private LocalDateTime createdAt;

}
