package com.example.hwcollection1.service;

import com.example.hwcollection1.model.Employee;

public interface EmployeeService {
    Employee add(String firstName, String lastName);
    Employee remove(String firstName, String lastName);
    Employee find(String firstName, String lastName);

}
