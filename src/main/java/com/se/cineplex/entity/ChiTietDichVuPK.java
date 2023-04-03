package com.se.cineplex.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class ChiTietDichVuPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int donDat;

	private int dichVu;

	public ChiTietDichVuPK() {
		super();
	}

	@Override
	public String toString() {
		return "ChiTietDichVuPK [donDat=" + donDat + ", dichVu=" + dichVu + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dichVu, donDat);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChiTietDichVuPK other = (ChiTietDichVuPK) obj;
		return dichVu == other.dichVu && donDat == other.donDat;
	}

}
