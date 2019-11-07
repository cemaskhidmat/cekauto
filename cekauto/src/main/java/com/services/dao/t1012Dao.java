package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.model.t1012;

@Repository
public interface t1012Dao extends JpaRepository<t1012,Long> {
	t1012 findByid(Long id);
}
