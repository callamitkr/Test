package com.amit;

public class Employee1 {

    private int empId;
    private String empName;

    public Employee1(int empId, String empName) {
        super();
        this.empId = empId;
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + "]";
    }

    @Override
    public int hashCode() {
        return empId + empName.hashCode();
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (!(this instanceof Employee1)) {
            return false;
        }
        Employee1 emp = (Employee1) obj;
        return this.getEmpId() == emp.getEmpId() && this.getEmpName().equals(emp.getEmpName());
    }

}