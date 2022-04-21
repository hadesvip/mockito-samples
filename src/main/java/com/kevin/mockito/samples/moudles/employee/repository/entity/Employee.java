package com.kevin.mockito.samples.moudles.employee.repository.entity;

public class Employee {


  private Long employeeId;

  private String name;


  public Long getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(Long employeeId) {
    this.employeeId = employeeId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Employee() {
  }

  public Employee(Long employeeId, String name) {
    this.employeeId = employeeId;
    this.name = name;
  }
}
