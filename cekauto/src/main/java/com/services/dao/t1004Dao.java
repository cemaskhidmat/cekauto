package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.model.t1004;

@Repository
public interface t1004Dao extends JpaRepository<t1004,Long> {
	t1004 findByid(Long id);
}
