package edu.dmacc.codedsm.finalprojectfragments.controller;


import edu.dmacc.codedsm.finalprojectfragments.Employee;
import edu.dmacc.codedsm.finalprojectfragments.repository.EmployeeRepository;
import edu.dmacc.codedsm.finalprojectfragments.service.EmployeeService;

import java.util.Collection;

public class EmployeeController {

    public static Collection<Employee> gatherEmployees() {
        return EmployeeService.gatherEmployees();

            }
    EmployeeRepository employeeRepository = new EmployeeRepository();
}



