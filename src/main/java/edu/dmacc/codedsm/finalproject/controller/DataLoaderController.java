package edu.dmacc.codedsm.finalprojectfragments.controller;


import edu.dmacc.codedsm.finalprojectfragments.repository.EmployeeRepository;
import edu.dmacc.codedsm.finalprojectfragments.service.DataLoaderService;

public class DataLoaderController {

    public static void loadEmployeeData(){
        DataLoaderService.readFile();
    }

    EmployeeRepository employeeRepository = new EmployeeRepository();
}