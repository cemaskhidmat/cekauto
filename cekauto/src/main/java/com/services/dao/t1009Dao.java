package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.model.t1009;

@Repository
public interface t1009Dao extends JpaRepository<t1009,Long> {
	t1009 findByid(Long id);
}
