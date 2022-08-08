package com.example.HelloWorld;
public class employeedetails {
    private String firstname;
    private String lastname;
    private int salary;
    private int age;
    private int employeeId;


    public employeedetails(String firstname, String lastname, int salary, int age, int employeeId) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
        this.age = age;
        this.salary = salary;
        this.employeeId = employeeId;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public int getEmployeeId() {
        return employeeId;
    }

}
