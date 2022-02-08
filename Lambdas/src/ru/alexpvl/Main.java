package ru.alexpvl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    List<Employee> employees = new ArrayList<>();

        Employee jack = new Employee("Jack", 21);
        Employee sasha = new Employee("Sasha", 19);
        Employee tim = new Employee("Tim", 43);
        Employee jane = new Employee("Jane", 18);

        employees.add(jack);
        employees.add(sasha);
        employees.add(tim);
        employees.add(jane);

        Collections.sort(employees, (e1, e2) -> e1.getName().compareTo(e2.getName()));
        for (Employee employee : employees) {
            System.out.println(employee.getName() + ", " + employee.getAge());
        }

        System.out.println(doUpAndCon((s1, s2) -> s1.toUpperCase() + s2.toUpperCase(), employees.get(0).getName(), employees.get(1).getName()));
    }

    public static String doUpAndCon(upperAndConcat uc, String s1, String s2) {
        return uc.UpAndCon(s1, s2);
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

interface upperAndConcat {
    String UpAndCon(String s1, String s2);
}
