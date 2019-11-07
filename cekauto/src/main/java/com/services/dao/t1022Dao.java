package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.model.t1022;

@Repository
public interface t1022Dao extends JpaRepository<t1022,Long> {
	t1022 findByid(Long id);
}
