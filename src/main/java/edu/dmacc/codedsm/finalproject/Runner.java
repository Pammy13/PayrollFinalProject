package edu.dmacc.codedsm.finalproject;

import edu.dmacc.codedsm.finalproject.controller.DataLoaderController;
import edu.dmacc.codedsm.finalproject.controller.EmployeeController;
import edu.dmacc.codedsm.finalproject.controller.PayrollControllerImpl;
import edu.dmacc.codedsm.finalproject.view.AllEmployeeViewImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) throws IOException {
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

            if (userAnswer.equals("1")) {
                AllEmployeeViewImpl allEmployeeView = new AllEmployeeViewImpl();
                allEmployeeView.setEmployees(new ArrayList(EmployeeController.gatherEmployees()));
                allEmployeeView.display();

            } else if (userAnswer.equals("2")) {
                EmployeeController.updateHours();

            } else if (userAnswer.equals("3")) {
                PayrollControllerImpl.processPayroll();

            } else if (userAnswer.equals("4")) {
                isRunning = false;

            } else {
                System.out.println("You must enter 1, 2, 3, or 4.");
                System.out.println();
                isRunning = true;
            }
        }
    }
}