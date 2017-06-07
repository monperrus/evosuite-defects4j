/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:13:20 GMT 2014
 */

package org.apache.commons.lang.time;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.lang.time.DurationFormatUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class DurationFormatUtilsEvoSuite_branch_Test extends DurationFormatUtilsEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      int int0 = (-1412);
      Integer integer0 = new Integer(int0);
      assertTrue(integer0.equals((Object)int0));
      assertEquals((-1412), (int)integer0);
      
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(integer0, int0);
      assertTrue(integer0.equals((Object)int0));
      assertNotNull(durationFormatUtils_Token0);
      
      boolean boolean0 = durationFormatUtils_Token0.equals((Object) durationFormatUtils_Token0);
      assertTrue(integer0.equals((Object)int0));
      assertTrue(boolean0);
  }

  @Test
  public void test01()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      assertEquals("", stringBuffer0.toString());
      assertEquals(16, stringBuffer0.capacity());
      assertEquals(0, stringBuffer0.length());
      assertNotNull(stringBuffer0);
      
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(stringBuffer0);
      assertEquals("", stringBuffer0.toString());
      assertEquals(16, stringBuffer0.capacity());
      assertEquals(0, stringBuffer0.length());
      assertNotNull(durationFormatUtils_Token0);
      
      boolean boolean0 = durationFormatUtils_Token0.equals((Object) durationFormatUtils_Token0);
      assertEquals("", stringBuffer0.toString());
      assertEquals(16, stringBuffer0.capacity());
      assertEquals(0, stringBuffer0.length());
      assertTrue(boolean0);
  }

  @Test
  public void test02()  throws Throwable  {
      String string0 = "ab";
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(string0);
      assertNotNull(durationFormatUtils_Token0);
      
      int int0 = 905;
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(string0, int0);
      assertFalse(durationFormatUtils_Token1.equals((Object)durationFormatUtils_Token0));
      assertNotNull(durationFormatUtils_Token1);
      assertNotSame(durationFormatUtils_Token1, durationFormatUtils_Token0);
      
      boolean boolean0 = durationFormatUtils_Token0.equals((Object) durationFormatUtils_Token1);
      assertFalse(durationFormatUtils_Token1.equals((Object)durationFormatUtils_Token0));
      assertFalse(durationFormatUtils_Token0.equals((Object)durationFormatUtils_Token1));
      assertFalse(boolean0);
      assertNotSame(durationFormatUtils_Token1, durationFormatUtils_Token0);
      assertNotSame(durationFormatUtils_Token0, durationFormatUtils_Token1);
  }

  @Test
  public void test03()  throws Throwable  {
      String string0 = (String)DurationFormatUtils.M;
      assertEquals("M", string0);
      assertNotNull(string0);
      
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[23];
      int int0 = (-14);
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(string0, int0);
      assertNotNull(durationFormatUtils_Token0);
      
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      assertNotNull(durationFormatUtils_TokenArray0[0]);
      
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(durationFormatUtils_Token0);
      assertFalse(durationFormatUtils_Token1.equals((Object)durationFormatUtils_Token0));
      assertFalse(durationFormatUtils_Token0.equals((Object)durationFormatUtils_Token1));
      assertNotNull(durationFormatUtils_Token1);
      assertNotSame(durationFormatUtils_Token1, durationFormatUtils_Token0);
      assertNotSame(durationFormatUtils_Token0, durationFormatUtils_Token1);
      
      durationFormatUtils_TokenArray0[5] = durationFormatUtils_Token1;
      assertNotNull(durationFormatUtils_TokenArray0[5]);
      
      boolean boolean0 = durationFormatUtils_TokenArray0[0].equals((Object) durationFormatUtils_TokenArray0[5]);
      assertFalse(boolean0);
  }

  @Test
  public void test04()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      assertEquals("", stringBuffer0.toString());
      assertEquals(0, stringBuffer0.length());
      assertEquals(16, stringBuffer0.capacity());
      assertNotNull(stringBuffer0);
      
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(stringBuffer0);
      assertEquals("", stringBuffer0.toString());
      assertEquals(0, stringBuffer0.length());
      assertEquals(16, stringBuffer0.capacity());
      assertNotNull(durationFormatUtils_Token0);
      
      boolean boolean0 = durationFormatUtils_Token0.equals((Object) stringBuffer0);
      assertEquals("", stringBuffer0.toString());
      assertEquals(0, stringBuffer0.length());
      assertEquals(16, stringBuffer0.capacity());
      assertFalse(boolean0);
  }

  @Test
  public void test05()  throws Throwable  {
      String string0 = (String)DurationFormatUtils.M;
      assertEquals("M", string0);
      assertNotNull(string0);
      
      int int0 = (-31);
      String string1 = DurationFormatUtils.formatDurationISO((long) int0);
      assertFalse(string1.equals((Object)string0));
      assertEquals("P0Y0M0DT0H0M0.69S", string1);
      assertNotNull(string1);
      assertNotSame(string1, string0);
      
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(string0);
      assertFalse(string0.equals((Object)string1));
      assertNotNull(durationFormatUtils_Token0);
      assertNotSame(string0, string1);
      
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(string1);
      assertFalse(durationFormatUtils_Token1.equals((Object)durationFormatUtils_Token0));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(durationFormatUtils_Token1);
      assertNotSame(durationFormatUtils_Token1, durationFormatUtils_Token0);
      assertNotSame(string1, string0);
      
      boolean boolean0 = durationFormatUtils_Token0.equals((Object) durationFormatUtils_Token1);
      assertFalse(durationFormatUtils_Token0.equals((Object)durationFormatUtils_Token1));
      assertFalse(durationFormatUtils_Token1.equals((Object)durationFormatUtils_Token0));
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertFalse(boolean0);
      assertNotSame(durationFormatUtils_Token0, durationFormatUtils_Token1);
      assertNotSame(durationFormatUtils_Token1, durationFormatUtils_Token0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      
      String string2 = DurationFormatUtils.formatDuration((long) int0, string1, boolean0);
      assertFalse(durationFormatUtils_Token0.equals((Object)durationFormatUtils_Token1));
      assertFalse(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertFalse(durationFormatUtils_Token1.equals((Object)durationFormatUtils_Token0));
      assertFalse(string1.equals((Object)string2));
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      assertEquals("P0Y000DT00000.69-31", string2);
      assertNotNull(string2);
      assertNotSame(durationFormatUtils_Token0, durationFormatUtils_Token1);
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertNotSame(durationFormatUtils_Token1, durationFormatUtils_Token0);
      assertNotSame(string1, string2);
      assertNotSame(string1, string0);
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
  }

  @Test
  public void test06()  throws Throwable  {
      long long0 = 3600000L;
      boolean boolean0 = true;
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[1];
      String string0 = DurationFormatUtils.formatDurationWords(long0, boolean0, boolean0);
      assertEquals("1 hour", string0);
      assertNotNull(string0);
      
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(string0);
      assertNotNull(durationFormatUtils_Token0);
      
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      assertNotNull(durationFormatUtils_TokenArray0[0]);
      
      int int0 = 20;
      String string1 = DurationFormatUtils.format(durationFormatUtils_TokenArray0, int0, int0, int0, int0, int0, int0, int0, boolean0);
      assertFalse(string1.equals((Object)string0));
      assertEquals("", string1);
      assertNotNull(string1);
      assertNotSame(string1, string0);
  }

  @Test
  public void test07()  throws Throwable  {
      int int0 = 390;
      String string0 = "#U<]0{+e~NA(y0@t QG{";
      String string1 = DurationFormatUtils.formatDuration((long) int0, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertEquals("#U<]0{+e~NA(00@t QG{", string1);
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
  }

  @Test
  public void test08()  throws Throwable  {
      long long0 = (-46L);
      long long1 = 2419199991L;
      String string0 = "=(";
      String string1 = DurationFormatUtils.formatPeriod(long0, long1, string0);
      assertFalse(long0 == long1);
      assertFalse(long1 == long0);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
      assertEquals("=(", string1);
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
  }

  @Test
  public void test09()  throws Throwable  {
      int int0 = (-1412);
      long long0 = 2419200051L;
      String string0 = DurationFormatUtils.formatPeriodISO((long) int0, long0);
      assertEquals("P0Y0M28DT0H0M1.463S", string0);
      assertNotNull(string0);
  }

  @Test
  public void test10()  throws Throwable  {
      int int0 = (-1412);
      long long0 = 2419200051L;
      String string0 = "7GasBYa&M0";
      String string1 = DurationFormatUtils.formatPeriod((long) int0, long0, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertEquals("7Ga2419201BYa&00", string1);
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
  }

  @Test
  public void test11()  throws Throwable  {
      long long0 = 60017L;
      boolean boolean0 = true;
      String string0 = DurationFormatUtils.formatDurationWords(long0, boolean0, boolean0);
      assertEquals("1 minute", string0);
      assertNotNull(string0);
  }

  @Test
  public void test12()  throws Throwable  {
      boolean boolean0 = true;
      long long0 = 2419200000L;
      String string0 = DurationFormatUtils.formatDurationWords(long0, boolean0, boolean0);
      assertEquals("28 days", string0);
      assertNotNull(string0);
  }

  @Test
  public void test13()  throws Throwable  {
      int int0 = (-31);
      boolean boolean0 = true;
      String string0 = DurationFormatUtils.formatDurationWords((long) int0, boolean0, boolean0);
      assertEquals("0 seconds", string0);
      assertNotNull(string0);
  }

  @Test
  public void test14()  throws Throwable  {
      long long0 = (-39L);
      boolean boolean0 = false;
      String string0 = DurationFormatUtils.formatDurationWords(long0, boolean0, boolean0);
      assertEquals("0 days 0 hours 0 minutes 0 seconds", string0);
      assertNotNull(string0);
  }

  @Test
  public void test15()  throws Throwable  {
      String string0 = (String)DurationFormatUtils.M;
      assertEquals("M", string0);
      assertNotNull(string0);
      
      int int0 = (-31);
      String string1 = DurationFormatUtils.formatDurationISO((long) int0);
      assertFalse(string1.equals((Object)string0));
      assertEquals("P0Y0M0DT0H0M0.69S", string1);
      assertNotNull(string1);
      assertNotSame(string1, string0);
      
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(string0);
      assertFalse(string0.equals((Object)string1));
      assertNotNull(durationFormatUtils_Token0);
      assertNotSame(string0, string1);
      
      boolean boolean0 = durationFormatUtils_Token0.equals((Object) durationFormatUtils_Token0);
      assertFalse(string0.equals((Object)string1));
      assertTrue(boolean0);
      assertNotSame(string0, string1);
      
      String string2 = DurationFormatUtils.formatDuration((long) int0, string1, boolean0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string1.equals((Object)string2));
      assertFalse(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertFalse(string0.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      assertEquals("P0Y000DT00000.69-31", string2);
      assertNotNull(string2);
      assertNotSame(string1, string0);
      assertNotSame(string1, string2);
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
  }

  @Test
  public void test16()  throws Throwable  {
      String string0 = (String)DurationFormatUtils.M;
      assertEquals("M", string0);
      assertNotNull(string0);
      
      int int0 = (-14);
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token(string0, int0);
      assertNotNull(durationFormatUtils_Token0);
      
      String string1 = durationFormatUtils_Token0.toString();
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertEquals("", string1);
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
  }

  @Test
  public void test17()  throws Throwable  {
      DurationFormatUtils durationFormatUtils0 = new DurationFormatUtils();
      assertNotNull(durationFormatUtils0);
  }

  @Test
  public void test18()  throws Throwable  {
      long long0 = (-39L);
      String string0 = DurationFormatUtils.formatDurationHMS(long0);
      assertEquals("0:00:00.61", string0);
      assertNotNull(string0);
  }

  @Test
  public void test19()  throws Throwable  {
      int int0 = (-1412);
      String string0 = "7GasBYa&M0";
      String string1 = DurationFormatUtils.formatPeriod((long) int0, (long) int0, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertEquals("7Ga0BYa&00", string1);
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
  }
}