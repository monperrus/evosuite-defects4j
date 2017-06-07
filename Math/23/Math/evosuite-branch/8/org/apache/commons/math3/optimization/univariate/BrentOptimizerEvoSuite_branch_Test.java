/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:44:44 GMT 2014
 */

package org.apache.commons.math3.optimization.univariate;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.function.Sinc;
import org.apache.commons.math3.analysis.function.Sinh;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.univariate.BrentOptimizer;
import org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class BrentOptimizerEvoSuite_branch_Test extends BrentOptimizerEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double double0 = 1.739691050434712;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double0, double0);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertNull(brentOptimizer0.getGoalType());
      assertNotNull(brentOptimizer0);
      
      int int0 = brentOptimizer0.getEvaluations();
      assertEquals(0, int0);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertNull(brentOptimizer0.getGoalType());
      
      int int1 = 799;
      assertFalse(int1 == int0);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      double double1 = 1192.2696437062;
      Sinc sinc0 = new Sinc();
      assertNotNull(sinc0);
      
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(int1, (UnivariateFunction) sinc0, goalType0, double1, double1, (double) int0);
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(8, brentOptimizer0.getEvaluations());
      assertEquals(799, brentOptimizer0.getMaxEvaluations());
      assertEquals(1192.2696437062, brentOptimizer0.getMin(), 0.01D);
      assertEquals(1192.2696437062, brentOptimizer0.getMax(), 0.01D);
      assertEquals(GoalType.MAXIMIZE, brentOptimizer0.getGoalType());
      assertEquals(1.0, univariatePointValuePair0.getValue(), 0.01D);
      assertEquals(0.0, univariatePointValuePair0.getPoint(), 0.01D);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertNotNull(univariatePointValuePair0);
  }

  @Test
  public void test1()  throws Throwable  {
      double double0 = 0.7158187810198;
      double double1 = 2812.563;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double0, double1);
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertNotNull(brentOptimizer0);
      
      ConvergenceChecker<UnivariatePointValuePair> convergenceChecker0 = brentOptimizer0.getConvergenceChecker();
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertNull(convergenceChecker0);
      
      BrentOptimizer brentOptimizer1 = new BrentOptimizer(double0, double0, convergenceChecker0);
      assertEquals(0.0, brentOptimizer1.getMin(), 0.01D);
      assertEquals(0, brentOptimizer1.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer1.getMax(), 0.01D);
      assertEquals(0, brentOptimizer1.getEvaluations());
      assertNull(brentOptimizer1.getGoalType());
      assertEquals(0.0, brentOptimizer1.getStartValue(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertNotSame(brentOptimizer1, brentOptimizer0);
      assertNotSame(brentOptimizer0, brentOptimizer1);
      assertFalse(double0 == double1);
      assertFalse(brentOptimizer1.equals((Object)brentOptimizer0));
      assertFalse(brentOptimizer0.equals((Object)brentOptimizer1));
      assertFalse(double1 == double0);
      assertNotNull(brentOptimizer1);
      
      int int0 = 22;
      Sinh sinh0 = new Sinh();
      assertNotNull(sinh0);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      double double2 = (-198.42320917468408);
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer1.optimize(int0, (UnivariateFunction) sinh0, goalType0, double1, double2, double0);
      assertEquals((-1.665623089596596E57), univariatePointValuePair0.getValue(), 0.01D);
      assertEquals((-132.45069676263307), univariatePointValuePair0.getPoint(), 0.01D);
      assertEquals(0.7158187810198, brentOptimizer1.getStartValue(), 0.01D);
      assertEquals(GoalType.MINIMIZE, brentOptimizer1.getGoalType());
      assertEquals(14, brentOptimizer1.getEvaluations());
      assertEquals(22, brentOptimizer1.getMaxEvaluations());
      assertEquals((-198.42320917468408), brentOptimizer1.getMax(), 0.01D);
      assertEquals(2812.563, brentOptimizer1.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertNotSame(brentOptimizer1, brentOptimizer0);
      assertNotSame(brentOptimizer0, brentOptimizer1);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(brentOptimizer1.equals((Object)brentOptimizer0));
      assertFalse(brentOptimizer0.equals((Object)brentOptimizer1));
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertNotNull(univariatePointValuePair0);
  }

  @Test
  public void test2()  throws Throwable  {
      double double0 = 1.739691050434712;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double0, double0);
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertNotNull(brentOptimizer0);
      
      int int0 = brentOptimizer0.getEvaluations();
      assertEquals(0, int0);
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      
      int int1 = 799;
      assertFalse(int1 == int0);
      
      GoalType goalType0 = GoalType.MAXIMIZE;
      Sinc sinc0 = new Sinc();
      assertNotNull(sinc0);
      
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(int1, (UnivariateFunction) sinc0, goalType0, double0, double0, (double) int0);
      assertEquals(1.0, univariatePointValuePair0.getValue(), 0.01D);
      assertEquals(0.0, univariatePointValuePair0.getPoint(), 0.01D);
      assertEquals(799, brentOptimizer0.getMaxEvaluations());
      assertEquals(1.739691050434712, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(1.739691050434712, brentOptimizer0.getMin(), 0.01D);
      assertEquals(GoalType.MAXIMIZE, brentOptimizer0.getGoalType());
      assertEquals(1, brentOptimizer0.getEvaluations());
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertNotNull(univariatePointValuePair0);
  }

  @Test
  public void test3()  throws Throwable  {
      double double0 = 9.46452492584643E-8;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double0, double0);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertNotNull(brentOptimizer0);
      
      int int0 = 2336;
      boolean boolean0 = true;
      Sinc sinc0 = new Sinc(boolean0);
      assertNotNull(sinc0);
      
      GoalType goalType0 = GoalType.MINIMIZE;
      UnivariatePointValuePair univariatePointValuePair0 = brentOptimizer0.optimize(int0, (UnivariateFunction) sinc0, goalType0, double0, (double) int0, (double) int0);
      assertEquals((-2.038487946157771E-4), univariatePointValuePair0.getValue(), 0.01D);
      assertEquals(1561.499936866794, univariatePointValuePair0.getPoint(), 0.01D);
      assertEquals(2336.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(GoalType.MINIMIZE, brentOptimizer0.getGoalType());
      assertEquals(9.46452492584643E-8, brentOptimizer0.getMin(), 0.01D);
      assertEquals(2336, brentOptimizer0.getMaxEvaluations());
      assertEquals(27, brentOptimizer0.getEvaluations());
      assertEquals(2336.0, brentOptimizer0.getMax(), 0.01D);
      assertNotNull(univariatePointValuePair0);
  }

  @Test
  public void test4()  throws Throwable  {
      double double0 = 26.781178967206227;
      double double1 = (-4.587711103721226);
      BrentOptimizer brentOptimizer0 = null;
      try {
        brentOptimizer0 = new BrentOptimizer(double0, double1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -4.588 is smaller than, or equal to, the minimum (0)
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      double double0 = 941.7548308944417;
      BrentOptimizer brentOptimizer0 = new BrentOptimizer(double0, double0);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      assertNotNull(brentOptimizer0);
      
      int int0 = brentOptimizer0.getEvaluations();
      assertEquals(0, int0);
      assertEquals(0.0, brentOptimizer0.getMax(), 0.01D);
      assertEquals(0, brentOptimizer0.getEvaluations());
      assertEquals(0.0, brentOptimizer0.getMin(), 0.01D);
      assertNull(brentOptimizer0.getGoalType());
      assertEquals(0.0, brentOptimizer0.getStartValue(), 0.01D);
      assertEquals(0, brentOptimizer0.getMaxEvaluations());
      
      BrentOptimizer brentOptimizer1 = null;
      try {
        brentOptimizer1 = new BrentOptimizer((double) int0, (double) int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than the minimum (0)
         //
      }
  }
}