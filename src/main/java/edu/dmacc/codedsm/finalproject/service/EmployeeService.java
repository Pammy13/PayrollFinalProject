package edu.dmacc.codedsm.finalproject.service;

import edu.dmacc.codedsm.finalproject.model.Employee;
import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;

import java.util.Scanner;

public class EmployeeService{

    public void updateEmployeeHoursWorked( String id, EmployeeRepository employeeRepository ) {

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
