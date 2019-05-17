package edu.dmacc.codedsm.finalproject.service;

import edu.dmacc.codedsm.finalproject.controller.EmployeeController;
import edu.dmacc.codedsm.finalproject.model.Employee;
import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;
import edu.dmacc.codedsm.finalproject.repository.EmployeeRepositoryv2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PayrollServiceImpl implements PayrollService{
    public static void processPayroll() throws IOException {
        FileWriter fileWriter = new FileWriter("payroll_results.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);

        for (Employee employee : EmployeeController.gatherEmployees()) {
            printWriter.print("\nEmployee id number: " + employee.getIdNumber());
            printWriter.print("\nEmployee name: " + employee.getName());
            Double netPay = employee.getHourlyRate() * employee.getHoursWorked() / 1.2;
            printWriter.print("\nEmployee net pay: " + netPay);
            printWriter.println();
        }
        printWriter.close();
    }

    public void processPayrolls( EmployeeRepositoryv2 employeeRepository ) throws Exception{
        FileWriter fileWriter = new FileWriter("payroll_results.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);

        for (Employee employee : employeeRepository.getAllEmployees()) {
            printWriter.print("\nEmployee id number: " + employee.getIdNumber());
            printWriter.print("\nEmployee name: " + employee.getName());
            Double netPay = employee.getHourlyRate() * employee.getHoursWorked() / 1.2;
            printWriter.print("\nEmployee net pay: " + netPay);
            printWriter.println();
        }
        printWriter.close();
    }
}
