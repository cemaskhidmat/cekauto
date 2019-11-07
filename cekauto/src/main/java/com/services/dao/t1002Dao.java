package com.services.dao;

import com.services.model.t1002;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface t1002Dao extends JpaRepository<t1002,Long> {
	t1002 findByid(Long id);
	t1002 findByc1006(String c1006);
	t1002 findByc1013(String c1013);
}
