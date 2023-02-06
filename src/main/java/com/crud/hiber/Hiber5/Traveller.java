package com.crud.hiber.Hiber5;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Traveller")
public class Traveller {

	@Column(name="id")
	@Id
	private int id;
	@Column(name="traveller_name")
	private String name;
	@Column(name="package_name")
	private String package_name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPackage_name() {
		return package_name;
	}
	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}
	public Traveller(int id, String name, String package_name) {
		super();
		this.id = id;
		this.name = name;
		this.package_name = package_name;
	}
	public Traveller() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Traveller [id=" + id + ", name=" + name + ", package_name=" + package_name + "]";
	}
	
	
}
