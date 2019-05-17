package edu.dmacc.codedsm.finalproject;

import edu.dmacc.codedsm.finalproject.controller.DataLoaderController;
import edu.dmacc.codedsm.finalproject.controller.EmployeeController;
import edu.dmacc.codedsm.finalproject.controller.PayrollController;
import edu.dmacc.codedsm.finalproject.controller.PayrollControllerImpl;
import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;
import edu.dmacc.codedsm.finalproject.repository.EmployeeRepositoryv2;
import edu.dmacc.codedsm.finalproject.service.DataLoaderServicev2;
import edu.dmacc.codedsm.finalproject.service.EmployeeService;
import edu.dmacc.codedsm.finalproject.service.PayrollService;
import edu.dmacc.codedsm.finalproject.service.PayrollServiceImpl;
import edu.dmacc.codedsm.finalproject.view.AllEmployeeViewImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) throws Exception {
        EmployeeRepositoryv2 employeeRepository = new EmployeeRepositoryv2();
        DataLoaderServicev2 dataLoaderService = new DataLoaderServicev2();
        DataLoaderController dataLoaderController = new DataLoaderController(employeeRepository, dataLoaderService);
        dataLoaderController.loadEmployeeRepository();

        EmployeeService employeeService = new EmployeeService();
        EmployeeController employeeController = new EmployeeController(employeeRepository, employeeService);

        PayrollService payrollService = new PayrollServiceImpl();
        PayrollController payrollController = new PayrollControllerImpl(employeeRepository, payrollService);



        //DataLoaderController.loadEmployeeData();
        //displayUserOptions();

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
                AllEmployeeViewImpl allEmployeeView = new AllEmployeeViewImpl();
                allEmployeeView.setEmployees(new ArrayList(employeeController.displayAllEmployees()));
                allEmployeeView.display();

                employeeController.displayAllEmployees();
            } else if (userAnswer.equals("2")) {
                employeeController.updateHoursV2();
                //EmployeeController employeeController = new EmployeeController(EmployeeController.updateHours();

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
                //EmployeeController employeeController = new EmployeeController(EmployeeController.updateHours();

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