package edu.dmacc.codedsm.finalproject.controller;


import edu.dmacc.codedsm.finalproject.Employee;
import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;
import edu.dmacc.codedsm.finalproject.service.EmployeeService;

import java.util.Collection;

public class EmployeeController {

    public static Collection<Employee> gatherEmployees() {
        return EmployeeService.gatherEmployees();

            }
    EmployeeRepository employeeRepository = new EmployeeRepository();
}



