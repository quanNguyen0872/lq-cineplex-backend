package com.se.cineplex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.se.cineplex.entity.KhachHang;

@Repository
public interface KhachHangRepository extends JpaRepository<KhachHang, Integer>{

}
