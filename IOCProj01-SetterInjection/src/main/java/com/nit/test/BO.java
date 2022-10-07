package com.nit.test;

import java.util.Objects;

public class BO {
	
	 String name;
	String dept;
	int phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "BO [name=" + name + ", dept=" + dept + ", phone=" + phone + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(dept, name, phone);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BO other = (BO) obj;
		return Objects.equals(dept, other.dept) && Objects.equals(name, other.name) && phone == other.phone;
	}
	
	

}
