package edu.dmacc.codedsm.finalproject;

import edu.dmacc.codedsm.finalproject.controller.DataLoaderController;
import edu.dmacc.codedsm.finalproject.controller.EmployeeController;
import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;
import edu.dmacc.codedsm.finalproject.view.AllEmployeeView;

import java.io.IOException;
import java.util.Scanner;

public class Runner{

    static Double hoursWorked = 0.00d;
    static Double myDouble;
    static String array1[];

    public static void main( String[] args ) throws IOException {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        DataLoaderController.loadEmployeeData();
        displayUserOptions();

    }

    public static void displayUserOptions() throws IOException {
        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);
        while (isRunning) {
            System.out.println("Press 1 to list all employees.");
            System.out.println("Press 2 to update employee hours worked.");
            System.out.println("Press 3 to process payroll.");
            System.out.println("Press 4 to exit program.");
            String userAnswer = scanner.next();
            {
                if (userAnswer.equals("1")) {
                    AllEmployeeView.displayAllEmployees();




                } else if (userAnswer.equals("2")) {

                    System.out.println("Enter employee ID number: ");
                    String id = scanner.next();

                    System.out.println("Enter hours worked: ");
                    Double hoursWorked = scanner.nextDouble();
                    Employee theEmployee = EmployeeRepository.getEmployee(id);
                    theEmployee.setHoursWorked(hoursWorked);
                    EmployeeRepository.saveEmployee(theEmployee);


                    EmployeeRepository.getEmployee(id).getHourlyRate();
                    Double netPay = hoursWorked * EmployeeRepository.getEmployee(id).getHourlyRate() / 1.2;
                    System.out.println(netPay);

                } else if (userAnswer.equals("3")) {
                    System.out.println("To process payroll for an employee, enter employee ID number: ");
                    String numberEntered = scanner.next();

                } else if (userAnswer.equals("4")) {
                    isRunning = false;

                } else {
                    System.out.println("You must press 1, 2, 3, or 4.");
                    System.out.println();
                    isRunning = true;
                }
            }
        }

    }
}