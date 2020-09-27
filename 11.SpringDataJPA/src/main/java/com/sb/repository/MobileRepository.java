package com.sb.repository;
// https://docs.spring.io/spring-data/data-commons/docs/1.6.1.RELEASE/reference/html/repositories.html

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.sb.entity.Mobile;
import java.lang.Double;

@Repository
public interface MobileRepository extends JpaRepository<Mobile, Integer> {
	
	List<Mobile> findByBrand(String brand);
	List<Mobile> findByPrice(Double price);
	
	//JPQL
	@Query("from Mobile m where m.price>?1 and m.price<?2")
	List<Mobile> readMobile(double minPrice,double maxPrice);
	
	//Native SQL
	@Query(value= "select * from mobiles where price=? ",nativeQuery=true)
	List<Mobile> readMobile(double price);
}
