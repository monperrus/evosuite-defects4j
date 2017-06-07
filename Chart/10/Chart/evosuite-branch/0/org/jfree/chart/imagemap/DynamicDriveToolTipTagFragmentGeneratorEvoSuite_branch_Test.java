/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 15:27:05 GMT 2014
 */

package org.jfree.chart.imagemap;

import static org.junit.Assert.*;
import org.junit.Test;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.jfree.chart.imagemap.DynamicDriveToolTipTagFragmentGenerator;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class DynamicDriveToolTipTagFragmentGeneratorEvoSuite_branch_Test extends DynamicDriveToolTipTagFragmentGeneratorEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      DynamicDriveToolTipTagFragmentGenerator dynamicDriveToolTipTagFragmentGenerator0 = new DynamicDriveToolTipTagFragmentGenerator();
      assertNotNull(dynamicDriveToolTipTagFragmentGenerator0);
      
      String string0 = "|{',}b-H";
      String string1 = dynamicDriveToolTipTagFragmentGenerator0.generateToolTipFragment(string0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertEquals(" onMouseOver=\"return stm(['','|{&#39;,}b-H'],Style[1]);\" onMouseOut=\"return htm();\"", string1);
      assertNotNull(string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
  }

  @Test
  public void test1()  throws Throwable  {
      String string0 = "Z";
      int int0 = 1;
      DynamicDriveToolTipTagFragmentGenerator dynamicDriveToolTipTagFragmentGenerator0 = new DynamicDriveToolTipTagFragmentGenerator(string0, int0);
      assertNotNull(dynamicDriveToolTipTagFragmentGenerator0);
  }
}