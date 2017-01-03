package com.madhup.springboot.product;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, String> {
	
	 public List<Product> findByMyCategoryCategoryId(String myCategoryCategoryId);
	 
	 
	 //public List<Course> findByDescription(String description);
	
	

}

//getAllTopics

//getTopic(String id)
	
//updateTopic(Topic t)
	
//deleteTopic(String id)
