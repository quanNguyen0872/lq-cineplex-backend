package com.se.cineplex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.se.cineplex.entity.NhanVien;
import com.se.cineplex.service.NhanVienService;

public class NhanVienController {
	
	@Autowired
	private NhanVienService nhanVienService;
	
	@GetMapping("/dsnhanvien")
	public List<NhanVien> findAll() {
		return nhanVienService.findAll();
	}

	@GetMapping("/dsnhanvien/{id}")
	public NhanVien findById(@PathVariable int id) {
		return nhanVienService.findById(id);
	}

	@PostMapping("/dsnhanvien")
	public NhanVien addNhanVien(@RequestBody NhanVien nhanVien) {
		nhanVien.setId(0);
		nhanVienService.saveNhanVien(nhanVien);
		return nhanVien;
	}

	@PutMapping("/dsnhanvien")
	public NhanVien updateNhanVien(@RequestBody NhanVien nhanVien) {
		nhanVienService.saveNhanVien(nhanVien);
		return nhanVien;
	}

	@DeleteMapping("/dsnhanvien/{id}")
	public String deleteById(@PathVariable int id) {
		NhanVien nhanVien = nhanVienService.findById(id);
		if (nhanVien == null) {
			return "Nhan Vien Id not found !";
		}
		nhanVienService.deleteById(id);
		return "Deleted";

	}
}
