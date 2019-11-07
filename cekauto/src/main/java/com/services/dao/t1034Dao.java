package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.model.t1034;

@Repository
public interface t1034Dao extends JpaRepository<t1034,Long> {
	t1034 findByid(Long id);
}
