/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 12 00:02:55 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.RenameLabels;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalStateException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class RenameLabelsEvoSuite_branch_Test extends RenameLabelsEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      RenameLabels renameLabels0 = new RenameLabels(abstractCompiler0);
      assertNotNull(renameLabels0);
      
      int int0 = 116;
      String string0 = "";
      Node node0 = Node.newString(string0);
      assertEquals(false, node0.isQualifiedName());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(40, node0.getType());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasChildren());
      assertEquals(-1, node0.getLineno());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isVarArgs());
      assertNotNull(node0);
      
      Node node1 = new Node(int0, node0);
      assertFalse(node1.equals((Object)node0));
      assertFalse(node0.equals((Object)node1));
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.isVarArgs());
      assertEquals(true, node1.hasOneChild());
      assertEquals(-1, node1.getCharno());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(true, node1.hasChildren());
      assertEquals(116, node1.getType());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(-1, node1.getSourcePosition());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(-1, node1.getLineno());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(40, node0.getType());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.hasChildren());
      assertEquals(-1, node0.getLineno());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isVarArgs());
      assertNotNull(node1);
      assertNotSame(node1, node0);
      assertNotSame(node0, node1);
      
      // Undeclared exception!
      try {
        renameLabels0.process(node1, node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      RenameLabels renameLabels0 = new RenameLabels(abstractCompiler0);
      assertNotNull(renameLabels0);
      
      int int0 = 126;
      RenameLabels.ProcessLabels renameLabels_ProcessLabels0 = renameLabels0.new ProcessLabels();
      assertNotNull(renameLabels_ProcessLabels0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal(abstractCompiler0, (NodeTraversal.Callback) renameLabels_ProcessLabels0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      assertNotNull(nodeTraversal0);
      
      String string0 = "C";
      Node node0 = Node.newString(int0, string0);
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(126, node0.getType());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getChildCount());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(-1, node0.getCharno());
      assertNotNull(node0);
      
      // Undeclared exception!
      try {
        renameLabels_ProcessLabels0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      int int0 = 117;
      AbstractCompiler abstractCompiler0 = null;
      RenameLabels renameLabels0 = new RenameLabels(abstractCompiler0);
      assertNotNull(renameLabels0);
      
      CompilerOptions compilerOptions0 = new CompilerOptions();
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compilerOptions0.getLanguageIn());
      assertEquals(false, compilerOptions0.isExternExportsEnabled());
      assertEquals(false, compilerOptions0.shouldColorizeErrorOutput());
      assertNull(compilerOptions0.getLanguageOut());
      assertEquals(CompilerOptions.TweakProcessing.OFF, compilerOptions0.getTweakProcessing());
      assertEquals(false, compilerOptions0.getInferTypes());
      assertFalse(compilerOptions0.optimizeParameters);
      assertFalse(compilerOptions0.removeDeadCode);
      assertFalse(compilerOptions0.printInputDelimiter);
      assertFalse(compilerOptions0.inlineGetters);
      assertFalse(compilerOptions0.generatePseudoNames);
      assertFalse(compilerOptions0.inlineLocalVariables);
      assertFalse(compilerOptions0.optimizeCalls);
      assertFalse(compilerOptions0.specializeInitialModule);
      assertFalse(compilerOptions0.removeUnusedPrototypeProperties);
      assertFalse(compilerOptions0.checkSuspiciousCode);
      assertFalse(compilerOptions0.crossModuleMethodMotion);
      assertFalse(compilerOptions0.removeUnusedLocalVars);
      assertFalse(compilerOptions0.checkCaja);
      assertFalse(compilerOptions0.optimizeArgumentsArray);
      assertFalse(compilerOptions0.aliasAllStrings);
      assertFalse(compilerOptions0.checkUnusedPropertiesEarly);
      assertFalse(compilerOptions0.checkTypedPropertyCalls);
      assertFalse(compilerOptions0.exportTestFunctions);
      assertFalse(compilerOptions0.inlineConstantVars);
      assertFalse(compilerOptions0.reserveRawExports);
      assertFalse(compilerOptions0.closurePass);
      assertFalse(compilerOptions0.rewriteFunctionExpressions);
      assertFalse(compilerOptions0.aliasKeywords);
      assertFalse(compilerOptions0.markAsCompiled);
      assertFalse(compilerOptions0.checkEs5Strict);
      assertFalse(compilerOptions0.ideMode);
      assertFalse(compilerOptions0.ambiguateProperties);
      assertFalse(compilerOptions0.optimizeReturns);
      assertFalse(compilerOptions0.moveFunctionDeclarations);
      assertFalse(compilerOptions0.foldConstants);
      assertFalse(compilerOptions0.lineBreak);
      assertFalse(compilerOptions0.inlineLocalFunctions);
      assertFalse(compilerOptions0.markNoSideEffectCalls);
      assertFalse(compilerOptions0.aliasExternals);
      assertFalse(compilerOptions0.removeEmptyFunctions);
      assertFalse(compilerOptions0.convertToDottedProperties);
      assertFalse(compilerOptions0.collapseVariableDeclarations);
      assertFalse(compilerOptions0.computeFunctionSideEffects);
      assertFalse(compilerOptions0.inlineAnonymousFunctionExpressions);
      assertFalse(compilerOptions0.groupVariableDeclarations);
      assertFalse(compilerOptions0.flowSensitiveInlineVariables);
      assertFalse(compilerOptions0.coalesceVariableNames);
      assertFalse(compilerOptions0.deadAssignmentElimination);
      assertFalse(compilerOptions0.inferTypesInGlobalScope);
      assertFalse(compilerOptions0.instrumentForCoverage);
      assertFalse(compilerOptions0.collapseProperties);
      assertFalse(compilerOptions0.prettyPrint);
      assertFalse(compilerOptions0.labelRenaming);
      assertFalse(compilerOptions0.allowLegacyJsMessages);
      assertFalse(compilerOptions0.instrumentForCoverageOnly);
      assertFalse(compilerOptions0.removeUnusedVars);
      assertFalse(compilerOptions0.decomposeExpressions);
      assertFalse(compilerOptions0.inlineFunctions);
      assertFalse(compilerOptions0.generateExports);
      assertFalse(compilerOptions0.removeTryCatchFinally);
      assertFalse(compilerOptions0.extractPrototypeMemberDeclarations);
      assertFalse(compilerOptions0.checkSymbols);
      assertFalse(compilerOptions0.strictMessageReplacement);
      assertFalse(compilerOptions0.devirtualizePrototypeMethods);
      assertFalse(compilerOptions0.recordFunctionInformation);
      assertFalse(compilerOptions0.checkDuplicateMessages);
      assertFalse(compilerOptions0.checkTypes);
      assertFalse(compilerOptions0.inlineVariables);
      assertFalse(compilerOptions0.disambiguateProperties);
      assertFalse(compilerOptions0.removeUnusedPrototypePropertiesInExterns);
      assertFalse(compilerOptions0.checkControlStructures);
      assertFalse(compilerOptions0.smartNameRemoval);
      assertFalse(compilerOptions0.gatherCssNames);
      assertFalse(compilerOptions0.ignoreCajaProperties);
      assertFalse(compilerOptions0.collapseAnonymousFunctions);
      assertFalse(compilerOptions0.tightenTypes);
      assertFalse(compilerOptions0.crossModuleCodeMotion);
      assertNotNull(compilerOptions0);
      
      Node node0 = Node.newString(int0, compilerOptions0.jsOutputFile);
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasChildren());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(117, node0.getType());
      assertEquals(-1, node0.getCharno());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compilerOptions0.getLanguageIn());
      assertEquals(false, compilerOptions0.isExternExportsEnabled());
      assertEquals(false, compilerOptions0.shouldColorizeErrorOutput());
      assertNull(compilerOptions0.getLanguageOut());
      assertEquals(CompilerOptions.TweakProcessing.OFF, compilerOptions0.getTweakProcessing());
      assertEquals(false, compilerOptions0.getInferTypes());
      assertFalse(compilerOptions0.optimizeParameters);
      assertFalse(compilerOptions0.removeDeadCode);
      assertFalse(compilerOptions0.printInputDelimiter);
      assertFalse(compilerOptions0.inlineGetters);
      assertFalse(compilerOptions0.generatePseudoNames);
      assertFalse(compilerOptions0.inlineLocalVariables);
      assertFalse(compilerOptions0.optimizeCalls);
      assertFalse(compilerOptions0.specializeInitialModule);
      assertFalse(compilerOptions0.removeUnusedPrototypeProperties);
      assertFalse(compilerOptions0.checkSuspiciousCode);
      assertFalse(compilerOptions0.crossModuleMethodMotion);
      assertFalse(compilerOptions0.removeUnusedLocalVars);
      assertFalse(compilerOptions0.checkCaja);
      assertFalse(compilerOptions0.optimizeArgumentsArray);
      assertFalse(compilerOptions0.aliasAllStrings);
      assertFalse(compilerOptions0.checkUnusedPropertiesEarly);
      assertFalse(compilerOptions0.checkTypedPropertyCalls);
      assertFalse(compilerOptions0.exportTestFunctions);
      assertFalse(compilerOptions0.inlineConstantVars);
      assertFalse(compilerOptions0.reserveRawExports);
      assertFalse(compilerOptions0.closurePass);
      assertFalse(compilerOptions0.rewriteFunctionExpressions);
      assertFalse(compilerOptions0.aliasKeywords);
      assertFalse(compilerOptions0.markAsCompiled);
      assertFalse(compilerOptions0.checkEs5Strict);
      assertFalse(compilerOptions0.ideMode);
      assertFalse(compilerOptions0.ambiguateProperties);
      assertFalse(compilerOptions0.optimizeReturns);
      assertFalse(compilerOptions0.moveFunctionDeclarations);
      assertFalse(compilerOptions0.foldConstants);
      assertFalse(compilerOptions0.lineBreak);
      assertFalse(compilerOptions0.inlineLocalFunctions);
      assertFalse(compilerOptions0.markNoSideEffectCalls);
      assertFalse(compilerOptions0.aliasExternals);
      assertFalse(compilerOptions0.removeEmptyFunctions);
      assertFalse(compilerOptions0.convertToDottedProperties);
      assertFalse(compilerOptions0.collapseVariableDeclarations);
      assertFalse(compilerOptions0.computeFunctionSideEffects);
      assertFalse(compilerOptions0.inlineAnonymousFunctionExpressions);
      assertFalse(compilerOptions0.groupVariableDeclarations);
      assertFalse(compilerOptions0.flowSensitiveInlineVariables);
      assertFalse(compilerOptions0.coalesceVariableNames);
      assertFalse(compilerOptions0.deadAssignmentElimination);
      assertFalse(compilerOptions0.inferTypesInGlobalScope);
      assertFalse(compilerOptions0.instrumentForCoverage);
      assertFalse(compilerOptions0.collapseProperties);
      assertFalse(compilerOptions0.prettyPrint);
      assertFalse(compilerOptions0.labelRenaming);
      assertFalse(compilerOptions0.allowLegacyJsMessages);
      assertFalse(compilerOptions0.instrumentForCoverageOnly);
      assertFalse(compilerOptions0.removeUnusedVars);
      assertFalse(compilerOptions0.decomposeExpressions);
      assertFalse(compilerOptions0.inlineFunctions);
      assertFalse(compilerOptions0.generateExports);
      assertFalse(compilerOptions0.removeTryCatchFinally);
      assertFalse(compilerOptions0.extractPrototypeMemberDeclarations);
      assertFalse(compilerOptions0.checkSymbols);
      assertFalse(compilerOptions0.strictMessageReplacement);
      assertFalse(compilerOptions0.devirtualizePrototypeMethods);
      assertFalse(compilerOptions0.recordFunctionInformation);
      assertFalse(compilerOptions0.checkDuplicateMessages);
      assertFalse(compilerOptions0.checkTypes);
      assertFalse(compilerOptions0.inlineVariables);
      assertFalse(compilerOptions0.disambiguateProperties);
      assertFalse(compilerOptions0.removeUnusedPrototypePropertiesInExterns);
      assertFalse(compilerOptions0.checkControlStructures);
      assertFalse(compilerOptions0.smartNameRemoval);
      assertFalse(compilerOptions0.gatherCssNames);
      assertFalse(compilerOptions0.ignoreCajaProperties);
      assertFalse(compilerOptions0.collapseAnonymousFunctions);
      assertFalse(compilerOptions0.tightenTypes);
      assertFalse(compilerOptions0.crossModuleCodeMotion);
      assertNotNull(node0);
      
      renameLabels0.process(node0, node0);
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasChildren());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isVarArgs());
      assertEquals(117, node0.getType());
      assertEquals(-1, node0.getCharno());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compilerOptions0.getLanguageIn());
      assertEquals(false, compilerOptions0.isExternExportsEnabled());
      assertEquals(false, compilerOptions0.shouldColorizeErrorOutput());
      assertNull(compilerOptions0.getLanguageOut());
      assertEquals(CompilerOptions.TweakProcessing.OFF, compilerOptions0.getTweakProcessing());
      assertEquals(false, compilerOptions0.getInferTypes());
      assertFalse(compilerOptions0.optimizeParameters);
      assertFalse(compilerOptions0.removeDeadCode);
      assertFalse(compilerOptions0.printInputDelimiter);
      assertFalse(compilerOptions0.inlineGetters);
      assertFalse(compilerOptions0.generatePseudoNames);
      assertFalse(compilerOptions0.inlineLocalVariables);
      assertFalse(compilerOptions0.optimizeCalls);
      assertFalse(compilerOptions0.specializeInitialModule);
      assertFalse(compilerOptions0.removeUnusedPrototypeProperties);
      assertFalse(compilerOptions0.checkSuspiciousCode);
      assertFalse(compilerOptions0.crossModuleMethodMotion);
      assertFalse(compilerOptions0.removeUnusedLocalVars);
      assertFalse(compilerOptions0.checkCaja);
      assertFalse(compilerOptions0.optimizeArgumentsArray);
      assertFalse(compilerOptions0.aliasAllStrings);
      assertFalse(compilerOptions0.checkUnusedPropertiesEarly);
      assertFalse(compilerOptions0.checkTypedPropertyCalls);
      assertFalse(compilerOptions0.exportTestFunctions);
      assertFalse(compilerOptions0.inlineConstantVars);
      assertFalse(compilerOptions0.reserveRawExports);
      assertFalse(compilerOptions0.closurePass);
      assertFalse(compilerOptions0.rewriteFunctionExpressions);
      assertFalse(compilerOptions0.aliasKeywords);
      assertFalse(compilerOptions0.markAsCompiled);
      assertFalse(compilerOptions0.checkEs5Strict);
      assertFalse(compilerOptions0.ideMode);
      assertFalse(compilerOptions0.ambiguateProperties);
      assertFalse(compilerOptions0.optimizeReturns);
      assertFalse(compilerOptions0.moveFunctionDeclarations);
      assertFalse(compilerOptions0.foldConstants);
      assertFalse(compilerOptions0.lineBreak);
      assertFalse(compilerOptions0.inlineLocalFunctions);
      assertFalse(compilerOptions0.markNoSideEffectCalls);
      assertFalse(compilerOptions0.aliasExternals);
      assertFalse(compilerOptions0.removeEmptyFunctions);
      assertFalse(compilerOptions0.convertToDottedProperties);
      assertFalse(compilerOptions0.collapseVariableDeclarations);
      assertFalse(compilerOptions0.computeFunctionSideEffects);
      assertFalse(compilerOptions0.inlineAnonymousFunctionExpressions);
      assertFalse(compilerOptions0.groupVariableDeclarations);
      assertFalse(compilerOptions0.flowSensitiveInlineVariables);
      assertFalse(compilerOptions0.coalesceVariableNames);
      assertFalse(compilerOptions0.deadAssignmentElimination);
      assertFalse(compilerOptions0.inferTypesInGlobalScope);
      assertFalse(compilerOptions0.instrumentForCoverage);
      assertFalse(compilerOptions0.collapseProperties);
      assertFalse(compilerOptions0.prettyPrint);
      assertFalse(compilerOptions0.labelRenaming);
      assertFalse(compilerOptions0.allowLegacyJsMessages);
      assertFalse(compilerOptions0.instrumentForCoverageOnly);
      assertFalse(compilerOptions0.removeUnusedVars);
      assertFalse(compilerOptions0.decomposeExpressions);
      assertFalse(compilerOptions0.inlineFunctions);
      assertFalse(compilerOptions0.generateExports);
      assertFalse(compilerOptions0.removeTryCatchFinally);
      assertFalse(compilerOptions0.extractPrototypeMemberDeclarations);
      assertFalse(compilerOptions0.checkSymbols);
      assertFalse(compilerOptions0.strictMessageReplacement);
      assertFalse(compilerOptions0.devirtualizePrototypeMethods);
      assertFalse(compilerOptions0.recordFunctionInformation);
      assertFalse(compilerOptions0.checkDuplicateMessages);
      assertFalse(compilerOptions0.checkTypes);
      assertFalse(compilerOptions0.inlineVariables);
      assertFalse(compilerOptions0.disambiguateProperties);
      assertFalse(compilerOptions0.removeUnusedPrototypePropertiesInExterns);
      assertFalse(compilerOptions0.checkControlStructures);
      assertFalse(compilerOptions0.smartNameRemoval);
      assertFalse(compilerOptions0.gatherCssNames);
      assertFalse(compilerOptions0.ignoreCajaProperties);
      assertFalse(compilerOptions0.collapseAnonymousFunctions);
      assertFalse(compilerOptions0.tightenTypes);
      assertFalse(compilerOptions0.crossModuleCodeMotion);
  }

  @Test
  public void test3()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      RenameLabels renameLabels0 = new RenameLabels(abstractCompiler0);
      assertNotNull(renameLabels0);
      
      int int0 = 116;
      String string0 = "MLLi\"";
      Node node0 = Node.newString(string0);
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(40, node0.getType());
      assertEquals(-1, node0.getSourcePosition());
      assertNotNull(node0);
      
      Node node1 = new Node(int0, node0);
      assertFalse(node1.equals((Object)node0));
      assertFalse(node0.equals((Object)node1));
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.isQuotedString());
      assertEquals(true, node1.hasChildren());
      assertEquals(-1, node1.getLineno());
      assertEquals(-1, node1.getCharno());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(-1, node1.getSourcePosition());
      assertEquals(116, node1.getType());
      assertEquals(false, node1.isVarArgs());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(true, node1.hasOneChild());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(40, node0.getType());
      assertEquals(-1, node0.getSourcePosition());
      assertNotNull(node1);
      assertNotSame(node1, node0);
      assertNotSame(node0, node1);
      
      renameLabels0.process(node1, node1);
      assertFalse(node1.equals((Object)node0));
      assertFalse(node0.equals((Object)node1));
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(false, node1.isQuotedString());
      assertEquals(true, node1.hasChildren());
      assertEquals(-1, node1.getLineno());
      assertEquals(-1, node1.getCharno());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(1, node1.getChildCount());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(-1, node1.getSourcePosition());
      assertEquals(116, node1.getType());
      assertEquals(false, node1.isVarArgs());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(true, node1.hasOneChild());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(40, node0.getType());
      assertEquals(-1, node0.getSourcePosition());
      assertNotSame(node1, node0);
      assertNotSame(node0, node1);
  }

  @Test
  public void test4()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      RenameLabels renameLabels0 = new RenameLabels(abstractCompiler0);
      assertNotNull(renameLabels0);
      
      int int0 = 126;
      String string0 = "!";
      Node node0 = Node.newString(string0);
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(40, node0.getType());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isQuotedString());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.hasOneChild());
      assertNotNull(node0);
      
      Node node1 = new Node(int0, node0);
      assertFalse(node1.equals((Object)node0));
      assertFalse(node0.equals((Object)node1));
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(false, node1.isQuotedString());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertEquals(false, node1.isVarArgs());
      assertEquals(-1, node1.getCharno());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(-1, node1.getLineno());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(126, node1.getType());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(1, node1.getChildCount());
      assertEquals(true, node1.hasChildren());
      assertEquals(false, node1.isSyntheticBlock());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(-1, node1.getSourcePosition());
      assertEquals(true, node1.hasOneChild());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(40, node0.getType());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isQuotedString());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.hasOneChild());
      assertNotNull(node1);
      assertNotSame(node1, node0);
      assertNotSame(node0, node1);
      
      // Undeclared exception!
      try {
        renameLabels0.process(node1, node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}