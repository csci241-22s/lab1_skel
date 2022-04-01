package lab1;

import static org.junit.Assert.*;
import org.junit.FixMethodOrder;

//import java.util.Arrays;

import org.junit.Rule;
import org.junit.rules.Timeout;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.time.LocalDateTime;

//import java.util.Random;
//import java.util.Collections;
//import java.util.Arrays;
//import java.util.Scanner;
//import java.util.HashMap;
//import java.util.ArrayList;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HelloTest {
  @Rule
  public Timeout globalTimeout = Timeout.seconds(10); // 10 second timeout

  private LocalDateTime dt = LocalDateTime.of(2020, 7, 14, 0, 4, 2);

  /** Tests getGreeting for all possible hours of the day*/
  @Test
  public void test00morning() {
    //LocalDateTime dt = LocalDateTime.of(2020, 7, 14, 0, 4, 2);
    for (int hour = 0; hour < 12; hour++) {
      assertEquals(Hello.getGreeting(dt.withHour(hour)), "Good morning");
    }
  }

  @Test
  public void test01afternoon() {
    for (int hour = 12; hour < 17; hour++) {
      assertEquals(Hello.getGreeting(dt.withHour(hour)), "Good afternoon");
    }
  }

  @Test
  public void test02evening() {
    for (int hour = 17; hour < 24; hour++) {
      assertEquals(Hello.getGreeting(dt.withHour(hour)), "Good evening");
    }
  }

}
