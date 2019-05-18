package edu.dmacc.codedsm.finalproject.repository;

import edu.dmacc.codedsm.finalproject.model.Employee;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class testRepository{

    @Test
    public void testAddingEmployee() {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        Employee employee = new Employee();
        employee.setIdNumber("1");
        employee.setName("Marvin");
        employeeRepository.saveEmployee(employee);
        assertEquals("Marvin", employeeRepository.getEmployee("1").getName());
        assertTrue(employeeRepository.getEmployee("1").getName().equals("Marvin"));
    }

    @Test
    public void testAddingEmployees() {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        Employee employee1 = new Employee();
        employee1.setIdNumber("1");
        employee1.setName("Marvin");
        employeeRepository.saveEmployee(employee1);
        Employee employee2 = new Employee();
        employee2.setIdNumber("2");
        employee2.setName("Sam");
        employeeRepository.saveEmployee(employee2);
        assertEquals(2, employeeRepository.getAllEmployees().size());
    }
}
