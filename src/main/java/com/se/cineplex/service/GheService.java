package com.se.cineplex.service;

import java.util.List;

import com.se.cineplex.entity.Ghe;

public interface GheService {
	public List<Ghe> findAll();
	
	public List<Ghe> findAllByMaPhongChieu(int maPhongChieu);

	public Ghe findById(int gheId);

	public void saveGhe(Ghe ghe);
	
	public void saveAllGhe(List<Ghe> dsGhe);

	public void deleteById(int gheId);

}
