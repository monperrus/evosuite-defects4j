/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:52:50 GMT 2014
 */

package org.apache.commons.math.optimization.direct;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.analysis.MultivariateFunction;
import org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction;
import org.apache.commons.math.exception.DimensionMismatchException;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.apache.commons.math.exception.OutOfRangeException;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.direct.BOBYQAOptimizer;
import org.apache.commons.math.random.RandomGenerator;
import org.apache.commons.math.random.UnitSphereRandomVectorGenerator;
import org.apache.commons.math.random.Well44497a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class BOBYQAOptimizerEvoSuite_branch_Test extends BOBYQAOptimizerEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      int int0 = (-1382);
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(int0);
      assertEquals(0, bOBYQAOptimizer0.getEvaluations());
      assertNull(bOBYQAOptimizer0.getGoalType());
      assertEquals(0, bOBYQAOptimizer0.getMaxEvaluations());
      assertNotNull(bOBYQAOptimizer0);
      
      double[][] doubleArray0 = new double[1][1];
      double[] doubleArray1 = new double[1];
      int int1 = 0;
      Well44497a well44497a0 = new Well44497a(int0);
      assertNotNull(well44497a0);
      assertFalse(int0 == int1);
      
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(int0, (RandomGenerator) well44497a0);
      assertNotNull(unitSphereRandomVectorGenerator0);
      assertFalse(int0 == int1);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray1, int1, int1, unitSphereRandomVectorGenerator0);
      assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
      assertNotNull(microsphereInterpolatingFunction0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray2 = new double[7];
      assertNotSame(doubleArray2, doubleArray1);
      assertFalse(doubleArray2.equals((Object)doubleArray1));
      
      // Undeclared exception!
      try {
        RealPointValuePair realPointValuePair0 = bOBYQAOptimizer0.optimize(int0, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of interpolation points (-1,382)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      int int0 = 30;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(int0);
      assertEquals(0, bOBYQAOptimizer0.getMaxEvaluations());
      assertEquals(0, bOBYQAOptimizer0.getEvaluations());
      assertNull(bOBYQAOptimizer0.getGoalType());
      assertNotNull(bOBYQAOptimizer0);
      
      double[][] doubleArray0 = new double[1][1];
      double[] doubleArray1 = new double[1];
      int int1 = 0;
      Well44497a well44497a0 = new Well44497a(int0);
      assertNotNull(well44497a0);
      assertFalse(int0 == int1);
      
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(int0, (RandomGenerator) well44497a0);
      assertNotNull(unitSphereRandomVectorGenerator0);
      assertFalse(int0 == int1);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray1, int1, int1, unitSphereRandomVectorGenerator0);
      assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
      assertNotNull(microsphereInterpolatingFunction0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray2 = new double[7];
      assertNotSame(doubleArray2, doubleArray1);
      assertFalse(doubleArray2.equals((Object)doubleArray1));
      
      // Undeclared exception!
      try {
        RealPointValuePair realPointValuePair0 = bOBYQAOptimizer0.optimize(int0, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 7
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      int int0 = 27;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(int0);
      assertEquals(0, bOBYQAOptimizer0.getMaxEvaluations());
      assertEquals(0, bOBYQAOptimizer0.getEvaluations());
      assertNull(bOBYQAOptimizer0.getGoalType());
      assertNotNull(bOBYQAOptimizer0);
      
      double[][] doubleArray0 = new double[1][1];
      double[] doubleArray1 = new double[1];
      int int1 = 0;
      Well44497a well44497a0 = new Well44497a(int0);
      assertNotNull(well44497a0);
      assertFalse(int0 == int1);
      
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(int0, (RandomGenerator) well44497a0);
      assertNotNull(unitSphereRandomVectorGenerator0);
      assertFalse(int0 == int1);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray1, int1, int1, unitSphereRandomVectorGenerator0);
      assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
      assertNotNull(microsphereInterpolatingFunction0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray2 = new double[6];
      assertNotSame(doubleArray2, doubleArray1);
      assertFalse(doubleArray2.equals((Object)doubleArray1));
      
      // Undeclared exception!
      try {
        RealPointValuePair realPointValuePair0 = bOBYQAOptimizer0.optimize(int0, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 6
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      int int0 = (-1382);
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(int0);
      assertNull(bOBYQAOptimizer0.getGoalType());
      assertEquals(0, bOBYQAOptimizer0.getMaxEvaluations());
      assertEquals(0, bOBYQAOptimizer0.getEvaluations());
      assertNotNull(bOBYQAOptimizer0);
      
      double[][] doubleArray0 = new double[1][1];
      double[] doubleArray1 = new double[1];
      int int1 = 0;
      Well44497a well44497a0 = new Well44497a(int0);
      assertNotNull(well44497a0);
      assertFalse(int0 == int1);
      
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(int0, (RandomGenerator) well44497a0);
      assertNotNull(unitSphereRandomVectorGenerator0);
      assertFalse(int0 == int1);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray1, int1, int1, unitSphereRandomVectorGenerator0);
      assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
      assertNotNull(microsphereInterpolatingFunction0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      try {
        RealPointValuePair realPointValuePair0 = bOBYQAOptimizer0.optimize(int0, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 is smaller than the minimum (2)
         //
      }
  }
}