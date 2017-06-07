/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 16:38:50 GMT 2014
 */

package org.joda.time.chrono;

import static org.junit.Assert.*;
import org.junit.Test;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.MonthDay;
import org.joda.time.Months;
import org.joda.time.MutablePeriod;
import org.joda.time.Partial;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonthDay;
import org.joda.time.chrono.BasicMonthOfYearDateTimeField;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJMonthOfYearDateTimeField;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.field.PreciseDurationField;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class BasicMonthOfYearDateTimeFieldEvoSuite_branch_Test extends BasicMonthOfYearDateTimeFieldEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      assertNotNull(ethiopicChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(ethiopicChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      
      long long0 = 30962844000009L;
      boolean boolean0 = gJMonthOfYearDateTimeField0.isLeap(long0);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertFalse(boolean0);
  }

  @Test
  public void test01()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      assertNotNull(ethiopicChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(ethiopicChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      
      long long0 = 99999999999954L;
      int int0 = gJMonthOfYearDateTimeField0.getLeapAmount(long0);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(1, int0);
  }

  @Test
  public void test02()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      assertNotNull(copticChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      
      long long0 = (-25L);
      int int0 = gJMonthOfYearDateTimeField0.getLeapAmount(long0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals(0, int0);
  }

  @Test
  public void test03()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      assertNotNull(gregorianChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(gregorianChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      
      long long0 = (-612L);
      long long1 = (-1L);
      long long2 = gJMonthOfYearDateTimeField0.getDifferenceAsLong(long0, long1);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals(0L, long2);
      assertFalse(long1 == long0);
      assertFalse(long1 == long2);
      assertFalse(long0 == long1);
      assertFalse(long0 == long2);
      assertFalse(long2 == long0);
      assertFalse(long2 == long1);
  }

  @Test
  public void test04()  throws Throwable  {
      int int0 = 56;
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetHoursMinutes(int0, int0);
      assertNotNull(fixedDateTimeZone0);
      assertEquals("+56:56", fixedDateTimeZone0.getID());
      assertEquals("+56:56", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      assertNotNull(julianChronology0);
      assertEquals("+56:56", fixedDateTimeZone0.getID());
      assertEquals("+56:56", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(julianChronology0, int0);
      assertNotNull(basicMonthOfYearDateTimeField0);
      assertEquals("+56:56", fixedDateTimeZone0.getID());
      assertEquals("+56:56", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      
      MonthDay monthDay0 = new MonthDay();
      assertNotNull(monthDay0);
      assertEquals(2, monthDay0.size());
      
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try {
        int[] intArray1 = basicMonthOfYearDateTimeField0.add((ReadablePartial) monthDay0, int0, intArray0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for monthOfYear must be in the range [1,12]
         //
      }
  }

  @Test
  public void test05()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      assertNotNull(julianChronology0);
      
      int int0 = 12;
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(julianChronology0, int0);
      assertNotNull(basicMonthOfYearDateTimeField0);
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      
      Partial partial0 = new Partial();
      assertNotNull(partial0);
      assertEquals(0, partial0.size());
      
      int[] intArray0 = new int[6];
      int[] intArray1 = basicMonthOfYearDateTimeField0.add((ReadablePartial) partial0, int0, intArray0, int0);
      assertNotNull(intArray1);
      assertEquals(0, partial0.size());
      assertEquals("monthOfYear", basicMonthOfYearDateTimeField0.getName());
      assertEquals(true, basicMonthOfYearDateTimeField0.isSupported());
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0}, intArray0);
      assertArrayEquals(new int[] {}, intArray1);
      assertNotSame(intArray0, intArray1);
      assertNotSame(intArray1, intArray0);
      assertFalse(intArray0.equals((Object)intArray1));
      assertFalse(intArray1.equals((Object)intArray0));
  }

  @Test
  public void test06()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      assertNotNull(monthDay0);
      assertEquals(2, monthDay0.size());
      
      long long0 = (-53L);
      MutablePeriod mutablePeriod0 = new MutablePeriod(long0, long0);
      assertNotNull(mutablePeriod0);
      
      MonthDay monthDay1 = monthDay0.plus((ReadablePeriod) mutablePeriod0);
      assertNotNull(monthDay1);
      assertEquals(2, monthDay1.size());
      assertEquals(2, monthDay0.size());
      assertNotSame(monthDay1, monthDay0);
      assertNotSame(monthDay0, monthDay1);
      assertTrue(monthDay1.equals((Object)monthDay0));
      assertTrue(monthDay0.equals((Object)monthDay1));
  }

  @Test
  public void test07()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      assertNotNull(gregorianChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(gregorianChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      
      long long0 = 1642L;
      long long1 = 2629745981L;
      long long2 = gJMonthOfYearDateTimeField0.add(long0, long1);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(6915563974512001642L, long2);
      assertFalse(long1 == long0);
      assertFalse(long1 == long2);
      assertFalse(long2 == long0);
      assertFalse(long2 == long1);
      assertFalse(long0 == long2);
      assertFalse(long0 == long1);
  }

  @Test
  public void test08()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      assertNotNull(gregorianChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(gregorianChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      
      long long0 = 2629745981L;
      long long1 = gJMonthOfYearDateTimeField0.add(long0, long0);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(6915563977055345981L, long1);
      assertFalse(long1 == long0);
      assertFalse(long0 == long1);
  }

  @Test
  public void test09()  throws Throwable  {
      int int0 = 1245;
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      assertNotNull(copticChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      
      byte byte0 = (byte) (-19);
      int int1 = 1244;
      long long0 = copticChronology0.getYearMonthDayMillis(byte0, int1, int0);
      assertEquals((-50486025600000L), long0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      
      // Undeclared exception!
      try {
        long long1 = gJMonthOfYearDateTimeField0.add((long) int0, long0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Magnitude of add amount is too large: -50486025600000
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      int int0 = 1245;
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      assertNotNull(copticChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      
      byte byte0 = (byte) (-19);
      long long0 = copticChronology0.getYearMonthDayMillis(byte0, byte0, int0);
      assertEquals((-53759721600000L), long0);
      
      // Undeclared exception!
      try {
        long long1 = gJMonthOfYearDateTimeField0.add((long) int0, long0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Magnitude of add amount is too large: -53759721600000
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      assertNotNull(copticChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      
      long long0 = 2436L;
      long long1 = gJMonthOfYearDateTimeField0.add(long0, long0);
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(5914252802436L, long1);
      assertFalse(long0 == long1);
      assertFalse(long1 == long0);
      
      // Undeclared exception!
      try {
        long long2 = gJMonthOfYearDateTimeField0.add(long0, long1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Magnitude of add amount is too large: 5914252802436
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      assertNotNull(islamicChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(islamicChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      
      long long0 = (-1639L);
      int int0 = (-1233);
      long long1 = gJMonthOfYearDateTimeField0.add(long0, int0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals((-3145910401639L), long1);
      assertFalse(long0 == long1);
      assertFalse(long1 == long0);
  }

  @Test
  public void test13()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      assertNotNull(gregorianChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(gregorianChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      
      long long0 = (-612L);
      long long1 = gJMonthOfYearDateTimeField0.getDifferenceAsLong(long0, long0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals(0L, long1);
      assertFalse(long1 == long0);
      assertFalse(long0 == long1);
      
      Months months0 = Months.ELEVEN;
      assertNotNull(months0);
      assertEquals(1, months0.size());
      
      int[] intArray0 = gregorianChronology0.get((ReadablePeriod) months0, long0, long1);
      assertNotNull(intArray0);
      assertEquals(1, months0.size());
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertArrayEquals(new int[] {0}, intArray0);
      assertFalse(long1 == long0);
      assertFalse(long0 == long1);
  }

  @Test
  public void test14()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      assertNotNull(copticChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      
      long long0 = 2436L;
      long long1 = gJMonthOfYearDateTimeField0.add(long0, long0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals(5914252802436L, long1);
      assertFalse(long1 == long0);
      assertFalse(long0 == long1);
      
      int int0 = gJMonthOfYearDateTimeField0.get(long1);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals(9, int0);
      assertFalse(long1 == long0);
      assertFalse(long0 == long1);
      
      long long2 = gJMonthOfYearDateTimeField0.addWrapField(long0, int0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals(21772802436L, long2);
      assertFalse(long1 == long0);
      assertFalse(long1 == long2);
      assertFalse(long0 == long2);
      assertFalse(long0 == long1);
      assertFalse(long2 == long1);
      assertFalse(long2 == long0);
  }

  @Test
  public void test15()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      assertNotNull(gregorianChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(gregorianChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      
      boolean boolean0 = gJMonthOfYearDateTimeField0.isLenient();
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertFalse(boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      assertNotNull(gregorianChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(gregorianChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      
      PreciseDurationField preciseDurationField0 = (PreciseDurationField)gJMonthOfYearDateTimeField0.getLeapDurationField();
      assertNotNull(preciseDurationField0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals("days", preciseDurationField0.getName());
      assertEquals(86400000L, preciseDurationField0.getUnitMillis());
      assertEquals(true, preciseDurationField0.isSupported());
      assertEquals(true, preciseDurationField0.isPrecise());
  }

  @Test
  public void test17()  throws Throwable  {
      int int0 = 686;
      YearMonthDay yearMonthDay0 = new YearMonthDay((long) int0);
      assertNotNull(yearMonthDay0);
      assertEquals(3, yearMonthDay0.size());
      
      YearMonthDay yearMonthDay1 = yearMonthDay0.minusDays(int0);
      assertNotNull(yearMonthDay1);
      assertEquals(3, yearMonthDay1.size());
      assertEquals(3, yearMonthDay0.size());
      assertNotSame(yearMonthDay1, yearMonthDay0);
      assertNotSame(yearMonthDay0, yearMonthDay1);
      assertFalse(yearMonthDay1.equals((Object)yearMonthDay0));
      assertFalse(yearMonthDay0.equals((Object)yearMonthDay1));
  }

  @Test
  public void test18()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      assertNotNull(copticChronology0);
      
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(copticChronology0);
      assertNotNull(gJMonthOfYearDateTimeField0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      
      long long0 = (-25L);
      long long1 = gJMonthOfYearDateTimeField0.remainder(long0);
      assertEquals("monthOfYear", gJMonthOfYearDateTimeField0.getName());
      assertEquals(true, gJMonthOfYearDateTimeField0.isSupported());
      assertEquals(1900799975L, long1);
      assertFalse(long0 == long1);
      assertFalse(long1 == long0);
  }

  @Test
  public void test19()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      assertNotNull(monthDay0);
      assertEquals(2, monthDay0.size());
      
      int int0 = 15;
      MonthDay monthDay1 = monthDay0.minusMonths(int0);
      assertNotNull(monthDay1);
      assertEquals(2, monthDay0.size());
      assertEquals(2, monthDay1.size());
      assertNotSame(monthDay0, monthDay1);
      assertNotSame(monthDay1, monthDay0);
      assertFalse(monthDay0.equals((Object)monthDay1));
      assertFalse(monthDay1.equals((Object)monthDay0));
  }
}