package com.blog1.blog1.Controllers;


import com.blog1.blog1.Domain.Category;
import com.blog1.blog1.Dtos.CategoryDto;
import com.blog1.blog1.Services.CategoryService;
import com.blog1.blog1.mappers.CategoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/api/v1/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;
    private final CategoryMapper categoryMapper;

    public ResponseEntity<List<CategoryDto>> listcategories(){
        List<CategoryDto>categories=categoryService.listCategories()
                .stream().map(categoryMapper::toDto)
                .toList();
        return ResponseEntity.ok(categories);
    }
}
