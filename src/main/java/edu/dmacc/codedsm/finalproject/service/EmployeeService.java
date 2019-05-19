package edu.dmacc.codedsm.finalproject.service;

import edu.dmacc.codedsm.finalproject.model.Employee;
import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;
import edu.dmacc.codedsm.finalproject.view.AllEmployeeViewImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeService{

    EmployeeRepository employeeRepository;

    public EmployeeService( EmployeeRepository employeeRepository ) {
        this.employeeRepository = employeeRepository;
    }

    public void displayAllEmployees() {
        AllEmployeeViewImpl allEmployeeView = new AllEmployeeViewImpl();
        allEmployeeView.setEmployees(new ArrayList(employeeRepository.getAllEmployees()));
        allEmployeeView.display();
    }

    public void updateHoursV2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee ID number: ");
        String id = scanner.next();
        updateEmployeeHoursWorked(id);
    }

    public void updateEmployeeHoursWorked( String id ) {
        if (employeeRepository.getEmployees().containsKey(id)) {
            System.out.println("Enter hours worked: ");
            Scanner scanner = new Scanner(System.in);
            String hoursWorked = scanner.next();


            if (hoursWorked.matches(("-?\\d+(\\.\\d+)?"))) {
                Employee theEmployee = employeeRepository.getEmployee(id);
                theEmployee.setHoursWorked(Double.parseDouble(hoursWorked));
                employeeRepository.saveEmployee(theEmployee);
            } else {
                System.out.println("You must enter a valid number for hours worked.");
                System.out.println("Valid numbers are whole numbers or whole numbers with decimals.");
                System.out.println();
            }
        } else {
            System.out.println("You must enter a valid ID number. ID numbers range from 1 - 10.");
            System.out.println();
        }
    }

}
