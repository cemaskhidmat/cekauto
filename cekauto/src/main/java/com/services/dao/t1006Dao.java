package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.model.t1006;

@Repository
public interface t1006Dao extends JpaRepository<t1006,Long> {
	t1006 findByid(Long id);
}
