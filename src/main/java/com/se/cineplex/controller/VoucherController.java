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

import com.se.cineplex.entity.Voucher;
import com.se.cineplex.service.VoucherService;

@RestController
@RequestMapping("/api")
public class VoucherController {
	
	@Autowired
	private VoucherService voucherService;
	
	@GetMapping("/dsvoucher")
	public List<Voucher> findAll() {
		return voucherService.findAll();
	}
	
	@GetMapping("/voucher/{id}")
	public Voucher findById(@PathVariable int id) {
		return voucherService.findById(id);
	}
	
	@PostMapping("/voucher")
	public Voucher addVoucher(@RequestBody Voucher voucher) {
		voucher.setId(0);
		voucherService.saveVoucher(voucher);
		return voucher;
	}
	
	@PutMapping("/voucher")
	public Voucher updateVoucher(@RequestBody Voucher voucher) {
		voucherService.saveVoucher(voucher);
		return voucher;
	}
	
	@DeleteMapping("/voucher/{id}")
	public String deleteById(@PathVariable int id) {
		Voucher voucher = voucherService.findById(id);
		if (voucher == null) {
			return "Voucher Id not found !";
		}
		voucherService.deleteById(id);
		return "Deleted";
	}


}
