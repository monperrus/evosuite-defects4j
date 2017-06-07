/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:39:20 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.TypedScopeCreator;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalStateException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class TypedScopeCreatorEvoSuite_branch_Test extends TypedScopeCreatorEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      String string0 = "msg.empty.array.reduce";
      Node node0 = compiler0.parseSyntheticCode(string0, string0);
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isVarArgs());
      assertEquals(132, node0.getType());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isQuotedString());
      assertEquals("msg.empty.array.reduce", node0.getSourceFileName());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(1, node0.getChildCount());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertNotNull(node0);
      
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertNotNull(typedScopeCreator0);
      
      Scope scope0 = null;
      // Undeclared exception!
      try {
        Scope scope1 = typedScopeCreator0.createScope(node0, scope0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      String string0 = "O";
      Node node0 = compiler0.parseSyntheticCode(string0, string0);
      assertEquals(132, node0.getType());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isVarArgs());
      assertEquals("O", node0.getSourceFileName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isFromExterns());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isQuotedString());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getLength());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertNotNull(node0);
      
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertNotNull(typedScopeCreator0);
      
      Scope scope0 = null;
      Scope scope1 = typedScopeCreator0.createScope(node0, scope0);
      assertEquals(132, node0.getType());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isVarArgs());
      assertEquals("O", node0.getSourceFileName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isFromExterns());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isQuotedString());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getLength());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(true, node0.hasOneChild());
      assertEquals(true, scope1.isGlobal());
      assertEquals(32, scope1.getVarCount());
      assertEquals(false, scope1.isLocal());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertNotNull(scope1);
      
      typedScopeCreator0.patchGlobalScope(scope1, node0);
      assertEquals(132, node0.getType());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isVarArgs());
      assertEquals("O", node0.getSourceFileName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isFromExterns());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isQuotedString());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getLength());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(true, node0.hasOneChild());
      assertEquals(true, scope1.isGlobal());
      assertEquals(32, scope1.getVarCount());
      assertEquals(false, scope1.isLocal());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
  }

  @Test
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      String string0 = "<non-file>";
      Node node0 = compiler0.parseSyntheticCode(string0, string0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(true, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(1, compiler0.getErrorCount());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals("<non-file>", node0.getSourceFileName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getCharno());
      assertEquals(0, node0.getChildCount());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(-1, node0.getLineno());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertNotNull(node0);
      
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(true, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(1, compiler0.getErrorCount());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertNotNull(typedScopeCreator0);
      
      Scope scope0 = null;
      Scope scope1 = typedScopeCreator0.createScope(node0, scope0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(true, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(1, compiler0.getErrorCount());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(true, scope1.isGlobal());
      assertEquals(32, scope1.getVarCount());
      assertEquals(false, scope1.isLocal());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals("<non-file>", node0.getSourceFileName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getCharno());
      assertEquals(0, node0.getChildCount());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(-1, node0.getLineno());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertNotNull(scope1);
      
      typedScopeCreator0.patchGlobalScope(scope1, node0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(true, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(1, compiler0.getErrorCount());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(true, scope1.isGlobal());
      assertEquals(0, scope1.getVarCount());
      assertEquals(false, scope1.isLocal());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals("<non-file>", node0.getSourceFileName());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getCharno());
      assertEquals(0, node0.getChildCount());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(-1, node0.getLineno());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isUnscopedQualifiedName());
  }

  @Test
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      String string0 = "<non-file>";
      Node node0 = compiler0.parseSyntheticCode(string0, string0);
      assertEquals(1, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(true, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(-1, node0.getCharno());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getChildCount());
      assertEquals("<non-file>", node0.getSourceFileName());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isQuotedString());
      assertNotNull(node0);
      
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
      assertEquals(1, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(true, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertNotNull(typedScopeCreator0);
      
      int int0 = 207;
      node0.setType(int0);
      assertEquals(1, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(true, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(-1, node0.getCharno());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getChildCount());
      assertEquals("<non-file>", node0.getSourceFileName());
      assertEquals(207, node0.getType());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isQuotedString());
      
      Scope scope0 = null;
      // Undeclared exception!
      try {
        typedScopeCreator0.patchGlobalScope(scope0, node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}