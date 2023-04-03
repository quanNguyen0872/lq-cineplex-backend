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

import com.se.cineplex.entity.DonDat;
import com.se.cineplex.service.DonDatService;

@RestController
@RequestMapping
public class DonDatController {
	
	@Autowired
	private DonDatService donDatService;
	
	@GetMapping("/dsdondat")
	public List<DonDat> findAll() {
		return donDatService.findAll();
	}
	
	@GetMapping("/dondat/{id}")
	public DonDat findById(@PathVariable int id) {
		return donDatService.findById(id);
	}
	
	@PostMapping("/dondat")
	public DonDat addDonDat(@RequestBody DonDat donDat) {
		donDat.setId(0);
		donDatService.saveDonDat(donDat);
		return donDat;
	}
	
	@PutMapping("/dondat")
	public DonDat updateDonDat(@RequestBody DonDat donDat) {
		donDatService.saveDonDat(donDat);
		return donDat;
	}
	
	@DeleteMapping("/dondat/{id}")
	public String deleteById(@PathVariable int id) {
		DonDat donDat = donDatService.findById(id);
		if (donDat == null) {
			return "Don Dat Id not found !";
		}
		donDatService.deleteById(id);
		return "Deleted";
	}


}