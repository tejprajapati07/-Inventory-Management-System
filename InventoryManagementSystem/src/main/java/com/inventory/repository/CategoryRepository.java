package com.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.inventory.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
