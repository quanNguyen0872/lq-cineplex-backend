package com.se.cineplex.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "taikhoan")
public class TaiKhoan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String tenDangNhap;

	private String matKhau;

	private String trangThai;

	@Enumerated(EnumType.STRING)
	@Column(name = "role")
	private Role role;

	public TaiKhoan() {
		super();
	}

	public TaiKhoan(int id, String tenDangNhap, String matKhau, String trangThai, Role role) {
		super();
		this.id = id;
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
		this.trangThai = trangThai;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenDangNhap() {
		return tenDangNhap;
	}

	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "TaiKhoan [id=" + id + ", tenDangNhap=" + tenDangNhap + ", matKhau=" + matKhau + ", trangThai="
				+ trangThai + ", role=" + role + "]";
	}

}
