package edu.dmacc.codedsm.finalproject.view;

import edu.dmacc.codedsm.finalproject.model.Employee;
import edu.dmacc.codedsm.finalproject.controller.EmployeeController;

public class AllEmployeeView {
    public static void displayAllEmployees() {

        for (Employee employee : EmployeeController.gatherEmployees()) {
            EmployeeView.displayEmployee(employee);

        }

    }
}
