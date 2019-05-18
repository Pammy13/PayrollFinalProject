package edu.dmacc.codedsm.finalproject.service;

import edu.dmacc.codedsm.finalproject.model.Employee;
import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDataLoaderService{

    @Test
    public void testCreateEmployee() {
        EmployeeRepository employeeRespository = new EmployeeRepository();
        DataLoaderService dataLoaderService = new DataLoaderService(employeeRespository);
        Employee employee = dataLoaderService.createEmployee("1,Bob Camden,15.00");
        assertEquals("Bob Camden", employee.getName());
    }
}
