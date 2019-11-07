package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.model.t1017;

@Repository
public interface t1017Dao extends JpaRepository<t1017,Long> {
	t1017 findByid(Long id);
}
