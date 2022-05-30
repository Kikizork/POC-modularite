package com.poc.modularite.java.data.dto;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.poc.modularite.java.common.data.dto.IDTO;
import com.poc.modularite.java.data.model.EntrepriseModel;

public class EntrepriseDTO implements IDTO<EntrepriseModel, EntrepriseDTO> {

	/**
	 *
	 */
	private static final long serialVersionUID = 9113080547381212524L;

	private Integer id;

	private String entrepriseName;

	private String entrepriseMailSuffixe;

	private LocalTime entrepriseCreationDate;

	private LocalTime entrepriseUpdateDate;

	private LocalTime entrepriseSuppressionDate;

	private List<EmployeeDTO> employeeDTOs = new ArrayList<>();

	private List<ClientDTO> clientDTOs = new ArrayList<>();

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEntrepriseName() {
		return this.entrepriseName;
	}

	public void setEntrepriseName(String entrepriseName) {
		this.entrepriseName = entrepriseName;
	}

	public String getEntrepriseMailSuffixe() {
		return this.entrepriseMailSuffixe;
	}

	public void setEntrepriseMailSuffixe(String entrepriseMailSuffixe) {
		this.entrepriseMailSuffixe = entrepriseMailSuffixe;
	}

	public LocalTime getEntrepriseCreationDate() {
		return this.entrepriseCreationDate;
	}

	public void setEntrepriseCreationDate(LocalTime entrepriseCreationDate) {
		this.entrepriseCreationDate = entrepriseCreationDate;
	}

	public LocalTime getEntrepriseUpdateDate() {
		return this.entrepriseUpdateDate;
	}

	public void setEntrepriseUpdateDate(LocalTime entrepriseUpdateDate) {
		this.entrepriseUpdateDate = entrepriseUpdateDate;
	}

	public LocalTime getEntrepriseSuppressionDate() {
		return this.entrepriseSuppressionDate;
	}

	public void setEntrepriseSuppressionDate(LocalTime entrepriseSuppressionDate) {
		this.entrepriseSuppressionDate = entrepriseSuppressionDate;
	}

	public List<EmployeeDTO> getEmployeeDTOs() {
		return this.employeeDTOs;
	}

	public void setEmployeeDTOs(List<EmployeeDTO> employeeDTOs) {
		this.employeeDTOs = employeeDTOs;
	}

	public List<ClientDTO> getClientDTOs() {
		return this.clientDTOs;
	}

	public void setClientDTOs(List<ClientDTO> clientDTOs) {
		this.clientDTOs = clientDTOs;
	}

	public EntrepriseDTO() {
		super();
	}

	@Override
	public EntrepriseModel convertToModelWithoutChildTable() {
		final EntrepriseModel model = new EntrepriseModel();
		model.setId(this.id);
		model.setEntrepriseName(this.entrepriseName);
		model.setEntrepriseMailSuffixe(this.entrepriseMailSuffixe);
		model.setEntrepriseCreationDate(this.entrepriseCreationDate);
		model.setEntrepriseUpdateDate(this.entrepriseUpdateDate);
		model.setEntrepriseSuppressionDate(this.entrepriseSuppressionDate);
		return model;
	}

	@Override
	public EntrepriseModel convertToModelWithChildTable() {
		final EntrepriseModel model = convertToModelWithoutChildTable();

		if (this.employeeDTOs != null) {
			model.setEmployeeModels((this.employeeDTOs.stream().map(d -> d.convertToModelWithChildTable())
					.collect(Collectors.toList())));
		}

		if (this.clientDTOs != null) {
			model.setClientModels(
					this.clientDTOs.stream().map(d -> d.convertToModelWithChildTable()).collect(Collectors.toList()));
		}

		return model;
	}

	@Override
	public EntrepriseDTO modelToDTOWithoutChildTable(EntrepriseModel model) {
		this.id = model.getId();
		this.entrepriseName = model.getEntrepriseName();
		this.entrepriseMailSuffixe = model.getEntrepriseMailSuffixe();
		this.entrepriseCreationDate = model.getEntrepriseCreationDate();
		this.entrepriseUpdateDate = model.getEntrepriseUpdateDate();
		this.entrepriseSuppressionDate = model.getEntrepriseSuppressionDate();
		return this;
	}

	@Override
	public EntrepriseDTO modelToDTOWithChildTable(EntrepriseModel model) {
		modelToDTOWithoutChildTable(model);

		if (model.getEmployeeModels() != null) {
			this.employeeDTOs = model.getEmployeeModels().stream()
					.map(m -> new EmployeeDTO().modelToDTOWithChildTable(m)).collect(Collectors.toList());
		}
		if (model.getClientModels() != null) {
			this.clientDTOs = model.getClientModels().stream().map(m -> new ClientDTO().modelToDTOWithChildTable(m))
					.collect(Collectors.toList());
		}
		return this;
	}

}
