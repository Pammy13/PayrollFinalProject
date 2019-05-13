package edu.dmacc.codedsm.finalproject.controller;


import edu.dmacc.codedsm.finalproject.model.Employee;
import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;
import edu.dmacc.codedsm.finalproject.service.EmployeeService;

import java.util.Collection;
import java.util.Scanner;

public class EmployeeController {

    public static Collection<Employee> gatherEmployees() {
        return EmployeeService.gatherEmployees();
    }

    EmployeeRepository employeeRepository = new EmployeeRepository();

    public static void updateHours() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee ID number: ");
        String id = scanner.next();

        if (EmployeeRepository.getEmployees().containsKey(id)) {
            System.out.println("Enter hours worked: ");
            String hoursWorked = scanner.next();

            if (hoursWorked.matches(("-?\\d+(\\.\\d+)?"))){
                Employee theEmployee = EmployeeRepository.getEmployee(id);
                theEmployee.setHoursWorked(Double.parseDouble(hoursWorked));
                EmployeeRepository.saveEmployee(theEmployee);
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
