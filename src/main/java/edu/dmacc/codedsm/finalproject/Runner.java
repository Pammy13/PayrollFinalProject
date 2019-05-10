package edu.dmacc.codedsm.finalprojectfragments;

import edu.dmacc.codedsm.finalprojectfragments.controller.DataLoaderController;
import edu.dmacc.codedsm.finalprojectfragments.controller.EmployeeController;
import edu.dmacc.codedsm.finalprojectfragments.repository.EmployeeRepository;

import java.io.IOException;
import java.util.Scanner;


public class Runner {

    static Double hoursWorked = 0.00d;
    static Double myDouble;
    static String array1[];

    public static void main(String[] args) throws IOException {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        DataLoaderController.loadEmployeeData();
        displayUserOptions();

    }

    public static void displayUserOptions() throws IOException {
        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);
        while (isRunning) {
            System.out.println("Press 1 to list all employees.");
            System.out.println("Press 2 to update employee hours worked.");
            System.out.println("Press 3 to process payroll.");
            System.out.println("Press 4 to exit program.");
            String userAnswer = scanner.next();
            {
                if (userAnswer.equals("1")) {
//                    String fileName = "initial_load.txt";
//                    try {
//                        FileReader inputFile = new FileReader(fileName);
//                        BufferedReader bufferReader = new BufferedReader(inputFile);
//                        String line;
//                        while ((line = bufferReader.readLine()) != null) {
//
//                            String array1[] = line.split(",", 3);
                    for (Employee employee : EmployeeController.gatherEmployees()) {
                        System.out.println("Employee id number: " + employee.getIdNumber());
                        System.out.println("Employee name: " + employee.getName());
                        System.out.println("Employee hourly rate: " + employee.getHourlyRate());
                        System.out.println("Hours worked: " + employee.getHoursWorked());
                        System.out.println();

                    }

//                        bufferReader.close();
//                    } catch (Exception e) {
//                        System.out.println("Error while reading file line by line:"
//                                + e.getMessage());
//                    }

                } else if (userAnswer.equals("2")) {
//                    String fileName = "initial_load.txt";
//                    try {
//                        //FileReader inputFile = new FileReader(fileName);
//                       // BufferedReader bufferReader = new BufferedReader(inputFile);
//                       // String line;
//
//                       // while ((line = bufferReader.readLine()) != null) {
//
//                            String array1[] = line.split(",", 3);
//                            System.out.println(array1);
                    System.out.println("Enter employee ID number: ");
                    String id = scanner.next();



                    System.out.println("Enter hours worked: ");
                    Double hoursWorked = scanner.nextDouble();
                   // EmployeeRepository.getEmployee(id).setHoursWorked(hoursWorked);
                    Employee theEmployee = EmployeeRepository.getEmployee(id);
                    theEmployee.setHoursWorked(hoursWorked);
                    EmployeeRepository.saveEmployee(theEmployee);





                    EmployeeRepository.getEmployee(id).getHourlyRate();
                    Double netPay = hoursWorked * EmployeeRepository.getEmployee(id).getHourlyRate() / 1.2;
                    System.out.println(netPay);

//                    if (employees.containsKey(numberEntered)) {
//                        System.out.println("Enter hours worked: ");
//                        Double hoursEntered = scanner.nextDouble();
//                        Employee employee = employees.get(numberEntered);
//                        employee.setHoursWorked(hoursEntered);
//                    }
//

                } else if (userAnswer.equals("3")) {
                    System.out.println("To process payroll for an employee, enter employee ID number: ");
                    String numberEntered = scanner.next();
//                    if (employees.containsKey(numberEntered)) {
//                        Double employeeRate = Double.parseDouble(array1[2]);
//                        System.out.println("Update employee hours by entering hours worked: ");
//                        String updatedHoursEntered = scanner.next();
//                        employees.get(updatedHoursEntered);
//                        Double myDouble = Double.parseDouble(updatedHoursEntered);
//                        Double netPay = (myDouble * employeeRate) / 1.2;
//                        System.out.println("Employee's net pay is : " + netPay);
//                        System.out.println();
//                    }
                } else if (userAnswer.equals("4")) {
                    isRunning = false;

                } else {
                    System.out.println("You must press 1, 2, 3, or 4.");
                    System.out.println();
                    isRunning = true;
                }
            }
        }                 //make a file reader service (class with a method) that reads values and stores them into a repository or a hashmap
        //if 2 is pressed, get the employee from the hashmap, do the updates, then store it back in the hashmap
    }                     //have an employee class that has the values and getters and setters
}                         //put option 1 and 2 together, option 3 is a service that gets info and returns payroll