package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.model.t1025;

@Repository
public interface t1025Dao extends JpaRepository<t1025,Long> {
	t1025 findByid(Long id);
}
