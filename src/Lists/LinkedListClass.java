package Lists;

import DTO.Employee;
import utils.Fillers.Filler;
import utils.Generators.EmployeeGenerator;
import utils.Generators.Generator;

import java.util.LinkedList;

public class LinkedListClass {
    private LinkedList<Employee> employeeLinkedList = new LinkedList<>();
    private Generator generator = new EmployeeGenerator();
    private Filler filler = new Filler();

    public LinkedListClass() {
        filler.fill(2, generator, this.employeeLinkedList);
        System.out.print("Initial List : ");
        System.out.println(this.employeeLinkedList);
        this.manipulateList();
    }

    private void manipulateList() {
//        this.employeeLinkedList.
    }
}
