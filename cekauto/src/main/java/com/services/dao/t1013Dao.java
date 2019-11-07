package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.model.t1013;

@Repository
public interface t1013Dao extends JpaRepository<t1013,Long> {
	t1013 findByid(Long id);
}
