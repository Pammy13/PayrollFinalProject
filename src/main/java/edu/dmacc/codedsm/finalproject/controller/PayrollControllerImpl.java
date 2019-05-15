package edu.dmacc.codedsm.finalproject.controller;

import edu.dmacc.codedsm.finalproject.service.PayrollServiceImpl;

import java.io.IOException;

public class PayrollControllerImpl{


    public static void processPayroll() throws IOException {
        PayrollServiceImpl.processPayroll();


    }
}