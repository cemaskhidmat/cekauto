package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.model.t1021;

@Repository
public interface t1021Dao extends JpaRepository<t1021,Long> {
	t1021 findByid(Long id);
}
