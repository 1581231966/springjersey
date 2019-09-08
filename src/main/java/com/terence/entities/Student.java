package com.terence.entities;

/*
* Author: Terence-->in home*
* Date: 2019-9-7*/

public class Student {

	private String name ;
	private String age ;
	private String school;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", age='" + age + '\'' +
				", school='" + school + '\'' +
				'}';
	}
}
