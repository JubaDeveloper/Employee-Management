package org.jubadeveloper.config;

import org.jubadeveloper.entitie.Employee;
import org.jubadeveloper.entitie.EmployeeStatus;
import org.jubadeveloper.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {
    @Autowired
    private EmployeeService employeeService;
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase () {
        return args -> {
            log.info("Preloading " + employeeService.create(new Employee("Juan")));
        };
    }
}