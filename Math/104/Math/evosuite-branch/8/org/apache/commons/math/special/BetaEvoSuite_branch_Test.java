/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:34:55 GMT 2014
 */

package org.apache.commons.math.special;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.special.Beta;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class BetaEvoSuite_branch_Test extends BetaEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double double0 = (-322.72);
      double double1 = 2.0;
      int int0 = 0;
      double double2 = Beta.logBeta(double1, double0, double0, int0);
      assertEquals(Double.NaN, double2, 0.01D);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
  }

  @Test
  public void test1()  throws Throwable  {
      double double0 = (-322.72);
      double double1 = Beta.regularizedBeta(double0, double0, double0, double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double1 == double0);
      
      double double2 = Beta.logBeta(double0, double1);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertTrue(double1 == double2);
  }

  @Test
  public void test2()  throws Throwable  {
      double double0 = 1.0E-14;
      double double1 = 1917.57151;
      int int0 = 0;
      double double2 = Beta.regularizedBeta(double1, double1, double1, double1, int0);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
      //  // Unstable assertion: assertFalse(double1 == double2);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertFalse(double2 == double1);
      
      double double3 = Beta.logBeta(double2, double0, double2, int0);
      //  // Unstable assertion: assertEquals(Double.NaN, double3, 0.01D);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double0 == double3);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double1 == double2);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertFalse(double1 == double3);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertTrue(double2 == double3);
      //  // Unstable assertion: assertFalse(double2 == double1);
      //  // Unstable assertion: assertFalse(double3 == double0);
      //  // Unstable assertion: assertFalse(double3 == double1);
      //  // Unstable assertion: assertTrue(double3 == double2);
  }

  @Test
  public void test3()  throws Throwable  {
      double double0 = 1.0;
      double double1 = Beta.regularizedBeta(double0, double0, double0);
      assertEquals(1.0, double1, 0.01D);
      assertTrue(double0 == double1);
      assertTrue(double1 == double0);
  }

  @Test
  public void test4()  throws Throwable  {
      double double0 = (-748.955478724451);
      double double1 = 1192.231249401;
      double double2 = 0.0;
      int int0 = 1;
      double double3 = Beta.regularizedBeta(double2, double1, double0, int0);
      assertEquals(Double.NaN, double3, 0.01D);
      assertFalse(double3 == double0);
      assertFalse(double3 == double2);
      assertFalse(double3 == double1);
      assertFalse(double2 == double3);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double1 == double0);
      assertFalse(double1 == double3);
      assertFalse(double1 == double2);
      assertFalse(double0 == double2);
      assertFalse(double0 == double3);
      assertFalse(double0 == double1);
  }

  @Test
  public void test5()  throws Throwable  {
      double double0 = 1.0E-14;
      double double1 = 1917.57151;
      int int0 = 0;
      double double2 = Beta.regularizedBeta(double1, double0, double1, double0, int0);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertFalse(double2 == double1);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double1 == double2);
      //  // Unstable assertion: assertFalse(double1 == double0);
      
      int int1 = Integer.MAX_VALUE;
      double double3 = Beta.regularizedBeta(double0, double1, double1, int1);
      //  // Unstable assertion: assertEquals(0.0, double3, 0.01D);
      //  // Unstable assertion: assertFalse(double3 == double2);
      //  // Unstable assertion: assertFalse(double3 == double0);
      //  // Unstable assertion: assertFalse(double3 == double1);
      //  // Unstable assertion: assertFalse(int1 == int0);
      //  // Unstable assertion: assertFalse(double0 == double3);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double1 == double2);
      //  // Unstable assertion: assertFalse(double1 == double3);
      //  // Unstable assertion: assertFalse(double1 == double0);
      
      double double4 = Beta.regularizedBeta(double0, double3, double2);
      //  // Unstable assertion: assertEquals(Double.NaN, double4, 0.01D);
      //  // Unstable assertion: assertFalse(double4 == double3);
      //  // Unstable assertion: assertFalse(double4 == double1);
      //  // Unstable assertion: assertFalse(double4 == double0);
      //  // Unstable assertion: assertTrue(double4 == double2);
      //  // Unstable assertion: assertFalse(double3 == double4);
      //  // Unstable assertion: assertFalse(double3 == double2);
      //  // Unstable assertion: assertFalse(double3 == double0);
      //  // Unstable assertion: assertFalse(double3 == double1);
      //  // Unstable assertion: assertFalse(int1 == int0);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertFalse(double2 == double3);
      //  // Unstable assertion: assertTrue(double2 == double4);
      //  // Unstable assertion: assertFalse(double2 == double1);
      //  // Unstable assertion: assertFalse(int0 == int1);
      //  // Unstable assertion: assertFalse(double0 == double3);
      //  // Unstable assertion: assertFalse(double0 == double4);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double1 == double2);
      //  // Unstable assertion: assertFalse(double1 == double3);
      //  // Unstable assertion: assertFalse(double1 == double4);
      //  // Unstable assertion: assertFalse(double1 == double0);
  }

  @Test
  public void test6()  throws Throwable  {
      double double0 = (-322.72);
      double double1 = Beta.regularizedBeta(double0, double0, double0, double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double1 == double0);
      
      int int0 = 0;
      double double2 = Beta.regularizedBeta((double) int0, double1, double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertTrue(double1 == double2);
  }

  @Test
  public void test7()  throws Throwable  {
      double double0 = (-322.72);
      int int0 = 0;
      double double1 = Beta.regularizedBeta((double) int0, double0, double0);
      assertEquals(Double.NaN, double1, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
  }

  @Test
  public void test8()  throws Throwable  {
      double double0 = (-748.955478724451);
      double double1 = Beta.logBeta(double0, double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double1 == double0);
      
      int int0 = 1;
      double double2 = Beta.regularizedBeta(double1, double1, double0, int0);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertTrue(double1 == double2);
  }
}