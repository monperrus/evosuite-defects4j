/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 16:08:23 GMT 2014
 */

package org.jfree.data;

import static org.junit.Assert.*;
import org.junit.Test;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.jfree.data.KeyedObjects;
import org.jfree.data.KeyedObjects2D;
import org.jfree.data.UnknownKeyException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class KeyedObjects2DEvoSuite_branch_Test extends KeyedObjects2DEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = (-22);
      String string0 = Integer.toOctalString(int0);
      assertEquals("37777777752", string0);
      assertNotNull(string0);
      
      keyedObjects2D0.setObject((Object) keyedObjects2D0, (Comparable) string0, (Comparable) string0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      
      KeyedObjects2D keyedObjects2D1 = (KeyedObjects2D)keyedObjects2D0.clone();
      assertEquals(1, keyedObjects2D1.getRowCount());
      assertEquals(1, keyedObjects2D1.getColumnCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertTrue(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertNotNull(keyedObjects2D1);
      
      keyedObjects2D0.setObject((Object) string0, (Comparable) string0, (Comparable) string0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      
      boolean boolean0 = keyedObjects2D0.equals((Object) keyedObjects2D1);
      assertEquals(1, keyedObjects2D1.getRowCount());
      assertEquals(1, keyedObjects2D1.getColumnCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertFalse(boolean0);
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
  }

  @Test
  public void test01()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = 0;
      Object object0 = new Object();
      assertNotNull(object0);
      
      keyedObjects2D0.addObject(object0, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      
      Comparable comparable0 = keyedObjects2D0.getRowKey(int0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(0, comparable0);
      assertNotNull(comparable0);
      
      keyedObjects2D0.removeRow(comparable0);
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      
      KeyedObjects2D keyedObjects2D1 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertNotNull(keyedObjects2D1);
      
      boolean boolean0 = keyedObjects2D0.equals((Object) keyedObjects2D1);
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertFalse(boolean0);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
  }

  @Test
  public void test02()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = (-22);
      keyedObjects2D0.setObject((Object) keyedObjects2D0, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      
      KeyedObjects2D keyedObjects2D1 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertNotNull(keyedObjects2D1);
      
      boolean boolean0 = keyedObjects2D0.equals((Object) keyedObjects2D1);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D1.getRowCount());
      assertEquals(0, keyedObjects2D1.getColumnCount());
      assertFalse(boolean0);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertFalse(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
  }

  @Test
  public void test03()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      String string0 = ".\"%SZ]K9";
      boolean boolean0 = keyedObjects2D0.equals((Object) string0);
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertFalse(boolean0);
  }

  @Test
  public void test04()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = keyedObjects2D0.hashCode();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(871, int0);
      
      int int1 = (-540);
      assertFalse(int1 == int0);
      
      keyedObjects2D0.setObject((Object) keyedObjects2D0, (Comparable) int1, (Comparable) int1);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertFalse(int1 == int0);
      
      keyedObjects2D0.addObject((Object) keyedObjects2D0, (Comparable) int0, (Comparable) int0);
      assertEquals(2, keyedObjects2D0.getColumnCount());
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertFalse(int0 == int1);
      
      keyedObjects2D0.removeColumn((Comparable) int1);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertFalse(int1 == int0);
  }

  @Test
  public void test05()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = keyedObjects2D0.getColumnCount();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, int0);
      
      // Undeclared exception!
      try {
        keyedObjects2D0.removeRow((Comparable) int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Row key (0) not recognised.
         //
      }
  }

  @Test
  public void test06()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = keyedObjects2D0.hashCode();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(871, int0);
      
      int int1 = (-540);
      assertFalse(int1 == int0);
      
      keyedObjects2D0.setObject((Object) keyedObjects2D0, (Comparable) int1, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      
      keyedObjects2D0.removeObject((Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertFalse(int0 == int1);
  }

  @Test
  public void test07()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = (-167);
      keyedObjects2D0.setObject((Object) keyedObjects2D0, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      
      int int1 = 971;
      keyedObjects2D0.removeObject((Comparable) int1, (Comparable) int1);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertFalse(int1 == int0);
  }

  @Test
  public void test08()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = keyedObjects2D0.hashCode();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(871, int0);
      
      int int1 = (-540);
      assertFalse(int1 == int0);
      
      keyedObjects2D0.setObject((Object) keyedObjects2D0, (Comparable) int1, (Comparable) int1);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertFalse(int1 == int0);
      
      keyedObjects2D0.removeObject((Comparable) int1, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
  }

  @Test
  public void test09()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = 12;
      Comparable<Object> comparable0 = null;
      // Undeclared exception!
      try {
        keyedObjects2D0.removeObject((Comparable) int0, (Comparable) comparable0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'columnKey' argument.
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      Comparable<Object> comparable0 = null;
      // Undeclared exception!
      try {
        keyedObjects2D0.removeObject(comparable0, comparable0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'rowKey' argument.
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = (-22);
      keyedObjects2D0.setObject((Object) keyedObjects2D0, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      
      String string0 = Integer.toOctalString(int0);
      assertEquals("37777777752", string0);
      assertNotNull(string0);
      
      keyedObjects2D0.setObject((Object) keyedObjects2D0, (Comparable) string0, (Comparable) string0);
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertEquals(2, keyedObjects2D0.getColumnCount());
      
      Object object0 = keyedObjects2D0.getObject((Comparable) string0, (Comparable) int0);
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertEquals(2, keyedObjects2D0.getColumnCount());
      assertNull(object0);
  }

  @Test
  public void test12()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      KeyedObjects keyedObjects0 = new KeyedObjects();
      assertEquals(0, keyedObjects0.getItemCount());
      assertNotNull(keyedObjects0);
      
      String string0 = "*(_S~5<?V";
      int int0 = (-1);
      Integer integer0 = Integer.getInteger(string0, int0);
      assertEquals((-1), (int)integer0);
      
      keyedObjects2D0.addObject((Object) keyedObjects0, (Comparable) integer0, (Comparable) string0);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects0.getItemCount());
      
      int int1 = 0;
      Comparable comparable0 = keyedObjects2D0.getRowKey(int1);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals((-1), comparable0);
      assertFalse(int1 == int0);
      assertNotNull(comparable0);
      
      // Undeclared exception!
      try {
        Object object0 = keyedObjects2D0.getObject((Comparable) comparable0, (Comparable) int1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Column key (0) not recognised.
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = (-167);
      keyedObjects2D0.setObject((Object) keyedObjects2D0, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      
      KeyedObjects2D keyedObjects2D1 = (KeyedObjects2D)keyedObjects2D0.getObject((Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D1.getRowCount());
      assertEquals(1, keyedObjects2D1.getColumnCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertSame(keyedObjects2D1, keyedObjects2D0);
      assertSame(keyedObjects2D0, keyedObjects2D1);
      assertNotNull(keyedObjects2D1);
  }

  @Test
  public void test14()  throws Throwable  {
      Comparable<KeyedObjects> comparable0 = null;
      int int0 = 193;
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      // Undeclared exception!
      try {
        Object object0 = keyedObjects2D0.getObject((Comparable) int0, (Comparable) comparable0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'columnKey' argument.
         //
      }
  }

  @Test
  public void test15()  throws Throwable  {
      Comparable<String> comparable0 = null;
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      // Undeclared exception!
      try {
        Object object0 = keyedObjects2D0.getObject(comparable0, comparable0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'rowKey' argument.
         //
      }
  }

  @Test
  public void test16()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = (-167);
      // Undeclared exception!
      try {
        Object object0 = keyedObjects2D0.getObject((Comparable) int0, (Comparable) int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Row key (-167) not recognised.
         //
      }
  }

  @Test
  public void test17()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = (-22);
      keyedObjects2D0.setObject((Object) keyedObjects2D0, (Comparable) int0, (Comparable) int0);
      assertEquals(1, keyedObjects2D0.getRowCount());
      assertEquals(1, keyedObjects2D0.getColumnCount());
      
      String string0 = Integer.toOctalString(int0);
      assertEquals("37777777752", string0);
      assertNotNull(string0);
      
      keyedObjects2D0.setObject((Object) keyedObjects2D0, (Comparable) string0, (Comparable) string0);
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertEquals(2, keyedObjects2D0.getColumnCount());
      
      KeyedObjects2D keyedObjects2D1 = (KeyedObjects2D)keyedObjects2D0.clone();
      assertEquals(2, keyedObjects2D1.getColumnCount());
      assertEquals(2, keyedObjects2D1.getRowCount());
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertEquals(2, keyedObjects2D0.getColumnCount());
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertTrue(keyedObjects2D0.equals((Object)keyedObjects2D1));
      assertNotNull(keyedObjects2D1);
      
      boolean boolean0 = keyedObjects2D0.equals((Object) keyedObjects2D1);
      assertEquals(2, keyedObjects2D1.getColumnCount());
      assertEquals(2, keyedObjects2D1.getRowCount());
      assertEquals(2, keyedObjects2D0.getRowCount());
      assertEquals(2, keyedObjects2D0.getColumnCount());
      assertTrue(boolean0);
      assertNotSame(keyedObjects2D1, keyedObjects2D0);
      assertNotSame(keyedObjects2D0, keyedObjects2D1);
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertTrue(keyedObjects2D0.equals((Object)keyedObjects2D1));
  }

  @Test
  public void test18()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = (-1041);
      String string0 = Integer.toString(int0, int0);
      assertEquals("-1041", string0);
      assertNotNull(string0);
      
      // Undeclared exception!
      try {
        keyedObjects2D0.removeColumn((Comparable) string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Column key (-1041) not recognised.
         //
      }
  }

  @Test
  public void test19()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      assertEquals(0, keyedObjects2D0.getColumnCount());
      assertEquals(0, keyedObjects2D0.getRowCount());
      assertNotNull(keyedObjects2D0);
      
      int int0 = (-167);
      // Undeclared exception!
      try {
        keyedObjects2D0.removeColumn(int0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}