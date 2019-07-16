package structural.adapter;

import structural.adapter.beans.Employee;
import structural.adapter.beans.EmployeeClient;

import java.util.List;

public class TestAdapter {
    public static void main(String[] args) {
        EmployeeClient client = new EmployeeClient();

        List<Employee> employees = client.getEmployeeList();

        employees.forEach(System.out::println);
    }
}
