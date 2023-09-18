package org.jubadeveloper.entitie;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private LocalDate createdAt;

    public Employee(String name) {
        this.name = name;
        this.createdAt = LocalDate.now();
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

}
