package com.ctc.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ctc.repository.*;
import com.ctc.entities.*;

@Repository
public interface RoleDao extends JpaRepository<Role, String> {

}
