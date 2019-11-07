package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.model.t1005;

@Repository
public interface t1005Dao extends JpaRepository<t1005,Long> {
	t1005 findByid(Long id);
}
