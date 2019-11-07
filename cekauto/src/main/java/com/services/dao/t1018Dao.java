package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.model.t1018;

@Repository
public interface t1018Dao extends JpaRepository<t1018,Long> {
	t1018 findByid(Long id);
}
