package com.madhup.springboot.category;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
//	List<Category> categories = new ArrayList<>(Arrays.asList(
//			new Category("Book", "Book Collection Category"),
//			new Category("Sports", "Sports Products Category"),
//			new Category("Beauty", "Beauty Products Category")
//			));
	
	public List<Category> getAllCategories() {
		List<Category> categories = new ArrayList<>();
		categoryRepository.findAll()
		.forEach(categories::add);
		return categories;
	}
	
	public Category getCategory(String categoryId) {
		return categoryRepository.findOne(categoryId);
	}

	public void addCategory(Category myCategory) {
		categoryRepository.save(myCategory);
		
	}

	public void updateCategory(String categoryId, Category myCategory) {
		categoryRepository.save(myCategory);	
	}

	public void deleteCategory(String categoryId) {
		categoryRepository.delete(categoryId);
		
	}

}
