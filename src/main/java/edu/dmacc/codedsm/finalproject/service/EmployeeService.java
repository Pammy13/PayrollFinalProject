package edu.dmacc.codedsm.finalprojectfragments.service;

import edu.dmacc.codedsm.finalprojectfragments.Employee;
import edu.dmacc.codedsm.finalprojectfragments.repository.EmployeeRepository;

import java.util.Collection;
import java.util.HashMap;

public class EmployeeService {
    public static Collection<Employee> gatherEmployees() {
        HashMap<String, Employee> employees = EmployeeRepository.getEmployees();
       return  employees.values();

    }
}
