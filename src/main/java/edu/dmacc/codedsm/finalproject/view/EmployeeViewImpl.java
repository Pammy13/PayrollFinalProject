package edu.dmacc.codedsm.finalproject.view;

import edu.dmacc.codedsm.finalproject.model.Employee;

import java.util.List;

public class EmployeeViewImpl implements EmployeeView{

    private Employee employee;

    public void display() {
        System.out.println("Employee id number: " + employee.getIdNumber());
        System.out.println("Employee name: " + employee.getName());
        System.out.println("Employee hourly rate: " + employee.getHourlyRate());
        System.out.println("Hours worked: " + employee.getHoursWorked());
        System.out.println();
    }

    public void setEmployee (Employee employee) {
          this.employee = employee;

    }


}

