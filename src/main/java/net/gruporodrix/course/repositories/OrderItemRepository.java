package net.gruporodrix.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.gruporodrix.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
