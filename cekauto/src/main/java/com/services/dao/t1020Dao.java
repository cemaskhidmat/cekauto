package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.model.t1020;

@Repository
public interface t1020Dao extends JpaRepository<t1020,Long> {
	t1020 findByid(Long id);
}
