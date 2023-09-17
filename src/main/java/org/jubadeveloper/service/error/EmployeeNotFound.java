package org.jubadeveloper.service.error;


public class EmployeeNotFound extends Exception {
    public EmployeeNotFound (Long id) {
        super("Employee id: " + id + " was not found");
    }
}
