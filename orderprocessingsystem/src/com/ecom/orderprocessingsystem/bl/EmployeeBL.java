package com.ecom.orderprocessingsystem.bl;

import java.sql.SQLException;
import java.util.Set;

import com.ecom.orderprocessingsystem.models.Employee;

public interface EmployeeBL {
    Set<Employee> getAllEmployees() throws SQLException, ClassNotFoundException;
}
