package com.blog1.blog1.mappers;


import com.blog1.blog1.Domain.Category;
import com.blog1.blog1.Domain.Post;
import com.blog1.blog1.Domain.PostStatus;
import com.blog1.blog1.Dtos.CategoryDto;
import com.blog1.blog1.Dtos.CreateCategoryRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel="spring",unmappedTargetPolicy= ReportingPolicy.IGNORE)
public interface CategoryMapper {

    @Mapping(target="postCount",source="posts",qualifiedByName = "calculatedPostCount")
    CategoryDto toDto(Category category);


    Category toEntity(CreateCategoryRequest createCategoryRequest);
    @Named("calculatedPostCount")
    default long calculatePostCount(List<Post> posts){
        if(null==posts){
            return 0;
        }
        return posts.stream()
                .filter(post-> PostStatus.PUBLISHED.equals(post.getStatus()))
                .count();
    }
}
