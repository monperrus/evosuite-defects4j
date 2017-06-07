/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 23:52:31 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.common.base.Supplier;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.FunctionToBlockMutator;
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
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      assertNotNull(supplier0);
      
      FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
      assertNotNull(functionToBlockMutator_LabelNameSupplier0);
      
      FunctionToBlockMutator functionToBlockMutator0 = new FunctionToBlockMutator(abstractCompiler0, functionToBlockMutator_LabelNameSupplier0);
      assertNotNull(functionToBlockMutator0);
      
      String string0 = functionToBlockMutator_LabelNameSupplier0.get();
      assertNotNull(string0);
      assertEquals("JSCompiler_inline_label_0", string0);
      
      Node node0 = compiler0.parseSyntheticCode(string0, string0);
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(0, node0.getCharno());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(132, node0.getType());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
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
}