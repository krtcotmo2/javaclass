package com.krc.inheritance;

public class Student extends Person {

	private String college;
	private String major;

	Student(String name) {
		super(name);
	}

	Student(String name, String college) {
		super(name);
		setCollege(college);
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}


	@Override
	public String toString() {
		return "Student [college=" + college + ", major=" + major + "]"
				+ super.toString();
	}

}
