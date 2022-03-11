package com.kevin.mockito.samples.service.impl;

import com.kevin.mockito.samples.service.ScheduleService;
import java.time.LocalDateTime;

public class ScheduleServiceImpl implements ScheduleService {

  @Override
  public boolean canRegister(LocalDateTime datetime) {
    if (datetime == null) {
      return false;
    }

    LocalDateTime now = LocalDateTime.now();
    // we can register the schedule after 10 minutes of the current time
    return datetime.isAfter(now.plusMinutes(10));
  }

}
