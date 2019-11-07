package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.model.t1019;

@Repository
public interface t1019Dao extends JpaRepository<t1019,Long> {
	t1019 findByid(Long id);
}
