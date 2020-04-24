package com.capgemini.employeeapp.service;

import AssignmentLab11.com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements IEmployeeService {
	Employee emp;
	public EmployeeServiceImpl(Employee e)
	{
		this.emp=e;
	}
	@Override
	public void insuranceSystem() {
		
		System.out.println("-->"+emp.getInsuranceScheme());
	}

	@Override
	public void display() {
		System.out.println("\n "+emp.getName()+" Your Current insurance Scheme is:");
		insuranceSystem();
	}

	@Override
	public Employee getEmployeeDetails() {
		
		return this.emp;
	}

}
