package com.cgi.modularite.poc.products.data.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTS")
public class ProductsModel {

	@Id
	@Column(name = "PRD_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "PRD_NAME", nullable = false, length = 64)
	private String name;

	@Column(name = "PRD_BARCODE", nullable = false)
	private Integer barcode;

	@Column(name = "PRD_USER_CREA", nullable = false, length = 64)
	private String userCrea;

	@Column(name = "PRD_CREA_DATE", nullable = false)
	private LocalDateTime creaDate;

	@Column(name = "PRD_USER_UPD", nullable = false, length = 64)
	private String userUpd;

	@Column(name = "PRD_UPD_DATE", nullable = false)
	private LocalDateTime updateDate;

	@Column(name = "PRD_SUP_DATE", nullable = true)
	private LocalDateTime supDate;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getBarcode() {
		return this.barcode;
	}

	public void setBarcode(Integer barcode) {
		this.barcode = barcode;
	}

	public String getUserCrea() {
		return this.userCrea;
	}

	public void setUserCrea(String userCrea) {
		this.userCrea = userCrea;
	}

	public LocalDateTime getCreaDate() {
		return this.creaDate;
	}

	public void setCreaDate(LocalDateTime creaDate) {
		this.creaDate = creaDate;
	}

	public String getUserUpd() {
		return this.userUpd;
	}

	public void setUserUpd(String userUpd) {
		this.userUpd = userUpd;
	}

	public LocalDateTime getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}

	public LocalDateTime getSupDate() {
		return this.supDate;
	}

	public void setSupDate(LocalDateTime supDate) {
		this.supDate = supDate;
	}

	public ProductsModel() {
		super();
	}

}
