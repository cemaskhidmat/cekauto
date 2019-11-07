package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.model.t1028;

@Repository
public interface t1028Dao extends JpaRepository<t1028,Long> {
	t1028 findByid(Long id);
}
