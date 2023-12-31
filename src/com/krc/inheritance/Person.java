package com.krc.inheritance;

public class Person {
	private String name;
	private String email;
	private String phone;

	Person(String name) {
		this.name = name;
	}

	Person(String name, String email) {
		this.name = name;
		setEmail(email);
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", phone="
				+ phone + "]";
	}

}
