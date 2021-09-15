package structural.adapter;

public class EmployeeCSV {

    private int id;
    private String givenName;
    private String surName;

    public EmployeeCSV() {
    }

    public EmployeeCSV(int id, String givenName, String surName) {
        this.id = id;
        this.givenName = givenName;
        this.surName = surName;
    }

    public int getId() {
        return id;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getSurName() {
        return surName;
    }
}
