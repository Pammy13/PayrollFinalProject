package edu.dmacc.codedsm.finalproject.controller;

import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;
import edu.dmacc.codedsm.finalproject.service.PayrollService;
import edu.dmacc.codedsm.finalproject.service.PayrollServiceImpl;

import java.io.IOException;

public class PayrollControllerImpl implements PayrollController{

    private EmployeeRepository employeeRepository;
    private PayrollService payrollService;

    public PayrollControllerImpl( EmployeeRepository employeeRepository, PayrollService payrollService){
        this.employeeRepository = employeeRepository;
        this.payrollService = payrollService;
    }

    public void processPayrolls() throws Exception{
        payrollService.processPayrolls(employeeRepository);
    }
}