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

import com.se.cineplex.entity.Phim;
import com.se.cineplex.service.PhimService;

@RestController
@RequestMapping("/api")
public class PhimController {

	@Autowired
	private PhimService phimService;

	@GetMapping("/dsphim")
	public List<Phim> findAll() {
		return phimService.findAll();
	}

	@GetMapping("/dsphim/{id}")
	public Phim findById(@PathVariable int id) {
		return phimService.findById(id);
	}

	@PostMapping("/dsphim")
	public Phim addPhim(@RequestBody Phim phim) {
		phim.setId(0);
		phimService.savePhim(phim);
		return phim;
	}

	@PutMapping("/dsphim")
	public Phim updatePhim(@RequestBody Phim phim) {
		phimService.savePhim(phim);
		return phim;
	}

	@DeleteMapping("/dsphim/{id}")
	public String deleteById(@PathVariable int id) {
		Phim phim = phimService.findById(id);
		if (phim == null) {
			return "Phim Id not found !";
		}
		phimService.deleteById(id);
		return "Deleted";
	}

}
