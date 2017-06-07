/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:06:43 GMT 2014
 */

package org.apache.commons.math.analysis.solvers;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Log;
import org.apache.commons.math.analysis.function.Log1p;
import org.apache.commons.math.analysis.function.Tanh;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class BaseSecantSolverEvoSuite_branch_Test extends BaseSecantSolverEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      double double0 = 1.1839709941847596;
      double double1 = 0.0;
      int int0 = 156;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(double0, double0, double1);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertEquals(1.1839709941847596, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, regulaFalsiSolver0.getEvaluations());
      assertEquals(0, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(1.1839709941847596, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMin(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMax(), 0.01D);
      assertNotNull(regulaFalsiSolver0);
      
      Log log0 = new Log();
      assertNotNull(log0);
      
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double2 = regulaFalsiSolver0.solve(int0, (UnivariateRealFunction) log0, double1, double0, allowedSolution0);
      assertEquals(1.1839709941847596, double2, 0.01D);
      assertTrue(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertTrue(double2 == double0);
      assertFalse(double2 == double1);
      assertEquals(1.1839709941847596, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(156, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(0.0, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.1839709941847596, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMin(), 0.01D);
      assertEquals(4, regulaFalsiSolver0.getEvaluations());
      assertEquals(1.1839709941847596, regulaFalsiSolver0.getMax(), 0.01D);
      assertEquals(0.5919854970923798, regulaFalsiSolver0.getStartValue(), 0.01D);
  }

  @Test
  public void test01()  throws Throwable  {
      Log1p log1p0 = new Log1p();
      assertNotNull(log1p0);
      
      double double0 = 4742.124757285353;
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      assertEquals(0, pegasusSolver0.getMaxEvaluations());
      assertEquals(1.0E-6, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getMax(), 0.01D);
      assertEquals(0, pegasusSolver0.getEvaluations());
      assertEquals(1.0E-15, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getMin(), 0.01D);
      assertEquals(1.0E-14, pegasusSolver0.getRelativeAccuracy(), 0.01D);
      assertNotNull(pegasusSolver0);
      
      int int0 = 462;
      double double1 = (-0.32012665772496174);
      double double2 = pegasusSolver0.solve(int0, (UnivariateRealFunction) log1p0, double1, double0, allowedSolution0);
      assertEquals((-4.307178696914672E-10), double2, 0.01D);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertEquals(4742.124757285353, pegasusSolver0.getMax(), 0.01D);
      assertEquals(462, pegasusSolver0.getMaxEvaluations());
      assertEquals(1.0E-6, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(11, pegasusSolver0.getEvaluations());
      assertEquals((-0.32012665772496174), pegasusSolver0.getMin(), 0.01D);
      assertEquals(2370.902315313814, pegasusSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-15, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-14, pegasusSolver0.getRelativeAccuracy(), 0.01D);
  }

  @Test
  public void test02()  throws Throwable  {
      double double0 = 1.18397099418;
      double double1 = 0.715536754107;
      int int0 = 151;
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(double0, double0, double1);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertEquals(1.18397099418, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(0.715536754107, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMin(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMax(), 0.01D);
      assertEquals(1.18397099418, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, regulaFalsiSolver0.getEvaluations());
      assertNotNull(regulaFalsiSolver0);
      
      Log log0 = new Log();
      assertNotNull(log0);
      
      double double2 = regulaFalsiSolver0.solve(int0, (UnivariateRealFunction) log0, double1, (double) int0, allowedSolution0);
      assertEquals(10.114554490052484, double2, 0.01D);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertEquals(1.18397099418, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.715536754107, regulaFalsiSolver0.getMin(), 0.01D);
      assertEquals(151.0, regulaFalsiSolver0.getMax(), 0.01D);
      assertEquals(0.715536754107, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.18397099418, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(3, regulaFalsiSolver0.getEvaluations());
      assertEquals(75.8577683770535, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(151, regulaFalsiSolver0.getMaxEvaluations());
  }

  @Test
  public void test03()  throws Throwable  {
      double double0 = 0.0;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(double0);
      assertEquals(0.0, illinoisSolver0.getMax(), 0.01D);
      assertEquals(0, illinoisSolver0.getEvaluations());
      assertEquals(1.0E-14, illinoisSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getMin(), 0.01D);
      assertEquals(1.0E-15, illinoisSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, illinoisSolver0.getMaxEvaluations());
      assertNotNull(illinoisSolver0);
      
      int int0 = 2306;
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) int0;
      doubleArray0[2] = (double) int0;
      doubleArray0[5] = (double) int0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {2306.0, 0.0, 2306.0, 0.0, 0.0, 2306.0}, doubleArray0, 0.01);
      assertEquals(5, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      
      double double1 = (-1077.19);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double2 = illinoisSolver0.solve(int0, (UnivariateRealFunction) polynomialFunction0, double1, doubleArray0[0], allowedSolution0);
      assertEquals((-1.1938591113212231), double2, 0.01D);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertArrayEquals(new double[] {2306.0, 0.0, 2306.0, 0.0, 0.0, 2306.0}, doubleArray0, 0.01);
      assertEquals(5, polynomialFunction0.degree());
      assertEquals(1.0E-14, illinoisSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(53, illinoisSolver0.getEvaluations());
      assertEquals(2306.0, illinoisSolver0.getMax(), 0.01D);
      assertEquals(2306, illinoisSolver0.getMaxEvaluations());
      assertEquals((-1077.19), illinoisSolver0.getMin(), 0.01D);
      assertEquals(1.0E-15, illinoisSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(614.405, illinoisSolver0.getStartValue(), 0.01D);
  }

  @Test
  public void test04()  throws Throwable  {
      Log1p log1p0 = new Log1p();
      assertNotNull(log1p0);
      
      double double0 = 1197.539024661;
      double double1 = log1p0.value(double0);
      assertEquals(7.088858614596732, double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      assertEquals(1.0E-15, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getMin(), 0.01D);
      assertEquals(1.0E-6, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-14, pegasusSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, pegasusSolver0.getEvaluations());
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getMax(), 0.01D);
      assertEquals(0, pegasusSolver0.getMaxEvaluations());
      assertNotNull(pegasusSolver0);
      
      int int0 = 471;
      double double2 = (-1.9841269659586505E-4);
      assertFalse(double2 == double1);
      
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double3 = pegasusSolver0.solve(int0, (UnivariateRealFunction) log1p0, double2, double1, allowedSolution0);
      assertEquals((-2.450689461218079E-12), double3, 0.01D);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double1 == double3);
      assertFalse(double2 == double3);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double0 == double3);
      assertFalse(double3 == double2);
      assertFalse(double3 == double0);
      assertFalse(double3 == double1);
      assertEquals(1.0E-15, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals((-1.9841269659586505E-4), pegasusSolver0.getMin(), 0.01D);
      assertEquals(5, pegasusSolver0.getEvaluations());
      assertEquals(1.0E-14, pegasusSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(3.5443301009500683, pegasusSolver0.getStartValue(), 0.01D);
      assertEquals(7.088858614596732, pegasusSolver0.getMax(), 0.01D);
      assertEquals(471, pegasusSolver0.getMaxEvaluations());
  }

  @Test
  public void test05()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      assertEquals(0, illinoisSolver0.getEvaluations());
      assertEquals(0, illinoisSolver0.getMaxEvaluations());
      assertEquals(1.0E-15, illinoisSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getMin(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getMax(), 0.01D);
      assertEquals(1.0E-14, illinoisSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-6, illinoisSolver0.getAbsoluteAccuracy(), 0.01D);
      assertNotNull(illinoisSolver0);
      
      int int0 = 3369;
      double[] doubleArray0 = new double[7];
      doubleArray0[2] = (double) int0;
      doubleArray0[3] = (double) int0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 3369.0, 3369.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(3, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      
      double double0 = (-596.5894312063344);
      double double1 = illinoisSolver0.solve(int0, (UnivariateRealFunction) polynomialFunction0, double0, doubleArray0[2], doubleArray0[2]);
      assertEquals((-1.0000000000025484), double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertArrayEquals(new double[] {0.0, 0.0, 3369.0, 3369.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(3369.0, illinoisSolver0.getMax(), 0.01D);
      assertEquals((-596.5894312063344), illinoisSolver0.getMin(), 0.01D);
      assertEquals(1.0E-15, illinoisSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(3369, illinoisSolver0.getMaxEvaluations());
      assertEquals(33, illinoisSolver0.getEvaluations());
      assertEquals(1.0E-14, illinoisSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(3369.0, illinoisSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-6, illinoisSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(3, polynomialFunction0.degree());
  }

  @Test
  public void test06()  throws Throwable  {
      Log1p log1p0 = new Log1p();
      assertNotNull(log1p0);
      
      double double0 = 4796.758840905008;
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      assertEquals(0, pegasusSolver0.getMaxEvaluations());
      assertEquals(1.0E-15, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getMin(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getMax(), 0.01D);
      assertEquals(0, pegasusSolver0.getEvaluations());
      assertEquals(1.0E-14, pegasusSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
      assertNotNull(pegasusSolver0);
      
      int int0 = 489;
      double double1 = (-0.320127);
      double double2 = pegasusSolver0.solve(int0, (UnivariateRealFunction) log1p0, double1, double0, allowedSolution0);
      assertEquals(3.411764447168309E-16, double2, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertEquals(1.0E-15, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(4796.758840905008, pegasusSolver0.getMax(), 0.01D);
      assertEquals((-0.320127), pegasusSolver0.getMin(), 0.01D);
      assertEquals(489, pegasusSolver0.getMaxEvaluations());
      assertEquals(2398.219356952504, pegasusSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-14, pegasusSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(11, pegasusSolver0.getEvaluations());
      assertEquals(1.0E-6, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
  }

  @Test
  public void test07()  throws Throwable  {
      Log1p log1p0 = new Log1p();
      assertNotNull(log1p0);
      
      double double0 = 661.6131825304323;
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getMin(), 0.01D);
      assertEquals(1.0E-15, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getMax(), 0.01D);
      assertEquals(0, pegasusSolver0.getEvaluations());
      assertEquals(1.0E-14, pegasusSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, pegasusSolver0.getMaxEvaluations());
      assertNotNull(pegasusSolver0);
      
      int int0 = 492;
      double double1 = (-0.32);
      double double2 = pegasusSolver0.solve(int0, (UnivariateRealFunction) log1p0, double1, double0, allowedSolution0);
      assertEquals(7.273750047968941E-11, double2, 0.01D);
      assertFalse(double2 == double1);
      assertFalse(double2 == double0);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertEquals(330.64659126521616, pegasusSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-15, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(10, pegasusSolver0.getEvaluations());
      assertEquals(1.0E-14, pegasusSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals((-0.32), pegasusSolver0.getMin(), 0.01D);
      assertEquals(661.6131825304323, pegasusSolver0.getMax(), 0.01D);
      assertEquals(492, pegasusSolver0.getMaxEvaluations());
  }

  @Test
  public void test08()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      assertEquals(0, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(1.0E-15, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0, regulaFalsiSolver0.getEvaluations());
      assertEquals(1.0E-14, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMin(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMax(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-6, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertNotNull(regulaFalsiSolver0);
      
      int int0 = 2866;
      Tanh tanh0 = new Tanh();
      assertNotNull(tanh0);
      
      double double0 = (-1.0);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double1 = regulaFalsiSolver0.solve(int0, (UnivariateRealFunction) tanh0, double0, (double) int0, double0, allowedSolution0);
      assertEquals((-9.13608061867748E-22), double1, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertEquals(2866, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(1.0E-15, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals((-1.0), regulaFalsiSolver0.getMin(), 0.01D);
      assertEquals(1.0E-14, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals((-1.0), regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(16, regulaFalsiSolver0.getEvaluations());
      assertEquals(2866.0, regulaFalsiSolver0.getMax(), 0.01D);
      assertEquals(1.0E-6, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
  }

  @Test
  public void test09()  throws Throwable  {
      Log1p log1p0 = new Log1p();
      assertNotNull(log1p0);
      
      double double0 = 1.6969;
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      assertEquals(0, pegasusSolver0.getEvaluations());
      assertEquals(0.0, pegasusSolver0.getMin(), 0.01D);
      assertEquals(1.0E-14, pegasusSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getMax(), 0.01D);
      assertEquals(0, pegasusSolver0.getMaxEvaluations());
      assertEquals(1.0E-15, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01D);
      assertNotNull(pegasusSolver0);
      
      int int0 = 665;
      double double1 = (-0.32012665772496174);
      double double2 = pegasusSolver0.solve(int0, (UnivariateRealFunction) log1p0, double1, double0, allowedSolution0);
      assertEquals((-6.900901950762309E-25), double2, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertEquals((-0.32012665772496174), pegasusSolver0.getMin(), 0.01D);
      assertEquals(1.0E-14, pegasusSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-6, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.6883866711375193, pegasusSolver0.getStartValue(), 0.01D);
      assertEquals(1.6969, pegasusSolver0.getMax(), 0.01D);
      assertEquals(1.0E-15, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(665, pegasusSolver0.getMaxEvaluations());
      assertEquals(9, pegasusSolver0.getEvaluations());
  }

  @Test
  public void test10()  throws Throwable  {
      double double0 = 1.1839709941847596;
      double double1 = 0.0;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(double0, double1, double0);
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertEquals(0, illinoisSolver0.getEvaluations());
      assertEquals(0, illinoisSolver0.getMaxEvaluations());
      assertEquals(1.1839709941847596, illinoisSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.1839709941847596, illinoisSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getMin(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getMax(), 0.01D);
      assertNotNull(illinoisSolver0);
      
      int int0 = 156;
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      Log log0 = new Log();
      assertNotNull(log0);
      
      double double2 = illinoisSolver0.solve(int0, (UnivariateRealFunction) log0, double1, double0, allowedSolution0);
      assertEquals(0.0, double2, 0.01D);
      assertFalse(double1 == double0);
      assertTrue(double1 == double2);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double2 == double0);
      assertTrue(double2 == double1);
      assertEquals(3, illinoisSolver0.getEvaluations());
      assertEquals(1.1839709941847596, illinoisSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.1839709941847596, illinoisSolver0.getMax(), 0.01D);
      assertEquals(156, illinoisSolver0.getMaxEvaluations());
      assertEquals(0.0, illinoisSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.1839709941847596, illinoisSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getMin(), 0.01D);
      assertEquals(0.5919854970923798, illinoisSolver0.getStartValue(), 0.01D);
  }

  @Test
  public void test11()  throws Throwable  {
      Log1p log1p0 = new Log1p();
      assertNotNull(log1p0);
      
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01D);
      assertEquals(0, pegasusSolver0.getMaxEvaluations());
      assertEquals(0, pegasusSolver0.getEvaluations());
      assertEquals(1.0E-14, pegasusSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getMin(), 0.01D);
      assertEquals(1.0E-6, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getMax(), 0.01D);
      assertNotNull(pegasusSolver0);
      
      int int0 = 471;
      double double0 = (-1.9841269659586505E-4);
      double double1 = 1.0E-6;
      double double2 = pegasusSolver0.solve(int0, (UnivariateRealFunction) log1p0, double0, double1, double1);
      assertEquals(9.781163493984581E-19, double2, 0.01D);
      assertFalse(double1 == double0);
      assertFalse(double1 == double2);
      assertFalse(double0 == double1);
      assertFalse(double0 == double2);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertEquals(471, pegasusSolver0.getMaxEvaluations());
      assertEquals(1.0E-14, pegasusSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals((-1.9841269659586505E-4), pegasusSolver0.getMin(), 0.01D);
      assertEquals(1.0E-6, pegasusSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-6, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, pegasusSolver0.getMax(), 0.01D);
      assertEquals(4, pegasusSolver0.getEvaluations());
  }

  @Test
  public void test12()  throws Throwable  {
      double double0 = 0.32612774211;
      int int0 = 132;
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(double0, (double) int0, (double) int0);
      assertEquals(0.32612774211, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMin(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(132.0, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMax(), 0.01D);
      assertEquals(0, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(132.0, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, regulaFalsiSolver0.getEvaluations());
      assertNotNull(regulaFalsiSolver0);
      
      Log log0 = new Log();
      assertNotNull(log0);
      
      double double1 = regulaFalsiSolver0.solve(int0, (UnivariateRealFunction) log0, double0, (double) int0, allowedSolution0);
      assertEquals(24.902094115849778, double1, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertEquals(0.32612774211, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(3, regulaFalsiSolver0.getEvaluations());
      assertEquals(0.32612774211, regulaFalsiSolver0.getMin(), 0.01D);
      assertEquals(66.163063871055, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(132, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(132.0, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(132.0, regulaFalsiSolver0.getMax(), 0.01D);
      assertEquals(132.0, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
  }

  @Test
  public void test13()  throws Throwable  {
      double double0 = 0.0;
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(double0);
      assertEquals(0, illinoisSolver0.getEvaluations());
      assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-15, illinoisSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getMin(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getMax(), 0.01D);
      assertEquals(1.0E-14, illinoisSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, illinoisSolver0.getMaxEvaluations());
      assertEquals(0.0, illinoisSolver0.getAbsoluteAccuracy(), 0.01D);
      assertNotNull(illinoisSolver0);
      
      int int0 = 2306;
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) int0;
      doubleArray0[5] = (double) int0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {2306.0, 0.0, 0.0, 0.0, 0.0, 2306.0}, doubleArray0, 0.01);
      assertEquals(5, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      
      double double1 = (-1077.19);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double2 = illinoisSolver0.solve(int0, (UnivariateRealFunction) polynomialFunction0, double1, doubleArray0[0], allowedSolution0);
      assertEquals((-1.0), double2, 0.01D);
      assertFalse(double2 == double0);
      assertFalse(double2 == double1);
      assertFalse(double0 == double2);
      assertFalse(double0 == double1);
      assertFalse(double1 == double2);
      assertFalse(double1 == double0);
      assertArrayEquals(new double[] {2306.0, 0.0, 0.0, 0.0, 0.0, 2306.0}, doubleArray0, 0.01);
      assertEquals(1.0E-15, illinoisSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(53, illinoisSolver0.getEvaluations());
      assertEquals(614.405, illinoisSolver0.getStartValue(), 0.01D);
      assertEquals(2306, illinoisSolver0.getMaxEvaluations());
      assertEquals((-1077.19), illinoisSolver0.getMin(), 0.01D);
      assertEquals(2306.0, illinoisSolver0.getMax(), 0.01D);
      assertEquals(1.0E-14, illinoisSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(5, polynomialFunction0.degree());
  }

  @Test
  public void test14()  throws Throwable  {
      Log1p log1p0 = new Log1p();
      assertNotNull(log1p0);
      
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      assertEquals(1.0E-14, pegasusSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01D);
      assertEquals(0, pegasusSolver0.getMaxEvaluations());
      assertEquals(0.0, pegasusSolver0.getMin(), 0.01D);
      assertEquals(1.0E-15, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(1.0E-6, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0, pegasusSolver0.getEvaluations());
      assertEquals(0.0, pegasusSolver0.getMax(), 0.01D);
      assertNotNull(pegasusSolver0);
      
      int int0 = 413;
      double double0 = (-0.3201267);
      double double1 = pegasusSolver0.solve(int0, (UnivariateRealFunction) log1p0, double0, (double) int0, allowedSolution0);
      assertEquals(1.3214205806847908E-13, double1, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertEquals(1.0E-14, pegasusSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(413.0, pegasusSolver0.getMax(), 0.01D);
      assertEquals(1.0E-15, pegasusSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(206.33993665, pegasusSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-6, pegasusSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(413, pegasusSolver0.getMaxEvaluations());
      assertEquals((-0.3201267), pegasusSolver0.getMin(), 0.01D);
      assertEquals(9, pegasusSolver0.getEvaluations());
  }

  @Test
  public void test15()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      assertEquals(1.0E-15, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMax(), 0.01D);
      assertEquals(1.0E-14, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(0, regulaFalsiSolver0.getEvaluations());
      assertEquals(1.0E-6, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMin(), 0.01D);
      assertNotNull(regulaFalsiSolver0);
      
      int int0 = 2866;
      Tanh tanh0 = new Tanh();
      assertNotNull(tanh0);
      
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = 0.0;
      double double1 = regulaFalsiSolver0.solve(int0, (UnivariateRealFunction) tanh0, (double) int0, double0, double0, allowedSolution0);
      assertEquals(0.0, double1, 0.01D);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
      assertEquals(1.0E-15, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMax(), 0.01D);
      assertEquals(1.0E-14, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(2866.0, regulaFalsiSolver0.getMin(), 0.01D);
      assertEquals(2866, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(1.0E-6, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(2, regulaFalsiSolver0.getEvaluations());
  }

  @Test
  public void test16()  throws Throwable  {
      double double0 = 243.9076409107984;
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(double0);
      assertEquals(0.0, regulaFalsiSolver0.getMin(), 0.01D);
      assertEquals(0.0, regulaFalsiSolver0.getMax(), 0.01D);
      assertEquals(0, regulaFalsiSolver0.getEvaluations());
      assertEquals(0, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-14, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(1.0E-15, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(243.9076409107984, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertNotNull(regulaFalsiSolver0);
      
      int int0 = 2179;
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(0, polynomialFunction0.degree());
      assertNotNull(polynomialFunction0);
      
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double1 = regulaFalsiSolver0.solve(int0, (UnivariateRealFunction) polynomialFunction0, double0, doubleArray0[0], (double) int0, allowedSolution0);
      assertEquals(243.9076409107984, double1, 0.01D);
      assertTrue(double0 == double1);
      assertTrue(double1 == double0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(0.0, regulaFalsiSolver0.getMax(), 0.01D);
      assertEquals(2179, regulaFalsiSolver0.getMaxEvaluations());
      assertEquals(1.0E-14, regulaFalsiSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(2, regulaFalsiSolver0.getEvaluations());
      assertEquals(2179.0, regulaFalsiSolver0.getStartValue(), 0.01D);
      assertEquals(1.0E-15, regulaFalsiSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(243.9076409107984, regulaFalsiSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(243.9076409107984, regulaFalsiSolver0.getMin(), 0.01D);
      assertEquals(0, polynomialFunction0.degree());
  }

  @Test
  public void test17()  throws Throwable  {
      Log1p log1p0 = new Log1p();
      assertNotNull(log1p0);
      
      double double0 = 1197.539024661;
      double double1 = log1p0.value(double0);
      assertEquals(7.088858614596732, double1, 0.01D);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(double1, double1);
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertEquals(7.088858614596732, illinoisSolver0.getAbsoluteAccuracy(), 0.01D);
      assertEquals(1.0E-15, illinoisSolver0.getFunctionValueAccuracy(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getMax(), 0.01D);
      assertEquals(7.088858614596732, illinoisSolver0.getRelativeAccuracy(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01D);
      assertEquals(0.0, illinoisSolver0.getMin(), 0.01D);
      assertEquals(0, illinoisSolver0.getEvaluations());
      assertEquals(0, illinoisSolver0.getMaxEvaluations());
      assertNotNull(illinoisSolver0);
  }
}