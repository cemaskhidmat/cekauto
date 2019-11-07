package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.model.t1029;

@Repository
public interface t1029Dao extends JpaRepository<t1029,Long> {
	t1029 findByid(Long id);
}
