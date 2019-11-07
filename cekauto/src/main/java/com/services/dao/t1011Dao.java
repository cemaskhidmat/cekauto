package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.model.t1011;

@Repository
public interface t1011Dao extends JpaRepository<t1011,Long> {
	t1011 findByid(Long id);
}
