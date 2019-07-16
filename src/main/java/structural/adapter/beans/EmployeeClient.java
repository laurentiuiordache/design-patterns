package structural.adapter.beans;

import structural.adapter.beans.adaptor.EmployeeAdapterCSV;
import structural.adapter.beans.adaptor.EmployeeAdapterLdap;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList(){
        List<Employee> employees = new ArrayList<>();

        Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@wick.com");
        EmployeeLdap employeeLdap = new EmployeeLdap("4321", "Nhoj", "Kciw", "john@wick.com");
        EmployeeCSV employeeCSV = new EmployeeCSV("222,Laurentiu,Iordache,Laurentiu@Iordache.com");

        employees.add(employeeFromDB);
        employees.add(new EmployeeAdapterLdap(employeeLdap));
        employees.add(new EmployeeAdapterCSV(employeeCSV));
        return employees;
    }
}
