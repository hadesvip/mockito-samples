package com.kevin.mockito.samples.service;

import java.time.LocalDateTime;

/**
 * @author wangyong
 */
public interface ScheduleService {

   boolean canRegister(LocalDateTime datetime);
}
