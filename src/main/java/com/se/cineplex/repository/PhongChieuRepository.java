package com.se.cineplex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.se.cineplex.entity.PhongChieu;

@Repository
public interface PhongChieuRepository extends JpaRepository<PhongChieu, Integer>{

}
