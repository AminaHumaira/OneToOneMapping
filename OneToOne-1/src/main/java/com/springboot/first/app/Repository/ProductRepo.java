package com.springboot.first.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.first.app.Entity.Product;
public interface ProductRepo extends JpaRepository<Product,Long>
{

}
