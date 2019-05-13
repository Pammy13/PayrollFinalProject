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

    public static void updateHours() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee ID number: ");
        String id = scanner.next();

        EmployeeService.updateHoursWorked(id);


    }

}
