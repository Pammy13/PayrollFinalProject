package edu.dmacc.codedsm.finalproject.view;

import edu.dmacc.codedsm.finalproject.controller.EmployeeController;
import edu.dmacc.codedsm.finalproject.controller.PayrollController;

import java.util.Scanner;

public class InputView{

    public static void displayUserOptionsV2( EmployeeController employeeController,
                                             PayrollController payrollController) throws Exception {
        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);
        while (isRunning) {
            System.out.println("Press 1 to list all employees.");
            System.out.println("Press 2 to update employee hours worked.");
            System.out.println("Press 3 to process payroll.");
            System.out.println("Press 4 to exit program.");
            String userAnswer = scanner.next();

            if (userAnswer.equals("1")) {
                employeeController.displayAllEmployees();

            } else if (userAnswer.equals("2")) {
                employeeController.updateHoursV2();

            } else if (userAnswer.equals("3")) {
                payrollController.processPayrolls();

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
