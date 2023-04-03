package com.se.cineplex.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@IdClass(ChiTietDichVuPK.class)
public class ChiTietDichVu implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne
	@JoinColumn(name = "ma_dondat")
	private DonDat donDat;

	@Id
	@ManyToOne
	@JoinColumn(name = "ma_dichvu")
	private DichVu dichVu;

	private int soLuong;

	private double thanhTien;

	public ChiTietDichVu() {
		super();
	}

	public ChiTietDichVu(int soLuong, double thanhTien) {
		super();
		this.soLuong = soLuong;
		this.thanhTien = thanhTien;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public double getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien(double thanhTien) {
		this.thanhTien = thanhTien;
	}

	public DichVu getDichVu() {
		return dichVu;
	}

	public void setDichVu(DichVu dichVu) {
		this.dichVu = dichVu;
	}

	@Override
	public String toString() {
		return "ChiTietDichVu [soLuong=" + soLuong + ", thanhTien=" + thanhTien + "]";
	}

}
