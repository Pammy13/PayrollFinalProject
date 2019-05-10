package edu.dmacc.codedsm.finalproject.repository;

import edu.dmacc.codedsm.finalproject.model.Employee;

import java.util.HashMap;

public class EmployeeRepository{

    private static HashMap<String, Employee> employees = new HashMap<>();

    public static HashMap<String, Employee> getEmployees() {return employees;
    }

    public static void setEmployees(HashMap<String, Employee> employees) {
        EmployeeRepository.employees = employees;
    }

    public static Employee getEmployee(String id) {
        if (employees.containsKey(id)) {
            Employee employee = employees.get(id);
            return employee;
        } else {
            return null;
        }
    }

    public static void saveEmployee(Employee employee) {
        employees.put(employee.getIdNumber(), employee);
        //EmployeeRepostiory.save(theEmployee);
    }

}
