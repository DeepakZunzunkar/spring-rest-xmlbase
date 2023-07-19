package com.dz.app.model;

public class Employee {

	private Integer id;
	private String name;
	private String contact;
	private String address;
	private String type;

	public Employee() {
	}

	public Employee(Integer id, String name, String contact, String address, String type) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.address = address;
		this.type = type;
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

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", contact=" + contact + ", address=" + address + ", type="
				+ type + "]";
	}

}
