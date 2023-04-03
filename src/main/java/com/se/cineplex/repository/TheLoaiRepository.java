package com.se.cineplex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.se.cineplex.entity.TheLoai;

@Repository
public interface TheLoaiRepository extends JpaRepository<TheLoai, Integer> {

}
