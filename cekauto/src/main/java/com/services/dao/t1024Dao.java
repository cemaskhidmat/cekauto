package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.model.t1024;

@Repository
public interface t1024Dao extends JpaRepository<t1024,Long> {
	t1024 findByid(Long id);
}
