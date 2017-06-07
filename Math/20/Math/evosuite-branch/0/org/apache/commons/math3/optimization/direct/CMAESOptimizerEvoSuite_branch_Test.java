/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:28:16 GMT 2014
 */

package org.apache.commons.math3.optimization.direct;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;
import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatingFunction;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.direct.CMAESOptimizer;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.UnitSphereRandomVectorGenerator;
import org.apache.commons.math3.random.Well1024a;
import org.apache.commons.math3.random.Well19937c;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class CMAESOptimizerEvoSuite_branch_Test extends CMAESOptimizerEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      int int0 = 2791;
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) int0;
      boolean boolean0 = false;
      MersenneTwister mersenneTwister0 = (MersenneTwister)CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
      assertNotNull(mersenneTwister0);
      
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, doubleArray0, int0, (double) int0, boolean0, int0, int0, (RandomGenerator) mersenneTwister0, boolean0);
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertArrayEquals(new double[] {2791.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(cMAESOptimizer0);
      
      double[][] doubleArray1 = new double[3][6];
      doubleArray1[0] = doubleArray0;
      assertNotNull(doubleArray1[0]);
      
      doubleArray1[1] = doubleArray0;
      assertNotNull(doubleArray1[1]);
      
      doubleArray1[2] = doubleArray0;
      assertNotNull(doubleArray1[2]);
      
      int int1 = 0;
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(int0);
      assertFalse(int0 == int1);
      assertNotNull(unitSphereRandomVectorGenerator0);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray1[0], int0, int1, unitSphereRandomVectorGenerator0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertNotNull(microsphereInterpolatingFunction0);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      try {
        PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(int1, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1[1], doubleArray1[0], doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2,791 out of [0, 0] range
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      int int0 = 0;
      double[] doubleArray0 = new double[2];
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, doubleArray0);
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(cMAESOptimizer0);
      
      double[][] doubleArray1 = new double[2][7];
      doubleArray1[0] = doubleArray0;
      assertNotNull(doubleArray1[0]);
      
      doubleArray1[1] = doubleArray0;
      assertNotNull(doubleArray1[1]);
      
      Well19937c well19937c0 = new Well19937c();
      assertNotNull(well19937c0);
      
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(int0, (RandomGenerator) well19937c0);
      assertNotNull(unitSphereRandomVectorGenerator0);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray1[0], int0, int0, unitSphereRandomVectorGenerator0);
      assertNotNull(microsphereInterpolatingFunction0);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      try {
        PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(int0, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      int int0 = (-1308);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) int0;
      boolean boolean0 = true;
      int int1 = 23;
      RandomGenerator randomGenerator0 = null;
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, doubleArray0, int0, (double) int0, boolean0, int1, int0, randomGenerator0, boolean0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertArrayEquals(new double[] {(-1308.0), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(cMAESOptimizer0);
      
      int int2 = 10;
      double[][] doubleArray1 = new double[9][10];
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
      
      doubleArray1[8] = doubleArray0;
      assertNotNull(doubleArray1[8]);
      
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(int2);
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
      assertNotNull(unitSphereRandomVectorGenerator0);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray1[1], int2, int1, unitSphereRandomVectorGenerator0);
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
      assertFalse(int1 == int2);
      assertFalse(int1 == int0);
      assertNotNull(microsphereInterpolatingFunction0);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      // Undeclared exception!
      try {
        PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(int2, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1[4], doubleArray1[1], doubleArray1[2]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1,308 is smaller than the minimum (0)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      int int0 = 2;
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0);
      //  // Unstable assertion: assertNull(cMAESOptimizer0.getGoalType());
      //  // Unstable assertion: assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertEquals(0, cMAESOptimizer0.getEvaluations());
      //  // Unstable assertion: assertNotNull(cMAESOptimizer0);
      
      double[] doubleArray0 = new double[8];
      int int1 = 1025;
      double[][] doubleArray1 = new double[8][5];
      doubleArray1[0] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[0]);
      
      doubleArray1[1] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[1]);
      
      doubleArray1[2] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[2]);
      
      doubleArray1[3] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[3]);
      
      doubleArray1[4] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[4]);
      
      doubleArray1[5] = doubleArray1[2];
      //  // Unstable assertion: assertNotNull(doubleArray1[5]);
      
      doubleArray1[6] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[6]);
      
      doubleArray1[7] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[7]);
      
      int int2 = 0;
      Well1024a well1024a0 = new Well1024a();
      //  // Unstable assertion: assertNotNull(well1024a0);
      
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(int2, (RandomGenerator) well1024a0);
      //  // Unstable assertion: assertFalse(int2 == int1);
      //  // Unstable assertion: assertFalse(int2 == int0);
      //  // Unstable assertion: assertNotNull(unitSphereRandomVectorGenerator0);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray1[2], int2, int2, unitSphereRandomVectorGenerator0);
      //  // Unstable assertion: assertFalse(int2 == int1);
      //  // Unstable assertion: assertFalse(int2 == int0);
      //  // Unstable assertion: assertNotNull(microsphereInterpolatingFunction0);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(int1, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1[7]);
      //  // Unstable assertion: assertFalse(int1 == int0);
      //  // Unstable assertion: assertFalse(int1 == int2);
      //  // Unstable assertion: assertFalse(int2 == int1);
      //  // Unstable assertion: assertFalse(int2 == int0);
      //  // Unstable assertion: assertFalse(int0 == int1);
      //  // Unstable assertion: assertFalse(int0 == int2);
      //  // Unstable assertion: assertEquals(GoalType.MINIMIZE, cMAESOptimizer0.getGoalType());
      //  // Unstable assertion: assertEquals(1026, cMAESOptimizer0.getEvaluations());
      //  // Unstable assertion: assertEquals(1025, cMAESOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertNotNull(pointValuePair0);
      
      doubleArray0[6] = (double) int1;
      PointValuePair pointValuePair1 = cMAESOptimizer0.optimizeInternal(int1, microsphereInterpolatingFunction0, goalType0, doubleArray1[3]);
      //  // Unstable assertion: assertFalse(int1 == int0);
      //  // Unstable assertion: assertFalse(int1 == int2);
      //  // Unstable assertion: assertFalse(int2 == int1);
      //  // Unstable assertion: assertFalse(int2 == int0);
      //  // Unstable assertion: assertFalse(int0 == int1);
      //  // Unstable assertion: assertFalse(int0 == int2);
      //  // Unstable assertion: assertFalse(pointValuePair1.equals((Object)pointValuePair0));
      //  // Unstable assertion: assertEquals(GoalType.MINIMIZE, cMAESOptimizer0.getGoalType());
      //  // Unstable assertion: assertEquals(43, cMAESOptimizer0.getEvaluations());
      //  // Unstable assertion: assertEquals(1025, cMAESOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertNotNull(pointValuePair1);
      //  // Unstable assertion: assertNotSame(pointValuePair1, pointValuePair0);
  }

  @Test
  public void test4()  throws Throwable  {
      int int0 = 0;
      double[] doubleArray0 = new double[9];
      boolean boolean0 = false;
      RandomGenerator randomGenerator0 = null;
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0, doubleArray0, int0, (double) int0, boolean0, int0, int0, randomGenerator0, boolean0);
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(cMAESOptimizer0);
      
      int int1 = 759;
      double[][] doubleArray1 = new double[9][10];
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
      
      doubleArray1[8] = doubleArray0;
      assertNotNull(doubleArray1[8]);
      
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(int0);
      assertFalse(int0 == int1);
      assertNotNull(unitSphereRandomVectorGenerator0);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray1[1], int1, int0, unitSphereRandomVectorGenerator0);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertNotNull(microsphereInterpolatingFunction0);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(int1, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1[4], doubleArray1[1], doubleArray1[2]);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertEquals(759, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(1, cMAESOptimizer0.getEvaluations());
      assertEquals(GoalType.MAXIMIZE, cMAESOptimizer0.getGoalType());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(pointValuePair0);
  }

  @Test
  public void test5()  throws Throwable  {
      int int0 = 331;
      double[] doubleArray0 = new double[1];
      int int1 = 0;
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int1);
      //  // Unstable assertion: assertFalse(int1 == int0);
      //  // Unstable assertion: assertNull(cMAESOptimizer0.getGoalType());
      //  // Unstable assertion: assertEquals(0, cMAESOptimizer0.getEvaluations());
      //  // Unstable assertion: assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertNotNull(cMAESOptimizer0);
      
      double[][] doubleArray1 = new double[1][6];
      doubleArray1[0] = doubleArray0;
      //  // Unstable assertion: assertNotNull(doubleArray1[0]);
      
      int[] intArray0 = new int[8];
      Well1024a well1024a0 = new Well1024a(intArray0);
      //  // Unstable assertion: assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      //  // Unstable assertion: assertNotNull(well1024a0);
      
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(int0, (RandomGenerator) well1024a0);
      //  // Unstable assertion: assertFalse(int0 == int1);
      //  // Unstable assertion: assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      //  // Unstable assertion: assertNotNull(unitSphereRandomVectorGenerator0);
      
      MicrosphereInterpolatingFunction microsphereInterpolatingFunction0 = new MicrosphereInterpolatingFunction(doubleArray1, doubleArray1[0], int0, int1, unitSphereRandomVectorGenerator0);
      //  // Unstable assertion: assertFalse(int0 == int1);
      //  // Unstable assertion: assertFalse(int1 == int0);
      //  // Unstable assertion: assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      //  // Unstable assertion: assertNotNull(microsphereInterpolatingFunction0);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      PointValuePair pointValuePair0 = cMAESOptimizer0.optimize(int0, (MultivariateFunction) microsphereInterpolatingFunction0, goalType0, doubleArray1[0]);
      //  // Unstable assertion: assertFalse(int0 == int1);
      //  // Unstable assertion: assertFalse(int1 == int0);
      //  // Unstable assertion: assertEquals(GoalType.MAXIMIZE, cMAESOptimizer0.getGoalType());
      //  // Unstable assertion: assertEquals(332, cMAESOptimizer0.getEvaluations());
      //  // Unstable assertion: assertEquals(331, cMAESOptimizer0.getMaxEvaluations());
      //  // Unstable assertion: assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      //  // Unstable assertion: assertNotNull(pointValuePair0);
  }

  @Test
  public void test6()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNotNull(cMAESOptimizer0);
      
      List<RealMatrix> list0 = cMAESOptimizer0.getStatisticsDHistory();
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(true, list0.isEmpty());
      assertEquals(0, list0.size());
      assertNotNull(list0);
  }

  @Test
  public void test7()  throws Throwable  {
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer();
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNotNull(cMAESOptimizer0);
      
      List<RealMatrix> list0 = cMAESOptimizer0.getStatisticsMeanHistory();
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(true, list0.isEmpty());
      assertEquals(0, list0.size());
      assertNotNull(list0);
  }

  @Test
  public void test8()  throws Throwable  {
      int int0 = 2;
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0);
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertNotNull(cMAESOptimizer0);
      
      List<Double> list0 = cMAESOptimizer0.getStatisticsFitnessHistory();
      assertEquals(true, list0.isEmpty());
      assertEquals(0, list0.size());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertNotNull(list0);
  }

  @Test
  public void test9()  throws Throwable  {
      int int0 = 6;
      CMAESOptimizer cMAESOptimizer0 = new CMAESOptimizer(int0);
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertNotNull(cMAESOptimizer0);
      
      List<Double> list0 = cMAESOptimizer0.getStatisticsSigmaHistory();
      assertEquals(0, cMAESOptimizer0.getMaxEvaluations());
      assertNull(cMAESOptimizer0.getGoalType());
      assertEquals(0, cMAESOptimizer0.getEvaluations());
      assertEquals(true, list0.isEmpty());
      assertEquals(0, list0.size());
      assertNotNull(list0);
  }
}