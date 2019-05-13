package edu.dmacc.codedsm.finalproject.service;

import edu.dmacc.codedsm.finalproject.model.Employee;
import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class EmployeeService{
    public static Collection<Employee> gatherEmployees() {
        HashMap<String, Employee> employees = EmployeeRepository.getEmployees();
        return employees.values();

    }

    public static void updateHoursWorked( String id ) {

        if (EmployeeRepository.getEmployees().containsKey(id)) {
            System.out.println("Enter hours worked: ");
            Scanner scanner = new Scanner(System.in);
            String hoursWorked = scanner.next();


            if (hoursWorked.matches(("-?\\d+(\\.\\d+)?"))) {
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
