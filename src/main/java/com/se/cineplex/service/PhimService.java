package com.se.cineplex.service;

import java.util.List;

import com.se.cineplex.entity.Phim;

public interface PhimService {
	public List<Phim> findAll();

	public Phim findById(int phimId);

	public void savePhim(Phim phim);

	public void deleteById(int phimId);
	 
}