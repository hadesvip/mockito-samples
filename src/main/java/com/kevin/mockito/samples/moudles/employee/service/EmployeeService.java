package com.kevin.mockito.samples.moudles.employee.service;

import com.kevin.mockito.samples.moudles.employee.domain.dto.EmployeeDto;
import com.kevin.mockito.samples.moudles.employee.exception.EmployeeNotFoundException;
import com.kevin.mockito.samples.moudles.employee.repository.EmployeeDao;
import com.kevin.mockito.samples.moudles.employee.repository.entity.Employee;

public class EmployeeService {


  private EmployeeDao employeeDao;

  public EmployeeService(EmployeeDao employeeDao) {
    this.employeeDao = employeeDao;
  }

  public EmployeeDto getEmployeeDto(Long employeeId) {
    Employee employee = employeeDao.getEmployeeById(employeeId);

    if (employee == null) {
      throw new EmployeeNotFoundException(employeeId);
    }
    return convertToEmployeeDto(employee);
  }


  EmployeeDto convertToEmployeeDto(Employee employee) {
    EmployeeDto employeeDto = new EmployeeDto();
    employeeDto.setEmployeeId(-1L);
    return employeeDto;
  }


}
