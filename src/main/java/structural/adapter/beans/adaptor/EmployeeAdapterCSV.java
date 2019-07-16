package structural.adapter.beans.adaptor;

import structural.adapter.beans.Employee;
import structural.adapter.beans.EmployeeCSV;

public class EmployeeAdapterCSV implements Employee {

    private EmployeeCSV instance;

    private String id;
    private String firstName;
    private String lastName;
    private String email;

    public EmployeeAdapterCSV(EmployeeCSV instance) {
        this.instance = instance;
        this.id = Integer.toString(instance.getId());
        this.firstName = instance.getFirstName();
        this.lastName = instance.getLastName();
        this.email = instance.getEmailAddress();
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "EmployeeAdapterCSV{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
