package com.se.cineplex.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.se.cineplex.entity.Ghe;

@Repository
public interface GheRepository extends JpaRepository<Ghe, Integer> {
	
//	 @Query(value="select g from Ghe g where g.phongChieu.id= :maPhongChieu")
//	 List<Ghe> getAllGheByMaPhongChieu(int maPhongChieu);
	 
	 @Query(value="select * from ghe where ma_phongchieu= :maPhongChieu", nativeQuery = true)
	 List<Ghe> getAllGheByMaPhongChieu(int maPhongChieu);

}
