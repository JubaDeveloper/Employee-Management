package org.jubadeveloper.advice;

import org.jubadeveloper.service.error.EmployeeNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class EmployeeNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(EmployeeNotFound.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public String employeeNotFoundHandle (EmployeeNotFound employeeNotFound) {
        return employeeNotFound.getMessage();
    }
}
