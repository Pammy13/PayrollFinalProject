package edu.dmacc.codedsm.finalproject.service;

import edu.dmacc.codedsm.finalproject.repository.EmployeeRepositoryv2;

public interface PayrollService{
    void processPayrolls( EmployeeRepositoryv2 employeeRepository) throws Exception;
}


