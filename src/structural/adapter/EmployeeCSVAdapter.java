package structural.adapter;

public class EmployeeCSVAdapter implements Employee {

    private EmployeeCSV employeeCSV;

    public EmployeeCSVAdapter(EmployeeCSV employeeCSV) {
        this.employeeCSV = employeeCSV;
    }

    @Override
    public String getId() {
        return employeeCSV.getId()+"";
    }

    @Override
    public String getFirstName() {
        return employeeCSV.getGivenName();
    }

    @Override
    public String getLastName() {
        return employeeCSV.getSurName();
    }

    @Override
    public String toString() {
        return "EmployeeCSV {" +
                "id='" + employeeCSV.getId() + '\'' +
                ", firstName='" + employeeCSV.getGivenName() + '\'' +
                ", lastName='" + employeeCSV.getSurName() + '\'' +
                '}';
    }
}
