package utils.Generators;

import DTO.Employee;

public class EmployeeGenerator implements Generator {

    @Override
    public <T> T genetrate(int n) {
        String id = (int) (Math.random() * 10000) + "";
        String firstName = "Employee " + n;
        String lastName = "Someone " + n;
        String mail = "employee" + n + "@gmail.com";
        int age = (int) (Math.random() * 20) + 20;
        float salary = n * 2000;
        Employee e = new Employee(id, firstName, mail);
        e.setAge(age);
        e.setSalary(salary);
        e.setLastName(lastName);
        return (T) e;
    }
}
