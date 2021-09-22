package com.bstek.demo.urule.entity;

import java.io.Serializable;
import java.util.Date;

import com.bstek.urule.model.Label;

public class Employee implements Serializable {
	private static final long serialVersionUID = 7521258772293356125L;
	@Label("ID")
	private long id;
	@Label("LastName")
	private String lastName;
	@Label("FirstName")
	private String firstName;
	@Label("Title")
	private String title;
	@Label("TitleOfCourtesy")
	private String titleOfCourtesy;
	@Label("Sex")
	private Boolean sex;
	@Label("Birthdate")
	private Date birthDate;
	@Label("Hire Date")
	private Date hireDate;
	@Label("Address")
	private String address;
	@Label("City")
	private String city;
	@Label("Region")
	private String region;
	@Label("Postal Code")
	private String postalCode;
	@Label("Country")
	private String country;
	@Label("Phone")
	private String phone;
	@Label("Extension")
	private String extension;
	@Label("Notes")
	private String notes;
	@Label("Reports To")
	private Employee reportsTo;
	@Label("Reports To Id")
	private Long reportsToId;
	@Label("Photo Path")
	private String photoPath;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitleOfCourtesy() {
		return titleOfCourtesy;
	}

	public void setTitleOfCourtesy(String titleOfCourtesy) {
		this.titleOfCourtesy = titleOfCourtesy;
	}

	public Boolean getSex() {
		return sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Employee getReportsTo() {
		return reportsTo;
	}

	public void setReportsTo(Employee reportsTo) {
		this.reportsTo = reportsTo;
	}

	public Long getReportsToId() {
		return reportsToId;
	}

	public void setReportsToId(Long reportsToId) {
		this.reportsToId = reportsToId;
	}

	public String getPhotoPath() {
		return photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}
}
