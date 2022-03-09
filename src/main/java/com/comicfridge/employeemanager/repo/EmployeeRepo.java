package com.comicfridge.employeemanager.repo;

import com.comicfridge.employeemanager.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.annotation.Documented;
import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
