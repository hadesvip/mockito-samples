package com.kevin.mockito.samples.service;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.kevin.mockito.samples.service.impl.ScheduleServiceImpl;
import java.time.LocalDateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 * @author wangyong
 */
@DisplayName("调度服务测试")
public class ScheduleServiceTest {

  private static final LocalDateTime datetime = LocalDateTime.of(2021, 7,
      8, 22, 6, 0, 0);


  @InjectMocks
  private ScheduleServiceImpl service;


  @BeforeEach
  public void setup() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  @DisplayName("测试是否能注册")
  public void testCanRegister() {

    MockedStatic<LocalDateTime> mock = Mockito.mockStatic(LocalDateTime.class,
        Mockito.CALLS_REAL_METHODS);
    // define the behaviour of the mock
    mock.when(LocalDateTime::now).thenReturn(datetime);

    // [case] can register
    assertTrue(service.canRegister(LocalDateTime.of(2021, 7, 8, 22,
        20, 0, 0)));
    // [case] cannot register
    assertFalse(service.canRegister(LocalDateTime.of(2021, 7, 8, 22,
        10, 0, 0)));

  }





}
