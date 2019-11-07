package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.model.t1032;

@Repository
public interface t1032Dao extends JpaRepository<t1032,Long> {
	t1032 findByid(Long id);
}
