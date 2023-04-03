package com.se.cineplex.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "dondat")
public class DonDat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private Date ngayDat;

	private double tongTien;

	@ManyToOne
	@JoinColumn(name = "ma_khachhang")
	private KhachHang khachHang;

	@ManyToOne
	@JoinColumn(name = "ma_nhanvien")
	private NhanVien nhanVien;

	@OneToMany(mappedBy = "donDat")
	private List<Ve> dsVe;

	@OneToMany(mappedBy = "donDat")
	private List<ChiTietDichVu> dsChiTietDichVu;

	@OneToMany(mappedBy = "donDat")
	private List<ChiTietVoucher> dsChiTietVoucher;

	public DonDat() {
		super();
	}

	public DonDat(int id, Date ngayDat, double tongTien, KhachHang khachHang, NhanVien nhanVien, List<Ve> dsVe,
			List<ChiTietDichVu> dsChiTietDichVu, List<ChiTietVoucher> dsChiTietVoucher) {
		super();
		this.id = id;
		this.ngayDat = ngayDat;
		this.tongTien = tongTien;
		this.khachHang = khachHang;
		this.nhanVien = nhanVien;
		this.dsVe = dsVe;
		this.dsChiTietDichVu = dsChiTietDichVu;
		this.dsChiTietVoucher = dsChiTietVoucher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getNgayDat() {
		return ngayDat;
	}

	public void setNgayDat(Date ngayDat) {
		this.ngayDat = ngayDat;
	}

	public double getTongTien() {
		return tongTien;
	}

	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}

	public List<Ve> getDsVe() {
		return dsVe;
	}

	public void setDsVe(List<Ve> dsVe) {
		this.dsVe = dsVe;
	}

	public List<ChiTietDichVu> getDsChiTietDichVu() {
		return dsChiTietDichVu;
	}

	public void setDsChiTietDichVu(List<ChiTietDichVu> dsChiTietDichVu) {
		this.dsChiTietDichVu = dsChiTietDichVu;
	}

	public List<ChiTietVoucher> getDsChiTietVoucher() {
		return dsChiTietVoucher;
	}

	public void setDsChiTietVoucher(List<ChiTietVoucher> dsChiTietVoucher) {
		this.dsChiTietVoucher = dsChiTietVoucher;
	}

	@Override
	public String toString() {
		return "DonDat [id=" + id + ", ngayDat=" + ngayDat + ", tongTien=" + tongTien + ", khachHang=" + khachHang
				+ ", nhanVien=" + nhanVien + ", dsVe=" + dsVe + ", dsChiTietDichVu=" + dsChiTietDichVu
				+ ", dsChiTietVoucher=" + dsChiTietVoucher + "]";
	}

}
