package com.amit;

public class Employee1Test {

    public static void main(String[] args) {
        Employee1 emp1 = new Employee1(101,"Manash");
        Employee1 emp2 = new Employee1(101,"Manash");
        Employee1 emp3 = new Employee1(103,"Ranjan");
        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());
        System.out.println(emp1.equals(emp2));
        System.out.println(emp1.equals(emp3));
    }

}