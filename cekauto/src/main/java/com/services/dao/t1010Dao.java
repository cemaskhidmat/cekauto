package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.model.t1010;

@Repository
public interface t1010Dao extends JpaRepository<t1010,Long> {
	t1010 findByid(Long id);
}
