package structural.adapter.beans.adaptor;

import structural.adapter.beans.Employee;
import structural.adapter.beans.EmployeeLdap;

public class EmployeeAdapterLdap implements Employee {

    private EmployeeLdap instance;

    private String id;
    private String firstName;
    private String lastName;
    private String email;

    public EmployeeAdapterLdap(EmployeeLdap employeeLdap) {
        this.instance = employeeLdap;
        this.id = employeeLdap.getCn();
        this.firstName = employeeLdap.getGivenName();
        this.lastName = employeeLdap.getSurname();
        this.email = employeeLdap.getMail();
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
        return "EmployeeAdapterLdap{" +
                ", id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
