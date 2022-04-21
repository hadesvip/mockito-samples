package com.kevin.mockito.samples.moudles.employee.exception;

public class EmployeeNotFoundException extends RuntimeException {


  private Long employeeId;

  public EmployeeNotFoundException(String message) {
    super(message);
  }


  public EmployeeNotFoundException(Long employeeId) {
    this.employeeId = employeeId;
  }


  @Override
  public String getMessage() {
    return String.format("员工%s未检索到", employeeId);
  }
}
