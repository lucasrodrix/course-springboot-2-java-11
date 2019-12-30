package net.gruporodrix.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.gruporodrix.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
