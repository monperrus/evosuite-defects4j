/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:38:03 GMT 2014
 */

package org.apache.commons.math.ode.events;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.events.EventState;
import org.apache.commons.math.ode.sampling.DummyStepInterpolator;
import org.apache.commons.math.ode.sampling.NordsieckStepInterpolator;
import org.apache.commons.math.ode.sampling.StepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class EventStateEvoSuite_branch_Test extends EventStateEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      EventHandler eventHandler0 = null;
      double double0 = (-2363.374741031649);
      int int0 = (-28);
      EventState eventState0 = new EventState(eventHandler0, double0, double0, int0);
      assertNotNull(eventState0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(-28, eventState0.getMaxIterationCount());
      assertEquals(2363.374741031649, eventState0.getConvergence(), 0.01D);
      assertEquals(false, eventState0.stop());
      assertEquals((-2363.374741031649), eventState0.getMaxCheckInterval(), 0.01D);
      
      double[] doubleArray0 = new double[8];
      boolean boolean0 = eventState0.reset((double) int0, doubleArray0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(-28, eventState0.getMaxIterationCount());
      assertEquals(2363.374741031649, eventState0.getConvergence(), 0.01D);
      assertEquals(false, eventState0.stop());
      assertEquals((-2363.374741031649), eventState0.getMaxCheckInterval(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      EventHandler eventHandler0 = null;
      double double0 = (-2.441565956566224);
      int int0 = 698;
      EventState eventState0 = new EventState(eventHandler0, double0, double0, int0);
      assertNotNull(eventState0);
      assertEquals(2.441565956566224, eventState0.getConvergence(), 0.01D);
      assertEquals((-2.441565956566224), eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(false, eventState0.stop());
      assertEquals(698, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      
      boolean boolean0 = eventState0.stop();
      assertEquals(2.441565956566224, eventState0.getConvergence(), 0.01D);
      assertEquals((-2.441565956566224), eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(false, eventState0.stop());
      assertEquals(698, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertFalse(boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      EventHandler eventHandler0 = null;
      double double0 = (-2133.4219018913172);
      int int0 = 462;
      EventState eventState0 = new EventState(eventHandler0, double0, double0, int0);
      assertNotNull(eventState0);
      assertEquals((-2133.4219018913172), eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(false, eventState0.stop());
      assertEquals(462, eventState0.getMaxIterationCount());
      assertEquals(2133.4219018913172, eventState0.getConvergence(), 0.01D);
      
      NordsieckStepInterpolator nordsieckStepInterpolator0 = new NordsieckStepInterpolator();
      assertNotNull(nordsieckStepInterpolator0);
      assertEquals(Double.NaN, nordsieckStepInterpolator0.getInterpolatedTime(), 0.01D);
      assertEquals(Double.NaN, nordsieckStepInterpolator0.getPreviousTime(), 0.01D);
      assertEquals(Double.NaN, nordsieckStepInterpolator0.getCurrentTime(), 0.01D);
      assertEquals(true, nordsieckStepInterpolator0.isForward());
      
      // Undeclared exception!
      try {
        boolean boolean0 = eventState0.evaluateStep((StepInterpolator) nordsieckStepInterpolator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      double double0 = 15.114653346383314;
      int int0 = 1381;
      double[] doubleArray0 = new double[7];
      boolean boolean0 = false;
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, boolean0);
      assertNotNull(dummyStepInterpolator0);
      assertEquals(Double.NaN, dummyStepInterpolator0.getCurrentTime(), 0.01D);
      assertEquals(false, dummyStepInterpolator0.isForward());
      assertEquals(Double.NaN, dummyStepInterpolator0.getInterpolatedTime(), 0.01D);
      assertEquals(Double.NaN, dummyStepInterpolator0.getPreviousTime(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      EventHandler eventHandler0 = null;
      EventState eventState0 = new EventState(eventHandler0, (double) int0, double0, int0);
      assertNotNull(eventState0);
      assertEquals(1381.0, eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(1381, eventState0.getMaxIterationCount());
      assertEquals(15.114653346383314, eventState0.getConvergence(), 0.01D);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(false, eventState0.stop());
      
      // Undeclared exception!
      try {
        boolean boolean1 = eventState0.evaluateStep((StepInterpolator) dummyStepInterpolator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      EventHandler eventHandler0 = null;
      double double0 = (-2133.4219018913172);
      int int0 = 462;
      EventState eventState0 = new EventState(eventHandler0, double0, double0, int0);
      assertNotNull(eventState0);
      assertEquals((-2133.4219018913172), eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(false, eventState0.stop());
      assertEquals(2133.4219018913172, eventState0.getConvergence(), 0.01D);
      assertEquals(462, eventState0.getMaxIterationCount());
      
      double double1 = eventState0.getConvergence();
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertEquals((-2133.4219018913172), eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(false, eventState0.stop());
      assertEquals(2133.4219018913172, eventState0.getConvergence(), 0.01D);
      assertEquals(462, eventState0.getMaxIterationCount());
      assertEquals(2133.4219018913172, double1, 0.01D);
  }

  @Test
  public void test5()  throws Throwable  {
      EventHandler eventHandler0 = null;
      double double0 = 51.6950499;
      int int0 = (-1809);
      EventState eventState0 = new EventState(eventHandler0, double0, double0, int0);
      assertNotNull(eventState0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(-1809, eventState0.getMaxIterationCount());
      assertEquals(false, eventState0.stop());
      assertEquals(51.6950499, eventState0.getConvergence(), 0.01D);
      assertEquals(51.6950499, eventState0.getMaxCheckInterval(), 0.01D);
      
      double double1 = eventState0.getMaxCheckInterval();
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(-1809, eventState0.getMaxIterationCount());
      assertEquals(false, eventState0.stop());
      assertEquals(51.6950499, eventState0.getConvergence(), 0.01D);
      assertEquals(51.6950499, eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(51.6950499, double1, 0.01D);
  }

  @Test
  public void test6()  throws Throwable  {
      EventHandler eventHandler0 = null;
      double double0 = (-2.441565956566224);
      int int0 = 698;
      EventState eventState0 = new EventState(eventHandler0, double0, double0, int0);
      assertNotNull(eventState0);
      assertEquals(698, eventState0.getMaxIterationCount());
      assertEquals(2.441565956566224, eventState0.getConvergence(), 0.01D);
      assertEquals(false, eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals((-2.441565956566224), eventState0.getMaxCheckInterval(), 0.01D);
      
      int int1 = eventState0.getMaxIterationCount();
      assertTrue(int0 == int1);
      assertTrue(int1 == int0);
      assertEquals(698, eventState0.getMaxIterationCount());
      assertEquals(2.441565956566224, eventState0.getConvergence(), 0.01D);
      assertEquals(false, eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals((-2.441565956566224), eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(698, int1);
  }

  @Test
  public void test7()  throws Throwable  {
      EventHandler eventHandler0 = null;
      double double0 = (-2.441565956566224);
      int int0 = 698;
      EventState eventState0 = new EventState(eventHandler0, double0, double0, int0);
      assertNotNull(eventState0);
      assertEquals(false, eventState0.stop());
      assertEquals(2.441565956566224, eventState0.getConvergence(), 0.01D);
      assertEquals(698, eventState0.getMaxIterationCount());
      assertEquals((-2.441565956566224), eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      
      double double1 = eventState0.getEventTime();
      assertFalse(double0 == double1);
      assertFalse(double1 == double0);
      assertEquals(false, eventState0.stop());
      assertEquals(2.441565956566224, eventState0.getConvergence(), 0.01D);
      assertEquals(698, eventState0.getMaxIterationCount());
      assertEquals((-2.441565956566224), eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(Double.NaN, double1, 0.01D);
  }

  @Test
  public void test8()  throws Throwable  {
      EventHandler eventHandler0 = null;
      double double0 = (-2363.374741031649);
      int int0 = (-28);
      EventState eventState0 = new EventState(eventHandler0, double0, double0, int0);
      assertNotNull(eventState0);
      assertEquals(-28, eventState0.getMaxIterationCount());
      assertEquals((-2363.374741031649), eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(2363.374741031649, eventState0.getConvergence(), 0.01D);
      assertEquals(false, eventState0.stop());
      
      EventHandler eventHandler1 = eventState0.getEventHandler();
      assertNull(eventHandler1);
      assertEquals(-28, eventState0.getMaxIterationCount());
      assertEquals((-2363.374741031649), eventState0.getMaxCheckInterval(), 0.01D);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01D);
      assertEquals(2363.374741031649, eventState0.getConvergence(), 0.01D);
      assertEquals(false, eventState0.stop());
  }
}