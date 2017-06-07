/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:43:10 GMT 2014
 */

package org.apache.commons.math.complex;

import static org.junit.Assert.*;
import org.junit.Test;
import java.math.RoundingMode;
import java.text.AttributedCharacterIterator;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import org.apache.commons.math.complex.Complex;
import org.apache.commons.math.complex.ComplexFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class ComplexFormatEvoSuite_branch_Test extends ComplexFormatEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      NumberFormat numberFormat0 = null;
      Locale locale0 = Locale.ITALIAN;
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.toString());
      assertNotNull(locale0);
      
      DecimalFormat decimalFormat0 = (DecimalFormat)NumberFormat.getIntegerInstance(locale0);
      assertEquals("", decimalFormat0.getPositivePrefix());
      assertEquals(true, decimalFormat0.isParseIntegerOnly());
      assertEquals(false, decimalFormat0.isDecimalSeparatorAlwaysShown());
      assertEquals(1, decimalFormat0.getMultiplier());
      assertEquals(3, decimalFormat0.getGroupingSize());
      assertEquals("", decimalFormat0.getPositiveSuffix());
      assertEquals("#.##0", decimalFormat0.toLocalizedPattern());
      assertEquals(RoundingMode.HALF_EVEN, decimalFormat0.getRoundingMode());
      assertEquals(0, decimalFormat0.getMinimumFractionDigits());
      assertEquals("", decimalFormat0.getNegativeSuffix());
      assertEquals(true, decimalFormat0.isGroupingUsed());
      assertEquals(0, decimalFormat0.getMaximumFractionDigits());
      assertEquals(2147483647, decimalFormat0.getMaximumIntegerDigits());
      assertEquals(1, decimalFormat0.getMinimumIntegerDigits());
      assertEquals("#,##0", decimalFormat0.toPattern());
      assertEquals(false, decimalFormat0.isParseBigDecimal());
      assertEquals("-", decimalFormat0.getNegativePrefix());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.toString());
      assertNotNull(decimalFormat0);
      
      ComplexFormat complexFormat0 = null;
      try {
        complexFormat0 = new ComplexFormat(numberFormat0, (NumberFormat) decimalFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // realFormat can not be null.
         //
      }
  }

  @Test
  public void test01()  throws Throwable  {
      NumberFormat numberFormat0 = null;
      ComplexFormat complexFormat0 = null;
      try {
        complexFormat0 = new ComplexFormat(numberFormat0, numberFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // imaginaryFormat can not be null.
         //
      }
  }

  @Test
  public void test02()  throws Throwable  {
      String string0 = "";
      ComplexFormat complexFormat0 = null;
      try {
        complexFormat0 = new ComplexFormat(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // imaginaryCharacter must be a non-empty string.
         //
      }
  }

  @Test
  public void test03()  throws Throwable  {
      String string0 = null;
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      assertEquals("TW", locale0.getCountry());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.getLanguage());
      assertNotNull(locale0);
      
      DecimalFormat decimalFormat0 = (DecimalFormat)NumberFormat.getIntegerInstance(locale0);
      assertEquals(true, decimalFormat0.isParseIntegerOnly());
      assertEquals("", decimalFormat0.getPositiveSuffix());
      assertEquals(0, decimalFormat0.getMinimumFractionDigits());
      assertEquals(3, decimalFormat0.getGroupingSize());
      assertEquals("#,##0", decimalFormat0.toPattern());
      assertEquals(false, decimalFormat0.isParseBigDecimal());
      assertEquals(0, decimalFormat0.getMaximumFractionDigits());
      assertEquals("", decimalFormat0.getPositivePrefix());
      assertEquals(1, decimalFormat0.getMinimumIntegerDigits());
      assertEquals(1, decimalFormat0.getMultiplier());
      assertEquals(2147483647, decimalFormat0.getMaximumIntegerDigits());
      assertEquals("-", decimalFormat0.getNegativePrefix());
      assertEquals(true, decimalFormat0.isGroupingUsed());
      assertEquals(false, decimalFormat0.isDecimalSeparatorAlwaysShown());
      assertEquals(RoundingMode.HALF_EVEN, decimalFormat0.getRoundingMode());
      assertEquals("#,##0", decimalFormat0.toLocalizedPattern());
      assertEquals("", decimalFormat0.getNegativeSuffix());
      assertEquals("TW", locale0.getCountry());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.getLanguage());
      assertNotNull(decimalFormat0);
      
      ComplexFormat complexFormat0 = null;
      try {
        complexFormat0 = new ComplexFormat(string0, (NumberFormat) decimalFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // imaginaryCharacter must be a non-empty string.
         //
      }
  }

  @Test
  public void test04()  throws Throwable  {
      String string0 = "7b>:9HiJWJV";
      ComplexFormat complexFormat0 = new ComplexFormat(string0);
      assertEquals("7b>:9HiJWJV", complexFormat0.getImaginaryCharacter());
      assertNotNull(complexFormat0);
      
      try {
        Object object0 = complexFormat0.parseObject(string0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Format.parseObject(String) failed
         //
      }
  }

  @Test
  public void test05()  throws Throwable  {
      String string0 = "0-`[GDnEy[Mf{i`^X,#E";
      ComplexFormat complexFormat0 = new ComplexFormat(string0);
      assertEquals("0-`[GDnEy[Mf{i`^X,#E", complexFormat0.getImaginaryCharacter());
      assertNotNull(complexFormat0);
      
      try {
        Object object0 = complexFormat0.parseObject(string0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Format.parseObject(String) failed
         //
      }
  }

  @Test
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      assertEquals("zh", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertNotNull(locale0);
      
      ComplexFormat complexFormat0 = ComplexFormat.getInstance(locale0);
      assertEquals("zh", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("i", complexFormat0.getImaginaryCharacter());
      assertNotNull(complexFormat0);
      
      String string0 = " ";
      try {
        Complex complex0 = complexFormat0.parse(string0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable complex number: \" \"
         //
      }
  }

  @Test
  public void test07()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      //  // Unstable assertion: assertEquals(false, complex0.isInfinite());
      //  // Unstable assertion: assertEquals(0.0, complex0.getReal(), 0.01D);
      //  // Unstable assertion: assertEquals(1247.768964479, complex0.getImaginary(), 0.01D);
      //  // Unstable assertion: assertEquals(1247.768964479, complex0.abs(), 0.01D);
      //  // Unstable assertion: assertEquals(false, complex0.isNaN());
      //  // Unstable assertion: assertNotNull(complex0);
      
      ComplexFormat complexFormat0 = ComplexFormat.getInstance();
      //  // Unstable assertion: assertEquals("i", complexFormat0.getImaginaryCharacter());
      //  // Unstable assertion: assertNotNull(complexFormat0);
      
      String string0 = ComplexFormat.formatComplex(complex0);
      //  // Unstable assertion: assertEquals(false, complex0.isInfinite());
      //  // Unstable assertion: assertEquals(0.0, complex0.getReal(), 0.01D);
      //  // Unstable assertion: assertEquals(1247.768964479, complex0.getImaginary(), 0.01D);
      //  // Unstable assertion: assertEquals(1247.768964479, complex0.abs(), 0.01D);
      //  // Unstable assertion: assertEquals(false, complex0.isNaN());
      //  // Unstable assertion: assertNotNull(string0);
      //  // Unstable assertion: assertEquals("0 + 1,247.77i", string0);
      
      complexFormat0.setImaginaryCharacter(string0);
      //  // Unstable assertion: assertEquals("0 + 1,247.77i", complexFormat0.getImaginaryCharacter());
      //  // Unstable assertion: assertEquals(false, complex0.isInfinite());
      //  // Unstable assertion: assertEquals(0.0, complex0.getReal(), 0.01D);
      //  // Unstable assertion: assertEquals(1247.768964479, complex0.getImaginary(), 0.01D);
      //  // Unstable assertion: assertEquals(1247.768964479, complex0.abs(), 0.01D);
      //  // Unstable assertion: assertEquals(false, complex0.isNaN());
      
      try {
        Complex complex1 = complexFormat0.parse(string0);
       //  fail("Expecting exception: ParseException");
       // Unstable assertion
      } catch(ParseException e) {
         //
         // Unparseable complex number: \"0 + 1,247.77i\"
         //
      }
  }

  @Test
  public void test08()  throws Throwable  {
      String string0 = "'srA~~}ANc[Y(QLLc^";
      ComplexFormat complexFormat0 = new ComplexFormat(string0);
      assertEquals("'srA~~}ANc[Y(QLLc^", complexFormat0.getImaginaryCharacter());
      assertNotNull(complexFormat0);
      
      double double0 = (-1035.0);
      Float float0 = new Float(double0);
      assertEquals((-1035.0F), (float)float0, 0.01F);
      
      String string1 = Double.toString((double) float0);
      assertNotSame(string1, string0);
      assertNotNull(string1);
      assertEquals("-1035.0", string1);
      assertFalse(string1.equals((Object)string0));
      
      Complex complex0 = complexFormat0.parse(string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("'srA~~}ANc[Y(QLLc^", complexFormat0.getImaginaryCharacter());
      assertEquals((-1035.0), complex0.getReal(), 0.01D);
      assertEquals(1035.0, complex0.abs(), 0.01D);
      assertEquals(false, complex0.isInfinite());
      assertEquals(0.0, complex0.getImaginary(), 0.01D);
      assertEquals(false, complex0.isNaN());
      assertNotNull(complex0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
  }

  @Test
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      assertEquals("ko_KR", locale0.toString());
      assertEquals("KR", locale0.getCountry());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("KOR", locale0.getISO3Country());
      assertNotNull(locale0);
      
      DecimalFormat decimalFormat0 = (DecimalFormat)NumberFormat.getNumberInstance(locale0);
      assertEquals("ko_KR", locale0.toString());
      assertEquals("KR", locale0.getCountry());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("KOR", locale0.getISO3Country());
      assertEquals("", decimalFormat0.getPositiveSuffix());
      assertEquals("#,##0.###", decimalFormat0.toLocalizedPattern());
      assertEquals(false, decimalFormat0.isParseIntegerOnly());
      assertEquals(true, decimalFormat0.isGroupingUsed());
      assertEquals(false, decimalFormat0.isParseBigDecimal());
      assertEquals(0, decimalFormat0.getMinimumFractionDigits());
      assertEquals(1, decimalFormat0.getMinimumIntegerDigits());
      assertEquals(1, decimalFormat0.getMultiplier());
      assertEquals(false, decimalFormat0.isDecimalSeparatorAlwaysShown());
      assertEquals(2147483647, decimalFormat0.getMaximumIntegerDigits());
      assertEquals(3, decimalFormat0.getMaximumFractionDigits());
      assertEquals(3, decimalFormat0.getGroupingSize());
      assertEquals("#,##0.###", decimalFormat0.toPattern());
      assertEquals("", decimalFormat0.getNegativeSuffix());
      assertEquals("", decimalFormat0.getPositivePrefix());
      assertEquals("-", decimalFormat0.getNegativePrefix());
      assertEquals(RoundingMode.HALF_EVEN, decimalFormat0.getRoundingMode());
      assertNotNull(decimalFormat0);
      
      ComplexFormat complexFormat0 = new ComplexFormat((NumberFormat) decimalFormat0, (NumberFormat) decimalFormat0);
      assertEquals("ko_KR", locale0.toString());
      assertEquals("KR", locale0.getCountry());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("KOR", locale0.getISO3Country());
      assertEquals("i", complexFormat0.getImaginaryCharacter());
      assertEquals("", decimalFormat0.getPositiveSuffix());
      assertEquals("#,##0.###", decimalFormat0.toLocalizedPattern());
      assertEquals(false, decimalFormat0.isParseIntegerOnly());
      assertEquals(true, decimalFormat0.isGroupingUsed());
      assertEquals(false, decimalFormat0.isParseBigDecimal());
      assertEquals(0, decimalFormat0.getMinimumFractionDigits());
      assertEquals(1, decimalFormat0.getMinimumIntegerDigits());
      assertEquals(1, decimalFormat0.getMultiplier());
      assertEquals(false, decimalFormat0.isDecimalSeparatorAlwaysShown());
      assertEquals(2147483647, decimalFormat0.getMaximumIntegerDigits());
      assertEquals(3, decimalFormat0.getMaximumFractionDigits());
      assertEquals(3, decimalFormat0.getGroupingSize());
      assertEquals("#,##0.###", decimalFormat0.toPattern());
      assertEquals("", decimalFormat0.getNegativeSuffix());
      assertEquals("", decimalFormat0.getPositivePrefix());
      assertEquals("-", decimalFormat0.getNegativePrefix());
      assertEquals(RoundingMode.HALF_EVEN, decimalFormat0.getRoundingMode());
      assertNotNull(complexFormat0);
      
      // Undeclared exception!
      try {
        AttributedCharacterIterator attributedCharacterIterator0 = complexFormat0.formatToCharacterIterator((Object) locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot format given Object as a Date
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      assertEquals("ko_KR", locale0.toString());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("KOR", locale0.getISO3Country());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("KR", locale0.getCountry());
      assertNotNull(locale0);
      
      DecimalFormat decimalFormat0 = (DecimalFormat)NumberFormat.getNumberInstance(locale0);
      assertEquals(false, decimalFormat0.isDecimalSeparatorAlwaysShown());
      assertEquals("-", decimalFormat0.getNegativePrefix());
      assertEquals("#,##0.###", decimalFormat0.toLocalizedPattern());
      assertEquals(false, decimalFormat0.isParseIntegerOnly());
      assertEquals(3, decimalFormat0.getMaximumFractionDigits());
      assertEquals(3, decimalFormat0.getGroupingSize());
      assertEquals("", decimalFormat0.getNegativeSuffix());
      assertEquals(RoundingMode.HALF_EVEN, decimalFormat0.getRoundingMode());
      assertEquals(1, decimalFormat0.getMinimumIntegerDigits());
      assertEquals("", decimalFormat0.getPositivePrefix());
      assertEquals(false, decimalFormat0.isParseBigDecimal());
      assertEquals("", decimalFormat0.getPositiveSuffix());
      assertEquals(true, decimalFormat0.isGroupingUsed());
      assertEquals("#,##0.###", decimalFormat0.toPattern());
      assertEquals(1, decimalFormat0.getMultiplier());
      assertEquals(2147483647, decimalFormat0.getMaximumIntegerDigits());
      assertEquals(0, decimalFormat0.getMinimumFractionDigits());
      assertEquals("ko_KR", locale0.toString());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("KOR", locale0.getISO3Country());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("KR", locale0.getCountry());
      assertNotNull(decimalFormat0);
      
      ComplexFormat complexFormat0 = new ComplexFormat((NumberFormat) decimalFormat0, (NumberFormat) decimalFormat0);
      assertEquals(false, decimalFormat0.isDecimalSeparatorAlwaysShown());
      assertEquals("-", decimalFormat0.getNegativePrefix());
      assertEquals("#,##0.###", decimalFormat0.toLocalizedPattern());
      assertEquals(false, decimalFormat0.isParseIntegerOnly());
      assertEquals(3, decimalFormat0.getMaximumFractionDigits());
      assertEquals(3, decimalFormat0.getGroupingSize());
      assertEquals("", decimalFormat0.getNegativeSuffix());
      assertEquals(RoundingMode.HALF_EVEN, decimalFormat0.getRoundingMode());
      assertEquals(1, decimalFormat0.getMinimumIntegerDigits());
      assertEquals("", decimalFormat0.getPositivePrefix());
      assertEquals(false, decimalFormat0.isParseBigDecimal());
      assertEquals("", decimalFormat0.getPositiveSuffix());
      assertEquals(true, decimalFormat0.isGroupingUsed());
      assertEquals("#,##0.###", decimalFormat0.toPattern());
      assertEquals(1, decimalFormat0.getMultiplier());
      assertEquals(2147483647, decimalFormat0.getMaximumIntegerDigits());
      assertEquals(0, decimalFormat0.getMinimumFractionDigits());
      assertEquals("ko_KR", locale0.toString());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("KOR", locale0.getISO3Country());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("KR", locale0.getCountry());
      assertEquals("i", complexFormat0.getImaginaryCharacter());
      assertNotNull(complexFormat0);
      
      byte byte0 = (byte)0;
      Byte byte1 = Byte.valueOf(byte0);
      assertEquals((byte)0, (byte)byte1);
      
      AttributedCharacterIterator attributedCharacterIterator0 = complexFormat0.formatToCharacterIterator((Object) byte1);
      assertEquals(1, attributedCharacterIterator0.getRunLimit());
      assertEquals(0, attributedCharacterIterator0.getRunStart());
      assertEquals(0, attributedCharacterIterator0.getIndex());
      assertEquals(1, attributedCharacterIterator0.getEndIndex());
      assertEquals(0, attributedCharacterIterator0.getBeginIndex());
      assertEquals(false, decimalFormat0.isDecimalSeparatorAlwaysShown());
      assertEquals("-", decimalFormat0.getNegativePrefix());
      assertEquals("#,##0.###", decimalFormat0.toLocalizedPattern());
      assertEquals(false, decimalFormat0.isParseIntegerOnly());
      assertEquals(3, decimalFormat0.getMaximumFractionDigits());
      assertEquals(3, decimalFormat0.getGroupingSize());
      assertEquals("", decimalFormat0.getNegativeSuffix());
      assertEquals(RoundingMode.HALF_EVEN, decimalFormat0.getRoundingMode());
      assertEquals(1, decimalFormat0.getMinimumIntegerDigits());
      assertEquals("", decimalFormat0.getPositivePrefix());
      assertEquals(false, decimalFormat0.isParseBigDecimal());
      assertEquals("", decimalFormat0.getPositiveSuffix());
      assertEquals(true, decimalFormat0.isGroupingUsed());
      assertEquals("#,##0.###", decimalFormat0.toPattern());
      assertEquals(1, decimalFormat0.getMultiplier());
      assertEquals(2147483647, decimalFormat0.getMaximumIntegerDigits());
      assertEquals(0, decimalFormat0.getMinimumFractionDigits());
      assertEquals("ko_KR", locale0.toString());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("KOR", locale0.getISO3Country());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("KR", locale0.getCountry());
      assertEquals("i", complexFormat0.getImaginaryCharacter());
      assertNotNull(attributedCharacterIterator0);
  }

  @Test
  public void test11()  throws Throwable  {
      ComplexFormat complexFormat0 = new ComplexFormat();
      assertEquals("i", complexFormat0.getImaginaryCharacter());
      assertNotNull(complexFormat0);
  }

  @Test
  public void test12()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      //  // Unstable assertion: assertEquals("", locale0.getVariant());
      //  // Unstable assertion: assertEquals("ko", locale0.getLanguage());
      //  // Unstable assertion: assertEquals("ko_KR", locale0.toString());
      //  // Unstable assertion: assertEquals("KOR", locale0.getISO3Country());
      //  // Unstable assertion: assertEquals("kor", locale0.getISO3Language());
      //  // Unstable assertion: assertEquals("KR", locale0.getCountry());
      //  // Unstable assertion: assertNotNull(locale0);
      
      DecimalFormat decimalFormat0 = (DecimalFormat)NumberFormat.getNumberInstance(locale0);
      //  // Unstable assertion: assertEquals(0, decimalFormat0.getMinimumFractionDigits());
      //  // Unstable assertion: assertEquals(false, decimalFormat0.isParseIntegerOnly());
      //  // Unstable assertion: assertEquals("", decimalFormat0.getPositiveSuffix());
      //  // Unstable assertion: assertEquals(false, decimalFormat0.isDecimalSeparatorAlwaysShown());
      //  // Unstable assertion: assertEquals(true, decimalFormat0.isGroupingUsed());
      //  // Unstable assertion: assertEquals(RoundingMode.HALF_EVEN, decimalFormat0.getRoundingMode());
      //  // Unstable assertion: assertEquals(3, decimalFormat0.getMaximumFractionDigits());
      //  // Unstable assertion: assertEquals("", decimalFormat0.getPositivePrefix());
      //  // Unstable assertion: assertEquals(1, decimalFormat0.getMinimumIntegerDigits());
      //  // Unstable assertion: assertEquals(1, decimalFormat0.getMultiplier());
      //  // Unstable assertion: assertEquals(false, decimalFormat0.isParseBigDecimal());
      //  // Unstable assertion: assertEquals("#,##0.###", decimalFormat0.toLocalizedPattern());
      //  // Unstable assertion: assertEquals("", decimalFormat0.getNegativeSuffix());
      //  // Unstable assertion: assertEquals("#,##0.###", decimalFormat0.toPattern());
      //  // Unstable assertion: assertEquals(2147483647, decimalFormat0.getMaximumIntegerDigits());
      //  // Unstable assertion: assertEquals(3, decimalFormat0.getGroupingSize());
      //  // Unstable assertion: assertEquals("-", decimalFormat0.getNegativePrefix());
      //  // Unstable assertion: assertEquals("", locale0.getVariant());
      //  // Unstable assertion: assertEquals("ko", locale0.getLanguage());
      //  // Unstable assertion: assertEquals("ko_KR", locale0.toString());
      //  // Unstable assertion: assertEquals("KOR", locale0.getISO3Country());
      //  // Unstable assertion: assertEquals("kor", locale0.getISO3Language());
      //  // Unstable assertion: assertEquals("KR", locale0.getCountry());
      //  // Unstable assertion: assertNotNull(decimalFormat0);
      
      ComplexFormat complexFormat0 = new ComplexFormat((NumberFormat) decimalFormat0, (NumberFormat) decimalFormat0);
      //  // Unstable assertion: assertEquals("i", complexFormat0.getImaginaryCharacter());
      //  // Unstable assertion: assertEquals(0, decimalFormat0.getMinimumFractionDigits());
      //  // Unstable assertion: assertEquals(false, decimalFormat0.isParseIntegerOnly());
      //  // Unstable assertion: assertEquals("", decimalFormat0.getPositiveSuffix());
      //  // Unstable assertion: assertEquals(false, decimalFormat0.isDecimalSeparatorAlwaysShown());
      //  // Unstable assertion: assertEquals(true, decimalFormat0.isGroupingUsed());
      //  // Unstable assertion: assertEquals(RoundingMode.HALF_EVEN, decimalFormat0.getRoundingMode());
      //  // Unstable assertion: assertEquals(3, decimalFormat0.getMaximumFractionDigits());
      //  // Unstable assertion: assertEquals("", decimalFormat0.getPositivePrefix());
      //  // Unstable assertion: assertEquals(1, decimalFormat0.getMinimumIntegerDigits());
      //  // Unstable assertion: assertEquals(1, decimalFormat0.getMultiplier());
      //  // Unstable assertion: assertEquals(false, decimalFormat0.isParseBigDecimal());
      //  // Unstable assertion: assertEquals("#,##0.###", decimalFormat0.toLocalizedPattern());
      //  // Unstable assertion: assertEquals("", decimalFormat0.getNegativeSuffix());
      //  // Unstable assertion: assertEquals("#,##0.###", decimalFormat0.toPattern());
      //  // Unstable assertion: assertEquals(2147483647, decimalFormat0.getMaximumIntegerDigits());
      //  // Unstable assertion: assertEquals(3, decimalFormat0.getGroupingSize());
      //  // Unstable assertion: assertEquals("-", decimalFormat0.getNegativePrefix());
      //  // Unstable assertion: assertEquals("", locale0.getVariant());
      //  // Unstable assertion: assertEquals("ko", locale0.getLanguage());
      //  // Unstable assertion: assertEquals("ko_KR", locale0.toString());
      //  // Unstable assertion: assertEquals("KOR", locale0.getISO3Country());
      //  // Unstable assertion: assertEquals("kor", locale0.getISO3Language());
      //  // Unstable assertion: assertEquals("KR", locale0.getCountry());
      //  // Unstable assertion: assertNotNull(complexFormat0);
      
      Complex complex0 = Complex.NaN;
      //  // Unstable assertion: assertEquals(false, complex0.isInfinite());
      //  // Unstable assertion: assertEquals(3172.159792, complex0.getImaginary(), 0.01D);
      //  // Unstable assertion: assertEquals(3172.451220425853, complex0.abs(), 0.01D);
      //  // Unstable assertion: assertEquals(false, complex0.isNaN());
      //  // Unstable assertion: assertEquals(43.0, complex0.getReal(), 0.01D);
      //  // Unstable assertion: assertNotNull(complex0);
      
      String string0 = ComplexFormat.formatComplex(complex0);
      //  // Unstable assertion: assertEquals(false, complex0.isInfinite());
      //  // Unstable assertion: assertEquals(3172.159792, complex0.getImaginary(), 0.01D);
      //  // Unstable assertion: assertEquals(3172.451220425853, complex0.abs(), 0.01D);
      //  // Unstable assertion: assertEquals(false, complex0.isNaN());
      //  // Unstable assertion: assertEquals(43.0, complex0.getReal(), 0.01D);
      //  // Unstable assertion: assertNotNull(string0);
      //  // Unstable assertion: assertEquals("43 + 3,172.16i", string0);
      
      Complex complex1 = (Complex)complexFormat0.parseObject(string0);
      //  // Unstable assertion: assertNotSame(complex0, complex1);
      //  // Unstable assertion: assertNotSame(complex1, complex0);
      //  // Unstable assertion: assertEquals("i", complexFormat0.getImaginaryCharacter());
      //  // Unstable assertion: assertEquals(0, decimalFormat0.getMinimumFractionDigits());
      //  // Unstable assertion: assertEquals(false, decimalFormat0.isParseIntegerOnly());
      //  // Unstable assertion: assertEquals("", decimalFormat0.getPositiveSuffix());
      //  // Unstable assertion: assertEquals(false, decimalFormat0.isDecimalSeparatorAlwaysShown());
      //  // Unstable assertion: assertEquals(true, decimalFormat0.isGroupingUsed());
      //  // Unstable assertion: assertEquals(RoundingMode.HALF_EVEN, decimalFormat0.getRoundingMode());
      //  // Unstable assertion: assertEquals(3, decimalFormat0.getMaximumFractionDigits());
      //  // Unstable assertion: assertEquals("", decimalFormat0.getPositivePrefix());
      //  // Unstable assertion: assertEquals(1, decimalFormat0.getMinimumIntegerDigits());
      //  // Unstable assertion: assertEquals(1, decimalFormat0.getMultiplier());
      //  // Unstable assertion: assertEquals(false, decimalFormat0.isParseBigDecimal());
      //  // Unstable assertion: assertEquals("#,##0.###", decimalFormat0.toLocalizedPattern());
      //  // Unstable assertion: assertEquals("", decimalFormat0.getNegativeSuffix());
      //  // Unstable assertion: assertEquals("#,##0.###", decimalFormat0.toPattern());
      //  // Unstable assertion: assertEquals(2147483647, decimalFormat0.getMaximumIntegerDigits());
      //  // Unstable assertion: assertEquals(3, decimalFormat0.getGroupingSize());
      //  // Unstable assertion: assertEquals("-", decimalFormat0.getNegativePrefix());
      //  // Unstable assertion: assertEquals(false, complex0.isInfinite());
      //  // Unstable assertion: assertEquals(3172.159792, complex0.getImaginary(), 0.01D);
      //  // Unstable assertion: assertEquals(3172.451220425853, complex0.abs(), 0.01D);
      //  // Unstable assertion: assertEquals(false, complex0.isNaN());
      //  // Unstable assertion: assertEquals(43.0, complex0.getReal(), 0.01D);
      //  // Unstable assertion: assertEquals(false, complex1.isInfinite());
      //  // Unstable assertion: assertEquals(3172.4514284067454, complex1.abs(), 0.01D);
      //  // Unstable assertion: assertEquals(3172.16, complex1.getImaginary(), 0.01D);
      //  // Unstable assertion: assertEquals(false, complex1.isNaN());
      //  // Unstable assertion: assertEquals(43.0, complex1.getReal(), 0.01D);
      //  // Unstable assertion: assertEquals("", locale0.getVariant());
      //  // Unstable assertion: assertEquals("ko", locale0.getLanguage());
      //  // Unstable assertion: assertEquals("ko_KR", locale0.toString());
      //  // Unstable assertion: assertEquals("KOR", locale0.getISO3Country());
      //  // Unstable assertion: assertEquals("kor", locale0.getISO3Language());
      //  // Unstable assertion: assertEquals("KR", locale0.getCountry());
      //  // Unstable assertion: assertNotNull(complex1);
      //  // Unstable assertion: assertFalse(complex0.equals((Object)complex1));
      //  // Unstable assertion: assertFalse(complex1.equals((Object)complex0));
  }

  @Test
  public void test13()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      //  // Unstable assertion: assertEquals(2703.184496414356, complex0.getReal(), 0.01D);
      //  // Unstable assertion: assertEquals(false, complex0.isNaN());
      //  // Unstable assertion: assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01D);
      //  // Unstable assertion: assertEquals(true, complex0.isInfinite());
      //  // Unstable assertion: assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01D);
      //  // Unstable assertion: assertNotNull(complex0);
      
      String string0 = ComplexFormat.formatComplex(complex0);
      //  // Unstable assertion: assertEquals(2703.184496414356, complex0.getReal(), 0.01D);
      //  // Unstable assertion: assertEquals(false, complex0.isNaN());
      //  // Unstable assertion: assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01D);
      //  // Unstable assertion: assertEquals(true, complex0.isInfinite());
      //  // Unstable assertion: assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01D);
      //  // Unstable assertion: assertNotNull(string0);
      //  // Unstable assertion: assertEquals("2,703.18 + (Infinity)i", string0);
  }
}