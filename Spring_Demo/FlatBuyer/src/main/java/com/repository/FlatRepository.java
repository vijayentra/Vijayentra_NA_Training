package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.Flat;

@Repository
public interface FlatRepository extends JpaRepository<Flat, String> {

	
}
