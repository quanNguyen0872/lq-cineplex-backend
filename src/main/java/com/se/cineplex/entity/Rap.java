package com.se.cineplex.entity;

import jakarta.persistence.Table;  

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
@Table(name = "rap")
public class Rap {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String tenRap;

	private String moTa;

	private List<String> dsHinhAnh;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ma_diachi", referencedColumnName = "id")
	private DiaChi diaChi;

	@OneToMany(mappedBy = "rap")
	@JsonIgnore
	private List<PhongChieu> dsPhongChieu;

	private String trangThai;

	public Rap() {
		super();
	}

	public Rap(int id, String tenRap, String moTa, List<String> dsHinhAnh, DiaChi diaChi, String trangThai) {
		super();
		this.id = id;
		this.tenRap = tenRap;
		this.moTa = moTa;
		this.dsHinhAnh = dsHinhAnh;
		this.diaChi = diaChi;
		this.trangThai = trangThai;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenRap() {
		return tenRap;
	}

	public void setTenRap(String tenRap) {
		this.tenRap = tenRap;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public List<String> getDsHinhAnh() {
		return dsHinhAnh;
	}

	public void setDsHinhAnh(List<String> dsHinhAnh) {
		this.dsHinhAnh = dsHinhAnh;
	}

	public DiaChi getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(DiaChi diaChi) {
		this.diaChi = diaChi;
	}

	public List<PhongChieu> getDsPhongChieu() {
		return dsPhongChieu;
	}

	public void setDsPhongChieu(List<PhongChieu> dsPhongChieu) {
		this.dsPhongChieu = dsPhongChieu;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

	@Override
	public String toString() {
		return "Rap [id=" + id + ", tenRap=" + tenRap + ", moTa=" + moTa + ", dsHinhAnh=" + dsHinhAnh + ", diaChi="
				+ diaChi + ", dsPhongChieu=" + dsPhongChieu + ", trangThai=" + trangThai + "]";
	}

}
