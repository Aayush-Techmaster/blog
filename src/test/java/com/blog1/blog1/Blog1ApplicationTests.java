package com.blog1.blog1;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Blog1ApplicationTests {


	@NotBlank(message = "Category name is required")
	@Size(min=2,max=50,message="Category name must be between {min} and {max} characters")
	@Pattern(regexp = "^[\\w\\s-]+$",message = "Category name can only contain letters,num,spaces and hyphens")
	private String name;

}
