package com.se.cineplex.service;

import java.util.List;

import com.se.cineplex.entity.PhongChieu;

public interface PhongChieuService {
	public List<PhongChieu> findAll();

	public PhongChieu findById(int phongChieuId);

	public void savePhongChieu(PhongChieu phongChieu);

	public void deleteById(int phongChieuId);

}
