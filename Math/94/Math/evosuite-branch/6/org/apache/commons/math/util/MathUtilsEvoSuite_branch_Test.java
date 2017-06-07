/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:12:40 GMT 2014
 */

package org.apache.commons.math.util;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.util.MathUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockArithmeticException;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class MathUtilsEvoSuite_branch_Test extends MathUtilsEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      long long0 = 3030L;
      long long1 = (-9223372036854775808L);
      // Undeclared exception!
      try {
        long long2 = MathUtils.subAndCheck(long0, long1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
      }
  }

  @Test
  public void test01()  throws Throwable  {
      long long0 = (-9223372036854775808L);
      long long1 = MathUtils.subAndCheck(long0, long0);
      assertFalse(long0 == long1);
      assertFalse(long1 == long0);
      assertEquals(0L, long1);
  }

  @Test
  public void test02()  throws Throwable  {
      int int0 = 1;
      int int1 = MathUtils.subAndCheck(int0, int0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(0, int1);
  }

  @Test
  public void test03()  throws Throwable  {
      short short0 = (short)1109;
      short short1 = MathUtils.sign(short0);
      assertFalse(short1 == short0);
      assertFalse(short0 == short1);
      assertEquals((short)1, short1);
  }

  @Test
  public void test04()  throws Throwable  {
      long long0 = (-1L);
      long long1 = MathUtils.sign(long0);
      assertTrue(long1 == long0);
      assertTrue(long0 == long1);
      assertEquals((-1L), long1);
  }

  @Test
  public void test05()  throws Throwable  {
      byte byte0 = (byte)0;
      long long0 = MathUtils.sign((long) byte0);
      assertEquals(0L, long0);
  }

  @Test
  public void test06()  throws Throwable  {
      int int0 = (-825);
      int int1 = MathUtils.sign(int0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals((-1), int1);
  }

  @Test
  public void test07()  throws Throwable  {
      int int0 = 0;
      int int1 = MathUtils.sign(int0);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertEquals(0, int1);
  }

  @Test
  public void test08()  throws Throwable  {
      short short0 = (short) (-489);
      short short1 = MathUtils.sign(short0);
      assertFalse(short1 == short0);
      assertFalse(short0 == short1);
      assertEquals((short) (-1), short1);
      
      float float0 = MathUtils.sign((float) short1);
      assertFalse(short1 == short0);
      assertFalse(short0 == short1);
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test
  public void test09()  throws Throwable  {
      long long0 = 2500L;
      long long1 = MathUtils.sign(long0);
      assertFalse(long1 == long0);
      assertFalse(long0 == long1);
      assertEquals(1L, long1);
      
      float float0 = MathUtils.sign((float) long1);
      assertFalse(long1 == long0);
      assertFalse(long0 == long1);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test
  public void test10()  throws Throwable  {
      float float0 = Float.NaN;
      float float1 = MathUtils.sign(float0);
      //  // Unstable assertion: assertTrue(float0 == float1);
      //  // Unstable assertion: assertTrue(float1 == float0);
      //  // Unstable assertion: assertEquals(Float.NaN, float1, 0.01F);
  }

  @Test
  public void test11()  throws Throwable  {
      int int0 = (-3316);
      int int1 = MathUtils.indicator(int0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals((-1), int1);
      
      double double0 = MathUtils.sign((double) int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals((-1.0), double0, 0.01D);
  }

  @Test
  public void test12()  throws Throwable  {
      int int0 = 0;
      double double0 = MathUtils.sign((double) int0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test13()  throws Throwable  {
      double double0 = Double.NaN;
      double double1 = MathUtils.sign(double0);
      //  // Unstable assertion: assertTrue(double0 == double1);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
  }

  @Test
  public void test14()  throws Throwable  {
      double double0 = 1.0;
      int int0 = MathUtils.hash(double0);
      assertEquals(1072693248, int0);
      
      double double1 = MathUtils.sign((double) int0);
      assertTrue(double0 == double1);
      assertTrue(double1 == double0);
      assertEquals(1.0, double1, 0.01D);
  }

  @Test
  public void test15()  throws Throwable  {
      byte byte0 = (byte) (-73);
      byte byte1 = MathUtils.sign(byte0);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
      assertEquals((byte) (-1), byte1);
  }

  @Test
  public void test16()  throws Throwable  {
      byte byte0 = (byte)0;
      byte byte1 = MathUtils.sign(byte0);
      assertTrue(byte1 == byte0);
      assertTrue(byte0 == byte1);
      assertEquals((byte)0, byte1);
  }

  @Test
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      int int0 = 2;
      int int1 = MathUtils.hash(doubleArray0);
      assertFalse(int1 == int0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(31, int1);
      
      short short0 = (short) (-69);
      float float0 = MathUtils.round((float) short0, int1, int0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals((-69.0F), float0, 0.01F);
  }

  @Test
  public void test18()  throws Throwable  {
      int int0 = 6;
      float float0 = MathUtils.round((float) int0, int0, int0);
      assertEquals(6.0F, float0, 0.01F);
  }

  @Test
  public void test19()  throws Throwable  {
      int int0 = 0;
      int int1 = MathUtils.gcd(int0, int0);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertEquals(0, int1);
      
      int int2 = 2;
      assertFalse(int2 == int1);
      
      float float0 = MathUtils.round((float) int1, int0, int2);
      assertFalse(int1 == int2);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertFalse(int0 == int2);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test
  public void test20()  throws Throwable  {
      float float0 = 875.1423F;
      int int0 = 0;
      float float1 = MathUtils.round(float0, int0, int0);
      assertFalse(float0 == float1);
      assertFalse(float1 == float0);
      assertEquals(876.0F, float1, 0.01F);
  }

  @Test
  public void test21()  throws Throwable  {
      short short0 = (short) (-2666);
      short short1 = MathUtils.sign(short0);
      assertFalse(short1 == short0);
      assertFalse(short0 == short1);
      assertEquals((short) (-1), short1);
      
      double double0 = Double.POSITIVE_INFINITY;
      double double1 = MathUtils.round(double0, (int) short1, (int) short1);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
      assertFalse(short1 == short0);
      assertFalse(short0 == short1);
      assertEquals(Double.POSITIVE_INFINITY, double1, 0.01D);
  }

  @Test
  public void test22()  throws Throwable  {
      short short0 = (short) (-2666);
      double double0 = Double.POSITIVE_INFINITY;
      double double1 = MathUtils.scalb(double0, (int) short0);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
      assertEquals(Double.POSITIVE_INFINITY, double1, 0.01D);
  }

  @Test
  public void test23()  throws Throwable  {
      int int0 = 952;
      double double0 = Double.NaN;
      double double1 = MathUtils.scalb(double0, int0);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertTrue(double0 == double1);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
  }

  @Test
  public void test24()  throws Throwable  {
      int int0 = (-1368);
      double double0 = MathUtils.scalb((double) int0, int0);
      assertEquals((-6.862512505834746E207), double0, 0.01D);
  }

  @Test
  public void test25()  throws Throwable  {
      byte byte0 = (byte)0;
      long long0 = MathUtils.addAndCheck((long) byte0, (long) byte0);
      assertEquals(0L, long0);
      
      double double0 = MathUtils.scalb((double) long0, (int) byte0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test26()  throws Throwable  {
      int int0 = (-1);
      double double0 = 2.2250738585072014E-308;
      double double1 = MathUtils.nextAfter(double0, (double) int0);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertEquals(2.225073858507201E-308, double1, 0.01D);
  }

  @Test
  public void test27()  throws Throwable  {
      int int0 = 0;
      int int1 = 1;
      float float0 = MathUtils.round((float) int0, int1, int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals((-0.1F), float0, 0.01F);
  }

  @Test
  public void test28()  throws Throwable  {
      int int0 = 328;
      float float0 = MathUtils.round((float) int0, int0);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test
  public void test29()  throws Throwable  {
      long long0 = 0L;
      long long1 = MathUtils.mulAndCheck(long0, long0);
      assertTrue(long0 == long1);
      assertTrue(long1 == long0);
      assertEquals(0L, long1);
      
      int int0 = 950;
      float float0 = MathUtils.round((float) long1, int0);
      assertTrue(long0 == long1);
      assertTrue(long1 == long0);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test
  public void test30()  throws Throwable  {
      long long0 = 1893L;
      long long1 = 9223372036854775807L;
      // Undeclared exception!
      try {
        long long2 = MathUtils.mulAndCheck(long0, long1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
      }
  }

  @Test
  public void test31()  throws Throwable  {
      int int0 = 2;
      long long0 = (-9218868437227405313L);
      // Undeclared exception!
      try {
        long long1 = MathUtils.mulAndCheck(long0, (long) int0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
      }
  }

  @Test
  public void test32()  throws Throwable  {
      long long0 = (-1643L);
      long long1 = 0L;
      long long2 = MathUtils.mulAndCheck(long0, long1);
      assertTrue(long2 == long1);
      assertFalse(long2 == long0);
      assertFalse(long0 == long1);
      assertFalse(long0 == long2);
      assertTrue(long1 == long2);
      assertFalse(long1 == long0);
      assertEquals(0L, long2);
  }

  @Test
  public void test33()  throws Throwable  {
      long long0 = (-9218868437227405313L);
      // Undeclared exception!
      try {
        long long1 = MathUtils.mulAndCheck(long0, long0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
      }
  }

  @Test
  public void test34()  throws Throwable  {
      int int0 = (-1368);
      long long0 = MathUtils.mulAndCheck((long) int0, (long) int0);
      assertEquals(1871424L, long0);
  }

  @Test
  public void test35()  throws Throwable  {
      short short0 = (short)1109;
      long long0 = MathUtils.mulAndCheck((long) short0, (long) short0);
      assertEquals(1229881L, long0);
  }

  @Test
  public void test36()  throws Throwable  {
      int int0 = 328;
      long long0 = (-452L);
      long long1 = MathUtils.mulAndCheck((long) int0, long0);
      assertFalse(long0 == long1);
      assertFalse(long1 == long0);
      assertEquals((-148256L), long1);
  }

  @Test
  public void test37()  throws Throwable  {
      int int0 = (-1368);
      int int1 = MathUtils.lcm(int0, int0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(1368, int1);
      
      long long0 = MathUtils.mulAndCheck((long) int0, (long) int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals((-1871424L), long0);
  }

  @Test
  public void test38()  throws Throwable  {
      float float0 = 130.7844F;
      double[] doubleArray0 = new double[4];
      short short0 = (short) (-69);
      doubleArray0[2] = (double) float0;
      int int0 = MathUtils.hash(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 130.78439331054688, 0.0}, doubleArray0, 0.01);
      assertEquals((-1950817912), int0);
      
      // Undeclared exception!
      try {
        int int1 = MathUtils.lcm(int0, (int) short0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
      }
  }

  @Test
  public void test39()  throws Throwable  {
      float float0 = 130.7844F;
      double[] doubleArray0 = new double[4];
      short short0 = (short) (-1448);
      doubleArray0[2] = (double) float0;
      doubleArray0[3] = (double) float0;
      int int0 = MathUtils.hash(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 130.78439331054688, 130.78439331054688}, doubleArray0, 0.01);
      assertEquals(202980001, int0);
      
      // Undeclared exception!
      try {
        int int1 = MathUtils.lcm(int0, (int) short0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
      }
  }

  @Test
  public void test40()  throws Throwable  {
      byte byte0 = (byte)0;
      short short0 = MathUtils.indicator((short) byte0);
      assertEquals((short)1, short0);
  }

  @Test
  public void test41()  throws Throwable  {
      short short0 = (short) (-1448);
      short short1 = MathUtils.indicator(short0);
      assertFalse(short1 == short0);
      assertFalse(short0 == short1);
      assertEquals((short) (-1), short1);
  }

  @Test
  public void test42()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      int int0 = MathUtils.hash(doubleArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(31, int0);
      
      long long0 = MathUtils.indicator((long) int0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(1L, long0);
  }

  @Test
  public void test43()  throws Throwable  {
      short short0 = (short) (-2666);
      short short1 = MathUtils.sign(short0);
      assertFalse(short1 == short0);
      assertFalse(short0 == short1);
      assertEquals((short) (-1), short1);
      
      long long0 = MathUtils.indicator((long) short1);
      assertFalse(short1 == short0);
      assertFalse(short0 == short1);
      assertEquals((-1L), long0);
  }

  @Test
  public void test44()  throws Throwable  {
      int int0 = 0;
      int int1 = MathUtils.indicator(int0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(1, int1);
  }

  @Test
  public void test45()  throws Throwable  {
      float float0 = Float.NaN;
      int int0 = 27;
      // Undeclared exception!
      try {
        float float1 = MathUtils.round(float0, int0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid rounding method.
         //
      }
  }

  @Test
  public void test46()  throws Throwable  {
      double double0 = (-1150.8726771276);
      double double1 = MathUtils.indicator(double0);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertEquals((-1.0), double1, 0.01D);
  }

  @Test
  public void test47()  throws Throwable  {
      short short0 = (short)0;
      short short1 = MathUtils.sign(short0);
      //  // Unstable assertion: assertTrue(short1 == short0);
      //  // Unstable assertion: assertTrue(short0 == short1);
      //  // Unstable assertion: assertEquals((short)0, short1);
      
      double double0 = Double.NaN;
      double double1 = MathUtils.round(double0, (int) short1);
      //  // Unstable assertion: assertTrue(double0 == double1);
      //  // Unstable assertion: assertTrue(short1 == short0);
      //  // Unstable assertion: assertTrue(short0 == short1);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      
      double double2 = MathUtils.indicator(double1);
      //  // Unstable assertion: assertTrue(double0 == double1);
      //  // Unstable assertion: assertTrue(double0 == double2);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertTrue(double2 == double0);
      //  // Unstable assertion: assertTrue(short1 == short0);
      //  // Unstable assertion: assertTrue(short0 == short1);
      //  // Unstable assertion: assertTrue(double1 == double0);
      //  // Unstable assertion: assertTrue(double1 == double2);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
  }

  @Test
  public void test48()  throws Throwable  {
      float float0 = 0.0F;
      float float1 = MathUtils.sign(float0);
      assertTrue(float1 == float0);
      assertTrue(float0 == float1);
      assertEquals(0.0F, float1, 0.01F);
      
      double double0 = MathUtils.indicator((double) float1);
      assertTrue(float1 == float0);
      assertTrue(float0 == float1);
      assertEquals(1.0, double0, 0.01D);
  }

  @Test
  public void test49()  throws Throwable  {
      byte byte0 = (byte)0;
      byte byte1 = MathUtils.indicator(byte0);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
      assertEquals((byte)1, byte1);
  }

  @Test
  public void test50()  throws Throwable  {
      byte byte0 = (byte) (-71);
      byte byte1 = MathUtils.indicator(byte0);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
      assertEquals((byte) (-1), byte1);
  }

  @Test
  public void test51()  throws Throwable  {
      int int0 = 328;
      int int1 = MathUtils.lcm(int0, int0);
      assertTrue(int0 == int1);
      assertTrue(int1 == int0);
      assertEquals(328, int1);
  }

  @Test
  public void test52()  throws Throwable  {
      int int0 = (-1);
      int int1 = 0;
      int int2 = MathUtils.gcd(int0, int1);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertFalse(int1 == int2);
      assertFalse(int1 == int0);
      assertEquals(1, int2);
  }

  @Test
  public void test53()  throws Throwable  {
      int int0 = (-14);
      // Undeclared exception!
      try {
        double double0 = MathUtils.factorialLog(int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n > 0 for n!
         //
      }
  }

  @Test
  public void test54()  throws Throwable  {
      int int0 = (-3316);
      int int1 = MathUtils.indicator(int0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals((-1), int1);
      
      // Undeclared exception!
      try {
        double double0 = MathUtils.factorialDouble(int1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for n!
         //
      }
  }

  @Test
  public void test55()  throws Throwable  {
      int int0 = 2363;
      // Undeclared exception!
      try {
        long long0 = MathUtils.factorial(int0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // result too large to represent in a long integer
         //
      }
  }

  @Test
  public void test56()  throws Throwable  {
      byte byte0 = (byte)0;
      long long0 = MathUtils.factorial((int) byte0);
      assertEquals(1L, long0);
  }

  @Test
  public void test57()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double double0 = Double.POSITIVE_INFINITY;
      doubleArray0[1] = double0;
      double[] doubleArray1 = new double[6];
      assertNotSame(doubleArray1, doubleArray0);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray1);
      assertNotSame(doubleArray0, doubleArray1);
      assertNotSame(doubleArray1, doubleArray0);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertArrayEquals(new double[] {0.0, Double.POSITIVE_INFINITY, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
      assertFalse(boolean0);
  }

  @Test
  public void test58()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[2];
      assertNotSame(doubleArray1, doubleArray0);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray1);
      assertNotSame(doubleArray1, doubleArray0);
      assertNotSame(doubleArray0, doubleArray1);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(boolean0);
  }

  @Test
  public void test59()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = null;
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(boolean0);
  }

  @Test
  public void test60()  throws Throwable  {
      float float0 = Float.NaN;
      double double0 = 2.2250738585072014E-308;
      boolean boolean0 = MathUtils.equals((double) float0, double0);
      assertFalse(boolean0);
  }

  @Test
  public void test61()  throws Throwable  {
      double double0 = (-1150.8726771276);
      double double1 = MathUtils.log(double0, double0);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertEquals(Double.NaN, double1, 0.01D);
      
      double[] doubleArray0 = new double[10];
      doubleArray0[4] = double1;
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertTrue(boolean0);
  }

  @Test
  public void test62()  throws Throwable  {
      int int0 = 0;
      int int1 = (-1);
      double double0 = MathUtils.binomialCoefficientDouble(int0, int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test63()  throws Throwable  {
      int int0 = 339;
      int int1 = MathUtils.sign(int0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(1, int1);
      
      double double0 = MathUtils.binomialCoefficientDouble(int0, int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(339.0, double0, 0.01D);
  }

  @Test
  public void test64()  throws Throwable  {
      byte byte0 = (byte)99;
      byte byte1 = MathUtils.sign(byte0);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
      assertEquals((byte)1, byte1);
      
      int int0 = 0;
      double double0 = MathUtils.binomialCoefficientLog((int) byte1, int0);
      assertFalse(byte1 == byte0);
      assertFalse(byte0 == byte1);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test65()  throws Throwable  {
      int int0 = (-1);
      // Undeclared exception!
      try {
        double double0 = MathUtils.binomialCoefficientLog(int0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for binomial coefficient (n,k)
         //
      }
  }

  @Test
  public void test66()  throws Throwable  {
      int int0 = (-825);
      byte byte0 = (byte)99;
      byte byte1 = MathUtils.sign(byte0);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
      assertEquals((byte)1, byte1);
      
      // Undeclared exception!
      try {
        double double0 = MathUtils.binomialCoefficientLog(int0, (int) byte1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= k for binomial coefficient (n,k)
         //
      }
  }

  @Test
  public void test67()  throws Throwable  {
      int int0 = 328;
      short short0 = (short) (-489);
      short short1 = MathUtils.sign(short0);
      assertFalse(short0 == short1);
      assertFalse(short1 == short0);
      assertEquals((short) (-1), short1);
      
      long long0 = MathUtils.binomialCoefficient(int0, (int) short1);
      assertFalse(short0 == short1);
      assertFalse(short1 == short0);
      assertEquals(0L, long0);
  }

  @Test
  public void test68()  throws Throwable  {
      int int0 = 0;
      int int1 = (-1);
      long long0 = MathUtils.binomialCoefficient(int0, int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(0L, long0);
  }

  @Test
  public void test69()  throws Throwable  {
      int int0 = 339;
      int int1 = 3418;
      // Undeclared exception!
      try {
        long long0 = MathUtils.binomialCoefficient(int1, int0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // result too large to represent in a long integer
         //
      }
  }

  @Test
  public void test70()  throws Throwable  {
      int int0 = 4;
      int int1 = 0;
      long long0 = MathUtils.binomialCoefficient(int0, int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(1L, long0);
  }

  @Test
  public void test71()  throws Throwable  {
      int int0 = 1;
      int int1 = 3418;
      long long0 = MathUtils.binomialCoefficient(int1, int0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(3418L, long0);
  }

  @Test
  public void test72()  throws Throwable  {
      int int0 = (-660);
      int int1 = MathUtils.addAndCheck(int0, int0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals((-1320), int1);
      
      // Undeclared exception!
      try {
        long long0 = MathUtils.binomialCoefficient(int0, int1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for binomial coefficient (n,k)
         //
      }
  }

  @Test
  public void test73()  throws Throwable  {
      int int0 = 4;
      int int1 = 0;
      // Undeclared exception!
      try {
        long long0 = MathUtils.binomialCoefficient(int1, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= k for binomial coefficient (n,k)
         //
      }
  }

  @Test
  public void test74()  throws Throwable  {
      int int0 = 1;
      long long0 = MathUtils.binomialCoefficient(int0, int0);
      assertEquals(1L, long0);
  }

  @Test
  public void test75()  throws Throwable  {
      int int0 = (-697);
      long long0 = 9223372036854775807L;
      // Undeclared exception!
      try {
        long long1 = MathUtils.subAndCheck((long) int0, long0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
      }
  }

  @Test
  public void test76()  throws Throwable  {
      int int0 = (-1);
      long long0 = MathUtils.addAndCheck((long) int0, (long) int0);
      assertEquals((-2L), long0);
  }

  @Test
  public void test77()  throws Throwable  {
      int int0 = (-1368);
      int int1 = MathUtils.lcm(int0, int0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(1368, int1);
      
      long long0 = MathUtils.addAndCheck((long) int0, (long) int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(0L, long0);
  }

  @Test
  public void test78()  throws Throwable  {
      long long0 = 9223372036854775807L;
      long long1 = 1L;
      // Undeclared exception!
      try {
        long long2 = MathUtils.addAndCheck(long0, long1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
      }
  }

  @Test
  public void test79()  throws Throwable  {
      int int0 = 1;
      int int1 = MathUtils.sign(int0);
      assertTrue(int0 == int1);
      assertTrue(int1 == int0);
      assertEquals(1, int1);
      
      double double0 = MathUtils.binomialCoefficientDouble(int1, int1);
      assertTrue(int0 == int1);
      assertTrue(int1 == int0);
      assertEquals(1.0, double0, 0.01D);
  }

  @Test
  public void test80()  throws Throwable  {
      double double0 = 1.0;
      int int0 = MathUtils.hash(double0);
      assertEquals(1072693248, int0);
      
      double double1 = MathUtils.cosh((double) int0);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertEquals(Double.POSITIVE_INFINITY, double1, 0.01D);
  }

  @Test
  public void test81()  throws Throwable  {
      float float0 = 0.0F;
      float float1 = MathUtils.sign(float0);
      assertTrue(float0 == float1);
      assertTrue(float1 == float0);
      assertEquals(0.0F, float1, 0.01F);
      
      double double0 = MathUtils.sinh((double) float1);
      assertTrue(float0 == float1);
      assertTrue(float1 == float0);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test82()  throws Throwable  {
      double double0 = 0.0;
      double double1 = MathUtils.normalizeAngle(double0, double0);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
      assertEquals(0.0, double1, 0.01D);
  }

  @Test
  public void test83()  throws Throwable  {
      float float0 = 0.0F;
      int int0 = (-1368);
      float float1 = MathUtils.round(float0, int0);
      assertFalse(float0 == float1);
      assertFalse(float1 == float0);
      assertEquals(Float.NaN, float1, 0.01F);
  }
}