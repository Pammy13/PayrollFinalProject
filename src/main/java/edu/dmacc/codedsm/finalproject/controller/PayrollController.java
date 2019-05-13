package edu.dmacc.codedsm.finalproject.controller;

import edu.dmacc.codedsm.finalproject.service.PayrollService;

import java.io.IOException;

public class PayrollController {


    public static void processPayroll() throws IOException {
        PayrollService.processPayroll();


    }
}