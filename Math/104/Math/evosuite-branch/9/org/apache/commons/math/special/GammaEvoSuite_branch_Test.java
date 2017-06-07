/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:38:18 GMT 2014
 */

package org.apache.commons.math.special;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.special.Gamma;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class GammaEvoSuite_branch_Test extends GammaEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      double double0 = 1201.813343218201;
      double double1 = 4.652362892704858E-5;
      int int0 = 1;
      double double2 = Gamma.regularizedGammaQ(double0, double1, double0, int0);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertEquals(1.0, double2, 0.01D);
  }

  @Test
  public void test01()  throws Throwable  {
      double double0 = (-940.319566864);
      double double1 = 1.0;
      double double2 = Gamma.regularizedGammaQ(double1, double0);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertEquals(Double.NaN, double2, 0.01D);
  }

  @Test
  public void test02()  throws Throwable  {
      double double0 = (-2577.999);
      double double1 = Gamma.regularizedGammaQ(double0, double0);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertEquals(Double.NaN, double1, 0.01D);
  }

  @Test
  public void test03()  throws Throwable  {
      double double0 = (-302.12821569364445);
      double double1 = Gamma.regularizedGammaP(double0, double0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      
      double double2 = Gamma.regularizedGammaQ(double1, double1);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertTrue(double1 == double2);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
  }

  @Test
  public void test04()  throws Throwable  {
      double double0 = 51.8242464;
      double double1 = 0.0;
      double double2 = Gamma.regularizedGammaQ(double0, double1);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertEquals(1.0, double2, 0.01D);
      
      int int0 = 788;
      double double3 = Gamma.regularizedGammaP(double2, double2, double1, int0);
      assertFalse(double0 == double2);
      assertFalse(double0 == double3);
      assertFalse(double0 == double1);
      assertFalse(double2 == double0);
      assertFalse(double2 == double3);
      assertFalse(double2 == double1);
      assertFalse(double1 == double3);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double3 == double0);
      assertFalse(double3 == double1);
      assertFalse(double3 == double2);
      assertEquals(0.6321205588285581, double3, 0.01D);
  }

  @Test
  public void test05()  throws Throwable  {
      double double0 = (-3088.0);
      int int0 = (-2171);
      double double1 = 1.0;
      double double2 = 0.0;
      double double3 = Gamma.regularizedGammaQ(double1, double2);
      assertTrue(double3 == double1);
      assertFalse(double3 == double2);
      assertFalse(double3 == double0);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertTrue(double1 == double3);
      assertFalse(double2 == double0);
      assertFalse(double2 == double3);
      assertFalse(double2 == double1);
      assertEquals(1.0, double3, 0.01D);
      
      try {
        double double4 = Gamma.regularizedGammaP(double3, double3, double0, int0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (-2,171) exceeded
         //
      }
  }

  @Test
  public void test06()  throws Throwable  {
      double double0 = 0.0;
      double double1 = Gamma.logGamma(double0);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertEquals(Double.NaN, double1, 0.01D);
      
      int int0 = 0;
      double double2 = 1.0E-8;
      assertFalse(double2 == double1);
      
      try {
        double double3 = Gamma.regularizedGammaQ(double2, double2, double1, int0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (0) exceeded
         //
      }
  }

  @Test
  public void test07()  throws Throwable  {
      double double0 = 2781.568521331655;
      double double1 = 0.0;
      double double2 = Gamma.regularizedGammaP(double0, double1);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertTrue(double1 == double2);
      assertFalse(double1 == double0);
      assertTrue(double2 == double1);
      assertFalse(double2 == double0);
      assertEquals(0.0, double2, 0.01D);
  }

  @Test
  public void test08()  throws Throwable  {
      double double0 = (-2577.999);
      double double1 = 2500.075349288614;
      double double2 = Gamma.regularizedGammaP(double1, double0);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertEquals(Double.NaN, double2, 0.01D);
  }

  @Test
  public void test09()  throws Throwable  {
      double double0 = (-2577.999);
      double double1 = Gamma.regularizedGammaP(double0, double0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      
      int int0 = (-1);
      double double2 = Gamma.regularizedGammaP(double0, double1, double1, int0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertTrue(double1 == double2);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
  }

  @Test
  public void test10()  throws Throwable  {
      double double0 = (-3088.0);
      double double1 = Gamma.logGamma(double0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      
      int int0 = (-2171);
      double double2 = Gamma.regularizedGammaP(double1, double1, double1, int0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertTrue(double1 == double2);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
  }

  @Test
  public void test11()  throws Throwable  {
      double double0 = 0.0;
      double double1 = Gamma.logGamma(double0);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      
      double double2 = Gamma.logGamma(double1);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertTrue(double1 == double2);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
  }

  @Test
  public void test12()  throws Throwable  {
      double double0 = 1201.813343218201;
      double double1 = 6.283185307179586;
      double double2 = Gamma.regularizedGammaP(double1, double0);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertEquals(1.0, double2, 0.01D);
  }

  @Test
  public void test13()  throws Throwable  {
      double double0 = (-2577.999);
      double double1 = Gamma.regularizedGammaP(double0, double0);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double1, 0.01D);
      
      double double2 = Gamma.regularizedGammaQ(double0, double1);
      //  // Unstable assertion: assertFalse(double2 == double0);
      //  // Unstable assertion: assertTrue(double2 == double1);
      //  // Unstable assertion: assertFalse(double0 == double2);
      //  // Unstable assertion: assertFalse(double0 == double1);
      //  // Unstable assertion: assertTrue(double1 == double2);
      //  // Unstable assertion: assertFalse(double1 == double0);
      //  // Unstable assertion: assertEquals(Double.NaN, double2, 0.01D);
  }
}