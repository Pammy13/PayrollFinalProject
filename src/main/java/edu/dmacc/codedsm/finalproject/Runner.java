package edu.dmacc.codedsm.finalproject;

import edu.dmacc.codedsm.finalproject.controller.*;
import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;
import edu.dmacc.codedsm.finalproject.service.DataLoaderService;
import edu.dmacc.codedsm.finalproject.service.EmployeeService;
import edu.dmacc.codedsm.finalproject.service.PayrollService;
import edu.dmacc.codedsm.finalproject.service.PayrollServiceImpl;
import edu.dmacc.codedsm.finalproject.view.InputView;

public class Runner{

    public static void main( String[] args ) throws Exception {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        DataLoaderService dataLoaderService = new DataLoaderService(employeeRepository);
        DataLoaderController dataLoaderController = new DataLoaderController(dataLoaderService);
        dataLoaderController.loadEmployeeRepository();

        EmployeeService employeeService = new EmployeeService(employeeRepository);
        PayrollService payrollService = new PayrollServiceImpl(employeeRepository);

        ViewController viewController = new ViewController();
        InputView view = viewController.getDisplay();
        view.displayUserOptions(employeeService, payrollService);
    }

}