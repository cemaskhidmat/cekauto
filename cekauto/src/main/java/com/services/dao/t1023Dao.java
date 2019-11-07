package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.model.t1023;

@Repository
public interface t1023Dao extends JpaRepository<t1023,Long> {
	t1023 findByid(Long id);
}
