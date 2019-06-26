package Lists;

import DTO.Employee;
import utils.Fillers.Filler;
import utils.Generators.EmployeeGenerator;
import utils.Generators.Generator;

import static utils.ConsoleColors.*;

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
        this.callAddMethods();
        this.callGetMethods();
        this.callRemoveMethods();
    }

    private void callAddMethods() {
        System.out.println(ANSI_GREEN + "^^^^^^^^^^^^^^^ Start Of AddMethods ^^^^^^^^^^^^^^^" + ANSI_RESET);
        LinkedList<Employee> employeeLinkedList = new LinkedList<>();
        Employee e1 = generator.genetrate(1);
        Employee e2 = generator.genetrate(2);
        Employee e3 = generator.genetrate(3);
        Employee e4 = generator.genetrate(4);
        employeeLinkedList.add(e1);
        employeeLinkedList.add(e2);
        employeeLinkedList.add(e1);
        System.out.println("employeeLinkedList after add() ----> " + employeeLinkedList);
        employeeLinkedList.addFirst(e3);
        System.out.println("employeeLinkedList after addFirst(3) ----> " + employeeLinkedList);
        employeeLinkedList.addLast(e4);
        System.out.println("employeeLinkedList after addLast(4) ----> " + employeeLinkedList);
        employeeLinkedList.offer(e1);
        System.out.println("employeeLinkedList after offer(1) ----> " + employeeLinkedList);
        employeeLinkedList.offerFirst(e3);
        System.out.println("employeeLinkedList after offerFirst(3) ----> " + employeeLinkedList);
        employeeLinkedList.offerLast(e4);
        System.out.println("employeeLinkedList after offerLast(4) ----> " + employeeLinkedList);
        employeeLinkedList.push(e2);
        System.out.println("employeeLinkedList after push(2) ----> " + employeeLinkedList);

    }

    private void callGetMethods() {
        System.out.println(ANSI_GREEN + "^^^^^^^^^^^^^^^ Start Of GetMethods ^^^^^^^^^^^^^^^" + ANSI_RESET);

        // get() Retrieves, but does not remove, the head (first element) of this list. Throws: NoSuchElementException - if this list is empty
        // element() Retrieves, but does not remove, the head (first element) of this list. Throws: NoSuchElementException - if this list is empty
        // peek() Retrieves, but does not remove, the head (first element) of this list.
        this.callGetMethodsWhenListIsNotEmpty();
        this.callGetMethodsWhenListIsEmpty();
    }

    private void callGetMethodsWhenListIsEmpty() {
        LinkedList<Employee> employeeLinkedList = new LinkedList<>();
        try {
            employeeLinkedList.getFirst();
        } catch (Exception e) {
            System.out.println(ANSI_RED + "getFirst() ----> " + e.toString() + ANSI_RESET);
        }
        try {
            employeeLinkedList.getLast();
        } catch (Exception e) {
            System.out.println(ANSI_RED + "getLast() ----> " + e.toString() + ANSI_RESET);
        }
        try {
            employeeLinkedList.indexOf(null);
        } catch (Exception e) {
            System.out.println(ANSI_RED + "indexOf() ----> " + e.toString() + ANSI_RESET);
        }
        try {
            employeeLinkedList.peek();
        } catch (Exception e) {
            System.out.println(ANSI_RED + "peek() ----> " + e.toString() + ANSI_RESET);
        }
    }

    private void callGetMethodsWhenListIsNotEmpty() {
        LinkedList<Employee> employeeLinkedList = new LinkedList<>();
        filler.fill(4, generator, employeeLinkedList);
        System.out.println("employeeLinkedList after add() ----> " + employeeLinkedList);

        System.out.println("get() ----> " + employeeLinkedList.get(0));
        System.out.println("peek() ----> " + employeeLinkedList.peek());
        System.out.println("getFirst() ----> " + employeeLinkedList.getFirst());
        System.out.println("getLast() ----> " + employeeLinkedList.getLast());
        System.out.println("peekFirst() ----> " + employeeLinkedList.peekFirst());
        System.out.println("peekLast() ----> " + employeeLinkedList.peekLast());


    }

    private void callRemoveMethods() {
        System.out.println(ANSI_GREEN + "^^^^^^^^^^^^^^^ Start Of RemoveMethods ^^^^^^^^^^^^^^^" + ANSI_RESET);

        //poll() Retrieves and removes the head (first element) of this list. Returns: the head of this list, or null if this list is empty
        //remove() Retrieves and removes the head (first element) of this list.Throws: NoSuchElementException - if this list is empty
        //pop() removes and returns the first element of this list.Throws: NoSuchElementException - if this list is empty
        this.callRemoveMethodsWhenListIsNotEmpty();
        this.callRemoveMethodsWhenListIsEmpty();

    }

    private void callRemoveMethodsWhenListIsEmpty() {
        LinkedList<Employee> employeeLinkedList = new LinkedList<>();

        try {
            employeeLinkedList.remove();
        } catch (Exception e) {
            System.out.println(ANSI_RED + "remove() ----> " + e.toString() + ANSI_RESET);
        }
        try {
            employeeLinkedList.removeFirst();
        } catch (Exception e) {
            System.out.println(ANSI_RED + "removeFirst() ----> " + e.toString() + ANSI_RESET);
        }
        try {
            employeeLinkedList.removeLast();
        } catch (Exception e) {
            System.out.println(ANSI_RED + "removeLast() ----> " + e.toString() + ANSI_RESET);
        }
    }

    private void callRemoveMethodsWhenListIsNotEmpty() {
        LinkedList<Employee> employeeLinkedList = new LinkedList<>();
        filler.fill(4, generator, employeeLinkedList);
        System.out.println("employeeLinkedList after add() ----> " + employeeLinkedList);

        employeeLinkedList.remove();
        System.out.println("employeeLinkedList after remove() ----> " + employeeLinkedList);
        employeeLinkedList.poll();
        System.out.println("employeeLinkedList after poll() ----> " + employeeLinkedList);
        employeeLinkedList.pop();
        System.out.println("employeeLinkedList after pop() ----> " + employeeLinkedList);

    }
}
