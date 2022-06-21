package com.ctc.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ctc.entities.Product;


@Repository
public interface ProductRepo  extends JpaRepository<Product, Integer>  {

}
