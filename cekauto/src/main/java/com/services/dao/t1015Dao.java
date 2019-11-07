package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.model.t1015;

@Repository
public interface t1015Dao extends JpaRepository<t1015,Long> {
	t1015 findByid(Long id);
}
