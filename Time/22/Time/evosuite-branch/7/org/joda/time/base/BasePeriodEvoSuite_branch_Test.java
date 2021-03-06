/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:15:26 GMT 2014
 */

package org.joda.time.base;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.TimeOfDay;
import org.joda.time.YearMonthDay;
import org.joda.time.Years;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class BasePeriodEvoSuite_branch_Test extends BasePeriodEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      long long0 = 3L;
      PeriodType periodType0 = PeriodType.dayTime();
      assertEquals("DayTime", periodType0.getName());
      assertEquals(5, periodType0.size());
      assertNotNull(periodType0);
      
      MutablePeriod mutablePeriod0 = new MutablePeriod(long0, periodType0);
      assertEquals(5, mutablePeriod0.size());
      assertEquals("DayTime", periodType0.getName());
      assertEquals(5, periodType0.size());
      assertNotNull(mutablePeriod0);
      
      int int0 = 8;
      Years years0 = Years.years(int0);
      assertEquals(1, years0.size());
      assertNotNull(years0);
      
      // Undeclared exception!
      try {
        mutablePeriod0.add((ReadablePeriod) years0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'years'
         //
      }
  }

  @Test
  public void test01()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      assertEquals(7, periodType0.size());
      assertEquals("YearMonthDayTime", periodType0.getName());
      assertNotNull(periodType0);
      
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      assertEquals(7, mutablePeriod0.size());
      assertEquals(7, periodType0.size());
      assertEquals("YearMonthDayTime", periodType0.getName());
      assertNotNull(mutablePeriod0);
      
      ReadableInstant readableInstant0 = null;
      Duration duration0 = mutablePeriod0.toDurationFrom(readableInstant0);
      assertEquals(7, mutablePeriod0.size());
      assertEquals(0L, duration0.getMillis());
      assertEquals(7, periodType0.size());
      assertEquals("YearMonthDayTime", periodType0.getName());
      assertNotNull(duration0);
      
      mutablePeriod0.add((ReadableDuration) duration0);
      assertEquals(7, mutablePeriod0.size());
      assertEquals(0L, duration0.getMillis());
      assertEquals(7, periodType0.size());
      assertEquals("YearMonthDayTime", periodType0.getName());
  }

  @Test
  public void test02()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      assertEquals(8, mutablePeriod0.size());
      assertNotNull(mutablePeriod0);
      
      ReadablePeriod readablePeriod0 = null;
      mutablePeriod0.add(readablePeriod0);
      assertEquals(8, mutablePeriod0.size());
  }

  @Test
  public void test03()  throws Throwable  {
      long long0 = 226L;
      Period period0 = new Period(long0, long0);
      assertEquals(8, period0.size());
      assertNotNull(period0);
      
      MutablePeriod mutablePeriod0 = period0.toMutablePeriod();
      assertEquals(8, mutablePeriod0.size());
      assertEquals(8, period0.size());
      assertNotNull(mutablePeriod0);
      
      mutablePeriod0.mergePeriod((ReadablePeriod) period0);
      assertEquals(8, mutablePeriod0.size());
      assertEquals(8, period0.size());
  }

  @Test
  public void test04()  throws Throwable  {
      int int0 = 362;
      Seconds seconds0 = null;
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      assertEquals(7, periodType0.size());
      assertEquals("YearWeekDayTime", periodType0.getName());
      assertNotNull(periodType0);
      
      MutablePeriod mutablePeriod0 = new MutablePeriod((long) int0, periodType0);
      assertEquals(7, periodType0.size());
      assertEquals("YearWeekDayTime", periodType0.getName());
      assertEquals(7, mutablePeriod0.size());
      assertNotNull(mutablePeriod0);
      
      mutablePeriod0.mergePeriod((ReadablePeriod) seconds0);
      assertEquals(7, periodType0.size());
      assertEquals("YearWeekDayTime", periodType0.getName());
      assertEquals(7, mutablePeriod0.size());
  }

  @Test
  public void test05()  throws Throwable  {
      long long0 = 3L;
      PeriodType periodType0 = PeriodType.dayTime();
      assertEquals("DayTime", periodType0.getName());
      assertEquals(5, periodType0.size());
      assertNotNull(periodType0);
      
      MutablePeriod mutablePeriod0 = new MutablePeriod(long0, periodType0);
      assertEquals("DayTime", periodType0.getName());
      assertEquals(5, periodType0.size());
      assertEquals(5, mutablePeriod0.size());
      assertNotNull(mutablePeriod0);
      
      int int0 = 8;
      Years years0 = Years.years(int0);
      assertEquals(1, years0.size());
      assertNotNull(years0);
      
      DurationFieldType durationFieldType0 = years0.getFieldType();
      assertEquals(1, years0.size());
      assertEquals("years", durationFieldType0.toString());
      assertEquals("years", durationFieldType0.getName());
      assertNotNull(durationFieldType0);
      
      int int1 = 0;
      mutablePeriod0.add(durationFieldType0, int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(1, years0.size());
      assertEquals("years", durationFieldType0.toString());
      assertEquals("years", durationFieldType0.getName());
      assertEquals("DayTime", periodType0.getName());
      assertEquals(5, periodType0.size());
      assertEquals(5, mutablePeriod0.size());
  }

  @Test
  public void test06()  throws Throwable  {
      long long0 = 3299L;
      MutablePeriod mutablePeriod0 = new MutablePeriod(long0);
      assertEquals(8, mutablePeriod0.size());
      assertNotNull(mutablePeriod0);
      
      DurationFieldType durationFieldType0 = null;
      int int0 = 0;
      // Undeclared exception!
      try {
        mutablePeriod0.add(durationFieldType0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'null'
         //
      }
  }

  @Test
  public void test07()  throws Throwable  {
      PeriodType periodType0 = PeriodType.months();
      assertEquals("Months", periodType0.getName());
      assertEquals(1, periodType0.size());
      assertNotNull(periodType0);
      
      ReadableInstant readableInstant0 = null;
      int int0 = 6088;
      Period period0 = new Period(readableInstant0, readableInstant0, periodType0);
      assertEquals("Months", periodType0.getName());
      assertEquals(1, periodType0.size());
      assertEquals(1, period0.size());
      assertNotNull(period0);
      
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      assertEquals("weeks", durationFieldType0.toString());
      assertEquals("weeks", durationFieldType0.getName());
      assertNotNull(durationFieldType0);
      
      // Undeclared exception!
      try {
        Period period1 = period0.withFieldAdded(durationFieldType0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'weeks'
         //
      }
  }

  @Test
  public void test08()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      assertEquals("YearMonthDayTime", periodType0.getName());
      assertEquals(7, periodType0.size());
      assertNotNull(periodType0);
      
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      assertEquals("YearMonthDayTime", periodType0.getName());
      assertEquals(7, periodType0.size());
      assertEquals(7, mutablePeriod0.size());
      assertNotNull(mutablePeriod0);
      
      int int0 = mutablePeriod0.getHours();
      assertEquals(0, int0);
      assertEquals("YearMonthDayTime", periodType0.getName());
      assertEquals(7, periodType0.size());
      assertEquals(7, mutablePeriod0.size());
      
      mutablePeriod0.setWeeks(int0);
      assertEquals("YearMonthDayTime", periodType0.getName());
      assertEquals(7, periodType0.size());
      assertEquals(7, mutablePeriod0.size());
  }

  @Test
  public void test09()  throws Throwable  {
      int int0 = 54;
      Instant instant0 = new Instant((long) int0);
      assertEquals(54L, instant0.getMillis());
      assertNotNull(instant0);
      
      Duration duration0 = Duration.standardSeconds((long) int0);
      assertEquals(54000L, duration0.getMillis());
      assertNotNull(duration0);
      
      Days days0 = Days.TWO;
      assertEquals(1, days0.size());
      assertNotNull(days0);
      
      PeriodType periodType0 = days0.getPeriodType();
      assertEquals(1, days0.size());
      assertEquals("Days", periodType0.getName());
      assertEquals(1, periodType0.size());
      assertNotNull(periodType0);
      
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) instant0, (ReadableDuration) duration0, periodType0);
      assertEquals(54000L, duration0.getMillis());
      assertEquals(54L, instant0.getMillis());
      assertEquals(1, days0.size());
      assertEquals(1, mutablePeriod0.size());
      assertEquals("Days", periodType0.getName());
      assertEquals(1, periodType0.size());
      assertNotNull(mutablePeriod0);
      
      // Undeclared exception!
      try {
        mutablePeriod0.setMonths(int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'months'
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      long long0 = 3299L;
      MutablePeriod mutablePeriod0 = new MutablePeriod(long0);
      assertEquals(8, mutablePeriod0.size());
      assertNotNull(mutablePeriod0);
      
      int int0 = (-3637);
      mutablePeriod0.setYears(int0);
      assertEquals(8, mutablePeriod0.size());
  }

  @Test
  public void test11()  throws Throwable  {
      int int0 = 0;
      PeriodType periodType0 = PeriodType.yearMonthDay();
      assertEquals("YearMonthDay", periodType0.getName());
      assertEquals(3, periodType0.size());
      assertNotNull(periodType0);
      
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      assertEquals("YearMonthDay", periodType0.getName());
      assertEquals(3, periodType0.size());
      assertEquals(3, mutablePeriod0.size());
      assertNotNull(mutablePeriod0);
      
      int int1 = (-3934);
      // Undeclared exception!
      try {
        mutablePeriod0.setPeriod(int0, int0, int0, int0, int0, int1, int1, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'minutes'
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      Chronology chronology0 = null;
      TimeOfDay timeOfDay0 = new TimeOfDay(chronology0);
      assertEquals(4, timeOfDay0.size());
      assertNotNull(timeOfDay0);
      
      int int0 = 0;
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetHours(int0);
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertNotNull(fixedDateTimeZone0);
      
      LocalDateTime localDateTime0 = new LocalDateTime((long) int0, (DateTimeZone) fixedDateTimeZone0);
      assertEquals(4, localDateTime0.size());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertNotNull(localDateTime0);
      
      Period period0 = null;
      try {
        period0 = new Period((ReadablePartial) timeOfDay0, (ReadablePartial) localDateTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = null;
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      assertEquals(4, localDateTime0.size());
      assertNotNull(localDateTime0);
      
      MockDate mockDate0 = (MockDate)localDateTime0.toDate();
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", mockDate0.toString());
      assertEquals(4, localDateTime0.size());
      assertNotNull(mockDate0);
      
      YearMonthDay yearMonthDay0 = YearMonthDay.fromDateFields((Date) mockDate0);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", mockDate0.toString());
      assertEquals(3, yearMonthDay0.size());
      assertEquals(4, localDateTime0.size());
      assertNotNull(yearMonthDay0);
      
      PeriodType periodType0 = PeriodType.months();
      assertEquals(1, periodType0.size());
      assertEquals("Months", periodType0.getName());
      assertNotNull(periodType0);
      
      Period period0 = null;
      try {
        period0 = new Period((ReadablePartial) yearMonthDay0, (ReadablePartial) localDateTime0, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      assertEquals(8, mutablePeriod0.size());
      assertNotNull(mutablePeriod0);
      
      TimeOfDay timeOfDay0 = new TimeOfDay();
      assertEquals(4, timeOfDay0.size());
      assertNotNull(timeOfDay0);
      
      DateTime dateTime0 = timeOfDay0.toDateTimeToday();
      assertEquals(1392409281320L, dateTime0.getMillis());
      assertEquals(4, timeOfDay0.size());
      assertNotNull(dateTime0);
      
      LocalTime localTime0 = dateTime0.toLocalTime();
      assertEquals(4, localTime0.size());
      assertEquals(1392409281320L, dateTime0.getMillis());
      assertEquals(4, timeOfDay0.size());
      assertNotNull(localTime0);
      
      PeriodType periodType0 = mutablePeriod0.getPeriodType();
      assertEquals(8, mutablePeriod0.size());
      assertEquals("Standard", periodType0.getName());
      assertEquals(8, periodType0.size());
      assertNotNull(periodType0);
      
      Period period0 = new Period((ReadablePartial) localTime0, (ReadablePartial) timeOfDay0, periodType0);
      assertEquals(8, mutablePeriod0.size());
      assertEquals(4, localTime0.size());
      assertEquals("Standard", periodType0.getName());
      assertEquals(8, periodType0.size());
      assertEquals(1392409281320L, dateTime0.getMillis());
      assertEquals(4, timeOfDay0.size());
      assertEquals(8, period0.size());
      assertNotNull(period0);
  }

  @Test
  public void test15()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      assertEquals(true, mockGregorianCalendar0.isLenient());
      assertEquals(2, mockGregorianCalendar0.getFirstDayOfWeek());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      assertEquals(4, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
      assertNotNull(mockGregorianCalendar0);
      
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      assertEquals(true, mockGregorianCalendar0.isLenient());
      assertEquals(2, mockGregorianCalendar0.getFirstDayOfWeek());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      assertEquals(4, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
      assertEquals("Fri Oct 15 00:00:00 GMT 1582", date0.toString());
      assertNotNull(date0);
      
      LocalDate localDate0 = LocalDate.fromDateFields(date0);
      assertEquals(3, localDate0.size());
      assertEquals(true, mockGregorianCalendar0.isLenient());
      assertEquals(2, mockGregorianCalendar0.getFirstDayOfWeek());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      assertEquals(4, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
      assertEquals("Fri Oct 15 00:00:00 GMT 1582", date0.toString());
      assertNotNull(localDate0);
      
      Period period0 = new Period((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      assertEquals(8, period0.size());
      assertEquals(3, localDate0.size());
      assertEquals(true, mockGregorianCalendar0.isLenient());
      assertEquals(2, mockGregorianCalendar0.getFirstDayOfWeek());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      assertEquals(4, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
      assertEquals("Fri Oct 15 00:00:00 GMT 1582", date0.toString());
      assertNotNull(period0);
  }

  @Test
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = null;
      MonthDay monthDay0 = new MonthDay(dateTimeZone0);
      assertEquals(2, monthDay0.size());
      assertNotNull(monthDay0);
      
      ReadablePartial readablePartial0 = null;
      Hours hours0 = Hours.FOUR;
      assertEquals(1, hours0.size());
      assertNotNull(hours0);
      
      PeriodType periodType0 = hours0.getPeriodType();
      assertEquals(1, hours0.size());
      assertEquals("Hours", periodType0.getName());
      assertEquals(1, periodType0.size());
      assertNotNull(periodType0);
      
      Period period0 = null;
      try {
        period0 = new Period((ReadablePartial) monthDay0, readablePartial0, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
      }
  }

  @Test
  public void test17()  throws Throwable  {
      ReadablePartial readablePartial0 = null;
      Period period0 = null;
      try {
        period0 = new Period(readablePartial0, readablePartial0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
      }
  }

  @Test
  public void test18()  throws Throwable  {
      ReadableInstant readableInstant0 = null;
      DateMidnight dateMidnight0 = new DateMidnight();
      assertEquals(1392336000000L, dateMidnight0.getMillis());
      assertNotNull(dateMidnight0);
      
      Chronology chronology0 = null;
      MutableDateTime mutableDateTime0 = dateMidnight0.toMutableDateTime(chronology0);
      assertEquals(1392336000000L, mutableDateTime0.getMillis());
      assertEquals(0, mutableDateTime0.getRoundingMode());
      assertEquals(1392336000000L, dateMidnight0.getMillis());
      assertNotNull(mutableDateTime0);
      
      PeriodType periodType0 = PeriodType.seconds();
      assertEquals(1, periodType0.size());
      assertEquals("Seconds", periodType0.getName());
      assertNotNull(periodType0);
      
      MutablePeriod mutablePeriod0 = new MutablePeriod(readableInstant0, (ReadableInstant) mutableDateTime0, periodType0);
      assertEquals(1392336000000L, mutableDateTime0.getMillis());
      assertEquals(0, mutableDateTime0.getRoundingMode());
      assertEquals(1, periodType0.size());
      assertEquals("Seconds", periodType0.getName());
      assertEquals(1, mutablePeriod0.size());
      assertEquals(1392336000000L, dateMidnight0.getMillis());
      assertNotNull(mutablePeriod0);
  }

  @Test
  public void test19()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      assertEquals(4, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      assertEquals(true, mockGregorianCalendar0.isLenient());
      assertEquals(2, mockGregorianCalendar0.getFirstDayOfWeek());
      assertNotNull(mockGregorianCalendar0);
      
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      assertEquals(4, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      assertEquals(true, mockGregorianCalendar0.isLenient());
      assertEquals(2, mockGregorianCalendar0.getFirstDayOfWeek());
      assertEquals("Fri Oct 15 00:00:00 GMT 1582", date0.toString());
      assertNotNull(date0);
      
      DateTime dateTime0 = new DateTime((Object) date0);
      assertEquals(4, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      assertEquals(true, mockGregorianCalendar0.isLenient());
      assertEquals(2, mockGregorianCalendar0.getFirstDayOfWeek());
      assertEquals((-12219292800000L), dateTime0.getMillis());
      assertEquals("Fri Oct 15 00:00:00 GMT 1582", date0.toString());
      assertNotNull(dateTime0);
      
      Period period0 = new Period((ReadableInstant) dateTime0, (ReadableInstant) dateTime0);
      assertEquals(4, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      assertEquals(true, mockGregorianCalendar0.isLenient());
      assertEquals(2, mockGregorianCalendar0.getFirstDayOfWeek());
      assertEquals((-12219292800000L), dateTime0.getMillis());
      assertEquals(8, period0.size());
      assertEquals("Fri Oct 15 00:00:00 GMT 1582", date0.toString());
      assertNotNull(period0);
  }

  @Test
  public void test20()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      assertEquals(1, hours0.size());
      assertNotNull(hours0);
      
      MutablePeriod mutablePeriod0 = hours0.toMutablePeriod();
      assertEquals(8, mutablePeriod0.size());
      assertEquals(1, hours0.size());
      assertNotNull(mutablePeriod0);
      
      int int0 = 0;
      DurationFieldType durationFieldType0 = null;
      // Undeclared exception!
      try {
        mutablePeriod0.set(durationFieldType0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'null'
         //
      }
  }

  @Test
  public void test21()  throws Throwable  {
      Object object0 = null;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      assertNotNull(buddhistChronology0);
      
      Period period0 = new Period(object0, (Chronology) buddhistChronology0);
      assertEquals(8, period0.size());
      assertNotNull(period0);
  }

  @Test
  public void test22()  throws Throwable  {
      int int0 = (-3637);
      Period period0 = new Period(int0, int0, int0, int0, int0, int0, int0, int0);
      assertEquals(8, period0.size());
      assertNotNull(period0);
      
      Period period1 = period0.plusDays(int0);
      assertNotSame(period1, period0);
      assertNotSame(period0, period1);
      assertFalse(period1.equals((Object)period0));
      assertFalse(period0.equals((Object)period1));
      assertEquals(8, period1.size());
      assertEquals(8, period0.size());
      assertNotNull(period1);
  }

  @Test
  public void test23()  throws Throwable  {
      long long0 = 3299L;
      MutablePeriod mutablePeriod0 = new MutablePeriod(long0);
      assertEquals(8, mutablePeriod0.size());
      assertNotNull(mutablePeriod0);
      
      int int0 = (-3637);
      mutablePeriod0.addMinutes(int0);
      assertEquals(8, mutablePeriod0.size());
  }

  @Test
  public void test24()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      assertEquals(7, periodType0.size());
      assertEquals("YearMonthDayTime", periodType0.getName());
      assertNotNull(periodType0);
      
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      assertEquals(7, mutablePeriod0.size());
      assertEquals(7, periodType0.size());
      assertEquals("YearMonthDayTime", periodType0.getName());
      assertNotNull(mutablePeriod0);
      
      int int0 = 1733;
      // Undeclared exception!
      try {
        mutablePeriod0.setValue(int0, int0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1733
         //
      }
  }

  @Test
  public void test25()  throws Throwable  {
      long long0 = 380L;
      MutablePeriod mutablePeriod0 = new MutablePeriod(long0);
      assertEquals(8, mutablePeriod0.size());
      assertNotNull(mutablePeriod0);
      
      int int0 = 23;
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) int0);
      assertEquals(4, localTime0.size());
      assertNotNull(localTime0);
      
      DateTime dateTime0 = localTime0.toDateTimeToday();
      assertEquals(1392336000023L, dateTime0.getMillis());
      assertEquals(4, localTime0.size());
      assertNotNull(dateTime0);
      
      Duration duration0 = mutablePeriod0.toDurationTo((ReadableInstant) dateTime0);
      assertEquals(1392336000023L, dateTime0.getMillis());
      assertEquals(4, localTime0.size());
      assertEquals(8, mutablePeriod0.size());
      assertEquals(380L, duration0.getMillis());
      assertNotNull(duration0);
      
      Period period0 = new Period((ReadableDuration) duration0, (ReadableInstant) dateTime0);
      assertEquals(1392336000023L, dateTime0.getMillis());
      assertEquals(4, localTime0.size());
      assertEquals(8, mutablePeriod0.size());
      assertEquals(380L, duration0.getMillis());
      assertEquals(8, period0.size());
      assertNotNull(period0);
  }
}
