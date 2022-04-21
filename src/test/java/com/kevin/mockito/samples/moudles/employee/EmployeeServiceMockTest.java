package com.kevin.mockito.samples.moudles.employee;

import static org.junit.jupiter.api.Assertions.assertThrows;

import com.alibaba.fastjson.JSON;
import com.kevin.mockito.samples.moudles.employee.exception.EmployeeNotFoundException;
import com.kevin.mockito.samples.moudles.employee.repository.EmployeeDao;
import com.kevin.mockito.samples.moudles.employee.service.EmployeeService;
import java.util.logging.Logger;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceMockTest {


  @Test
  public void getEmployeeDtoTest() {
//    MockedConstruction<EmployeeDao> employeeDaoMockedConstruction =
//        Mockito.mockConstruction(EmployeeDao.class,
//            (mock, context) -> Mockito.when(mock.getEmployeeById(1L)).thenReturn(null));

    EmployeeDao mockEmployeeDao = Mockito.mock(EmployeeDao.class);
    EmployeeService employeeService = new EmployeeService(mockEmployeeDao);
    Mockito.when(mockEmployeeDao.getEmployeeById(1L)).thenReturn(null);

    Throwable expectedException = assertThrows(EmployeeNotFoundException.class,
        () -> employeeService.getEmployeeDto(1L));
    Logger.getGlobal().info("期待返回的异常信息:" + JSON.toJSONString(expectedException));
    Assert.assertEquals(expectedException.getMessage(), "员工1未检索到");

  }


}
