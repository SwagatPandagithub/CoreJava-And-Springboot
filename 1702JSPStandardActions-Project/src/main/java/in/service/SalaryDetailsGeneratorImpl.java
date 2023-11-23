package in.service;

import in.beanDto.Employee;

public class SalaryDetailsGeneratorImpl implements SalaryDetailsGenerator {

	@Override
	public void generateSalaryDetails(Employee employee) {
		//generate gross salary and Net Salary
		
		float grossSal=employee.getbSal()+(employee.getbSal()*0.3f);
		float netSalary=grossSal-(employee.getbSal()*0.2f);
		
		System.out.println("basic salary   "+employee.getbSal());
		
		//Set those values in employee dto
		employee.setgSal(grossSal);
		employee.setNetSal(netSalary);
	}

}
