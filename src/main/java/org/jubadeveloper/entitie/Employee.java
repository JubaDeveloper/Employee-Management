package org.jubadeveloper.entitie;

import jakarta.persistence.*;
import net.bytebuddy.implementation.bind.annotation.Default;
import org.hibernate.annotations.ColumnDefault;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.EnumOptions;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.time.LocalDate;

enum EmployeeStatus {
    ACTIVE,
    INACTIVE
}
@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ColumnDefault(value = "INACTIVE")
    @Enumerated(EnumType.STRING)
    private EmployeeStatus status;
    @ColumnDefault("now()")
    private LocalDate createdAt;

    public Employee(Long id, String name, EmployeeStatus status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeStatus getStatus() {
        return status;
    }

    public void setStatus(EmployeeStatus status) {
        this.status = status;
    }
}
