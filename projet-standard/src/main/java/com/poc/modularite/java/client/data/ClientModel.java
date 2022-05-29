package com.poc.modularite.java.client.data;

import java.io.Serializable;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENT")
public class ClientModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2564573656202877858L;

	@Id
	@Column(name = "CLI_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "CLI_TYPE")
	@Enumerated(EnumType.STRING)
	private ClientTypeEnum clientType;
	
	@Column(name = "CLI_NAME")
	private String clientName;
	
	@Column(name = "CLI_SURNAME")
	private String clientSurname;
	
	@Column(name = "CLI_CREA_DATE")
	private LocalTime clientCreationDate;
	
	@Column(name = "CLI_UPD_DATE")
	private LocalTime clientUpdateDate;
	
	@Column(name = "CLI_SUP_DATE")
	private LocalTime clientSuppressionDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ClientTypeEnum getClientType() {
		return clientType;
	}

	public void setClientType(ClientTypeEnum clientType) {
		this.clientType = clientType;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientSurname() {
		return clientSurname;
	}

	public void setClientSurname(String clientSurname) {
		this.clientSurname = clientSurname;
	}

	public LocalTime getClientCreationDate() {
		return clientCreationDate;
	}

	public void setClientCreationDate(LocalTime clientCreationDate) {
		this.clientCreationDate = clientCreationDate;
	}

	public LocalTime getClientUpdateDate() {
		return clientUpdateDate;
	}

	public void setClientUpdateDate(LocalTime clientUpdateDate) {
		this.clientUpdateDate = clientUpdateDate;
	}

	public LocalTime getClientSuppressionDate() {
		return clientSuppressionDate;
	}

	public void setClientSuppressionDate(LocalTime clientSuppressionDate) {
		this.clientSuppressionDate = clientSuppressionDate;
	}

	public ClientModel() {
		super();
	}

	
	
	
	
	
}
