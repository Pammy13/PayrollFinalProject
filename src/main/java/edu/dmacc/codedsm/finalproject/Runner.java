package edu.dmacc.codedsm.finalproject;

import edu.dmacc.codedsm.finalproject.controller.DataLoaderController;
import edu.dmacc.codedsm.finalproject.controller.EmployeeController;
import edu.dmacc.codedsm.finalproject.controller.PayrollController;
import edu.dmacc.codedsm.finalproject.controller.PayrollControllerImpl;
import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;
import edu.dmacc.codedsm.finalproject.service.DataLoaderService;
import edu.dmacc.codedsm.finalproject.service.EmployeeService;
import edu.dmacc.codedsm.finalproject.service.PayrollService;
import edu.dmacc.codedsm.finalproject.service.PayrollServiceImpl;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) throws Exception {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        DataLoaderService dataLoaderService = new DataLoaderService();
        DataLoaderController dataLoaderController = new DataLoaderController(employeeRepository, dataLoaderService);
        dataLoaderController.loadEmployeeRepository();

        EmployeeService employeeService = new EmployeeService();
        EmployeeController employeeController = new EmployeeController(employeeRepository, employeeService);

        PayrollService payrollService = new PayrollServiceImpl();
        PayrollController payrollController = new PayrollControllerImpl(employeeRepository, payrollService);


        displayUserOptionsV2(employeeController, payrollController);

    }

    public static void displayUserOptionsV2(EmployeeController employeeController,
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