package edu.dmacc.codedsm.finalproject.service;

import edu.dmacc.codedsm.finalproject.Employee;
import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;

import java.util.Collection;
import java.util.HashMap;

public class EmployeeService {
    public static Collection<Employee> gatherEmployees() {
        HashMap<String, Employee> employees = EmployeeRepository.getEmployees();
       return  employees.values();

    }
}
