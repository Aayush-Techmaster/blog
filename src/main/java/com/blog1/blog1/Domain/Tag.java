package com.blog1.blog1.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.HashSet;
import java.util.Set;


@Entity
public class Tag {
    @Id
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "tags")
    private Set<Post> posts=new HashSet<>();

}
