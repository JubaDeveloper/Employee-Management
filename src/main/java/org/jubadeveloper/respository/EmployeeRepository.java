package org.jubadeveloper.respository;

import org.jubadeveloper.entitie.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
