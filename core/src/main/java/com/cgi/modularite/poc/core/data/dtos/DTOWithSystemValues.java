package com.cgi.modularite.poc.core.data.dtos;

import java.time.LocalDateTime;

@SuppressWarnings("serial")
public class DTOWithSystemValues implements CommonDTO {

	protected String userCrea;

	protected LocalDateTime creaDate;

	protected String userUpd;

	protected LocalDateTime updateDate;

	protected LocalDateTime supDate;

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

	public DTOWithSystemValues() {
		super();
	}

}
