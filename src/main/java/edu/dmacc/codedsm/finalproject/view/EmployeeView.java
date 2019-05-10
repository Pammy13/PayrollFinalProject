package edu.dmacc.codedsm.finalproject.view;

import edu.dmacc.codedsm.finalproject.model.Employee;

public class EmployeeView{
    public static void displayEmployee( Employee employee ) {

        System.out.println("Employee id number: " + employee.getIdNumber());
        System.out.println("Employee name: " + employee.getName());
        System.out.println("Employee hourly rate: " + employee.getHourlyRate());
        System.out.println("Hours worked: " + employee.getHoursWorked());
        System.out.println();

    }

}

