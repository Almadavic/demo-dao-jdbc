package model.entities;

import java.sql.Date;

public class Seller {
private Integer id;
private String name;
private String emailString;
private Date birthDate;
private Double baseSalary;
private Department department;

public Seller() {
	
}




public Seller(Integer id, String name, String emailString, Date birthDate, Double baseSalary, Department department) {
	super();
	this.id = id;
	this.name = name;
	this.emailString = emailString;
	this.birthDate = birthDate;
	this.baseSalary = baseSalary;
	this.department = department;
}




public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmailString() {
	return emailString;
}

public void setEmailString(String emailString) {
	this.emailString = emailString;
}

public Date getBirthDate() {
	return birthDate;
}

public void setBirthDate(Date birthDate) {
	this.birthDate = birthDate;
}

public Double getBaseSalary() {
	return baseSalary;
}

public void setBaseSalary(Double baseSalary) {
	this.baseSalary = baseSalary;
}

public Department getDepartment() {
	return department;
}

public void setDepartment(Department department) {
	this.department = department;
}


}