/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:32:24 GMT 2014
 */

package org.apache.commons.lang;

import static org.junit.Assert.*;
import org.junit.Test;
import java.math.BigDecimal;
import org.apache.commons.lang.NumberUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class NumberUtilsEvoSuite_branch_Test extends NumberUtilsEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      String string0 = "0L";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test01()  throws Throwable  {
      String string0 = "l";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test02()  throws Throwable  {
      String string0 = "F";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test03()  throws Throwable  {
      String string0 = "-D";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test04()  throws Throwable  {
      String string0 = "d";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test05()  throws Throwable  {
      String string0 = ".E";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test06()  throws Throwable  {
      String string0 = "e";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test07()  throws Throwable  {
      String string0 = "-07";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test08()  throws Throwable  {
      String string0 = " ";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test09()  throws Throwable  {
      String string0 = "-7E+6>]FlA80V)H'GdU";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      String string0 = "--Strings must not benull";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      String string0 = "e*@";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      String string0 = "0x#x X;z O66";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      String string0 = "-0x8";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test14()  throws Throwable  {
      String string0 = "0x";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      String string0 = "..=";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      String string0 = "-";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test17()  throws Throwable  {
      String string0 = "0xCannot pad a negative amount: ";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test18()  throws Throwable  {
      String string0 = null;
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test19()  throws Throwable  {
      String string0 = "-0f";
      boolean boolean0 = NumberUtils.isNumber(string0);
      assertTrue(boolean0);
  }

  @Test
  public void test20()  throws Throwable  {
      String string0 = "";
      boolean boolean0 = NumberUtils.isDigits(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test21()  throws Throwable  {
      String string0 = null;
      boolean boolean0 = NumberUtils.isDigits(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test22()  throws Throwable  {
      int int0 = 7;
      int int1 = NumberUtils.compare((double) int0, (double) int0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(0, int1);
      
      int int2 = NumberUtils.compare((float) int0, (float) int1);
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
      assertFalse(int1 == int0);
      assertFalse(int1 == int2);
      assertEquals(1, int2);
  }

  @Test
  public void test23()  throws Throwable  {
      int int0 = 7;
      int int1 = NumberUtils.compare((double) int0, (double) int0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(0, int1);
      
      int int2 = NumberUtils.compare((float) int1, (float) int0);
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
      assertFalse(int1 == int2);
      assertFalse(int1 == int0);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertEquals((-1), int2);
  }

  @Test
  public void test24()  throws Throwable  {
      float float0 = (-1949.1161F);
      int int0 = NumberUtils.compare(float0, float0);
      assertEquals(0, int0);
  }

  @Test
  public void test25()  throws Throwable  {
      String string0 = "0xCannot pad a negative amount: ";
      int int0 = 1186;
      int int1 = NumberUtils.stringToInt(string0, int0);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertEquals(1186, int1);
      
      double double0 = (-1.0);
      int int2 = NumberUtils.compare((double) int1, double0);
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
      assertTrue(int1 == int0);
      assertFalse(int1 == int2);
      assertFalse(int0 == int2);
      assertTrue(int0 == int1);
      assertEquals(1, int2);
  }

  @Test
  public void test26()  throws Throwable  {
      double double0 = 997.637;
      int int0 = NumberUtils.compare(double0, double0);
      assertEquals(0, int0);
      
      int int1 = NumberUtils.compare((double) int0, double0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals((-1), int1);
  }

  @Test
  public void test27()  throws Throwable  {
      int int0 = 7;
      int int1 = NumberUtils.compare((double) int0, (double) int0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(0, int1);
      
      int int2 = (-1228);
      assertFalse(int2 == int1);
      
      int int3 = NumberUtils.maximum(int2, int1, int0);
      assertFalse(int3 == int1);
      assertTrue(int3 == int0);
      assertFalse(int3 == int2);
      assertFalse(int2 == int3);
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
      assertFalse(int1 == int0);
      assertFalse(int1 == int2);
      assertFalse(int1 == int3);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertTrue(int0 == int3);
      assertEquals(7, int3);
  }

  @Test
  public void test28()  throws Throwable  {
      int int0 = 55;
      int int1 = NumberUtils.maximum(int0, int0, int0);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertEquals(55, int1);
  }

  @Test
  public void test29()  throws Throwable  {
      long long0 = (-1137L);
      long long1 = (-14L);
      long long2 = NumberUtils.maximum(long0, long0, long1);
      assertFalse(long2 == long0);
      assertTrue(long2 == long1);
      assertTrue(long1 == long2);
      assertFalse(long1 == long0);
      assertFalse(long0 == long1);
      assertFalse(long0 == long2);
      assertEquals((-14L), long2);
  }

  @Test
  public void test30()  throws Throwable  {
      long long0 = (-3977L);
      long long1 = 0L;
      long long2 = NumberUtils.maximum(long0, long1, long1);
      assertTrue(long2 == long1);
      assertFalse(long2 == long0);
      assertFalse(long0 == long1);
      assertFalse(long0 == long2);
      assertTrue(long1 == long2);
      assertFalse(long1 == long0);
      assertEquals(0L, long2);
  }

  @Test
  public void test31()  throws Throwable  {
      int int0 = 54;
      int int1 = (-106);
      int int2 = NumberUtils.minimum(int0, int0, int1);
      assertFalse(int1 == int0);
      assertTrue(int1 == int2);
      assertFalse(int2 == int0);
      assertTrue(int2 == int1);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertEquals((-106), int2);
  }

  @Test
  public void test32()  throws Throwable  {
      int int0 = 55;
      int int1 = 0;
      int int2 = NumberUtils.minimum(int0, int1, int1);
      assertTrue(int2 == int1);
      assertFalse(int2 == int0);
      assertFalse(int1 == int0);
      assertTrue(int1 == int2);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
      assertEquals(0, int2);
  }

  @Test
  public void test33()  throws Throwable  {
      long long0 = (-1137L);
      long long1 = (-14L);
      long long2 = NumberUtils.minimum(long1, long1, long0);
      assertFalse(long0 == long1);
      assertTrue(long0 == long2);
      assertTrue(long2 == long0);
      assertFalse(long2 == long1);
      assertFalse(long1 == long2);
      assertFalse(long1 == long0);
      assertEquals((-1137L), long2);
  }

  @Test
  public void test34()  throws Throwable  {
      int int0 = 7;
      int int1 = NumberUtils.compare((double) int0, (double) int0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(0, int1);
      
      int int2 = (-1228);
      assertFalse(int2 == int1);
      
      long long0 = NumberUtils.minimum((long) int1, (long) int2, (long) int1);
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
      assertFalse(int1 == int0);
      assertFalse(int1 == int2);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertEquals((-1228L), long0);
  }

  @Test
  public void test35()  throws Throwable  {
      String string0 = "vW5!@0EJa;)lI";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // vW5!@0EJa;)lI is not a valid number.
         //
      }
  }

  @Test
  public void test36()  throws Throwable  {
      String string0 = "Minimum abbreviation width with offset is 7";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test37()  throws Throwable  {
      String string0 = "-;07tL";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // -;07tL is not a valid number.
         //
      }
  }

  @Test
  public void test38()  throws Throwable  {
      String string0 = "0L";
      Long long0 = (Long)NumberUtils.createNumber(string0);
      assertEquals(0L, (long)long0);
  }

  @Test
  public void test39()  throws Throwable  {
      String string0 = "Stringq musttnotZbe null";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Stringq musttnotZbe null is not a valid number.
         //
      }
  }

  @Test
  public void test40()  throws Throwable  {
      String string0 = "L#k\\4JQR7AI=0Yd<d";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // L#k\\4JQR7AI=0Yd<d is not a valid number.
         //
      }
  }

  @Test
  public void test41()  throws Throwable  {
      String string0 = "bKg*+4F";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // bKg*+4F is not a valid number.
         //
      }
  }

  @Test
  public void test42()  throws Throwable  {
      String string0 = "nUX=MD";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // nUX=MD is not a valid number.
         //
      }
  }

  @Test
  public void test43()  throws Throwable  {
      String string0 = "i.#ghht'j`eYL";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // i.#ghht'j`eYL is not a valid number.
         //
      }
  }

  @Test
  public void test44()  throws Throwable  {
      String string0 = "\" i not a valid numer.";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // \" i not a valid numer. is not a valid number.
         //
      }
  }

  @Test
  public void test45()  throws Throwable  {
      String string0 = ".E";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // .E is not a valid number.
         //
      }
  }

  @Test
  public void test46()  throws Throwable  {
      String string0 = ".2";
      Float float0 = (Float)NumberUtils.createNumber(string0);
      assertEquals(0.2F, (float)float0, 0.01F);
  }

  @Test
  public void test47()  throws Throwable  {
      String string0 = "0x`mmlZn;8";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"`mmlZn;8\"
         //
      }
  }

  @Test
  public void test48()  throws Throwable  {
      String string0 = "--:|uE{F$9.!w_L!vcn";
      Number number0 = NumberUtils.createNumber(string0);
      assertNull(number0);
  }

  @Test
  public void test49()  throws Throwable  {
      String string0 = "L";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // L is not a valid number.
         //
      }
  }

  @Test
  public void test50()  throws Throwable  {
      String string0 = "8";
      Integer integer0 = (Integer)NumberUtils.createNumber(string0);
      assertEquals(8, (int)integer0);
  }

  @Test
  public void test51()  throws Throwable  {
      String string0 = "";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // \"\" is not a valid number.
         //
      }
  }

  @Test
  public void test52()  throws Throwable  {
      String string0 = null;
      Number number0 = NumberUtils.createNumber(string0);
      assertNull(number0);
  }

  @Test
  public void test53()  throws Throwable  {
      String string0 = "8";
      int int0 = NumberUtils.stringToInt(string0);
      assertEquals(8, int0);
  }

  @Test
  public void test54()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      assertNotNull(numberUtils0);
  }

  @Test
  public void test55()  throws Throwable  {
      String string0 = "#e9j'EV9";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"#e9j'EV9\"
         //
      }
  }

  @Test
  public void test56()  throws Throwable  {
      String string0 = "-0xv";
      try {
        Number number0 = NumberUtils.createNumber(string0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-v\"
         //
      }
  }

  @Test
  public void test57()  throws Throwable  {
      String string0 = "-078L";
      Long long0 = (Long)NumberUtils.createNumber(string0);
      assertEquals((-78L), (long)long0);
  }

  @Test
  public void test58()  throws Throwable  {
      String string0 = "-0f";
      BigDecimal bigDecimal0 = (BigDecimal)NumberUtils.createNumber(string0);
      assertEquals(0, bigDecimal0.byteValue());
      assertEquals(0, bigDecimal0.shortValue());
      assertNotNull(bigDecimal0);
  }
}