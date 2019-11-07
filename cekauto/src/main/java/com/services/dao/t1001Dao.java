package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.model.t1001;

@Repository
public interface t1001Dao extends JpaRepository<t1001,Long> {
	t1001 findByid(Long id);
	
}
