package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.model.t1003;

@Repository
public interface t1003Dao extends JpaRepository<t1003,Long> {
	t1003 findByid(Long id);
}
