package edu.dmacc.codedsm.finalproject.controller;

import edu.dmacc.codedsm.finalproject.repository.EmployeeRepositoryv2;
import edu.dmacc.codedsm.finalproject.service.PayrollService;
import edu.dmacc.codedsm.finalproject.service.PayrollServiceImpl;

import java.io.IOException;

public class PayrollControllerImpl implements PayrollController{

    private EmployeeRepositoryv2 employeeRepository;
    private PayrollService payrollService;

    public PayrollControllerImpl(EmployeeRepositoryv2 employeeRepository, PayrollService payrollService){
        this.employeeRepository = employeeRepository;
        this.payrollService = payrollService;
    }

    public static void processPayroll() throws IOException {
        PayrollServiceImpl.processPayroll();
    }

    public void processPayrolls() throws Exception{
        payrollService.processPayrolls(employeeRepository);
    }
}