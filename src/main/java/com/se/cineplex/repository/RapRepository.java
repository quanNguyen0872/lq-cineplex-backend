package com.se.cineplex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.se.cineplex.entity.Rap;

@Repository
public interface RapRepository extends JpaRepository<Rap, Integer>{

}