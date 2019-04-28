Final Project

1. On startup, read the 'initial_load.txt' file and put its contents into a HashMap.
2. Provide the user a prompt to do the following:
    1. List all known employees
    2. Update an employee's hours
    3. Process payroll and exit
    4. Exit
3.  When listing all known employees, provide the current name, hourly rate, and assigned hours worked.  0 is the default hours worked.
    1. Continue the loop after listing all known employees
4.  To update an employee's hours, prompt the user to enter the employee id
    1.  If the employee is found, prompt the user to update the hours worked
    2.  If the employee is not found, show the user "Employee not found" and return to the main loop
5.  To process payroll
    1.  Read the current employee hours stored in the system
    2.  Multiply the hourly rate times the assigned hours worked
    3.  Divide the gross pay by 1.2 to get the net pay
    4.  Write the employee id, name, and net pay out to a file called 'payroll_results.txt'
    5.  Exit the processing loop when completed

Notes

1.  The application should follow a MVC style architecture
2.  Use the provided Maven pom file to get started
3.  This is intended to be a console application; there is no need to use Spring or Spring MVC
4.  Use of unit tests will score you up to 5 bonus points, but are also not necessary

Scoring

1.  40 points based on functionality
    1.  You will receive zero points if the program does not compile.  It is imperative that the program compiles.
    2.  Points are broken down as follows:
        1.  10 points - list of employees in the system functionality
        2.  10 points - startup and initialization functionality
        2.  10 points - update of an employee hours functionality
        3.  10 points - process payroll functionality
2.  20 points based on team feedback
    1.  You will be asked to provide a 1 to 10 score on how your teammates contributed to the project.  The sum of these scores makes up this portion


