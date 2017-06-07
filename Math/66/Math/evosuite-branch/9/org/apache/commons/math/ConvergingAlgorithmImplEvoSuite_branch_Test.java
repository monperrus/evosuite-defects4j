/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:41:12 GMT 2014
 */

package org.apache.commons.math;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.integration.SimpsonIntegrator;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.MullerSolver;
import org.apache.commons.math.analysis.solvers.NewtonSolver;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.univariate.BrentOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class ConvergingAlgorithmImplEvoSuite_branch_Test extends ConvergingAlgorithmImplEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      double double0 = 6.283185307179586;
      double double1 = (-5350.8);
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      assertEquals(1000, brentOptimizer0.getMaxEvaluations());
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(1.0E-9, brentOptimizer0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0, brentOptimizer0.getIterationCount());
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      assertEquals(1.0E-11, brentOptimizer0.getAbsoluteAccuracy(), 0.01D);
      assertNotNull(brentOptimizer0);
      
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      int int0 = (-371);
      brentOptimizer0.setMaximalIterationCount(int0);
      assertEquals(1000, brentOptimizer0.getMaxEvaluations());
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(1.0E-9, brentOptimizer0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(-371, brentOptimizer0.getMaximalIterationCount());
      assertEquals(0, brentOptimizer0.getIterationCount());
      assertEquals(1.0E-11, brentOptimizer0.getAbsoluteAccuracy(), 0.01D);
      
      try {
        double double2 = brentOptimizer0.optimize((UnivariateRealFunction) polynomialFunction0, goalType0, double1, double0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // maximal number of iterations (-371) exceeded
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      assertEquals(0, newtonSolver0.getIterationCount());
      assertEquals(1.0E-14, newtonSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, newtonSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, newtonSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, newtonSolver0.getAbsoluteAccuracy(), 0.01D);
      assertNotNull(newtonSolver0);
      
      newtonSolver0.resetMaximalIterationCount();
      assertEquals(0, newtonSolver0.getIterationCount());
      assertEquals(1.0E-14, newtonSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, newtonSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(100, newtonSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, newtonSolver0.getAbsoluteAccuracy(), 0.01D);
  }

  @Test
  public void test2()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, mullerSolver0.getIterationCount());
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01D);
      assertNotNull(mullerSolver0);
      
      int int0 = mullerSolver0.getIterationCount();
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, mullerSolver0.getIterationCount());
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, int0);
  }

  @Test
  public void test3()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
      assertEquals(0, mullerSolver0.getIterationCount());
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01D);
      assertNotNull(mullerSolver0);
      
      mullerSolver0.resetRelativeAccuracy();
      assertEquals(0, mullerSolver0.getIterationCount());
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01D);
  }

  @Test
  public void test4()  throws Throwable  {
      SimpsonIntegrator simpsonIntegrator0 = new SimpsonIntegrator();
      assertEquals(64, simpsonIntegrator0.getMaximalIterationCount());
      assertEquals(1.0E-15, simpsonIntegrator0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(3, simpsonIntegrator0.getMinimalIterationCount());
      assertEquals(1.0E-6, simpsonIntegrator0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, simpsonIntegrator0.getIterationCount());
      assertNotNull(simpsonIntegrator0);
      
      int int0 = simpsonIntegrator0.getMaximalIterationCount();
      assertEquals(64, simpsonIntegrator0.getMaximalIterationCount());
      assertEquals(1.0E-15, simpsonIntegrator0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(3, simpsonIntegrator0.getMinimalIterationCount());
      assertEquals(1.0E-6, simpsonIntegrator0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, simpsonIntegrator0.getIterationCount());
      assertEquals(64, int0);
  }

  @Test
  public void test5()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(1000, brentOptimizer0.getMaxEvaluations());
      assertEquals(0, brentOptimizer0.getIterationCount());
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(1.0E-9, brentOptimizer0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(1.0E-11, brentOptimizer0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      assertNotNull(brentOptimizer0);
      
      brentOptimizer0.resetAbsoluteAccuracy();
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(1000, brentOptimizer0.getMaxEvaluations());
      assertEquals(0, brentOptimizer0.getIterationCount());
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(1.0E-9, brentOptimizer0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
  }

  @Test
  public void test6()  throws Throwable  {
      BrentOptimizer brentOptimizer0 = new BrentOptimizer();
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(1.0E-9, brentOptimizer0.getRelativeAccuracy(), 0.01D);
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      assertEquals(1000, brentOptimizer0.getMaxEvaluations());
      assertEquals(0, brentOptimizer0.getIterationCount());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(1.0E-11, brentOptimizer0.getAbsoluteAccuracy(), 0.01D);
      assertNotNull(brentOptimizer0);
      
      double[] doubleArray0 = new double[8];
      double double0 = 33.048628078552;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      double double1 = brentOptimizer0.optimize((UnivariateRealFunction) polynomialFunction0, goalType0, double0, doubleArray0[7]);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0, polynomialFunction0.degree());
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(1.0E-9, brentOptimizer0.getRelativeAccuracy(), 0.01D);
      assertEquals(33.048628078552, brentOptimizer0.getMin(), 0.01D);
      assertEquals(100, brentOptimizer0.getMaximalIterationCount());
      assertEquals(1000, brentOptimizer0.getMaxEvaluations());
      assertEquals(58, brentOptimizer0.getIterationCount());
      assertEquals(16.524314039276, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(59, brentOptimizer0.getEvaluations());
      assertEquals(1.0E-11, brentOptimizer0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(GoalType.MINIMIZE, brentOptimizer0.getGoalType());
      assertEquals(1.0222178768438404E-11, double1, 0.01D);
  }
}