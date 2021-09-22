package com.bstek.demo.urule.entity;

import java.util.List;

import com.bstek.urule.model.Label;

public class Dept {
	@Label("ID")
	private String id;
	@Label("Name")
	private String name;
	@Label("Desc")
	private String dec;
	@Label("Employees")
	private List<Employee> employees;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDec() {
		return dec;
	}

	public void setDec(String dec) {
		this.dec = dec;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}