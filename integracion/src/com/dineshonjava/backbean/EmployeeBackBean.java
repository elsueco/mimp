package com.dineshonjava.backbean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dineshonjava.model.Employee;
import com.dineshonjava.service.EmployeeService;

@Component
@ManagedBean
@SessionScoped
public class EmployeeBackBean {

	@Autowired
	EmployeeService employeeService;
	 
	public void addEmployee(Employee employee){
		employeeService.addEmployee(employee);
	}
	public List<Employee> getListEmployeess() {
		return employeeService.listEmployeess();
	}

	public Employee getEmployee(int empid) {
		return employeeService.getEmployee(empid);
	}
	
	public void deleteEmployee(Employee employee) {
		employeeService.deleteEmployee(employee);
	}
	 
}
