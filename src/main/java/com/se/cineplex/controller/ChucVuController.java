package com.se.cineplex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.se.cineplex.entity.ChucVu;
import com.se.cineplex.service.ChucVuService;

public class ChucVuController {
	
	@Autowired
	private ChucVuService chucVuService;
	
	@GetMapping("/dschucvu")
	public List<ChucVu> findAll() {
		return chucVuService.findAll();
	}

	@GetMapping("/chucvu/{id}")
	public ChucVu findById(@PathVariable int id) {
		return chucVuService.findById(id);
	}

	@PostMapping("/chucvu")
	public ChucVu addDaoDien(@RequestBody ChucVu chucVu) {
		chucVu.setId(0);
		chucVuService.saveChucVu(chucVu);
		return chucVu;
	}

	@PutMapping("/chucvu")
	public ChucVu updateChucVu(@RequestBody ChucVu chucVu) {
		chucVuService.saveChucVu(chucVu);
		return chucVu;
	}

	@DeleteMapping("/chucvu/{id}")
	public String deleteById(@PathVariable int id) {
		ChucVu chucVu = chucVuService.findById(id);
		if (chucVu == null) {
			return "Chuc Vu Id not found !";
		}
		chucVuService.deleteById(id);
		return "Deleted";

	}

}
