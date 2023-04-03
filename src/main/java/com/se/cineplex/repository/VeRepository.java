package com.se.cineplex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.se.cineplex.entity.Ve;

@Repository
public interface VeRepository extends JpaRepository<Ve, Integer>{

}
