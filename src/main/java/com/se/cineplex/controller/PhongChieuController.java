package com.se.cineplex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.se.cineplex.entity.PhongChieu;
import com.se.cineplex.service.PhongChieuService;

@RestController
@RequestMapping("/api")
public class PhongChieuController {

	@Autowired
	private PhongChieuService phongChieuService;

	@GetMapping("/dsphongchieu")
	public List<PhongChieu> findAll() {
		return phongChieuService.findAll();
	}

	@GetMapping("/phongchieu/{id}")
	public PhongChieu findById(@PathVariable int id) {
		return phongChieuService.findById(id);
	}

	@PostMapping("/phongchieu")
	public PhongChieu addPhongChieu(@RequestBody PhongChieu phongChieu) {
		phongChieu.setId(0);
		phongChieuService.savePhongChieu(phongChieu);
		return phongChieu;
	}

	@PutMapping("/phongchieu")
	public PhongChieu updatePhongChieu(@RequestBody PhongChieu phongChieu) {
		phongChieuService.savePhongChieu(phongChieu);
		return phongChieu;
	}

	@DeleteMapping("/phongchieu/{id}")
	public String deleteById(@PathVariable int id) {
		PhongChieu phongChieu = phongChieuService.findById(id);
		if (phongChieu == null) {
			return "Phong Chieu Id not found !";
		}
		phongChieuService.deleteById(id);
		return "Deleted";
	}
}
