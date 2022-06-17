package com.cgi.modularite.poc.users.data.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AUTHORITIES")
public class AuthoritiesModel {

	@Id
	@Column(name = "AUTH_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "AUTH_LIB_AUTH", nullable = false, length = 64)
	private String libAuth;

	@Column(name = "AUTH_USER_CREA", nullable = false, length = 64)
	private String userCrea;

	@Column(name = "AUTH_CREA_DATE", nullable = false)
	private LocalDateTime creaDate;

	@Column(name = "AUTH_USER_UPD", nullable = false, length = 64)
	private String userUpd;

	@Column(name = "AUTH_UPD_DATE", nullable = false)
	private LocalDateTime updateDate;

	@Column(name = "AUTH_SUP_DATE", nullable = true)
	private LocalDateTime supDate;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLibAuth() {
		return this.libAuth;
	}

	public void setLibAuth(String libAuth) {
		this.libAuth = libAuth;
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

	public AuthoritiesModel() {
		super();
	}
}
