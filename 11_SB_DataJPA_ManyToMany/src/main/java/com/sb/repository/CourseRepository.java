package com.sb.repository;

import com.sb.entity.Course;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, Long> {

	List<Course> findByTitleContaining(String title);
    List<Course> findByFeeLessThan(double fee);
	@Query("from Course c where c.fee>:minfee and c.fee<:maxFee")
    List<Course> getCourse(@Param("minfee")double minfee,@Param("maxFee")double maxFee);
    
}