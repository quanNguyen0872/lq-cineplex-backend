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

import com.se.cineplex.entity.DichVu;
import com.se.cineplex.service.DichVuService;

@RestController
@RequestMapping("/api")
public class DichVuController {
	
	@Autowired
	private DichVuService dichVuService;
	
	@GetMapping("/dsdichvu")
	public List<DichVu> findAll() {
		return dichVuService.findAll();
	}
	
	@GetMapping("/dichvu/{id}")
	public DichVu findById(@PathVariable int id) {
		return dichVuService.findById(id);
	}
	
	@PostMapping("/dichvu")
	public DichVu addDichVu(@RequestBody DichVu dichVu) {
		dichVu.setId(0);
		dichVuService.saveDichVu(dichVu);
		return dichVu;
	}
	
	@PutMapping("/dichvu")
	public DichVu updateDichVu(@RequestBody DichVu dichVu) {
		dichVuService.saveDichVu(dichVu);
		return dichVu;
	}
	
	@DeleteMapping("/dichvu/{id}")
	public String deleteById(@PathVariable int id) {
		DichVu dichVu = dichVuService.findById(id);
		if (dichVu == null) {
			return "Dich Vu Id not found !";
		}
		dichVuService.deleteById(id);
		return "Deleted";
	}


}
