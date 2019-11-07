package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.model.t1007;

@Repository
public interface t1007Dao extends JpaRepository<t1007,Long> {
	t1007 findByid(Long id);
}
