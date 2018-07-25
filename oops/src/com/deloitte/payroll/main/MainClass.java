package com.deloitte.payroll.main;

import com.deloitte.payroll.Accounts;
import com.deloitte.payroll.ConfirmedEmployee;
import com.deloitte.payroll.Employee;
import com.deloitte.payroll.HR;
import com.deloitte.payroll.Interns;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp;
		ConfirmedEmployee confirmedEmployee = new ConfirmedEmployee();
		Accounts accounts = new Accounts();
		accounts.processSalary(confirmedEmployee);
		
		Interns intern = new Interns();
		
		accounts.processSalary(intern);
		HR hr= new HR();
		
		emp = hr.recruit('I');
		accounts.processSalary(emp);
		emp = hr.recruit('P');
		accounts.processSalary(emp);
		hr.recruit('C');
		accounts.processSalary(emp);
		
	}

}
