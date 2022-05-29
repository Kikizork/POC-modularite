package com.poc.modularite.java.data.model;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

@Entity
@Table(name = "ENTREPRISE")
public class EntrepriseModel implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 6090186866942239795L;

	@Id
	@Column(name = "ENT_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "ENT_NAME")
	private String entrepriseName;

	@Column(name = "EMP_MAIL_SUFFIXE")
	private String entrepriseMailSuffixe;

	@Column(name = "ENT_CREA_DATE")
	private LocalTime entrepriseCreationDate;

	@Column(name = "ENT_UPD_DATE")
	private LocalTime entrepriseUpdateDate;

	@Column(name = "ENT_SUP_DATE")
	private LocalTime entrepriseSuppressionDate;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "ENT_ID")
	@OrderBy("employeeName")
	private List<EmployeeModel> employeeModels;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "RELATION_CLIENT", joinColumns = @JoinColumn(name = "ENT_ID"), inverseJoinColumns = @JoinColumn(name = "CLI_ID"))
	private List<ClientModel> clientModels;

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

	public List<EmployeeModel> getEmployeeModels() {
		return this.employeeModels;
	}

	public void setEmployeeModels(List<EmployeeModel> employeeModels) {
		this.employeeModels = employeeModels;
	}

	public List<ClientModel> getClientModels() {
		return this.clientModels;
	}

	public void setClientModels(List<ClientModel> clientModels) {
		this.clientModels = clientModels;
	}

	public EntrepriseModel() {
		super();
	}

}
