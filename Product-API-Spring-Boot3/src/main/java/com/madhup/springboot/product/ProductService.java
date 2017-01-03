package com.madhup.springboot.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAllProducts(String myCategoryCategoryId) {
		List<Product> products = new ArrayList<>();
		productRepository.findByMyCategoryCategoryId(myCategoryCategoryId)
		.forEach(products::add);
		return products;
	}
	
	public Product getProduct(String productId) {
		return productRepository.findOne(productId);
	}

	public void addProduct(Product product) {
		productRepository.save(product);
		
	}

	public void updateProduct(Product product) {
		productRepository.save(product);	
	}

	public void deleteProduct(String productId) {
		productRepository.delete(productId);
		
	}

}
