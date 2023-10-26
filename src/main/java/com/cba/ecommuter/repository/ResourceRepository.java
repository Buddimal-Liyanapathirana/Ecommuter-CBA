package com.cba.ecommuter.repository;

import com.cba.ecommuter.model.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Integer> {
}
