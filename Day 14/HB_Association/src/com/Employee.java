package com;

public class Employee {
private int employeeId;
private String employeeName;

public Employee() {
	// TODO Auto-generated constructor stub
}

public Employee(int employeeId, String employeeName) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
}

public int getEmployeeId() {
	return employeeId;
}

public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}

public String getEmployeeName() {
	return employeeName;
}

public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
	result = prime * result + employeeId;
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (employeeName == null) {
		if (other.employeeName != null)
			return false;
	} else if (!employeeName.equals(other.employeeName))
		return false;
	if (employeeId != other.employeeId)
		return false;
	return true;
}

@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
}


}
