/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 15:27:48 GMT 2014
 */

package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URI;
import java.nio.charset.Charset;
import org.apache.commons.lang3.text.translate.AggregateTranslator;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.NumericEntityEscaper;
import org.apache.commons.lang3.text.translate.OctalUnescaper;
import org.apache.commons.lang3.text.translate.UnicodeEscaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class CharSequenceTranslatorEvoSuite_branch_Test extends CharSequenceTranslatorEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      assertNotNull(charset0);
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.name());
      
      String string0 = charset0.toString();
      assertNotNull(string0);
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", string0);
      
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      assertNotNull(numericEntityEscaper0);
      
      String string1 = numericEntityEscaper0.translate((CharSequence) string0);
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.name());
      assertEquals("&#85;&#84;&#70;&#45;&#56;", string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
  }

  @Test
  public void test1()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[5];
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      assertNotNull(aggregateTranslator0);
      
      String string0 = null;
      URI uRI0 = new URI(string0, string0, string0, string0, string0);
      assertNotNull(uRI0);
      assertNull(uRI0.getRawFragment());
      assertEquals(false, uRI0.isAbsolute());
      assertNull(uRI0.getScheme());
      assertEquals("", uRI0.getRawPath());
      assertNull(uRI0.getRawQuery());
      assertEquals("", uRI0.toString());
      assertEquals(-1, uRI0.getPort());
      assertNull(uRI0.getRawUserInfo());
      assertNull(uRI0.getHost());
      assertEquals(false, uRI0.isOpaque());
      assertNull(uRI0.getRawAuthority());
      
      String string1 = uRI0.getFragment();
      assertNull(string1);
      assertNull(uRI0.getRawFragment());
      assertEquals(false, uRI0.isAbsolute());
      assertNull(uRI0.getScheme());
      assertEquals("", uRI0.getRawPath());
      assertNull(uRI0.getRawQuery());
      assertEquals("", uRI0.toString());
      assertEquals(-1, uRI0.getPort());
      assertNull(uRI0.getRawUserInfo());
      assertNull(uRI0.getHost());
      assertEquals(false, uRI0.isOpaque());
      assertNull(uRI0.getRawAuthority());
      
      StringWriter stringWriter0 = new StringWriter();
      assertNotNull(stringWriter0);
      assertEquals("", stringWriter0.toString());
      
      aggregateTranslator0.translate((CharSequence) string1, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
      assertNull(uRI0.getRawFragment());
      assertEquals(false, uRI0.isAbsolute());
      assertNull(uRI0.getScheme());
      assertEquals("", uRI0.getRawPath());
      assertNull(uRI0.getRawQuery());
      assertEquals("", uRI0.toString());
      assertEquals(-1, uRI0.getPort());
      assertNull(uRI0.getRawUserInfo());
      assertNull(uRI0.getHost());
      assertEquals(false, uRI0.isOpaque());
      assertNull(uRI0.getRawAuthority());
  }

  @Test
  public void test2()  throws Throwable  {
      int int0 = (-1);
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(int0);
      assertNotNull(unicodeEscaper0);
      
      CharSequence charSequence0 = null;
      Writer writer0 = null;
      // Undeclared exception!
      try {
        unicodeEscaper0.translate(charSequence0, writer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      assertNotNull(octalUnescaper0);
      
      String string0 = null;
      String string1 = octalUnescaper0.translate((CharSequence) string0);
      assertNull(string1);
  }

  @Test
  public void test4()  throws Throwable  {
      int int0 = 0;
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between(int0, int0);
      assertNotNull(unicodeEscaper0);
      
      Charset charset0 = Charset.defaultCharset();
      assertNotNull(charset0);
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.displayName());
      
      String string0 = charset0.toString();
      assertNotNull(string0);
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", string0);
      
      String string1 = unicodeEscaper0.translate((CharSequence) string0);
      assertNotNull(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", string1);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
  }

  @Test
  public void test5()  throws Throwable  {
      int int0 = 0;
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[5];
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.outsideOf(int0, int0);
      assertNotNull(numericEntityEscaper0);
      
      AggregateTranslator aggregateTranslator0 = (AggregateTranslator)numericEntityEscaper0.with(charSequenceTranslatorArray0);
      assertNotNull(aggregateTranslator0);
  }

  @Test
  public void test6()  throws Throwable  {
      int int0 = 0;
      String string0 = CharSequenceTranslator.hex(int0);
      assertNotNull(string0);
      assertEquals("0", string0);
  }
}