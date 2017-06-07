/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:23:25 GMT 2014
 */

package org.apache.commons.math3.optimization.direct;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;
import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatingFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.direct.CMAESOptimizer;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.UnitSphereRandomVectorGenerator;
import org.apache.commons.math3.random.Well19937a;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.random.Well44497b;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class CMAESOptimizerEvoSuite_branch_Test extends CMAESOptimizerEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      int int0 = 1195;
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) int0;
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, doubleArray0);
      assertNotNull(cMAESOptimizer0);
      assertArrayEquals(new double[] {1195.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      
      int int1 = 1689;
      int[] intArray0 = new int[8];
      intArray0[1] = int1;
      double[][] doubleArray1 = new double[8][4];
      doubleArray1[0] = doubleArray0;
      assertNotNull(doubleArray1[0]);
      
      doubleArray1[1] = doubleArray1[0];
      assertNotNull(doubleArray1[1]);
      
      doubleArray1[2] = doubleArray0;
      assertNotNull(doubleArray1[2]);
      
      doubleArray1[3] = doubleArray0;
      assertNotNull(doubleArray1[3]);
      
      doubleArray1[4] = doubleArray0;
      assertNotNull(doubleArray1[4]);
      
      doubleArray1[5] = doubleArray0;
      assertNotNull(doubleArray1[5]);
      
      doubleArray1[6] = doubleArray0;
      assertNotNull(doubleArray1[6]);
      
      doubleArray1[7] = doubleArray0;
      assertNotNull(doubleArray1[7]);
      
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(int1);
      assertNotNull(unitSphereRandomVectorGenerator0);
      assertFalse(int1 == int0);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray1[1], int1, intArray0[3], unitSphereRandomVectorGenerator0);
      assertNotNull(microsphereInterpolatingFunction0);
      assertFalse(int1 == int0);
      assertArrayEquals(new int[] {0, 1689, 0, 0, 0, 0, 0, 0}, intArray0);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(intArray0[1], (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1[7]);
      assertNotNull(pointValuePair0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertArrayEquals(new double[] {1195.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertArrayEquals(new int[] {0, 1689, 0, 0, 0, 0, 0, 0}, intArray0);
      assertEquals(1689, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(GoalType.MINIMIZE, cMAESOptimizer0.getGoalType());
      assertEquals(1690, cMAESOptimizer0.getEvaluations());
  }

  @Test
  public void test01()  throws Throwable  {
      int int0 = 1179;
      double[] doubleArray0 = new double[8];
      boolean boolean0 = false;
      int int1 = 1744;
      int[] intArray0 = new int[9];
      intArray0[1] = int1;
      int[] intArray1 = null;
      Well44497b well44497b0 = new Well44497b(intArray1);
      assertNotNull(well44497b0);
      
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, doubleArray0, int0, doubleArray0[5], boolean0, int1, int1, (RandomGenerator) well44497b0, boolean0);
      assertNotNull(cMAESOptimizer0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      
      double[][] doubleArray1 = new double[8][4];
      doubleArray1[0] = doubleArray0;
      assertNotNull(doubleArray1[0]);
      
      doubleArray1[1] = doubleArray0;
      assertNotNull(doubleArray1[1]);
      
      doubleArray1[2] = doubleArray0;
      assertNotNull(doubleArray1[2]);
      
      doubleArray1[3] = doubleArray0;
      assertNotNull(doubleArray1[3]);
      
      doubleArray1[4] = doubleArray0;
      assertNotNull(doubleArray1[4]);
      
      doubleArray1[5] = doubleArray0;
      assertNotNull(doubleArray1[5]);
      
      doubleArray1[6] = doubleArray0;
      assertNotNull(doubleArray1[6]);
      
      doubleArray1[7] = doubleArray0;
      assertNotNull(doubleArray1[7]);
      
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(intArray0[1]);
      assertNotNull(unitSphereRandomVectorGenerator0);
      assertArrayEquals(new int[] {0, 1744, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray1[1], int1, intArray0[3], unitSphereRandomVectorGenerator0);
      assertNotNull(microsphereInterpolatingFunction0);
      assertFalse(int1 == int0);
      assertArrayEquals(new int[] {0, 1744, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(intArray0[1], (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1[7]);
      assertNotNull(pointValuePair0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertArrayEquals(new int[] {0, 1744, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1180, cMAESOptimizer0.getEvaluations());
      assertEquals(1744, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(GoalType.MINIMIZE, cMAESOptimizer0.getGoalType());
  }

  @Test
  public void test02()  throws Throwable  {
      int int0 = (-728);
      double[] doubleArray0 = new double[2];
      boolean boolean0 = false;
      int int1 = 1339;
      Well19937c well19937c0 = new Well19937c((long) int1);
      assertNotNull(well19937c0);
      assertFalse(int1 == int0);
      
      doubleArray0[0] = (double) int1;
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, doubleArray0, int0, (double) int0, boolean0, int1, int0, (RandomGenerator) well19937c0, boolean0);
      assertNotNull(cMAESOptimizer0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertArrayEquals(new double[] {1339.0, 0.0}, doubleArray0, 0.01);
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      
      double[][] doubleArray1 = new double[2][7];
      doubleArray1[0] = doubleArray0;
      assertNotNull(doubleArray1[0]);
      
      doubleArray1[1] = doubleArray0;
      assertNotNull(doubleArray1[1]);
      
      int int2 = 0;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(int0, (RandomGenerator) well19937c0);
      assertNotNull(unitSphereRandomVectorGenerator0);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
      assertFalse(int1 == int0);
      assertFalse(int1 == int2);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray1[1], int2, int2, unitSphereRandomVectorGenerator0);
      assertNotNull(microsphereInterpolatingFunction0);
      assertFalse(int0 == int1);
      assertFalse(int0 == int2);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertFalse(int1 == int0);
      assertFalse(int1 == int2);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      try {
        PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(int2, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray0, doubleArray0, doubleArray1[1]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1,339 out of [0, 0] range
         //
      }
  }

  @Test
  public void test03()  throws Throwable  {
      int int0 = (-728);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) int0;
      boolean boolean0 = false;
      Well19937c well19937c0 = new Well19937c((long) int0);
      assertNotNull(well19937c0);
      
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, doubleArray0, int0, (double) int0, boolean0, int0, int0, (RandomGenerator) well19937c0, boolean0);
      assertNotNull(cMAESOptimizer0);
      assertArrayEquals(new double[] {(-728.0), 0.0}, doubleArray0, 0.01);
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      
      double[][] doubleArray1 = new double[2][7];
      doubleArray1[0] = doubleArray0;
      assertNotNull(doubleArray1[0]);
      
      doubleArray1[1] = doubleArray0;
      assertNotNull(doubleArray1[1]);
      
      int int1 = 0;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(int0, (RandomGenerator) well19937c0);
      assertNotNull(unitSphereRandomVectorGenerator0);
      assertFalse(int0 == int1);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray1[1], int1, int1, unitSphereRandomVectorGenerator0);
      assertNotNull(microsphereInterpolatingFunction0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      try {
        PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(int1, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray0, doubleArray0, doubleArray1[1]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -728 is smaller than the minimum (0)
         //
      }
  }

  @Test
  public void test04()  throws Throwable  {
      int int0 = 0;
      double[] doubleArray0 = new double[2];
      boolean boolean0 = false;
      Well19937c well19937c0 = new Well19937c((long) int0);
      assertNotNull(well19937c0);
      
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, doubleArray0, int0, (double) int0, boolean0, int0, int0, (RandomGenerator) well19937c0, boolean0);
      assertNotNull(cMAESOptimizer0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      
      double[][] doubleArray1 = new double[2][7];
      doubleArray1[0] = doubleArray0;
      assertNotNull(doubleArray1[0]);
      
      doubleArray1[1] = doubleArray0;
      assertNotNull(doubleArray1[1]);
      
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(int0, (RandomGenerator) well19937c0);
      assertNotNull(unitSphereRandomVectorGenerator0);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray1[1], int0, int0, unitSphereRandomVectorGenerator0);
      assertNotNull(microsphereInterpolatingFunction0);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray2 = new double[10];
      assertFalse(doubleArray2.equals((Object)doubleArray0));
      assertNotSame(doubleArray2, doubleArray0);
      
      // Undeclared exception!
      try {
        PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(int0, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 != 10
         //
      }
  }

  @Test
  public void test05()  throws Throwable  {
      int int0 = 0;
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0);
      assertNotNull(cMAESOptimizer0);
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      
      int int1 = cMAESOptimizer0.getMaxEvaluations();
      assertEquals(0, int1);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      
      double[] doubleArray0 = new double[2];
      Well19937c well19937c0 = new Well19937c((long) int1);
      assertNotNull(well19937c0);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      
      double[][] doubleArray1 = new double[2][7];
      doubleArray1[0] = doubleArray0;
      assertNotNull(doubleArray1[0]);
      
      doubleArray1[1] = doubleArray0;
      assertNotNull(doubleArray1[1]);
      
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(int0, (RandomGenerator) well19937c0);
      assertNotNull(unitSphereRandomVectorGenerator0);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray1[1], int0, int0, unitSphereRandomVectorGenerator0);
      assertNotNull(microsphereInterpolatingFunction0);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray2 = null;
      // Undeclared exception!
      try {
        PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(int0, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray0, doubleArray0, doubleArray2);
        fail("Expecting exception: MathUnsupportedOperationException");
      
      } catch(MathUnsupportedOperationException e) {
         //
         // unsupported operation
         //
      }
  }

  @Test
  public void test06()  throws Throwable  {
      int int0 = 1179;
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) int0;
      doubleArray0[1] = (double) int0;
      doubleArray0[2] = (double) int0;
      doubleArray0[3] = (double) int0;
      doubleArray0[4] = (double) int0;
      doubleArray0[5] = (double) int0;
      doubleArray0[6] = (double) int0;
      doubleArray0[7] = (double) int0;
      boolean boolean0 = false;
      int int1 = 1744;
      int[] intArray0 = new int[9];
      intArray0[1] = int1;
      Well44497b well44497b0 = new Well44497b(intArray0);
      assertNotNull(well44497b0);
      assertArrayEquals(new int[] {0, 1744, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      
      boolean boolean1 = true;
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, doubleArray0, int0, doubleArray0[5], boolean0, int1, int1, (RandomGenerator) well44497b0, boolean1);
      assertNotNull(cMAESOptimizer0);
      assertFalse(boolean0 == boolean1);
      assertFalse(boolean1 == boolean0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertArrayEquals(new double[] {1179.0, 1179.0, 1179.0, 1179.0, 1179.0, 1179.0, 1179.0, 1179.0}, doubleArray0, 0.01);
      assertArrayEquals(new int[] {0, 1744, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      
      double[][] doubleArray1 = new double[8][4];
      doubleArray1[0] = doubleArray0;
      assertNotNull(doubleArray1[0]);
      
      doubleArray1[1] = doubleArray0;
      assertNotNull(doubleArray1[1]);
      
      doubleArray1[2] = doubleArray0;
      assertNotNull(doubleArray1[2]);
      
      doubleArray1[3] = doubleArray0;
      assertNotNull(doubleArray1[3]);
      
      doubleArray1[4] = doubleArray0;
      assertNotNull(doubleArray1[4]);
      
      doubleArray1[5] = doubleArray0;
      assertNotNull(doubleArray1[5]);
      
      doubleArray1[6] = doubleArray0;
      assertNotNull(doubleArray1[6]);
      
      doubleArray1[7] = doubleArray0;
      assertNotNull(doubleArray1[7]);
      
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(intArray0[5]);
      assertNotNull(unitSphereRandomVectorGenerator0);
      assertArrayEquals(new int[] {0, 1744, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray1[1], int1, intArray0[3], unitSphereRandomVectorGenerator0);
      assertNotNull(microsphereInterpolatingFunction0);
      assertFalse(int1 == int0);
      assertArrayEquals(new int[] {0, 1744, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(intArray0[1], (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1[7]);
      assertNotNull(pointValuePair0);
      assertFalse(boolean0 == boolean1);
      assertFalse(int0 == int1);
      assertFalse(boolean1 == boolean0);
      assertFalse(int1 == int0);
      assertArrayEquals(new double[] {1179.0, 1179.0, 1179.0, 1179.0, 1179.0, 1179.0, 1179.0, 1179.0}, doubleArray0, 0.01);
      assertArrayEquals(new int[] {0, 1744, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertEquals(GoalType.MAXIMIZE, cMAESOptimizer0.getGoalType());
      assertEquals(1744, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(1745, cMAESOptimizer0.getEvaluations());
  }

  @Test
  public void test07()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      //  // Unstable assertion: assertNotNull(cMAESOptimizer0);
      //  // Unstable assertion: assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertEquals(0, cMAESOptimizer0.getEvaluations());
      //  // Unstable assertion: assertNull(cMAESOptimizer0.getGoalType());
      
      int int0 = 1690;
      double[][] doubleArray0 = new double[1][7];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (double) int0;
      int int1 = 0;
      Well19937a well19937a0 = new Well19937a(int0);
      //  // Unstable assertion: assertNotNull(well19937a0);
      //  // Unstable assertion: assertFalse(int0 == int1);
      
      double[] doubleArray2 = new double[1];
      //  // Unstable assertion: assertFalse(doubleArray2.equals((Object)doubleArray1));
      //  // Unstable assertion: assertNotSame(doubleArray2, doubleArray1);
      
      doubleArray0[0] = doubleArray2;
      //  // Unstable assertion: assertNotNull(doubleArray0[0]);
      
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(int0, (RandomGenerator) well19937a0);
      //  // Unstable assertion: assertNotNull(unitSphereRandomVectorGenerator0);
      //  // Unstable assertion: assertFalse(int0 == int1);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray0[0], int0, int1, unitSphereRandomVectorGenerator0);
      //  // Unstable assertion: assertNotNull(microsphereInterpolatingFunction0);
      //  // Unstable assertion: assertFalse(int1 == int0);
      //  // Unstable assertion: assertFalse(int0 == int1);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(int0, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1);
      //  // Unstable assertion: assertNotNull(pointValuePair0);
      //  // Unstable assertion: assertFalse(int1 == int0);
      //  // Unstable assertion: assertFalse(doubleArray1.equals((Object)doubleArray2));
      //  // Unstable assertion: assertFalse(int0 == int1);
      //  // Unstable assertion: assertArrayEquals(new double[] {1690.0}, doubleArray1, 0.01);
      //  // Unstable assertion: assertNotSame(doubleArray1, doubleArray2);
      //  // Unstable assertion: assertEquals(1690, cMAESOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertEquals(GoalType.MINIMIZE, cMAESOptimizer0.getGoalType());
      //  // Unstable assertion: assertEquals(57, cMAESOptimizer0.getEvaluations());
  }

  @Test
  public void test08()  throws Throwable  {
      int int0 = 1179;
      double[] doubleArray0 = new double[8];
      doubleArray0[5] = (double) int0;
      boolean boolean0 = false;
      int int1 = 1744;
      int[] intArray0 = new int[9];
      intArray0[1] = int1;
      Well44497b well44497b0 = new Well44497b(intArray0);
      assertNotNull(well44497b0);
      assertArrayEquals(new int[] {0, 1744, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, doubleArray0, int0, doubleArray0[5], boolean0, int1, int1, (RandomGenerator) well44497b0, boolean0);
      assertNotNull(cMAESOptimizer0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1179.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertArrayEquals(new int[] {0, 1744, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      
      double[][] doubleArray1 = new double[8][4];
      doubleArray1[0] = doubleArray0;
      assertNotNull(doubleArray1[0]);
      
      doubleArray1[1] = doubleArray0;
      assertNotNull(doubleArray1[1]);
      
      doubleArray1[2] = doubleArray0;
      assertNotNull(doubleArray1[2]);
      
      doubleArray1[3] = doubleArray0;
      assertNotNull(doubleArray1[3]);
      
      doubleArray1[4] = doubleArray0;
      assertNotNull(doubleArray1[4]);
      
      doubleArray1[5] = doubleArray0;
      assertNotNull(doubleArray1[5]);
      
      doubleArray1[6] = doubleArray0;
      assertNotNull(doubleArray1[6]);
      
      doubleArray1[7] = doubleArray0;
      assertNotNull(doubleArray1[7]);
      
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(intArray0[4]);
      assertNotNull(unitSphereRandomVectorGenerator0);
      assertArrayEquals(new int[] {0, 1744, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray1[1], int1, intArray0[3], unitSphereRandomVectorGenerator0);
      assertNotNull(microsphereInterpolatingFunction0);
      assertFalse(int1 == int0);
      assertArrayEquals(new int[] {0, 1744, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(intArray0[1], (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1[7]);
      assertNotNull(pointValuePair0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1179.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertArrayEquals(new int[] {0, 1744, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertEquals(1180, cMAESOptimizer0.getEvaluations());
      assertEquals(GoalType.MINIMIZE, cMAESOptimizer0.getGoalType());
      assertEquals(1744, cMAESOptimizer0.getMaxEvaluations());
  }

  @Test
  public void test09()  throws Throwable  {
      int int0 = 0;
      double[] doubleArray0 = new double[2];
      boolean boolean0 = false;
      int int1 = 1336;
      Well19937c well19937c0 = new Well19937c((long) int1);
      assertNotNull(well19937c0);
      assertFalse(int1 == int0);
      
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, doubleArray0, int1, (double) int0, boolean0, int1, int0, (RandomGenerator) well19937c0, boolean0);
      assertNotNull(cMAESOptimizer0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      
      double[][] doubleArray1 = new double[2][7];
      doubleArray1[0] = doubleArray0;
      assertNotNull(doubleArray1[0]);
      
      doubleArray1[1] = doubleArray0;
      assertNotNull(doubleArray1[1]);
      
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(int0, (RandomGenerator) well19937c0);
      assertNotNull(unitSphereRandomVectorGenerator0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray1[1], int0, int0, unitSphereRandomVectorGenerator0);
      assertNotNull(microsphereInterpolatingFunction0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(int1, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1[0], doubleArray0, doubleArray1[1]);
      assertNotNull(pointValuePair0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(GoalType.MINIMIZE, cMAESOptimizer0.getGoalType());
      assertEquals(7, cMAESOptimizer0.getEvaluations());
      assertEquals(1336, cMAESOptimizer0.getMaxEvaluations());
  }

  @Test
  public void test10()  throws Throwable  {
      int int0 = 0;
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0);
      assertNotNull(cMAESOptimizer0);
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      
      int int1 = cMAESOptimizer0.getMaxEvaluations();
      assertEquals(0, int1);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      
      double[] doubleArray0 = new double[2];
      boolean boolean0 = false;
      Well19937c well19937c0 = new Well19937c((long) int1);
      assertNotNull(well19937c0);
      assertTrue(int1 == int0);
      assertTrue(int0 == int1);
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      
      CMAESOptimizer cMAESOptimizer1 = new CMAESOptimizer(int0, doubleArray0, int0, (double) int0, boolean0, int0, int0, (RandomGenerator) well19937c0, boolean0);
      assertNotNull(cMAESOptimizer1);
      assertTrue(int1 == int0);
      assertFalse(cMAESOptimizer0.equals((Object)cMAESOptimizer1));
      assertTrue(int0 == int1);
      assertFalse(cMAESOptimizer1.equals((Object)cMAESOptimizer0));
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertNotSame(cMAESOptimizer0, cMAESOptimizer1);
      assertNotSame(cMAESOptimizer1, cMAESOptimizer0);
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer1.getMaxEvaluations());
      assertEquals(0, cMAESOptimizer1.getEvaluations());
      assertNull(cMAESOptimizer1.getGoalType());
      
      double[][] doubleArray1 = new double[2][7];
      doubleArray1[0] = doubleArray0;
      assertNotNull(doubleArray1[0]);
      
      doubleArray1[1] = doubleArray0;
      assertNotNull(doubleArray1[1]);
      
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(int0, (RandomGenerator) well19937c0);
      assertNotNull(unitSphereRandomVectorGenerator0);
      assertTrue(int1 == int0);
      assertFalse(cMAESOptimizer0.equals((Object)cMAESOptimizer1));
      assertTrue(int0 == int1);
      assertNotSame(cMAESOptimizer0, cMAESOptimizer1);
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray1[1], int0, int0, unitSphereRandomVectorGenerator0);
      assertNotNull(microsphereInterpolatingFunction0);
      assertTrue(int1 == int0);
      assertFalse(cMAESOptimizer0.equals((Object)cMAESOptimizer1));
      assertTrue(int0 == int1);
      assertNotSame(cMAESOptimizer0, cMAESOptimizer1);
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      
      int int2 = 375;
      assertFalse(int2 == int1);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      PointValuePair pointValuePair0 = cMAESOptimizer1.optimize(int2, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1[0], doubleArray0, doubleArray1[1]);
      assertNotNull(pointValuePair0);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertFalse(cMAESOptimizer1.equals((Object)cMAESOptimizer0));
      assertFalse(cMAESOptimizer0.equals((Object)cMAESOptimizer1));
      assertTrue(int1 == int0);
      assertFalse(int1 == int2);
      assertTrue(int0 == int1);
      assertFalse(int0 == int2);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertNotSame(cMAESOptimizer0, cMAESOptimizer1);
      assertNotSame(cMAESOptimizer1, cMAESOptimizer0);
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(1, cMAESOptimizer1.getEvaluations());
      assertEquals(GoalType.MAXIMIZE, cMAESOptimizer1.getGoalType());
      assertEquals(375, cMAESOptimizer1.getMaxEvaluations());
  }

  @Test
  public void test11()  throws Throwable  {
      int int0 = 0;
      double[] doubleArray0 = new double[2];
      boolean boolean0 = false;
      Well19937c well19937c0 = new Well19937c((long) int0);
      assertNotNull(well19937c0);
      
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, doubleArray0, int0, (double) int0, boolean0, int0, int0, (RandomGenerator) well19937c0, boolean0);
      assertNotNull(cMAESOptimizer0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      
      List<RealMatrix> list0 = cMAESOptimizer0.getStatisticsDHistory();
      assertNotNull(list0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(true, list0.isEmpty());
      assertEquals(0, list0.size());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
  }

  @Test
  public void test12()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      assertNotNull(cMAESOptimizer0);
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      
      List<RealMatrix> list0 = cMAESOptimizer0.getStatisticsMeanHistory();
      assertNotNull(list0);
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(true, list0.isEmpty());
      assertEquals(0, list0.size());
  }

  @Test
  public void test13()  throws Throwable  {
      int int0 = 1195;
      double[] doubleArray0 = new double[8];
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, doubleArray0);
      assertNotNull(cMAESOptimizer0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      
      List<Double> list0 = cMAESOptimizer0.getStatisticsFitnessHistory();
      assertNotNull(list0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(true, list0.isEmpty());
      assertEquals(0, list0.size());
  }

  @Test
  public void test14()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      assertNotNull(cMAESOptimizer0);
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      
      List<Double> list0 = cMAESOptimizer0.getStatisticsSigmaHistory();
      assertNotNull(list0);
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(true, list0.isEmpty());
      assertEquals(0, list0.size());
  }

  @Test
  public void test15()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      //  // Unstable assertion: assertNotNull(cMAESOptimizer0);
      //  // Unstable assertion: assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertEquals(0, cMAESOptimizer0.getEvaluations());
      //  // Unstable assertion: assertNull(cMAESOptimizer0.getGoalType());
      
      int int0 = 1690;
      double[][] doubleArray0 = new double[1][7];
      double[] doubleArray1 = new double[1];
      doubleArray0[0] = doubleArray1;
      //  // Unstable assertion: assertNotNull(doubleArray0[0]);
      
      int int1 = 0;
      Well19937a well19937a0 = new Well19937a(int0);
      //  // Unstable assertion: assertNotNull(well19937a0);
      //  // Unstable assertion: assertFalse(int0 == int1);
      
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(int0, (RandomGenerator) well19937a0);
      //  // Unstable assertion: assertNotNull(unitSphereRandomVectorGenerator0);
      //  // Unstable assertion: assertFalse(int0 == int1);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray0, doubleArray0[0], int0, int1, unitSphereRandomVectorGenerator0);
      //  // Unstable assertion: assertNotNull(microsphereInterpolatingFunction0);
      //  // Unstable assertion: assertFalse(int1 == int0);
      //  // Unstable assertion: assertFalse(int0 == int1);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(int0, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1);
      //  // Unstable assertion: assertNotNull(pointValuePair0);
      //  // Unstable assertion: assertFalse(int1 == int0);
      //  // Unstable assertion: assertFalse(int0 == int1);
      //  // Unstable assertion: assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
      //  // Unstable assertion: assertEquals(GoalType.MINIMIZE, cMAESOptimizer0.getGoalType());
      //  // Unstable assertion: assertEquals(1691, cMAESOptimizer0.getEvaluations());
      //  // Unstable assertion: assertEquals(1690, cMAESOptimizer0.getMaxEvaluations());
  }
}