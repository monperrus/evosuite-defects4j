/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 15:47:04 GMT 2014
 */

package org.joda.time.chrono;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.joda.time.Chronology;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.MutablePeriod;
import org.joda.time.Partial;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.BasicMonthOfYearDateTimeField;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJMonthOfYearDateTimeField;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.ZonedChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class BasicMonthOfYearDateTimeFieldEvoSuite_branch_Test extends BasicMonthOfYearDateTimeFieldEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      assertNotNull(islamicChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      
      long long0 = 9999999977L;
      int int0 = gJMonthOfYearDateTimeField0.getLeapAmount(long0);
      assertEquals(1, int0);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
  }

  @Test
  public void test01()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      assertNotNull(islamicChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      
      long long0 = 31083597720049L;
      boolean boolean0 = gJMonthOfYearDateTimeField0.isLeap(long0);
      assertFalse(boolean0);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
  }

  @Test
  public void test02()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      assertNotNull(ethiopicChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(ethiopicChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      
      byte byte0 = (byte)95;
      int int0 = gJMonthOfYearDateTimeField0.getLeapAmount((long) byte0);
      assertEquals(0, int0);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
  }

  @Test
  public void test03()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      assertNotNull(copticChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      
      int int0 = (-4);
      int int1 = gJMonthOfYearDateTimeField0.getMaximumValue((long) int0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(13, int1);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      
      long long0 = gJMonthOfYearDateTimeField0.set((long) int1, int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(21772800013L, long0);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
  }

  @Test
  public void test04()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      assertNotNull(gregorianChronology0);
      
      int int0 = (-18);
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(gregorianChronology0, int0);
      assertNotNull(basicMonthOfYearDateTimeField0);
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      
      long long0 = basicMonthOfYearDateTimeField0.getDifferenceAsLong((long) int0, (long) int0);
      assertEquals(0L, long0);
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
  }

  @Test
  public void test05()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      assertNotNull(gregorianChronology0);
      
      int int0 = 1887;
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(gregorianChronology0, int0);
      assertNotNull(basicMonthOfYearDateTimeField0);
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      
      long long0 = (-3410L);
      int int1 = basicMonthOfYearDateTimeField0.getDifference(long0, (long) int0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(0, int1);
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
  }

  @Test
  public void test06()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      assertNotNull(ethiopicChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(ethiopicChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      
      byte byte0 = (byte)95;
      MonthDay monthDay0 = new MonthDay((long) byte0);
      assertNotNull(monthDay0);
      assertEquals(2, monthDay0.size());
      
      int[] intArray0 = new int[15];
      // Undeclared exception!
      try {
        int[] intArray1 = gJMonthOfYearDateTimeField0.add((ReadablePartial) monthDay0, (int) byte0, intArray0, (int) byte0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for monthOfYear must be in the range [1,13]
         //
      }
  }

  @Test
  public void test07()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      assertNotNull(islamicChronology0);
      
      long long0 = (-1648L);
      LocalTime localTime0 = new LocalTime(long0);
      assertNotNull(localTime0);
      assertEquals(4, localTime0.size());
      
      int int0 = 0;
      int[] intArray0 = new int[8];
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      
      int int1 = (-1657);
      int[] intArray1 = gJMonthOfYearDateTimeField0.add((ReadablePartial) localTime0, int0, intArray0, int1);
      assertNotNull(intArray1);
      assertFalse(intArray0.equals((Object)intArray1));
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertFalse(intArray1.equals((Object)intArray0));
      assertNotSame(intArray0, intArray1);
      assertNotSame(intArray1, intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertArrayEquals(new int[] {22, 58, 45, 0}, intArray1);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(4, localTime0.size());
  }

  @Test
  public void test08()  throws Throwable  {
      byte byte0 = (byte)95;
      MonthDay monthDay0 = new MonthDay((long) byte0);
      assertNotNull(monthDay0);
      assertEquals(2, monthDay0.size());
      
      MonthDay monthDay1 = monthDay0.minusMonths((int) byte0);
      assertNotNull(monthDay1);
      assertFalse(monthDay1.equals((Object)monthDay0));
      assertFalse(monthDay0.equals((Object)monthDay1));
      assertNotSame(monthDay1, monthDay0);
      assertNotSame(monthDay0, monthDay1);
      assertEquals(2, monthDay1.size());
      assertEquals(2, monthDay0.size());
  }

  @Test
  public void test09()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      assertNotNull(ethiopicChronology0);
      
      int int0 = (-497);
      MockDate mockDate0 = new MockDate(int0, int0, int0);
      assertNotNull(mockDate0);
      assertEquals("Sat Mar 21 00:00:00 GMT 1360", mockDate0.toString());
      
      MonthDay monthDay0 = MonthDay.fromDateFields((Date) mockDate0);
      assertNotNull(monthDay0);
      assertEquals("Sat Mar 21 00:00:00 GMT 1360", mockDate0.toString());
      assertEquals(2, monthDay0.size());
      
      MutablePeriod mutablePeriod0 = new MutablePeriod((long) int0, (long) int0, (Chronology) ethiopicChronology0);
      assertNotNull(mutablePeriod0);
      
      MonthDay monthDay1 = monthDay0.withPeriodAdded((ReadablePeriod) mutablePeriod0, int0);
      assertNotNull(monthDay1);
      assertTrue(monthDay1.equals((Object)monthDay0));
      assertTrue(monthDay0.equals((Object)monthDay1));
      assertNotSame(monthDay1, monthDay0);
      assertNotSame(monthDay0, monthDay1);
      assertEquals(2, monthDay1.size());
      assertEquals("Sat Mar 21 00:00:00 GMT 1360", mockDate0.toString());
      assertEquals(2, monthDay0.size());
  }

  @Test
  public void test10()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      assertNotNull(gregorianChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(gregorianChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      
      long long0 = 2592000013L;
      long long1 = gJMonthOfYearDateTimeField0.add(long0, long0);
      assertFalse(long0 == long1);
      assertFalse(long1 == long0);
      assertEquals(6816301668547200013L, long1);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
  }

  @Test
  public void test11()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      assertNotNull(julianChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(julianChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      
      long long0 = 62035199970L;
      // Undeclared exception!
      try {
        long long1 = gJMonthOfYearDateTimeField0.add(long0, long0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Magnitude of add amount is too large: 62035199970
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      int int0 = (-309);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      assertNotNull(islamicChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      
      long long0 = gJMonthOfYearDateTimeField0.addWrapField((long) int0, int0);
      assertEquals((-22982400309L), long0);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      
      // Undeclared exception!
      try {
        long long1 = gJMonthOfYearDateTimeField0.add((long) int0, long0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Magnitude of add amount is too large: -22982400309
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      assertNotNull(islamicChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      
      long long0 = 1064L;
      int int0 = (-7636);
      long long1 = gJMonthOfYearDateTimeField0.addWrapField(long0, int0);
      assertFalse(long1 == long0);
      assertFalse(long0 == long1);
      assertEquals((-10195198936L), long1);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      
      // Undeclared exception!
      try {
        long long2 = gJMonthOfYearDateTimeField0.add(long0, long1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Magnitude of add amount is too large: -10195198936
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      assertNotNull(copticChronology0);
      
      long long0 = copticChronology0.getAverageMillisPerMonth();
      assertEquals(2592000000L, long0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      
      long long1 = gJMonthOfYearDateTimeField0.add(long0, long0);
      assertFalse(long0 == long1);
      assertFalse(long1 == long0);
      assertEquals(6292099941897600000L, long1);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
  }

  @Test
  public void test15()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      assertNotNull(islamicChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      
      long long0 = (-513L);
      long long1 = gJMonthOfYearDateTimeField0.add(long0, long0);
      assertFalse(long1 == long0);
      assertFalse(long0 == long1);
      assertEquals((-1308873600513L), long1);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
  }

  @Test
  public void test16()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      assertNotNull(copticChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      
      Partial partial0 = new Partial();
      assertNotNull(partial0);
      assertEquals(0, partial0.size());
      
      int[] intArray0 = new int[3];
      int int0 = 903;
      int[] intArray1 = gJMonthOfYearDateTimeField0.add((ReadablePartial) partial0, intArray0[0], intArray0, int0);
      assertNotNull(intArray1);
      assertFalse(intArray1.equals((Object)intArray0));
      assertFalse(intArray0.equals((Object)intArray1));
      assertNotSame(intArray1, intArray0);
      assertNotSame(intArray0, intArray1);
      assertArrayEquals(new int[] {}, intArray1);
      assertArrayEquals(new int[] {0, 0, 0}, intArray0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals(0, partial0.size());
  }

  @Test
  public void test17()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      assertNotNull(ethiopicChronology0);
      
      int int0 = (-497);
      long long0 = 214L;
      MutablePeriod mutablePeriod0 = new MutablePeriod((long) int0, long0, (Chronology) ethiopicChronology0);
      assertNotNull(mutablePeriod0);
  }

  @Test
  public void test18()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      assertNotNull(copticChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      
      int int0 = (-4);
      long long0 = gJMonthOfYearDateTimeField0.add((long) int0, (long) int0);
      assertEquals((-9676800004L), long0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
  }

  @Test
  public void test19()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      assertNotNull(islamicChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      
      boolean boolean0 = gJMonthOfYearDateTimeField0.isLenient();
      assertFalse(boolean0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
  }

  @Test
  public void test20()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      assertNotNull(islamicChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      
      ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = (ZonedChronology.ZonedDurationField)gJMonthOfYearDateTimeField0.getLeapDurationField();
      assertNotNull(zonedChronology_ZonedDurationField0);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals("days", zonedChronology_ZonedDurationField0.getName());
      assertEquals(true, zonedChronology_ZonedDurationField0.isSupported());
  }

  @Test
  public void test21()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      assertNotNull(islamicChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      
      ZonedChronology.ZonedDurationField zonedChronology_ZonedDurationField0 = (ZonedChronology.ZonedDurationField)gJMonthOfYearDateTimeField0.getRangeDurationField();
      assertNotNull(zonedChronology_ZonedDurationField0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("years", zonedChronology_ZonedDurationField0.getName());
      assertEquals(true, zonedChronology_ZonedDurationField0.isSupported());
  }

  @Test
  public void test22()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      assertNotNull(islamicChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      
      long long0 = 0L;
      long long1 = gJMonthOfYearDateTimeField0.remainder(long0);
      assertFalse(long0 == long1);
      assertFalse(long1 == long0);
      assertEquals(1814400000L, long1);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
  }
}
