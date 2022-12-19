package com.springboot.first.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.first.app.Entity.Category;

public interface CategoryRepo extends JpaRepository<Category,Long>
{
	

	
}


