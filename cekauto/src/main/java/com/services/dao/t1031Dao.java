package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.model.t1031;

@Repository
public interface t1031Dao extends JpaRepository<t1031,Long> {
	t1031 findByid(Long id);
}
