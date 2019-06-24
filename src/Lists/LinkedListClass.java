package Lists;

import DTO.Employee;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListClass {
    LinkedList<Employee> employeeArrayList = new LinkedList<>();

    public LinkedListClass() {
//        this.fillLists();
        System.out.print("Initial List : ");
        System.out.println(this.employeeArrayList);
//        this.manipulateList();
    }
}
