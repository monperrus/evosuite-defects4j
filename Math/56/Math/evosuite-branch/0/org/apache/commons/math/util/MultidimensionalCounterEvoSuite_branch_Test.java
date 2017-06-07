/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:03:03 GMT 2014
 */

package org.apache.commons.math.util;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.exception.DimensionMismatchException;
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import org.apache.commons.math.exception.OutOfRangeException;
import org.apache.commons.math.util.MultidimensionalCounter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class MultidimensionalCounterEvoSuite_branch_Test extends MultidimensionalCounterEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = 1;
      intArray0[0] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertEquals(1, multidimensionalCounter0.getSize());
      assertNotNull(multidimensionalCounter0);
      assertArrayEquals(new int[] {1}, intArray0);
      
      try {
        int int1 = multidimensionalCounter0.getCount(intArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 1 out of [0, 0] range
         //
      }
  }

  @Test
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[10];
      int int0 = (-1271);
      intArray0[0] = int0;
      int int1 = 1;
      intArray0[1] = int1;
      int int2 = 639;
      intArray0[2] = int2;
      intArray0[3] = int2;
      intArray0[4] = intArray0[3];
      intArray0[5] = intArray0[0];
      intArray0[6] = int0;
      intArray0[7] = intArray0[4];
      intArray0[8] = int0;
      intArray0[9] = intArray0[2];
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertEquals(10, multidimensionalCounter0.getDimension());
      assertEquals(1703589599, multidimensionalCounter0.getSize());
      assertNotNull(multidimensionalCounter0);
      assertArrayEquals(new int[] {(-1271), 1, 639, 639, 639, (-1271), (-1271), 639, (-1271), 639}, intArray0);
      
      try {
        int int3 = multidimensionalCounter0.getCount(intArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // -1,271 out of [0, -1,272] range
         //
      }
  }

  @Test
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[5];
      int int0 = 1768;
      intArray0[0] = int0;
      int int1 = (-4);
      intArray0[1] = int1;
      intArray0[2] = intArray0[0];
      intArray0[3] = intArray0[2];
      intArray0[4] = intArray0[2];
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertEquals(1099677696, multidimensionalCounter0.getSize());
      assertEquals(5, multidimensionalCounter0.getDimension());
      assertNotNull(multidimensionalCounter0);
      assertArrayEquals(new int[] {1768, (-4), 1768, 1768, 1768}, intArray0);
      
      // Undeclared exception!
      try {
        String string0 = multidimensionalCounter0.toString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 1 != 5
         //
      }
  }

  @Test
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = 1;
      intArray0[0] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertEquals(1, multidimensionalCounter0.getSize());
      assertNotNull(multidimensionalCounter0);
      assertArrayEquals(new int[] {1}, intArray0);
      
      String string0 = multidimensionalCounter0.toString();
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertEquals(1, multidimensionalCounter0.getSize());
      assertNotNull(string0);
      assertArrayEquals(new int[] {1}, intArray0);
      assertEquals("[0]", string0);
  }

  @Test
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[5];
      int int0 = (-1754);
      intArray0[0] = int0;
      intArray0[1] = intArray0[0];
      int int1 = 162;
      intArray0[2] = int1;
      intArray0[3] = int0;
      intArray0[4] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertEquals(1508576288, multidimensionalCounter0.getSize());
      assertEquals(5, multidimensionalCounter0.getDimension());
      assertNotNull(multidimensionalCounter0);
      assertArrayEquals(new int[] {(-1754), (-1754), 162, (-1754), (-1754)}, intArray0);
      
      int int2 = 8388607;
      intArray0[4] = int2;
      int[] intArray1 = multidimensionalCounter0.getCounts(intArray0[4]);
      assertEquals(1508576288, multidimensionalCounter0.getSize());
      assertEquals(5, multidimensionalCounter0.getDimension());
      assertNotNull(intArray1);
      assertArrayEquals(new int[] {0, 0, 2, 1227843, (-2139095099)}, intArray1);
      assertArrayEquals(new int[] {(-1754), (-1754), 162, (-1754), 8388607}, intArray0);
      assertNotSame(intArray1, intArray0);
      assertNotSame(intArray0, intArray1);
      assertFalse(intArray1.equals((Object)intArray0));
      assertFalse(intArray0.equals((Object)intArray1));
  }

  @Test
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = 1;
      intArray0[0] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertEquals(1, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertNotNull(multidimensionalCounter0);
      assertArrayEquals(new int[] {1}, intArray0);
      
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
      assertEquals(1, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertNotNull(multidimensionalCounter_Iterator0);
      assertArrayEquals(new int[] {1}, intArray0);
      
      Integer integer0 = multidimensionalCounter_Iterator0.next();
      assertEquals(1, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertArrayEquals(new int[] {1}, intArray0);
      assertFalse(integer0.equals((Object)int0));
      assertEquals(0, (int)integer0);
      
      int[] intArray1 = multidimensionalCounter0.getCounts((int) integer0);
      assertEquals(1, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertNotNull(intArray1);
      assertArrayEquals(new int[] {1}, intArray0);
      assertArrayEquals(new int[] {0}, intArray1);
      assertNotSame(intArray0, intArray1);
      assertNotSame(intArray1, intArray0);
      assertFalse(intArray0.equals((Object)intArray1));
      assertFalse(integer0.equals((Object)int0));
      assertFalse(intArray1.equals((Object)intArray0));
  }

  @Test
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = 1;
      intArray0[0] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertEquals(1, multidimensionalCounter0.getSize());
      assertNotNull(multidimensionalCounter0);
      assertArrayEquals(new int[] {1}, intArray0);
      
      // Undeclared exception!
      try {
        int[] intArray1 = multidimensionalCounter0.getCounts(intArray0[0]);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 1 out of [0, 1] range
         //
      }
  }

  @Test
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[5];
      MultidimensionalCounter multidimensionalCounter0 = null;
      try {
        multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
      }
  }

  @Test
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = 1;
      intArray0[0] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertEquals(1, multidimensionalCounter0.getSize());
      assertNotNull(multidimensionalCounter0);
      assertArrayEquals(new int[] {1}, intArray0);
      
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.new Iterator();
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertEquals(1, multidimensionalCounter0.getSize());
      assertNotNull(multidimensionalCounter_Iterator0);
      assertArrayEquals(new int[] {1}, intArray0);
      
      Integer integer0 = multidimensionalCounter_Iterator0.next();
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertEquals(1, multidimensionalCounter0.getSize());
      assertArrayEquals(new int[] {1}, intArray0);
      assertFalse(integer0.equals((Object)int0));
      assertEquals(0, (int)integer0);
      
      Integer integer1 = multidimensionalCounter_Iterator0.next();
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertEquals(1, multidimensionalCounter0.getSize());
      assertArrayEquals(new int[] {1}, intArray0);
      assertNotSame(integer1, integer0);
      assertFalse(integer1.equals((Object)integer0));
      assertEquals(1, (int)integer1);
  }

  @Test
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = 71;
      intArray0[0] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertEquals(71, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertNotNull(multidimensionalCounter0);
      assertArrayEquals(new int[] {71}, intArray0);
      
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.new Iterator();
      assertEquals(71, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertNotNull(multidimensionalCounter_Iterator0);
      assertArrayEquals(new int[] {71}, intArray0);
      
      boolean boolean0 = multidimensionalCounter_Iterator0.hasNext();
      assertEquals(71, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertArrayEquals(new int[] {71}, intArray0);
      assertTrue(boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = 1;
      intArray0[0] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertEquals(1, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertNotNull(multidimensionalCounter0);
      assertArrayEquals(new int[] {1}, intArray0);
      
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.new Iterator();
      assertEquals(1, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertNotNull(multidimensionalCounter_Iterator0);
      assertArrayEquals(new int[] {1}, intArray0);
      
      Integer integer0 = multidimensionalCounter_Iterator0.next();
      assertEquals(1, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertArrayEquals(new int[] {1}, intArray0);
      assertFalse(integer0.equals((Object)int0));
      assertEquals(0, (int)integer0);
      
      boolean boolean0 = multidimensionalCounter_Iterator0.hasNext();
      assertEquals(1, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertArrayEquals(new int[] {1}, intArray0);
      assertFalse(boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[5];
      int int0 = (-1754);
      intArray0[0] = int0;
      intArray0[1] = intArray0[0];
      int int1 = 162;
      intArray0[2] = int1;
      intArray0[3] = int0;
      intArray0[4] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertEquals(1508576288, multidimensionalCounter0.getSize());
      assertEquals(5, multidimensionalCounter0.getDimension());
      assertNotNull(multidimensionalCounter0);
      assertArrayEquals(new int[] {(-1754), (-1754), 162, (-1754), (-1754)}, intArray0);
      
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
      assertEquals(1508576288, multidimensionalCounter0.getSize());
      assertEquals(5, multidimensionalCounter0.getDimension());
      assertNotNull(multidimensionalCounter_Iterator0);
      assertArrayEquals(new int[] {(-1754), (-1754), 162, (-1754), (-1754)}, intArray0);
      
      int int2 = multidimensionalCounter_Iterator0.getCount();
      assertEquals(1508576288, multidimensionalCounter0.getSize());
      assertEquals(5, multidimensionalCounter0.getDimension());
      assertArrayEquals(new int[] {(-1754), (-1754), 162, (-1754), (-1754)}, intArray0);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertEquals((-1), int2);
  }

  @Test
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[5];
      int int0 = (-1754);
      intArray0[0] = int0;
      intArray0[1] = intArray0[0];
      int int1 = 162;
      intArray0[2] = int1;
      intArray0[3] = int0;
      intArray0[4] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertEquals(5, multidimensionalCounter0.getDimension());
      assertEquals(1508576288, multidimensionalCounter0.getSize());
      assertNotNull(multidimensionalCounter0);
      assertArrayEquals(new int[] {(-1754), (-1754), 162, (-1754), (-1754)}, intArray0);
      
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
      assertEquals(5, multidimensionalCounter0.getDimension());
      assertEquals(1508576288, multidimensionalCounter0.getSize());
      assertNotNull(multidimensionalCounter_Iterator0);
      assertArrayEquals(new int[] {(-1754), (-1754), 162, (-1754), (-1754)}, intArray0);
      
      int[] intArray1 = multidimensionalCounter_Iterator0.getCounts();
      assertEquals(5, multidimensionalCounter0.getDimension());
      assertEquals(1508576288, multidimensionalCounter0.getSize());
      assertNotNull(intArray1);
      assertArrayEquals(new int[] {(-1754), (-1754), 162, (-1754), (-1754)}, intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, (-1)}, intArray1);
      assertNotSame(intArray0, intArray1);
      assertNotSame(intArray1, intArray0);
      assertFalse(intArray0.equals((Object)intArray1));
      assertFalse(intArray1.equals((Object)intArray0));
  }

  @Test
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = 71;
      intArray0[0] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertEquals(71, multidimensionalCounter0.getSize());
      assertNotNull(multidimensionalCounter0);
      assertArrayEquals(new int[] {71}, intArray0);
      
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.new Iterator();
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertEquals(71, multidimensionalCounter0.getSize());
      assertNotNull(multidimensionalCounter_Iterator0);
      assertArrayEquals(new int[] {71}, intArray0);
      
      // Undeclared exception!
      try {
        multidimensionalCounter_Iterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = 1;
      intArray0[0] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertEquals(1, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertNotNull(multidimensionalCounter0);
      assertArrayEquals(new int[] {1}, intArray0);
      
      MultidimensionalCounter.Iterator multidimensionalCounter_Iterator0 = multidimensionalCounter0.iterator();
      assertEquals(1, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertNotNull(multidimensionalCounter_Iterator0);
      assertArrayEquals(new int[] {1}, intArray0);
      
      // Undeclared exception!
      try {
        int int1 = multidimensionalCounter_Iterator0.getCount(int0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
      }
  }

  @Test
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = 1;
      intArray0[0] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertEquals(1, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertNotNull(multidimensionalCounter0);
      assertArrayEquals(new int[] {1}, intArray0);
      
      int[] intArray1 = multidimensionalCounter0.getSizes();
      assertEquals(1, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertNotNull(intArray1);
      assertArrayEquals(new int[] {1}, intArray0);
      assertArrayEquals(new int[] {1}, intArray1);
      assertNotSame(intArray0, intArray1);
      assertNotSame(intArray1, intArray0);
      assertFalse(intArray0.equals((Object)intArray1));
      assertFalse(intArray1.equals((Object)intArray0));
  }

  @Test
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = 1;
      intArray0[0] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertEquals(1, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertNotNull(multidimensionalCounter0);
      assertArrayEquals(new int[] {1}, intArray0);
      
      int int1 = multidimensionalCounter0.getDimension();
      assertEquals(1, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertArrayEquals(new int[] {1}, intArray0);
      assertTrue(int1 == int0);
      assertEquals(1, int1);
  }

  @Test
  public void test17()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = 1;
      intArray0[0] = int0;
      MultidimensionalCounter multidimensionalCounter0 = new MultidimensionalCounter(intArray0);
      assertEquals(1, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertNotNull(multidimensionalCounter0);
      assertArrayEquals(new int[] {1}, intArray0);
      
      int int1 = multidimensionalCounter0.getSize();
      assertEquals(1, multidimensionalCounter0.getSize());
      assertEquals(1, multidimensionalCounter0.getDimension());
      assertArrayEquals(new int[] {1}, intArray0);
      assertTrue(int1 == int0);
      assertEquals(1, int1);
  }
}