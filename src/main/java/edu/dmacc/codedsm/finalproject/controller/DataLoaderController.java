package edu.dmacc.codedsm.finalproject.controller;


import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;
import edu.dmacc.codedsm.finalproject.service.DataLoaderService;


public class DataLoaderController{

    private EmployeeRepository employeeRepository;
    private DataLoaderService dataLoaderService;

    public DataLoaderController( EmployeeRepository employeeRepository,
                                 DataLoaderService dataLoaderService) {
        this.employeeRepository = employeeRepository;
        this.dataLoaderService = dataLoaderService;
    }

    public void loadEmployeeRepository( ){
        dataLoaderService.loadEmployees(employeeRepository);
    }
}