package com.ctc.controller;

import java.lang.System.Logger;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctc.entities.Admin;
import com.ctc.entities.Product;
import com.ctc.service.ProductService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProductController {
	
	@Autowired
	ProductService productsservice;
	
	Logger logger= System.getLogger("loger");

	
	@PutMapping(path="/updateProduct")
	public ResponseEntity<Product> updateProduct(@RequestBody Product e) throws Throwable
	{
		Product e1=productsservice.updateProduct(e);
		
		ResponseEntity re=new ResponseEntity<Product>(e1,HttpStatus.OK);
		return re;
	}
	
	@DeleteMapping(path="/deleteProduct")
	public ResponseEntity<String> deleteProduct(@RequestBody Product e)
	{
		productsservice.deleteProduct(e);
		
		ResponseEntity re=new ResponseEntity<String>("Deleted",HttpStatus.OK);
		return re;
	}
	
	@DeleteMapping(path="/deleteProductById/{pid}")
	public ResponseEntity<String> deletePById(@PathVariable int pid)
	{
		productsservice.deleteProductById(pid);
		
		ResponseEntity re=new ResponseEntity<String>("Deleted",HttpStatus.OK);
		return re;
	}
	
	@GetMapping("/getProduct")
	public ResponseEntity<List<Product>> getProduct()
	{
	List<Product> lo1=productsservice.getProduct();
	ResponseEntity<List<Product>> re = new ResponseEntity<List<Product>>(lo1,HttpStatus.OK);
	return re;
	}
	
	@PostMapping("/addProduct")
	public ResponseEntity<Product> addProduct(@Valid @RequestBody Product v)
	{
		Product v1=productsservice.addProduct(v);
		ResponseEntity re=new ResponseEntity<Product>(v1,HttpStatus.OK);
		return re;
	}
	

}
