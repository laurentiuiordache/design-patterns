package behavioral.memento;

import behavioral.memento.beans.Caretaker;
import behavioral.memento.beans.Employee;


public class TestMemento {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        Employee employee = new Employee("You", "address", "0766666666");
        System.out.println("Employee before save: " + employee);

        caretaker.save(employee);
        employee.setPhone("0782828282");
        System.out.println("Employee after edit: " + employee);

        caretaker.revert(employee);
        System.out.println("Employee after revert: " + employee);
    }
}
