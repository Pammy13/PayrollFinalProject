package edu.dmacc.codedsm.finalprojectfragments;

public class Employee {
    private String idNumber;
    private String name;
    private Double hourlyRate;
    private Double hoursWorked;

    @Override
    public String toString() {
        return "Employee{" +
                "idNumber='" + idNumber + '\'' +
                ", name='" + name + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", hoursWorked=" + hoursWorked +
                '}';
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate( Double hourlyRate ) {
        this.hourlyRate = hourlyRate;
    }

    public Double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked( Double hoursWorked ) {
        this.hoursWorked = hoursWorked;
    }
}