package com.blog1.blog1.Repository;

import com.blog1.blog1.Domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
