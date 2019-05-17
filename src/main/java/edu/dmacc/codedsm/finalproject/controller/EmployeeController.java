package edu.dmacc.codedsm.finalproject.controller;


import edu.dmacc.codedsm.finalproject.model.Employee;
import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;
import edu.dmacc.codedsm.finalproject.repository.EmployeeRepositoryv2;
import edu.dmacc.codedsm.finalproject.service.EmployeeService;

import java.util.Collection;
import java.util.Scanner;

public class EmployeeController {

    private EmployeeRepositoryv2 employeeRepository;
    private EmployeeService employeeService;

    public EmployeeController( EmployeeRepositoryv2 employeeRepository, EmployeeService employeeService){
        this.employeeRepository = employeeRepository;
        this.employeeService = employeeService;
    }

    public static Collection<Employee> gatherEmployees() {
        return EmployeeService.gatherEmployees();
    }

    public static void updateHours() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee ID number: ");
        String id = scanner.next();

        EmployeeService.updateHoursWorked(id);
    }

    public Collection<Employee>  displayAllEmployees(){
        return employeeRepository.getAllEmployees();
    }

    public void updateHoursV2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee ID number: ");
        String id = scanner.next();
        employeeService.updateEmployeeHoursWorked(id, employeeRepository);
    }
}
