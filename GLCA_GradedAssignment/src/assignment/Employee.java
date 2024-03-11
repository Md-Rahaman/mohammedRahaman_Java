package assignment;

import java.io.Serializable;

public class Employee implements Serializable
{
	private static final long serialVersionUID=1684;
	private String employeeId;
	private String employeeName;
	private String employeePhone;
	private String employeeAddress;
	private int emoloyeeSalary;

	public Employee(String employeeId,String employeeName,String employeePhone,String employeeAddress,int emoloyeeSalary) 
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeePhone=employeePhone;
		this.employeeAddress=employeeAddress;
		this.emoloyeeSalary=emoloyeeSalary;
	}

	public String getEmployeeId() 
	{
		return employeeId;
	}

	public void setEmployeeId(String employeeId) 
	{
		this.employeeId = employeeId;
	}

	public String getEmployeeName() 
	{
		return employeeName;
	}

	public void setEmployeeName(String employeeName) 
	{
		this.employeeName = employeeName;
	}

	public String getEmployeePhone() 
	{
		return employeePhone;
	}

	public void setEmployeePhone(String employeePhone) 
	{
		this.employeePhone = employeePhone;
	}

	public String getEmployeeAddress() 
	{
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) 
	{
		this.employeeAddress = employeeAddress;
	}

	public int getEmoloyeeSalary() 
	{
		return emoloyeeSalary;
	}

	public void setEmoloyeeSalary(int emoloyeeSalary) 
	{
		this.emoloyeeSalary = emoloyeeSalary;
	}

	@Override
	public String toString() 
	{
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeePhone="
				+ employeePhone + ", employeeAddress=" + employeeAddress + ", emoloyeeSalary=" + emoloyeeSalary + "]";
	}




}
