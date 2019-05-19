package edu.dmacc.codedsm.finalproject.service;

import edu.dmacc.codedsm.finalproject.model.Employee;
import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;

import java.io.FileWriter;
import java.io.PrintWriter;

public class PayrollServiceImpl implements PayrollService{

    EmployeeRepository employeeRepository;

    public PayrollServiceImpl( EmployeeRepository employeeRepository ) {
        this.employeeRepository = employeeRepository;
    }

    public void processPayrolls() throws Exception {
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
