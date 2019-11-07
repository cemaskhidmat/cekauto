package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.model.t001;
import com.services.model.t1001;

@Repository
public interface t001Dao extends JpaRepository<t001,Long> {
	t001 findByid(Long id);
}
