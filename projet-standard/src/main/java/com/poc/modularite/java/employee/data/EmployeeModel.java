package com.poc.modularite.java.employee.data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.poc.modularite.java.entreprise.data.EntrepriseModel;

@Entity
@Table(name = "EMPLOYEE")
public class EmployeeModel implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 9169572912175204402L;

	@Id
	@Column(name = "EMP_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "EMP_NAME")
	private String employeeName;

	@Column(name = "EMP_SURNAME")
	private String employeeSurname;

	@Column(name = "EMP_EMAIL")
	private String employeeEmail;

	@Column(name = "EMP_BIRTHDATE")
	private LocalDate employeeBirthdate;

	@Column(name = "EMP_START_WORK")
	private LocalDate employeeStartWork;

	@Column(name = "EMP_CREA_DATE")
	private LocalTime employeeCreationDate;

	@Column(name = "EMP_UPD_DATE")
	private LocalTime employeeUpdateDate;

	@Column(name = "EMP_SUP_DATE")
	private LocalTime employeeSuppressionDate;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ENT_ID")
	private EntrepriseModel entrepriseModel;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return this.employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeSurname() {
		return this.employeeSurname;
	}

	public void setEmployeeSurname(String employeeSurname) {
		this.employeeSurname = employeeSurname;
	}

	public String getEmployeeEmail() {
		return this.employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public LocalDate getEmployeeBirthdate() {
		return this.employeeBirthdate;
	}

	public void setEmployeeBirthdate(LocalDate employeeBirthdate) {
		this.employeeBirthdate = employeeBirthdate;
	}

	public LocalDate getEmployeeStartWork() {
		return this.employeeStartWork;
	}

	public void setEmployeeStartWork(LocalDate employeeStartWork) {
		this.employeeStartWork = employeeStartWork;
	}

	public LocalTime getEmployeeCreationDate() {
		return this.employeeCreationDate;
	}

	public void setEmployeeCreationDate(LocalTime employeeCreationDate) {
		this.employeeCreationDate = employeeCreationDate;
	}

	public LocalTime getEmployeeUpdateDate() {
		return this.employeeUpdateDate;
	}

	public void setEmployeeUpdateDate(LocalTime employeeUpdateDate) {
		this.employeeUpdateDate = employeeUpdateDate;
	}

	public LocalTime getEmployeeSuppressionDate() {
		return this.employeeSuppressionDate;
	}

	public void setEmployeeSuppressionDate(LocalTime employeeSuppressionDate) {
		this.employeeSuppressionDate = employeeSuppressionDate;
	}

	public EntrepriseModel getEntrepriseModel() {
		return this.entrepriseModel;
	}

	public void setEntrepriseModel(EntrepriseModel entrepriseModel) {
		this.entrepriseModel = entrepriseModel;
	}

	public EmployeeModel() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.employeeBirthdate, this.employeeCreationDate, this.employeeEmail, this.employeeName,
				this.employeeStartWork, this.employeeSuppressionDate, this.employeeSurname, this.employeeUpdateDate,
				this.id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final EmployeeModel other = (EmployeeModel) obj;
		return Objects.equals(this.employeeBirthdate, other.employeeBirthdate)
				&& Objects.equals(this.employeeCreationDate, other.employeeCreationDate)
				&& Objects.equals(this.employeeEmail, other.employeeEmail)
				&& Objects.equals(this.employeeName, other.employeeName)
				&& Objects.equals(this.employeeStartWork, other.employeeStartWork)
				&& Objects.equals(this.employeeSuppressionDate, other.employeeSuppressionDate)
				&& Objects.equals(this.employeeSurname, other.employeeSurname)
				&& Objects.equals(this.employeeUpdateDate, other.employeeUpdateDate)
				&& Objects.equals(this.id, other.id);
	}

	@Override
	public String toString() {
		return "EmployeeModel [id=" + this.id + ", employeeName=" + this.employeeName + ", employeeSurname="
				+ this.employeeSurname + ", employeeEmail=" + this.employeeEmail + ", employeeBirthdate="
				+ this.employeeBirthdate + ", employeeStartWork=" + this.employeeStartWork + ", employeeCreationDate="
				+ this.employeeCreationDate + ", employeeUpdateDate=" + this.employeeUpdateDate
				+ ", employeeSuppressionDate=" + this.employeeSuppressionDate + "]";
	}

}
