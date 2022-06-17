package com.cgi.modularite.poc.users.data.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class UsersModel {

	@Id
	@Column(name = "USR_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "USR_USERNAME", nullable = false, length = 64)
	private String username;

	@Column(name = "USR_PASSWORD", nullable = false, length = 128)
	private String password;

	@Column(name = "USR_ACTIVATION_DATE")
	private LocalDate activationDate;

	@Column(name = "USR_USER_CREA", nullable = false, length = 64)
	private String userCrea;

	@Column(name = "USR_CREA_DATE", nullable = false)
	private LocalDateTime creaDate;

	@Column(name = "USR_USER_UPD", nullable = false, length = 64)
	private String userUpd;

	@Column(name = "USR_UPD_DATE", nullable = false)
	private LocalDateTime updateDate;

	@Column(name = "USR_SUP_DATE", nullable = true)
	private LocalDateTime supDate;

	@ManyToOne
	@JoinColumn(name = "AUTH_ID", nullable = false)
	private AuthoritiesModel authoritie;

	public AuthoritiesModel getAuthoritie() {
		return this.authoritie;
	}

	public void setAuthoritie(AuthoritiesModel authoritie) {
		this.authoritie = authoritie;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getActivationDate() {
		return this.activationDate;
	}

	public void setActivationDate(LocalDate activationDate) {
		this.activationDate = activationDate;
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

	public UsersModel() {
		super();
	}

}
