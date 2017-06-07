/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:46:22 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.FunctionToBlockMutator;
import com.google.javascript.jscomp.RenameLabels;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class FunctionToBlockMutatorEvoSuite_branch_Test extends FunctionToBlockMutatorEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      assertNotNull(renameLabels_DefaultNameSupplier0);
      
      FunctionToBlockMutator functionToBlockMutator0 = new FunctionToBlockMutator(abstractCompiler0, renameLabels_DefaultNameSupplier0);
      assertNotNull(functionToBlockMutator0);
      
      String string0 = "VHzRyU0#!Q>";
      int int0 = (-1578);
      Node node0 = Node.newNumber((double) int0, int0, int0);
      assertEquals(39, node0.getType());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isQualifiedName());
      assertNotNull(node0);
      
      boolean boolean0 = true;
      // Undeclared exception!
      try {
        Node node1 = functionToBlockMutator0.mutate(string0, node0, node0, string0, boolean0, boolean0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
      assertNotNull(renameLabels_DefaultNameSupplier0);
      
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(renameLabels_DefaultNameSupplier0);
      assertNotNull(functionToBlockMutator_LabelNameSupplier0);
      
      String string0 = functionToBlockMutator_LabelNameSupplier0.get();
      assertNotNull(string0);
      assertEquals("JSCompiler_inline_label_a", string0);
  }
}