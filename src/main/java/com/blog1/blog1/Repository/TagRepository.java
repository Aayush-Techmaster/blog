package com.blog1.blog1.Repository;

import com.blog1.blog1.Domain.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag,Long> {
}
