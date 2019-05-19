package edu.dmacc.codedsm.finalproject.controller;

import edu.dmacc.codedsm.finalproject.service.DataLoaderService;

public class DataLoaderController{

    private DataLoaderService dataLoaderService;

    public DataLoaderController( DataLoaderService dataLoaderService ) {
        this.dataLoaderService = dataLoaderService;
    }

    public void loadEmployeeRepository() {
        dataLoaderService.loadEmployees();
    }

}
