package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.model.t1014;

@Repository
public interface t1014Dao extends JpaRepository<t1014,Long> {
	t1014 findByid(Long id);
}
