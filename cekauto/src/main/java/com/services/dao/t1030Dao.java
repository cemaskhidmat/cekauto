package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.model.t1030;

@Repository
public interface t1030Dao extends JpaRepository<t1030,Long> {
	t1030 findByid(Long id);
}
