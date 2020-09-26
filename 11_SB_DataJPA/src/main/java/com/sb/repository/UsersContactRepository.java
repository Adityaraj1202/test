package com.sb.repository;

import com.sb.model.UsersContact;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.lang.Integer;

public interface UsersContactRepository extends JpaRepository<UsersContact, Integer> {
	
	//   custom Query == JPQL + Native SQL 
	@Query("from UsersContact uc where uc.users.salary>:salary")
	List<UsersContact> getUserContact(@Param("salary")Integer salary);
	
	List<UsersContact> findByUsers_Salary(Integer salary);
	
}
