package structural.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Adapter pattern should be used when we have to incompatible interface that needs to work together
 * like we have legacy code having functionality similar to new code, adapter can be used here to make legacy code
 * compatible with new code
 */
public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        Employee employeeDb = new EmployeeDB("1", "shyam", "yadav");

        Employee employeeCsv = new EmployeeCSVAdapter(new EmployeeCSV(2, "john", "Deniel"));

        employeeList.add(employeeDb);
        employeeList.add(employeeCsv);

        System.out.println(employeeList);

    }
}
