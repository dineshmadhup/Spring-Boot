package com.madhup.springboot.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	// creating GET service
	@RequestMapping("/categories")
	public List<Category> getAllCategories() {
		return categoryService.getAllCategories();

	}
	
	// GET by default
	@RequestMapping("/categories/{categoryId}")
	public Category getCategory(@PathVariable String categoryId) {
		return categoryService.getCategory(categoryId);
	}
	
	// Using POST to add data
	@RequestMapping(method=RequestMethod.POST, value="/categories")
	public void addCategory(@RequestBody Category myCategory) {
		categoryService.addCategory(myCategory);
	}
	
	// Using PUT for Update
	@RequestMapping(method=RequestMethod.PUT, value="/categories/{categoryId}")
	public void updateTopic(@RequestBody Category myCategory, @PathVariable String categoryId) {
		categoryService.updateCategory(categoryId, myCategory);
	}
	
	// Delete
	@RequestMapping(method=RequestMethod.DELETE, value="/categories/{categoryId}")
	public void deleteCategory(@PathVariable String categoryId) {
		categoryService.deleteCategory(categoryId);
	}

}





