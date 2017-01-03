package com.madhup.springboot.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.madhup.springboot.category.Category;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	// creating GET service
	@RequestMapping("/categories/{categoryId}/products")
	public List<Product> getAllProducts(@PathVariable String categoryId) {
		return productService.getAllProducts(categoryId);

	}
	
	// GET by default
	@RequestMapping("/categories/{myCategoryCategoryId}/products/{productId}")
	public Product getProduct(@PathVariable String productId) {
		return productService.getProduct(productId);
	}
	
	// Using POST to add data
	@RequestMapping(method=RequestMethod.POST, value="/categories/{myCategoryCategoryId}/products")
	public void addProduct(@RequestBody Product product, @PathVariable String myCategoryCategoryId) {
		product.setMyCategory(new Category(myCategoryCategoryId, ""));
		productService.addProduct(product);
		
	}
	
	// Using PUT for Update
	@RequestMapping(method=RequestMethod.PUT, value="/categories/{myCategoryCategoryId}/products/{productId}")
	public void updateTopic(@RequestBody Product product, @PathVariable String myCategoryCategoryId, String productId) {
		product.setMyCategory(new Category(myCategoryCategoryId, ""));
		productService.updateProduct(product);
	}
	
	// Delete
	@RequestMapping(method=RequestMethod.DELETE, value="/categories/{myCategoryCategoryId}/products/{productId}")
	public void deleteCategory(@PathVariable String productId) {
		productService.deleteProduct(productId);
	}

}





