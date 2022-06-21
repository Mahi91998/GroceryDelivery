package com.ctc.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ctc.entities.Admin;
public interface AdminRepo extends JpaRepository<Admin, Integer> {
	//public Admin findbyAdminNameAndPassword(String admin_name,String password)

}
