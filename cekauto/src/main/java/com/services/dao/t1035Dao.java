package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.model.t1033;
import com.services.model.t1035;

@Repository
public interface t1035Dao extends JpaRepository<t1035,Long> {
	t1035 findByid(Long id);
}
