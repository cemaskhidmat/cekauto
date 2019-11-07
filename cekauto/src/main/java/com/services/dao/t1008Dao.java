package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.model.t1002;
import com.services.model.t1008;

@Repository
public interface t1008Dao extends JpaRepository<t1008,Long> {
	t1008 findByid(Long id);
	t1008 findByc1002(String c1002);
}
