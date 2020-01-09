package com;

public class RegularEmployee extends Employee{
private int salary;
private int bonus;
public RegularEmployee() {
	// TODO Auto-generated constructor stub
}
public RegularEmployee(int salary, int bonus) {
	super();
	this.salary = salary;
	this.bonus = bonus;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getBonus() {
	return bonus;
}
public void setBonus(int bonus) {
	this.bonus = bonus;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + bonus;
	result = prime * result + salary;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	RegularEmployee other = (RegularEmployee) obj;
	if (bonus != other.bonus)
		return false;
	if (salary != other.salary)
		return false;
	return true;
}
@Override
public String toString() {
	return "RegularEmployee [salary=" + salary + ", bonus=" + bonus + "]";
}

}
