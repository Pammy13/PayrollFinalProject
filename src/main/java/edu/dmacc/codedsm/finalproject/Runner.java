package edu.dmacc.codedsm.finalproject;

import edu.dmacc.codedsm.finalproject.controller.*;
import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;
import edu.dmacc.codedsm.finalproject.service.DataLoaderService;
import edu.dmacc.codedsm.finalproject.service.EmployeeService;
import edu.dmacc.codedsm.finalproject.service.PayrollService;
import edu.dmacc.codedsm.finalproject.service.PayrollServiceImpl;
import edu.dmacc.codedsm.finalproject.view.InputView;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) throws Exception {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        DataLoaderService dataLoaderService = new DataLoaderService(employeeRepository);
        DataLoaderController dataLoaderController = new DataLoaderController(dataLoaderService);
        dataLoaderController.loadEmployeeRepository();

        EmployeeService employeeService = new EmployeeService(employeeRepository);
        //EmployeeController employeeController = new EmployeeController(employeeRepository, employeeService);

        PayrollService payrollService = new PayrollServiceImpl(employeeRepository);
        //PayrollController payrollController = new PayrollControllerImpl(employeeRepository, payrollService);

        ViewController viewController = new ViewController();
        InputView view = viewController.getDisplay();
        view.displayUserOptionsV2(employeeService, payrollService);
    }

}