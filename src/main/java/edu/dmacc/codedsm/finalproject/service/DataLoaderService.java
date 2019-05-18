package edu.dmacc.codedsm.finalproject.service;

import edu.dmacc.codedsm.finalproject.model.Employee;
import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataLoaderService {

    private static final String FILE_NAME = "initial_load.txt";
    private EmployeeRepository employeeRepository;

    public DataLoaderService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void loadEmployees(){
        BufferedReader bufferReader = null;
        try {
            FileReader inputFile = new FileReader(FILE_NAME);
            bufferReader = new BufferedReader(inputFile);
            String line;

            while ((line = bufferReader.readLine()) != null) {

                Employee employee = createEmployee(line);
                employeeRepository.saveEmployee(employee);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bufferReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    protected Employee createEmployee(String line) {
        String idNumber = line.substring(0, line.indexOf(","));
        String restOfString = line.substring(line.indexOf(",") + 1);
        String name = restOfString.substring(0, restOfString.indexOf(","));
        String wage = restOfString.substring(restOfString.indexOf(",") + 1);
        Employee employee = new Employee();
        employee.setIdNumber(idNumber);
        employee.setName(name);
        employee.setHourlyRate(Double.parseDouble(wage));
        employee.setHoursWorked(0.0);
        return employee;
    }

}




