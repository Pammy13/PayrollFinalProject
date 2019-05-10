package edu.dmacc.codedsm.finalproject.view;

import edu.dmacc.codedsm.finalproject.Employee;
import edu.dmacc.codedsm.finalproject.controller.EmployeeController;
import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;

public class AllEmployeeView {
    public static void displayAllEmployees() {

        for (Employee employee : EmployeeController.gatherEmployees()) {
            System.out.println("Employee id number: " + employee.getIdNumber());
            System.out.println("Employee name: " + employee.getName());
            System.out.println("Employee hourly rate: " + employee.getHourlyRate());
            System.out.println("Hours worked: " + employee.getHoursWorked());
            System.out.println();

        }

    }
}
