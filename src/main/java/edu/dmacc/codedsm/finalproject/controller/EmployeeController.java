package edu.dmacc.codedsm.finalproject.controller;


import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;
import edu.dmacc.codedsm.finalproject.service.EmployeeService;
import edu.dmacc.codedsm.finalproject.view.AllEmployeeViewImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeController {

    private EmployeeRepository employeeRepository;
    private EmployeeService employeeService;

    public EmployeeController( EmployeeRepository employeeRepository, EmployeeService employeeService){
        this.employeeRepository = employeeRepository;
        this.employeeService = employeeService;
    }

    public void displayAllEmployees(){
        AllEmployeeViewImpl allEmployeeView = new AllEmployeeViewImpl();
        allEmployeeView.setEmployees(new ArrayList(employeeRepository.getAllEmployees()));
        allEmployeeView.display();
    }

    public void updateHoursV2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee ID number: ");
        String id = scanner.next();
        employeeService.updateEmployeeHoursWorked(id, employeeRepository);
    }
}
