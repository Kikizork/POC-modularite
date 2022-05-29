package com.poc.modularite.java.data.dto;

import java.time.LocalTime;

import com.poc.modularite.java.common.data.dto.IDTO;
import com.poc.modularite.java.data.enums.ClientTypeEnum;
import com.poc.modularite.java.data.model.ClientModel;

public class ClientDTO implements IDTO<ClientModel, ClientDTO> {

	/**
	 *
	 */
	private static final long serialVersionUID = 2787386732675477601L;

	private Integer id;

	private ClientTypeEnum clientType;

	private String clientName;

	private String clientSurname;

	private LocalTime clientCreationDate;

	private LocalTime clientUpdateDate;

	private LocalTime clientSuppressionDate;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ClientTypeEnum getClientType() {
		return this.clientType;
	}

	public void setClientType(ClientTypeEnum clientType) {
		this.clientType = clientType;
	}

	public String getClientName() {
		return this.clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientSurname() {
		return this.clientSurname;
	}

	public void setClientSurname(String clientSurname) {
		this.clientSurname = clientSurname;
	}

	public LocalTime getClientCreationDate() {
		return this.clientCreationDate;
	}

	public void setClientCreationDate(LocalTime clientCreationDate) {
		this.clientCreationDate = clientCreationDate;
	}

	public LocalTime getClientUpdateDate() {
		return this.clientUpdateDate;
	}

	public void setClientUpdateDate(LocalTime clientUpdateDate) {
		this.clientUpdateDate = clientUpdateDate;
	}

	public LocalTime getClientSuppressionDate() {
		return this.clientSuppressionDate;
	}

	public void setClientSuppressionDate(LocalTime clientSuppressionDate) {
		this.clientSuppressionDate = clientSuppressionDate;
	}

	public ClientDTO() {
		super();
	}

	@Override
	public ClientModel convertToModelWithoutChildTable() {
		final ClientModel model = new ClientModel();
		model.setId(this.id);
		model.setClientType(this.clientType);
		model.setClientName(this.clientName);
		model.setClientSurname(this.clientSurname);
		model.setClientCreationDate(this.clientCreationDate);
		model.setClientUpdateDate(this.clientUpdateDate);
		model.setClientSuppressionDate(this.clientSuppressionDate);
		return model;
	}

	@Override
	public ClientModel convertToModelWithChildTable() {
		final ClientModel model = convertToModelWithoutChildTable();
		return model;
	}

	@Override
	public ClientDTO modelToDTOWithoutChildTable(ClientModel model) {
		this.id = model.getId();
		this.clientType = model.getClientType();
		this.clientName = model.getClientName();
		this.clientSurname = model.getClientSurname();
		this.clientCreationDate = model.getClientCreationDate();
		this.clientUpdateDate = model.getClientUpdateDate();
		this.clientSuppressionDate = model.getClientSuppressionDate();
		return this;
	}

	@Override
	public ClientDTO modelToDTOWithChildTable(ClientModel model) {
		modelToDTOWithoutChildTable(model);
		return this;
	}

}
