package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.model.t1033;

@Repository
public interface t1033Dao extends JpaRepository<t1033,Long> {
	t1033 findByid(Long id);
}
