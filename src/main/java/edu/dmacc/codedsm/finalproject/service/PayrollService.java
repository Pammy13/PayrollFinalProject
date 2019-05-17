package edu.dmacc.codedsm.finalproject.service;

import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;

public interface PayrollService{
    void processPayrolls( EmployeeRepository employeeRepository) throws Exception;
}


