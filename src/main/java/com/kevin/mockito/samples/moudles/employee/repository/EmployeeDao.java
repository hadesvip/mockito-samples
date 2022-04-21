package com.kevin.mockito.samples.moudles.employee.repository;

import com.kevin.mockito.samples.moudles.employee.repository.entity.Employee;

public class EmployeeDao {


  public Employee getEmployeeById(Long employeeId) {

    return new Employee(employeeId, "张三");
  }


}
