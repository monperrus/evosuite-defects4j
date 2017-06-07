/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 15:51:44 GMT 2014
 */

package org.apache.commons.lang3;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.lang3.RandomStringUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class RandomStringUtilsEvoSuite_branch_Test extends RandomStringUtilsEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      int int0 = 0;
      String string0 = "lJc";
      String string1 = RandomStringUtils.random(int0, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(string1);
      assertEquals("", string1);
  }

  @Test
  public void test01()  throws Throwable  {
      boolean boolean0 = true;
      char char0 = '?';
      int int0 = (-1241);
      String string0 = RandomStringUtils.random((int) char0, int0, (int) char0, boolean0, boolean0);
      assertNotNull(string0);
      assertEquals("\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27\uFB27", string0);
  }

  @Test
  public void test02() {}
//   @Test
//   public void test02()  throws Throwable  {
//       int int0 = 1065;
//       boolean boolean0 = true;
//       char char0 = '?';
//       String string0 = RandomStringUtils.random((int) char0, int0, (int) char0, boolean0, boolean0);
//       assertNotNull(string0);
//       assertEquals("\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429\u0429", string0);
//   }

  @Test
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[8];
      char char0 = 'k';
      charArray0[0] = char0;
      charArray0[2] = charArray0[0];
      String string0 = RandomStringUtils.random((int) charArray0[2], charArray0);
      assertArrayEquals(new char[] {'k', '\u0000', 'k', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertNotNull(string0);
      assertEquals("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", string0);
  }

  @Test
  public void test04()  throws Throwable  {
      int int0 = 0;
      boolean boolean0 = true;
      char[] charArray0 = new char[5];
      String string0 = RandomStringUtils.random(int0, int0, int0, boolean0, boolean0, charArray0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test
  public void test05()  throws Throwable  {
      int int0 = 2313;
      String string0 = RandomStringUtils.randomAscii(int0);
      assertNotNull(string0);
      assertEquals("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", string0);
  }

  @Test
  public void test06()  throws Throwable  {
      int int0 = 0;
      String string0 = RandomStringUtils.randomAlphabetic(int0);
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test
  public void test07()  throws Throwable  {
      RandomStringUtils randomStringUtils0 = new RandomStringUtils();
      assertNotNull(randomStringUtils0);
  }

  @Test
  public void test08()  throws Throwable  {
      char char0 = ' ';
      String string0 = RandomStringUtils.random((int) char0);
      assertNotNull(string0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test
  public void test09()  throws Throwable  {
      int int0 = (-4);
      // Undeclared exception!
      try {
        String string0 = RandomStringUtils.randomAlphanumeric(int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requested random string length -4 is less than 0.
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      int int0 = (-559);
      // Undeclared exception!
      try {
        String string0 = RandomStringUtils.randomNumeric(int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requested random string length -559 is less than 0.
         //
      }
  }
}