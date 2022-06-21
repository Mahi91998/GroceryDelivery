package com.ctc.service;

import java.util.List;


import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctc.exceptions.ResourceNotFoundException;
import com.ctc.entities.Product;
import com.ctc.repository.ProductRepo;

@Service
public class ProductService {

	@Autowired
	ProductRepo repo;
	
	public Product addProduct(Product v)
	{
		 repo.save(v);	
		 return v;
	}
	

	public String deleteProductById(int vid) {
		
		repo.deleteById(vid);
		
		return "Deleted";
	}

	public String deleteProduct(Product v) {
		
		repo.delete(v);
		return "Deleted";
	}
	
	public List<Product> addProduct(List<Product> ls) {
		repo.saveAll(ls);
		return ls;
	}

	 public List<Product> getProduct()
	    {
	    	List<Product> lc1=repo.findAll();
	    	return lc1;
	    }

	
	public Product updateProduct(Product v) throws Throwable 
	{
		int id=v.getPid();
		
		Supplier s1= ()->new ResourceNotFoundException("Product Does not exist in the database");
		Product v1=repo.findById(id).orElseThrow(s1);
		
		v1.setPname(v.getPname());
		v1.setPcategory(v.getPcategory());
		v1.setPrice(v.getPrice());
		repo.save(v1);
		return v1;	
	}
}
