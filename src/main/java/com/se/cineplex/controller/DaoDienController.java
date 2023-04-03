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

import com.se.cineplex.entity.DaoDien;
import com.se.cineplex.service.DaoDienService;

@RestController
@RequestMapping("/api")
public class DaoDienController {

	@Autowired
	private DaoDienService daoDienService;

	@GetMapping("/dsdaodien")
	public List<DaoDien> findAll() {
		return daoDienService.findAll();
	}

	@GetMapping("/daodien/{id}")
	public DaoDien findById(@PathVariable int id) {
		return daoDienService.findById(id);
	}

	@PostMapping("/daodien")
	public DaoDien addDaoDien(@RequestBody DaoDien daoDien) {
		daoDien.setId(0);
		daoDienService.saveDaoDien(daoDien);
		return daoDien;
	}

	@PutMapping("/daodien")
	public DaoDien updateDaoDien(@RequestBody DaoDien daoDien) {
		daoDienService.saveDaoDien(daoDien);
		return daoDien;
	}

	@DeleteMapping("/daodien/{id}")
	public String deleteById(@PathVariable int id) {
		DaoDien daoDien = daoDienService.findById(id);
		if (daoDien == null) {
			return "Dao Dien Id not found !";
		}
		daoDienService.deleteById(id);
		return "Deleted";

	}
}
