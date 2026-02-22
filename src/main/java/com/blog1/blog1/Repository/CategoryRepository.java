package com.blog1.blog1.Repository;

import com.blog1.blog1.Domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category,Long> {

    @Query("Select c from Category c LEFT JOIN FETCH c.posts")
    List<Category> findAllWithPostCount();
}
