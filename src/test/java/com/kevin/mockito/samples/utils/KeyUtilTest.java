package com.kevin.mockito.samples.utils;

import static org.junit.Assert.assertEquals;

import java.util.UUID;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class KeyUtilTest {


  private static final UUID uuid = UUID.fromString("5af48f3b-468b-4ae0-a065-7d7ac70b37a8");

  @Test
  @DisplayName("测试生成唯一ID")
  public void testIssue(){
    MockedStatic<UUID> mock = Mockito.mockStatic(UUID.class);
    mock.when(UUID::randomUUID).thenReturn(uuid);
    assertEquals(uuid, KeyUtils.issue());
  }

}
