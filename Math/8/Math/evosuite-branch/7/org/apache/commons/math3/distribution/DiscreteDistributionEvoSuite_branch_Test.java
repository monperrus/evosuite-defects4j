/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:19:55 GMT 2014
 */

package org.apache.commons.math3.distribution;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math3.distribution.DiscreteDistribution;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.util.Pair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class DiscreteDistributionEvoSuite_branch_Test extends DiscreteDistributionEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      LinkedList<Pair<String, Double>> linkedList0 = new LinkedList<Pair<String, Double>>();
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      assertNotNull(linkedList0);
      
      String string0 = "^}\\'Y3#";
      double double0 = 1.6732275200147642;
      Pair<String, Double> pair0 = new Pair<String, Double>(string0, (Double) double0);
      assertNotNull(pair0);
      
      boolean boolean0 = linkedList0.add(pair0);
      assertEquals(1, linkedList0.size());
      assertTrue(boolean0);
      
      DiscreteDistribution<String> discreteDistribution0 = new DiscreteDistribution<String>((List<Pair<String, Double>>) linkedList0);
      assertEquals(1, linkedList0.size());
      assertNotNull(discreteDistribution0);
      
      int int0 = (-190);
      try {
        Object[] objectArray0 = discreteDistribution0.sample(int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-190)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      LinkedList<Pair<String, Double>> linkedList0 = new LinkedList<Pair<String, Double>>();
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      assertNotNull(linkedList0);
      
      String string0 = "^}\\'Y3#";
      double double0 = 1.6732275200147642;
      Pair<String, Double> pair0 = new Pair<String, Double>(string0, (Double) double0);
      assertNotNull(pair0);
      
      boolean boolean0 = linkedList0.add(pair0);
      assertEquals(1, linkedList0.size());
      assertTrue(boolean0);
      
      boolean boolean1 = linkedList0.add(pair0);
      assertEquals(2, linkedList0.size());
      assertTrue(boolean1);
      assertTrue(boolean1 == boolean0);
      
      DiscreteDistribution<String> discreteDistribution0 = new DiscreteDistribution<String>((List<Pair<String, Double>>) linkedList0);
      assertEquals(2, linkedList0.size());
      assertNotNull(discreteDistribution0);
      
      String string1 = discreteDistribution0.sample();
      assertEquals(2, linkedList0.size());
      assertNotNull(string1);
      assertSame(string1, string0);
      assertEquals("^}\\'Y3#", string1);
  }

  @Test
  public void test2()  throws Throwable  {
      LinkedList<Pair<Long, Double>> linkedList0 = new LinkedList<Pair<Long, Double>>();
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      assertNotNull(linkedList0);
      
      long long0 = 1L;
      Long long1 = new Long(long0);
      assertEquals(1L, (long)long1);
      assertTrue(long1.equals((Object)long0));
      
      Double double0 = new Double((double) long1);
      assertEquals(1.0, (double)double0, 0.01D);
      assertTrue(long1.equals((Object)long0));
      
      Pair<Long, Double> pair0 = new Pair<Long, Double>(long1, double0);
      assertNotNull(pair0);
      assertTrue(long1.equals((Object)long0));
      
      boolean boolean0 = linkedList0.offerFirst(pair0);
      assertEquals(1, linkedList0.size());
      assertTrue(boolean0);
      assertTrue(long1.equals((Object)long0));
      
      DiscreteDistribution<Long> discreteDistribution0 = new DiscreteDistribution<Long>((List<Pair<Long, Double>>) linkedList0);
      assertEquals(1, linkedList0.size());
      assertNotNull(discreteDistribution0);
      
      int int0 = 197;
      Object[] objectArray0 = discreteDistribution0.sample(int0);
      assertEquals(1, linkedList0.size());
      assertNotNull(objectArray0);
  }

  @Test
  public void test3()  throws Throwable  {
      LinkedList<Pair<Long, Double>> linkedList0 = new LinkedList<Pair<Long, Double>>();
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      assertNotNull(linkedList0);
      
      long long0 = 1L;
      Long long1 = new Long(long0);
      assertEquals(1L, (long)long1);
      assertTrue(long1.equals((Object)long0));
      
      Double double0 = new Double((double) long1);
      assertEquals(1.0, (double)double0, 0.01D);
      assertTrue(long1.equals((Object)long0));
      
      Pair<Long, Double> pair0 = new Pair<Long, Double>(long1, double0);
      assertNotNull(pair0);
      assertTrue(long1.equals((Object)long0));
      
      boolean boolean0 = linkedList0.offerFirst(pair0);
      assertEquals(1, linkedList0.size());
      assertTrue(boolean0);
      assertTrue(long1.equals((Object)long0));
      
      DiscreteDistribution<Long> discreteDistribution0 = new DiscreteDistribution<Long>((List<Pair<Long, Double>>) linkedList0);
      assertEquals(1, linkedList0.size());
      assertNotNull(discreteDistribution0);
      
      List<Pair<Long, Double>> list0 = discreteDistribution0.getSamples();
      assertEquals(1, linkedList0.size());
      assertEquals(false, list0.isEmpty());
      assertEquals(1, list0.size());
      assertNotNull(list0);
  }

  @Test
  public void test4()  throws Throwable  {
      LinkedList<Pair<Long, Double>> linkedList0 = new LinkedList<Pair<Long, Double>>();
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      assertNotNull(linkedList0);
      
      long long0 = 1L;
      Long long1 = new Long(long0);
      assertEquals(1L, (long)long1);
      assertTrue(long1.equals((Object)long0));
      
      Double double0 = new Double((double) long1);
      assertEquals(1.0, (double)double0, 0.01D);
      assertTrue(long1.equals((Object)long0));
      
      Pair<Long, Double> pair0 = new Pair<Long, Double>(long1, double0);
      assertNotNull(pair0);
      assertTrue(long1.equals((Object)long0));
      
      boolean boolean0 = linkedList0.offerFirst(pair0);
      assertEquals(1, linkedList0.size());
      assertTrue(boolean0);
      assertTrue(long1.equals((Object)long0));
      
      DiscreteDistribution<Long> discreteDistribution0 = new DiscreteDistribution<Long>((List<Pair<Long, Double>>) linkedList0);
      assertEquals(1, linkedList0.size());
      assertNotNull(discreteDistribution0);
      
      long long2 = 0L;
      double double1 = discreteDistribution0.probability((Long) long2);
      assertEquals(1, linkedList0.size());
      assertEquals(0.0, double1, 0.01D);
      assertFalse(long2 == long0);
  }

  @Test
  public void test5()  throws Throwable  {
      LinkedList<Pair<String, Double>> linkedList0 = new LinkedList<Pair<String, Double>>();
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      assertNotNull(linkedList0);
      
      String string0 = null;
      double double0 = 791.9;
      Double double1 = new Double(double0);
      assertEquals(791.9, (double)double1, 0.01D);
      assertTrue(double1.equals((Object)double0));
      
      String string1 = "";
      Pair<String, Double> pair0 = new Pair<String, Double>(string1, double1);
      assertNotNull(pair0);
      assertTrue(double1.equals((Object)double0));
      
      boolean boolean0 = linkedList0.add(pair0);
      assertEquals(1, linkedList0.size());
      assertTrue(boolean0);
      assertTrue(double1.equals((Object)double0));
      
      DiscreteDistribution<String> discreteDistribution0 = new DiscreteDistribution<String>((List<Pair<String, Double>>) linkedList0);
      assertEquals(1, linkedList0.size());
      assertNotNull(discreteDistribution0);
      
      double double2 = discreteDistribution0.probability(string0);
      assertEquals(1, linkedList0.size());
      assertEquals(0.0, double2, 0.01D);
      assertFalse(double2 == double0);
  }

  @Test
  public void test6()  throws Throwable  {
      LinkedList<Pair<String, Double>> linkedList0 = new LinkedList<Pair<String, Double>>();
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      assertNotNull(linkedList0);
      
      String string0 = null;
      double double0 = 791.9;
      Double double1 = new Double(double0);
      assertEquals(791.9, (double)double1, 0.01D);
      assertTrue(double1.equals((Object)double0));
      
      Pair<String, Double> pair0 = new Pair<String, Double>(string0, double1);
      assertNotNull(pair0);
      assertTrue(double1.equals((Object)double0));
      
      boolean boolean0 = linkedList0.add(pair0);
      assertEquals(1, linkedList0.size());
      assertTrue(boolean0);
      assertTrue(double1.equals((Object)double0));
      
      DiscreteDistribution<String> discreteDistribution0 = new DiscreteDistribution<String>((List<Pair<String, Double>>) linkedList0);
      assertEquals(1, linkedList0.size());
      assertNotNull(discreteDistribution0);
      
      double double2 = discreteDistribution0.probability(string0);
      assertEquals(1, linkedList0.size());
      assertEquals(1.0, double2, 0.01D);
      assertFalse(double2 == double0);
  }

  @Test
  public void test7()  throws Throwable  {
      LinkedList<Pair<Long, Double>> linkedList0 = new LinkedList<Pair<Long, Double>>();
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      assertNotNull(linkedList0);
      
      long long0 = 14L;
      Long long1 = new Long(long0);
      assertEquals(14L, (long)long1);
      assertTrue(long1.equals((Object)long0));
      
      Double double0 = new Double((double) long1);
      assertEquals(14.0, (double)double0, 0.01D);
      assertTrue(long1.equals((Object)long0));
      
      Pair<Long, Double> pair0 = new Pair<Long, Double>(long1, double0);
      assertNotNull(pair0);
      assertTrue(long1.equals((Object)long0));
      
      boolean boolean0 = linkedList0.offerFirst(pair0);
      assertEquals(1, linkedList0.size());
      assertTrue(boolean0);
      assertTrue(long1.equals((Object)long0));
      
      DiscreteDistribution<Long> discreteDistribution0 = new DiscreteDistribution<Long>((List<Pair<Long, Double>>) linkedList0);
      assertEquals(1, linkedList0.size());
      assertNotNull(discreteDistribution0);
      
      double double1 = discreteDistribution0.probability(long1);
      assertEquals(1, linkedList0.size());
      assertEquals(1.0, double1, 0.01D);
      assertTrue(long1.equals((Object)long0));
  }

  @Test
  public void test8()  throws Throwable  {
      LinkedList<Pair<Integer, Double>> linkedList0 = new LinkedList<Pair<Integer, Double>>();
      assertEquals("[]", linkedList0.toString());
      assertEquals(0, linkedList0.size());
      assertNotNull(linkedList0);
      
      int int0 = (-2715);
      Integer integer0 = new Integer(int0);
      assertEquals((-2715), (int)integer0);
      assertTrue(integer0.equals((Object)int0));
      
      Double double0 = new Double((double) int0);
      assertEquals((-2715.0), (double)double0, 0.01D);
      
      Pair<Integer, Double> pair0 = new Pair<Integer, Double>(integer0, double0);
      assertNotNull(pair0);
      assertTrue(integer0.equals((Object)int0));
      
      boolean boolean0 = linkedList0.add(pair0);
      assertEquals(1, linkedList0.size());
      assertTrue(boolean0);
      assertTrue(integer0.equals((Object)int0));
      
      DiscreteDistribution<Integer> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<Integer>((List<Pair<Integer, Double>>) linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2,715 is smaller than the minimum (0)
         //
      }
  }

  @Test
  public void test9()  throws Throwable  {
      LinkedList<Pair<Long, Double>> linkedList0 = new LinkedList<Pair<Long, Double>>();
      assertEquals(0, linkedList0.size());
      assertEquals("[]", linkedList0.toString());
      assertNotNull(linkedList0);
      
      long long0 = 14L;
      Long long1 = new Long(long0);
      assertEquals(14L, (long)long1);
      assertTrue(long1.equals((Object)long0));
      
      Double double0 = new Double((double) long1);
      assertEquals(14.0, (double)double0, 0.01D);
      assertTrue(long1.equals((Object)long0));
      
      Pair<Long, Double> pair0 = new Pair<Long, Double>(long1, double0);
      assertNotNull(pair0);
      assertTrue(long1.equals((Object)long0));
      
      boolean boolean0 = linkedList0.offerFirst(pair0);
      assertEquals(1, linkedList0.size());
      assertTrue(boolean0);
      assertTrue(long1.equals((Object)long0));
      
      DiscreteDistribution<Long> discreteDistribution0 = new DiscreteDistribution<Long>((List<Pair<Long, Double>>) linkedList0);
      assertEquals(1, linkedList0.size());
      assertNotNull(discreteDistribution0);
      
      discreteDistribution0.reseedRandomGenerator((long) long1);
      assertEquals(1, linkedList0.size());
      assertTrue(long1.equals((Object)long0));
  }
}