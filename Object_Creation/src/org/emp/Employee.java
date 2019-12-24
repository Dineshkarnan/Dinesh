package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {
	public void emp() {
		System.out.println("Employee Name is : Dinesh.K");
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.emp();
	
		Company co = new Company();
		co.company_name();
		
		Project p = new Project();
	p.elearning();
	
	Client c = new Client();
	c.clientname();
	
	
	}

}
