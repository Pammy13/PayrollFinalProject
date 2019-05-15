package edu.dmacc.codedsm.finalproject.controller;


import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;
import edu.dmacc.codedsm.finalproject.service.DataLoaderService;


public class DataLoaderController{

    public DataLoaderController( EmployeeRepository employeeRepository ) {

    }

    public static void loadEmployeeData() {
        DataLoaderService.readFile();
    }

}