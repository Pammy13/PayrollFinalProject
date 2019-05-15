package edu.dmacc.codedsm.finalproject.service;

import edu.dmacc.codedsm.finalproject.model.Employee;
import edu.dmacc.codedsm.finalproject.repository.EmployeeRepository;

import java.io.BufferedReader;
import java.io.FileReader;

public class DataLoaderService {

    private static final String FILE_NAME = "initial_load.txt";

    public static void readFile() {

        try {
            FileReader inputFile = new FileReader(FILE_NAME);
            BufferedReader bufferReader = new BufferedReader(inputFile);
            String line;


            while ((line = bufferReader.readLine()) != null) {

                Employee employee = createEmployee(line);
                EmployeeRepository.saveEmployee(employee);
            }

            bufferReader.close();
        } catch (Exception e) {
        }

    }

    private static Employee createEmployee(String line) {
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

    public static interface PayrollService{
    }
}




