package com.se.cineplex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.se.cineplex.entity.LichChieu;

@Repository
public interface LichChieuRepository extends JpaRepository<LichChieu, Integer>{

}
