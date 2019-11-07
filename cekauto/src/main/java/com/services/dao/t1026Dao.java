package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.model.t1026;

@Repository
public interface t1026Dao extends JpaRepository<t1026,Long> {
	t1026 findByid(Long id);
}
