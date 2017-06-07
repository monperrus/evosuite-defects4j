/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 12 00:13:24 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CheckGlobalThis;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.DefinitionsRemover;
import com.google.javascript.jscomp.MemoizedScopeCreator;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.jscomp.SyntacticScopeCreator;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class CheckGlobalThisEvoSuite_branch_Test extends CheckGlobalThisEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(abstractCompiler0, checkLevel0);
      assertNotNull(checkGlobalThis0);
      
      NodeTraversal nodeTraversal0 = null;
      int int0 = 42;
      Node node0 = new Node(int0);
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(true, node0.isQualifiedName());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(42, node0.getType());
      assertEquals(-1, node0.getCharno());
      assertEquals(0, node0.getChildCount());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertNotNull(node0);
      
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      Node node1 = compiler0.getRoot();
      assertNull(node1);
      
      checkGlobalThis0.visit(nodeTraversal0, node0, node1);
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(true, node0.isQualifiedName());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(42, node0.getType());
      assertEquals(-1, node0.getCharno());
      assertEquals(0, node0.getChildCount());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(0, node0.getSideEffectFlags());
  }

  @Test
  public void test1()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(abstractCompiler0, checkLevel0);
      assertNotNull(checkGlobalThis0);
      
      NodeTraversal nodeTraversal0 = null;
      int int0 = 42;
      Node node0 = new Node(int0);
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isQuotedString());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(true, node0.isQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(42, node0.getType());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasChildren());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertNotNull(node0);
      
      boolean boolean0 = true;
      DefinitionsRemover.ObjectLiteralPropertyDefinition definitionsRemover_ObjectLiteralPropertyDefinition0 = new DefinitionsRemover.ObjectLiteralPropertyDefinition(node0, node0, node0, boolean0);
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isQuotedString());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(true, node0.isQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(42, node0.getType());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasChildren());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertNotNull(definitionsRemover_ObjectLiteralPropertyDefinition0);
      
      Node node1 = definitionsRemover_ObjectLiteralPropertyDefinition0.getLValue();
      assertFalse(node0.equals((Object)node1));
      assertFalse(node1.equals((Object)node0));
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isQuotedString());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(true, node0.isQualifiedName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(42, node0.getType());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasChildren());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node1.hasOneChild());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(true, node1.hasChildren());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(true, node1.hasMoreThanOneChild());
      assertEquals(2, node1.getChildCount());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(33, node1.getType());
      assertEquals(-1, node1.getLineno());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(-1, node1.getCharno());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertNotSame(node0, node1);
      assertNotSame(node1, node0);
      assertNotNull(node1);
      
      // Undeclared exception!
      try {
        checkGlobalThis0.visit(nodeTraversal0, node0, node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(abstractCompiler0, checkLevel0);
      assertNotNull(checkGlobalThis0);
      
      NodeTraversal nodeTraversal0 = null;
      int int0 = 42;
      Node node0 = new Node(int0);
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.hasOneChild());
      assertEquals(true, node0.isQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQuotedString());
      assertEquals(42, node0.getType());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasChildren());
      assertEquals(0, node0.getChildCount());
      assertNotNull(node0);
      
      checkGlobalThis0.visit(nodeTraversal0, node0, node0);
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.hasOneChild());
      assertEquals(true, node0.isQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQuotedString());
      assertEquals(42, node0.getType());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.hasChildren());
      assertEquals(0, node0.getChildCount());
  }

  @Test
  public void test3()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(abstractCompiler0, checkLevel0);
      assertNotNull(checkGlobalThis0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal(abstractCompiler0, (NodeTraversal.Callback) checkGlobalThis0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertNotNull(nodeTraversal0);
      
      String string0 = "codgool=jscrip.soomp.CVkGlob=T6ir";
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      Node node0 = compiler0.parseTestCode(string0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(1, node0.getLineno());
      assertEquals(0, node0.getCharno());
      assertEquals(1, node0.getChildCount());
      assertNotNull(node0);
      
      nodeTraversal0.traverse(node0);
      assertEquals(" [testcode] ", nodeTraversal0.getSourceName());
      assertEquals(1, nodeTraversal0.getLineNumber());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(1, node0.getLineno());
      assertEquals(0, node0.getCharno());
      assertEquals(1, node0.getChildCount());
  }

  @Test
  public void test4()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      assertNotNull(checkGlobalThis0);
      
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      assertNotNull(syntacticScopeCreator0);
      
      MemoizedScopeCreator memoizedScopeCreator0 = new MemoizedScopeCreator(syntacticScopeCreator0);
      assertNotNull(memoizedScopeCreator0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, (NodeTraversal.Callback) checkGlobalThis0, (ScopeCreator) memoizedScopeCreator0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertNotNull(nodeTraversal0);
      
      int int0 = 105;
      Node node0 = new Node(int0, int0, int0);
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(105, node0.getCharno());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(105, node0.getLineno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasChildren());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(105, node0.getType());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isVarArgs());
      assertNotNull(node0);
      
      // Undeclared exception!
      try {
        boolean boolean0 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(abstractCompiler0, checkLevel0);
      assertNotNull(checkGlobalThis0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal(abstractCompiler0, (NodeTraversal.Callback) checkGlobalThis0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      assertNotNull(nodeTraversal0);
      
      String string0 = "co.gool=jscrip.jsoomp.CeVkGlob=T6ir";
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      Node node0 = compiler0.parseTestCode(string0);
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(true, node0.hasOneChild());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isQuotedString());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(0, node0.getCharno());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertNotNull(node0);
      
      nodeTraversal0.traverse(node0);
      assertEquals(1, nodeTraversal0.getLineNumber());
      assertEquals(" [testcode] ", nodeTraversal0.getSourceName());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(true, node0.hasOneChild());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isQuotedString());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(0, node0.getCharno());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
  }
}