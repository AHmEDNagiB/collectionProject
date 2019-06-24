package Lists;

import DTO.Employee;
import Fillers.Filler;
import Generators.EmployeeGenerator;
import Generators.Generator;

import java.util.ArrayList;

public class ArrayListClass {
    ArrayList<Employee> employeeArrayList = new ArrayList<>();
    Generator generator = new EmployeeGenerator();
    Filler filler = new Filler();

    public ArrayListClass() {
        filler.fill(2, generator, this.employeeArrayList);
        System.out.print("Initial List : ");
        System.out.println(this.employeeArrayList);
        this.manipulateList();
    }

//    void fillLists(int numberOfItems, Generator generator) {
//        Employee e = null;
//        for (int i = 1; i <= numberOfItems; i++) {
//            e = generator.genetrate(i);
//            this.employeeArrayList.add(e);
//        }
//    }

    public void manipulateList() {
        Employee e = generator.genetrate(5);
        this.employeeArrayList.add(e);
        System.out.print("List After Adding Item : ");
        System.out.println(this.employeeArrayList);
        e = generator.genetrate(6);
        this.employeeArrayList.add(0, e);
        System.out.print("List After Adding in index 2 : ");
        System.out.println(this.employeeArrayList);
        System.out.println("List contains(3)  : " + this.employeeArrayList.contains(e));
        System.out.println("######## Test Equals #########");
        this.testEquals();
        System.out.println("######## Test Clone #########");
        this.testClone();
        System.out.println("######## Test remove #########");
        this.testRemove();
//        this.employeeArrayList.

    }


    public void testEquals() {
        Employee e1 = generator.genetrate(1);
        Employee e2 = generator.genetrate(2);


        ArrayList<Employee> employeeArrayList1 = new ArrayList<>();
        ArrayList<Employee> employeeArrayList2 = new ArrayList<>();

        employeeArrayList1.add(e1);
        employeeArrayList1.add(e2);
        employeeArrayList2.add(e1);

        System.out.println("equals 1 same list type  with different objects  : " + employeeArrayList1.equals(employeeArrayList2));

        employeeArrayList1.clear();
        employeeArrayList2.clear();

        employeeArrayList1.add(e1);
        employeeArrayList1.add(e2);
        employeeArrayList2.add(e1);
        employeeArrayList2.add(e2);

        System.out.println("equals 2 same objects and same order: " + employeeArrayList1.equals(employeeArrayList2));

        employeeArrayList1.clear();
        employeeArrayList2.clear();

        employeeArrayList1.add(e1);
        employeeArrayList1.add(e2);
        employeeArrayList2.add(e2);
        employeeArrayList2.add(e1);

        System.out.println("equals 2 same objects but different order : " + employeeArrayList1.equals(employeeArrayList2));

    }

    public void testClone() {
        System.out.println("clone : " + this.employeeArrayList.clone());
        ArrayList<Employee> employeeClonedList = (ArrayList<Employee>) this.employeeArrayList.clone();
        ArrayList<Employee> employeeSameList = this.employeeArrayList;

        Employee e1 = generator.genetrate(10);
        Employee e2 = generator.genetrate(11);
        employeeClonedList.add(0, e1);
        employeeSameList.add(0, e2);

        System.out.println("List After Cloning  : " + this.employeeArrayList);


    }

    private void testRemove() {
        ArrayList<Employee> l1 = new ArrayList<>();
        ArrayList<Employee> l2 = new ArrayList<>();

        Employee e1 = generator.genetrate(10);
        Employee e2 = generator.genetrate(11);
        l1.add(e1);
        l1.add(e2);
        l1.add(e1);
        l2.add(e1);

        this.testRemoveAll((ArrayList<Employee>) l1.clone(), (ArrayList<Employee>) l2.clone());
        this.testRemoveIf((ArrayList<Employee>) l1.clone(), (ArrayList<Employee>) l2.clone());


    }

    public void testRemoveAll(ArrayList<Employee> l1, ArrayList<Employee> l2) {
        System.out.println("######## Test removeAll #########");
        System.out.println("l1 : " + l1);
        System.out.println("l2 : " + l2);
        l1.removeAll(l2);
        System.out.println("l1 after removeAll : " + l1);

    }

    public void testRemoveIf(ArrayList<Employee> l1, ArrayList<Employee> l2) {
        System.out.println("######## Test testRemoveIf #########");
        System.out.println("l1 : " + l1);
        System.out.println("l2 : " + l2);
        l1.removeIf(e -> l2.contains(e));
        System.out.println("l1 after removeIf : " + l1);

    }
}

