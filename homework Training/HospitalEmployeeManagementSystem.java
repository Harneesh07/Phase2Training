// HospitalEmployeeManagementSystem.java

abstract class Employee {

    // Private variables - Encapsulation
    private int id;
    private String name;
    private double basicSalary;

    // Constructor 1
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
        this.basicSalary = 0;
    }

    // Constructor 2
    Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Getters and Setters
    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    double getBasicSalary() {
        return basicSalary;
    }

    void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    // Abstract method
    abstract double calculateSalary();

    // Display details
    void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Final Salary: " + calculateSalary());
    }
}


// Doctor class
class Doctor extends Employee {

    private double consultationAllowance;

    // Constructor 1
    Doctor(int id, String name) {
        super(id, name);
        consultationAllowance = 0;
    }

    // Constructor 2
    Doctor(int id, String name, double basicSalary,
           double consultationAllowance) {
        super(id, name, basicSalary);
        this.consultationAllowance = consultationAllowance;
    }

    double calculateSalary() {
        return getBasicSalary() + consultationAllowance;
    }
}


// Nurse class
class Nurse extends Employee {

    private double nightShiftAllowance;

    // Constructor 1
    Nurse(int id, String name) {
        super(id, name);
        nightShiftAllowance = 0;
    }

    // Constructor 2
    Nurse(int id, String name, double basicSalary,
          double nightShiftAllowance) {
        super(id, name, basicSalary);
        this.nightShiftAllowance = nightShiftAllowance;
    }

    double calculateSalary() {
        return getBasicSalary() + nightShiftAllowance;
    }
}


// Lab Technician class
class LabTechnician extends Employee {

    private double labAllowance;

    // Constructor 1
    LabTechnician(int id, String name) {
        super(id, name);
        labAllowance = 0;
    }

    // Constructor 2
    LabTechnician(int id, String name, double basicSalary,
                  double labAllowance) {
        super(id, name, basicSalary);
        this.labAllowance = labAllowance;
    }

    double calculateSalary() {
        return getBasicSalary() + labAllowance;
    }
}


// Main class
public class HospitalEmployeeManagementSystem {

    public static void main(String[] args) {

        // Employee array with different employee types
        Employee[] employees = new Employee[3];

        employees[0] =
                new Doctor(101, "Rahul", 50000, 10000);

        employees[1] =
                new Nurse(102, "Priya", 30000, 5000);

        employees[2] =
                new LabTechnician(103, "Arun", 35000, 7000);


        // Runtime polymorphism
        System.out.println("----- EMPLOYEE DETAILS -----");

        for (int i = 0; i < employees.length; i++) {

            employees[i].displayDetails();

            System.out.println();
        }


        // Find highest-paid employee
        Employee highest = employees[0];

        for (int i = 1; i < employees.length; i++) {

            if (employees[i].calculateSalary()
                    > highest.calculateSalary()) {

                highest = employees[i];
            }
        }

        System.out.println("----- HIGHEST PAID EMPLOYEE -----");

        highest.displayDetails();
    }
}