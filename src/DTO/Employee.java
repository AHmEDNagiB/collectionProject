package DTO;

import java.util.Objects;

public class Employee {
    String id;
    String firstName;
    String lastName;
    String mail;
    int age;
    float salary;

    public Employee(String id, String firstName, String mail) {
        this.id = id;
        this.firstName = firstName;
        this.mail = mail;
    }

    public Employee(String id, String firstName, String lastName, String mail, int age, float salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        while (age > 50) {
            age /= 2;
        }
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        while (salary < 1000) {
            salary += 500;
        }
        while (salary > 20000) {
            salary /= 2;
        }
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getId(), employee.getId()) &&
                Objects.equals(getMail(), employee.getMail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMail());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", mail='" + mail + '\'' +
//                ", salary='" + salary + '\'' +
//                ", age='" + age + '\'' +
                '}';
    }
}
