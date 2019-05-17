package edu.dmacc.codedsm.finalproject.controller;


import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;
import edu.dmacc.codedsm.finalproject.repository.EmployeeRepositoryv2;
import edu.dmacc.codedsm.finalproject.service.DataLoaderService;
import edu.dmacc.codedsm.finalproject.service.DataLoaderServicev2;


public class DataLoaderController{

    private EmployeeRepositoryv2 employeeRepository;
    private DataLoaderServicev2 dataLoaderService;

    public DataLoaderController( EmployeeRepositoryv2 employeeRepository,
                                 DataLoaderServicev2 dataLoaderService) {
        this.employeeRepository = employeeRepository;
        this.dataLoaderService = dataLoaderService;
    }

    public static void loadEmployeeData() {
        DataLoaderService.readFile();
    }

    public void loadEmployeeRepository( ){
        dataLoaderService.loadEmployees(employeeRepository);
    }
}