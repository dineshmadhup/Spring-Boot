package com.madhup.springboot.product;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.madhup.springboot.category.Category;

@Entity
public class Product {
	
	@Id
	private String productId;
	private String productName;
	private String productDescription;
	
	@ManyToOne
	private Category myCategory;
	
	public Product() {
		
	}

	public Product(String productId, String productName, String productDescription, String myCategoryId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		
		this.myCategory = new Category(myCategoryId, "");
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Category getMyCategory() {
		return myCategory;
	}

	public void setMyCategory(Category myCategory) {
		this.myCategory = myCategory;
	}

	
}
