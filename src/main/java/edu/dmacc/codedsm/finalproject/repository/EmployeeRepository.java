package edu.dmacc.codedsm.finalproject.repository;

import edu.dmacc.codedsm.finalproject.model.Employee;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EmployeeRepository{

    private HashMap<String, Employee> employees = new HashMap<>();

    public HashMap<String, Employee> getEmployees() {
        return employees;
    }

    public void setEmployees( HashMap<String, Employee> employees ) {
        this.employees = employees;
    }

    public Collection<Employee> getAllEmployees() {
        return employees.values();
    }

    public Employee getEmployee( String id ) {
        if (employees.containsKey(id)) {
            Employee employee = employees.get(id);
            return employee;
        } else {
            return null;
        }
    }

    public void saveEmployee( Employee employee ) {
        employees.put(employee.getIdNumber(), employee);
    }

}
