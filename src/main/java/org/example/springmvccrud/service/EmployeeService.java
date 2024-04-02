package org.example.springmvccrud.service;

import org.example.springmvccrud.entity.Employee;

import java.util.List;

public interface EmployeeService
{
    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee employee);
    void deleteById(int id);
}
