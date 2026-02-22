package com.blog1.blog1.Services;

import com.blog1.blog1.Domain.Category;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface CategoryService {
    List<Category> listCategories();
    Category createCategory(Category category);
}
