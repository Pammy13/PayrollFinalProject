package edu.dmacc.codedsm.finalproject.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testModel {

    @Test
    public void testEmployeeId() {
        Employee employee = new Employee();
        employee.setIdNumber("2");
        assertEquals("2", employee.getIdNumber());
    }

    @Test
    public void testEmployeeName() {
        Employee employee = new Employee();
        employee.setName("Joey Smith");
        assertEquals("Joey Smith", employee.getName());
    }
}
