package net.gruporodrix.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.gruporodrix.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
