package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.model.t1027;

@Repository
public interface t1027Dao extends JpaRepository<t1027,Long> {
	t1027 findByid(Long id);
}
