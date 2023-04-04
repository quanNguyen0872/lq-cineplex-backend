package com.se.cineplex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.se.cineplex.entity.ChiTietDichVu;
import com.se.cineplex.service.ChiTietDichVuService;

@RestController
@RequestMapping("/api")
public class ChiTietDichVuController {
	
	@Autowired
	private ChiTietDichVuService chiTietDichVuService;
	
	@GetMapping("/dschitietdichvu")
	public List<ChiTietDichVu> findAll() {
		return chiTietDichVuService.findAll();
	}
	
	@PostMapping("/dschitietdichvu")
	public ChiTietDichVu addChiTietDichVu(@RequestBody ChiTietDichVu chiTietDichVu) {
		chiTietDichVuService.saveChiTietDichVu(chiTietDichVu);
		return chiTietDichVu;
	}

	@PutMapping("/dschitietdichvu")
	public ChiTietDichVu updateChiTietDichVu(@RequestBody ChiTietDichVu chiTietDichVu) {
		chiTietDichVuService.saveChiTietDichVu(chiTietDichVu);
		return chiTietDichVu;
	}

}
