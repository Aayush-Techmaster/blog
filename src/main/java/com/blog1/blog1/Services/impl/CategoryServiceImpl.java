package com.blog1.blog1.Services.impl;

import com.blog1.blog1.Domain.Category;
import com.blog1.blog1.Repository.CategoryRepository;
import com.blog1.blog1.Services.CategoryService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    @Override
    public List<Category> listCategories() {
        return categoryRepository.findAllWithPostCount();
    }


    @Override
    public Category createCategory(Category category){
        String categoryName = category.getName();
       if(categoryRepository.existsByNameIgnoreCase(category.getName())){
           throw new IllegalArgumentException("Category aldready exists with name:"+ categoryName);
       }
       return categoryRepository.save(category);
    }
}
