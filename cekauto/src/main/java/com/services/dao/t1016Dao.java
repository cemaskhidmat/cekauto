package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.model.t1016;

@Repository
public interface t1016Dao extends JpaRepository<t1016,Long> {
	t1016 findByid(Long id);
}
