package net.gruporodrix.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.gruporodrix.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
