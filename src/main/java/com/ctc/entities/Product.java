package com.ctc.entities;

import java.util.function.Supplier;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.*;
import javax.validation.constraints.Size;

import org.hibernate.annotations.SQLUpdate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
@Table(name="Product")
public class Product {
@Id
@GeneratedValue
	
	@NotNull
	private int pid;
	@NotBlank
	@Size(min=2,message="Category name should have atleast 2 characters")
	private String pcategory;
	@NotBlank
	@Size(min=2,message="Vegetable name should have atleast 2 characters")
	private String pname;
	private int price;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPcategory() {
		return pcategory;
	}
	public void setPcategory(String pcategory) {
		this.pcategory = pcategory;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}

	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pcategory=" + pcategory + ", pname=" + pname +"price"+price+ "]";
	}
}


