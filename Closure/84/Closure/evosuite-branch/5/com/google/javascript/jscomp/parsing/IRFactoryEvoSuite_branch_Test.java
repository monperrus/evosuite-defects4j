/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 23:08:56 GMT 2014
 */

package com.google.javascript.jscomp.parsing;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.jscomp.mozilla.rhino.ast.AstNode;
import com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot;
import com.google.javascript.jscomp.mozilla.rhino.ast.ErrorCollector;
import com.google.javascript.jscomp.mozilla.rhino.ast.FunctionCall;
import com.google.javascript.jscomp.mozilla.rhino.ast.Label;
import com.google.javascript.jscomp.mozilla.rhino.ast.SwitchCase;
import com.google.javascript.jscomp.mozilla.rhino.ast.VariableDeclaration;
import com.google.javascript.jscomp.mozilla.rhino.ast.VariableInitializer;
import com.google.javascript.jscomp.parsing.Config;
import com.google.javascript.jscomp.parsing.IRFactory;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.evosuite.runtime.mock.java.lang.MockIllegalStateException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class IRFactoryEvoSuite_branch_Test extends IRFactoryEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      assertEquals(0, astRoot0.getParamCount());
      assertEquals(136, astRoot0.getType());
      assertEquals(-1, astRoot0.getEncodedSourceEnd());
      assertEquals(-1, astRoot0.getAbsolutePosition());
      assertNull(astRoot0.getEncodedSource());
      assertEquals(0, astRoot0.getFunctionCount());
      assertEquals(0, astRoot0.depth());
      assertEquals(-1, astRoot0.getBaseLineno());
      assertNull(astRoot0.getSourceName());
      assertEquals(-1, astRoot0.getLineno());
      assertEquals(false, astRoot0.hasChildren());
      assertEquals(-1, astRoot0.getPosition());
      assertEquals(1, astRoot0.getLength());
      assertEquals(-1, astRoot0.getEndLineno());
      assertEquals(false, astRoot0.isInStrictMode());
      assertEquals(0, astRoot0.getRegexpCount());
      assertEquals(-1, astRoot0.getEncodedSourceStart());
      assertEquals("136", astRoot0.toString());
      assertNull(astRoot0.getJsDoc());
      assertNotNull(astRoot0);
      
      String string0 = "Qvk";
      int int0 = (-481);
      FunctionCall functionCall0 = new FunctionCall(int0);
      assertEquals(-481, functionCall0.getAbsolutePosition());
      assertEquals(false, functionCall0.hasChildren());
      assertEquals(-1, functionCall0.getRp());
      assertEquals(-1, functionCall0.getLineno());
      assertNull(functionCall0.getJsDoc());
      assertEquals(38, functionCall0.getType());
      assertEquals(1, functionCall0.getLength());
      assertEquals(-481, functionCall0.getPosition());
      assertEquals("38", functionCall0.toString());
      assertEquals(-1, functionCall0.getLp());
      assertEquals(0, functionCall0.depth());
      assertNotNull(functionCall0);
      
      astRoot0.addChild((AstNode) functionCall0);
      assertEquals(-481, functionCall0.getAbsolutePosition());
      assertEquals(false, functionCall0.hasChildren());
      assertEquals(-1, functionCall0.getRp());
      assertEquals(-1, functionCall0.getLineno());
      assertNull(functionCall0.getJsDoc());
      assertEquals(38, functionCall0.getType());
      assertEquals(1, functionCall0.getLength());
      assertEquals(-480, functionCall0.getPosition());
      assertEquals("38", functionCall0.toString());
      assertEquals(-1, functionCall0.getLp());
      assertEquals(1, functionCall0.depth());
      assertEquals(0, astRoot0.getParamCount());
      assertEquals(136, astRoot0.getType());
      assertEquals(-1, astRoot0.getEncodedSourceEnd());
      assertEquals(-1, astRoot0.getAbsolutePosition());
      assertNull(astRoot0.getEncodedSource());
      assertEquals(0, astRoot0.getFunctionCount());
      assertEquals(0, astRoot0.depth());
      assertEquals(-1, astRoot0.getBaseLineno());
      assertNull(astRoot0.getSourceName());
      assertEquals(-1, astRoot0.getLineno());
      assertEquals(-1, astRoot0.getPosition());
      assertEquals(true, astRoot0.hasChildren());
      assertEquals(-1, astRoot0.getEndLineno());
      assertEquals(false, astRoot0.isInStrictMode());
      assertEquals(-479, astRoot0.getLength());
      assertEquals(0, astRoot0.getRegexpCount());
      assertEquals(-1, astRoot0.getEncodedSourceStart());
      assertEquals("136", astRoot0.toString());
      assertNull(astRoot0.getJsDoc());
      
      Config config0 = null;
      ErrorReporter errorReporter0 = null;
      // Undeclared exception!
      try {
        Node node0 = IRFactory.transformTree(astRoot0, string0, config0, errorReporter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      int int0 = 23;
      AstRoot astRoot0 = new AstRoot(int0);
      assertEquals(0, astRoot0.depth());
      assertNull(astRoot0.getJsDoc());
      assertEquals(0, astRoot0.getParamCount());
      assertNull(astRoot0.getSourceName());
      assertEquals(false, astRoot0.hasChildren());
      assertEquals(23, astRoot0.getPosition());
      assertNull(astRoot0.getEncodedSource());
      assertEquals("136", astRoot0.toString());
      assertEquals(false, astRoot0.isInStrictMode());
      assertEquals(-1, astRoot0.getEncodedSourceStart());
      assertEquals(0, astRoot0.getRegexpCount());
      assertEquals(0, astRoot0.getFunctionCount());
      assertEquals(-1, astRoot0.getEncodedSourceEnd());
      assertEquals(-1, astRoot0.getLineno());
      assertEquals(23, astRoot0.getAbsolutePosition());
      assertEquals(-1, astRoot0.getBaseLineno());
      assertEquals(136, astRoot0.getType());
      assertEquals(1, astRoot0.getLength());
      assertEquals(-1, astRoot0.getEndLineno());
      assertNotNull(astRoot0);
      
      String string0 = "default:2\n";
      VariableDeclaration variableDeclaration0 = new VariableDeclaration();
      assertEquals("122", variableDeclaration0.toString());
      assertEquals(false, variableDeclaration0.hasChildren());
      assertEquals(-1, variableDeclaration0.getAbsolutePosition());
      assertNull(variableDeclaration0.getJsDoc());
      assertEquals(0, variableDeclaration0.depth());
      assertEquals(122, variableDeclaration0.getType());
      assertEquals(false, variableDeclaration0.isLet());
      assertEquals(false, variableDeclaration0.isConst());
      assertEquals(-1, variableDeclaration0.getLineno());
      assertEquals(1, variableDeclaration0.getLength());
      assertEquals(-1, variableDeclaration0.getPosition());
      assertEquals(true, variableDeclaration0.isVar());
      assertNotNull(variableDeclaration0);
      
      astRoot0.addChildToBack((com.google.javascript.jscomp.mozilla.rhino.Node) variableDeclaration0);
      assertEquals("122", variableDeclaration0.toString());
      assertEquals(false, variableDeclaration0.hasChildren());
      assertEquals(-1, variableDeclaration0.getAbsolutePosition());
      assertNull(variableDeclaration0.getJsDoc());
      assertEquals(0, variableDeclaration0.depth());
      assertEquals(122, variableDeclaration0.getType());
      assertEquals(false, variableDeclaration0.isLet());
      assertEquals(false, variableDeclaration0.isConst());
      assertEquals(-1, variableDeclaration0.getLineno());
      assertEquals(1, variableDeclaration0.getLength());
      assertEquals(-1, variableDeclaration0.getPosition());
      assertEquals(true, variableDeclaration0.isVar());
      assertEquals(0, astRoot0.depth());
      assertNull(astRoot0.getJsDoc());
      assertEquals(0, astRoot0.getParamCount());
      assertNull(astRoot0.getSourceName());
      assertEquals(true, astRoot0.hasChildren());
      assertEquals(23, astRoot0.getPosition());
      assertNull(astRoot0.getEncodedSource());
      assertEquals("136", astRoot0.toString());
      assertEquals(false, astRoot0.isInStrictMode());
      assertEquals(-1, astRoot0.getEncodedSourceStart());
      assertEquals(0, astRoot0.getRegexpCount());
      assertEquals(0, astRoot0.getFunctionCount());
      assertEquals(-1, astRoot0.getEncodedSourceEnd());
      assertEquals(-1, astRoot0.getLineno());
      assertEquals(23, astRoot0.getAbsolutePosition());
      assertEquals(-1, astRoot0.getBaseLineno());
      assertEquals(136, astRoot0.getType());
      assertEquals(1, astRoot0.getLength());
      assertEquals(-1, astRoot0.getEndLineno());
      
      VariableInitializer variableInitializer0 = new VariableInitializer();
      assertEquals(-1, variableInitializer0.getAbsolutePosition());
      assertEquals(1, variableInitializer0.getLength());
      assertEquals(-1, variableInitializer0.getPosition());
      assertEquals(-1, variableInitializer0.getLineno());
      assertEquals(122, variableInitializer0.getType());
      assertEquals(0, variableInitializer0.depth());
      assertEquals(false, variableInitializer0.hasChildren());
      assertEquals(true, variableInitializer0.isDestructuring());
      assertNull(variableInitializer0.getJsDoc());
      assertEquals("122", variableInitializer0.toString());
      assertNotNull(variableInitializer0);
      
      variableDeclaration0.addVariable(variableInitializer0);
      assertEquals("122", variableDeclaration0.toString());
      assertEquals(false, variableDeclaration0.hasChildren());
      assertEquals(-1, variableDeclaration0.getAbsolutePosition());
      assertNull(variableDeclaration0.getJsDoc());
      assertEquals(0, variableDeclaration0.depth());
      assertEquals(122, variableDeclaration0.getType());
      assertEquals(false, variableDeclaration0.isLet());
      assertEquals(false, variableDeclaration0.isConst());
      assertEquals(-1, variableDeclaration0.getLineno());
      assertEquals(1, variableDeclaration0.getLength());
      assertEquals(-1, variableDeclaration0.getPosition());
      assertEquals(true, variableDeclaration0.isVar());
      assertEquals(-1, variableInitializer0.getAbsolutePosition());
      assertEquals(1, variableInitializer0.getLength());
      assertEquals(-1, variableInitializer0.getLineno());
      assertEquals(122, variableInitializer0.getType());
      assertEquals(0, variableInitializer0.getPosition());
      assertEquals(1, variableInitializer0.depth());
      assertEquals(false, variableInitializer0.hasChildren());
      assertEquals(true, variableInitializer0.isDestructuring());
      assertNull(variableInitializer0.getJsDoc());
      assertEquals("122", variableInitializer0.toString());
      
      Config config0 = null;
      ErrorCollector errorCollector0 = new ErrorCollector();
      assertNotNull(errorCollector0);
      
      // Undeclared exception!
      try {
        Node node0 = IRFactory.transformTree(astRoot0, string0, config0, (ErrorReporter) errorCollector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      int int0 = 23;
      AstRoot astRoot0 = new AstRoot(int0);
      assertEquals(1, astRoot0.getLength());
      assertEquals(0, astRoot0.depth());
      assertNull(astRoot0.getJsDoc());
      assertEquals(23, astRoot0.getAbsolutePosition());
      assertEquals(0, astRoot0.getRegexpCount());
      assertEquals(-1, astRoot0.getEncodedSourceStart());
      assertEquals(0, astRoot0.getFunctionCount());
      assertEquals(false, astRoot0.hasChildren());
      assertEquals(136, astRoot0.getType());
      assertEquals(-1, astRoot0.getEncodedSourceEnd());
      assertEquals(0, astRoot0.getParamCount());
      assertEquals(-1, astRoot0.getEndLineno());
      assertNull(astRoot0.getSourceName());
      assertEquals(false, astRoot0.isInStrictMode());
      assertEquals("136", astRoot0.toString());
      assertEquals(-1, astRoot0.getBaseLineno());
      assertEquals(23, astRoot0.getPosition());
      assertEquals(-1, astRoot0.getLineno());
      assertNull(astRoot0.getEncodedSource());
      assertNotNull(astRoot0);
      
      String string0 = "default:2\n";
      VariableDeclaration variableDeclaration0 = new VariableDeclaration();
      assertEquals(-1, variableDeclaration0.getPosition());
      assertEquals("122", variableDeclaration0.toString());
      assertEquals(122, variableDeclaration0.getType());
      assertEquals(false, variableDeclaration0.hasChildren());
      assertEquals(false, variableDeclaration0.isLet());
      assertEquals(1, variableDeclaration0.getLength());
      assertEquals(false, variableDeclaration0.isConst());
      assertNull(variableDeclaration0.getJsDoc());
      assertEquals(-1, variableDeclaration0.getLineno());
      assertEquals(true, variableDeclaration0.isVar());
      assertEquals(-1, variableDeclaration0.getAbsolutePosition());
      assertEquals(0, variableDeclaration0.depth());
      assertNotNull(variableDeclaration0);
      
      astRoot0.addChildToBack((com.google.javascript.jscomp.mozilla.rhino.Node) variableDeclaration0);
      assertEquals(1, astRoot0.getLength());
      assertEquals(0, astRoot0.depth());
      assertNull(astRoot0.getJsDoc());
      assertEquals(23, astRoot0.getAbsolutePosition());
      assertEquals(0, astRoot0.getRegexpCount());
      assertEquals(-1, astRoot0.getEncodedSourceStart());
      assertEquals(0, astRoot0.getFunctionCount());
      assertEquals(true, astRoot0.hasChildren());
      assertEquals(136, astRoot0.getType());
      assertEquals(-1, astRoot0.getEncodedSourceEnd());
      assertEquals(0, astRoot0.getParamCount());
      assertEquals(-1, astRoot0.getEndLineno());
      assertNull(astRoot0.getSourceName());
      assertEquals(false, astRoot0.isInStrictMode());
      assertEquals("136", astRoot0.toString());
      assertEquals(-1, astRoot0.getBaseLineno());
      assertEquals(23, astRoot0.getPosition());
      assertEquals(-1, astRoot0.getLineno());
      assertNull(astRoot0.getEncodedSource());
      assertEquals(-1, variableDeclaration0.getPosition());
      assertEquals("122", variableDeclaration0.toString());
      assertEquals(122, variableDeclaration0.getType());
      assertEquals(false, variableDeclaration0.hasChildren());
      assertEquals(false, variableDeclaration0.isLet());
      assertEquals(1, variableDeclaration0.getLength());
      assertEquals(false, variableDeclaration0.isConst());
      assertNull(variableDeclaration0.getJsDoc());
      assertEquals(-1, variableDeclaration0.getLineno());
      assertEquals(true, variableDeclaration0.isVar());
      assertEquals(-1, variableDeclaration0.getAbsolutePosition());
      assertEquals(0, variableDeclaration0.depth());
      
      Config config0 = null;
      ErrorCollector errorCollector0 = new ErrorCollector();
      assertNotNull(errorCollector0);
      
      Node node0 = IRFactory.transformTree(astRoot0, string0, config0, (ErrorReporter) errorCollector0);
      assertEquals(1, astRoot0.getLength());
      assertEquals(0, astRoot0.depth());
      assertNull(astRoot0.getJsDoc());
      assertEquals(23, astRoot0.getAbsolutePosition());
      assertEquals(0, astRoot0.getRegexpCount());
      assertEquals(-1, astRoot0.getEncodedSourceStart());
      assertEquals(0, astRoot0.getFunctionCount());
      assertEquals(true, astRoot0.hasChildren());
      assertEquals(136, astRoot0.getType());
      assertEquals(-1, astRoot0.getEncodedSourceEnd());
      assertEquals(0, astRoot0.getParamCount());
      assertEquals(-1, astRoot0.getEndLineno());
      assertNull(astRoot0.getSourceName());
      assertEquals(false, astRoot0.isInStrictMode());
      assertEquals("136", astRoot0.toString());
      assertEquals(-1, astRoot0.getBaseLineno());
      assertEquals(23, astRoot0.getPosition());
      assertEquals(-1, astRoot0.getLineno());
      assertNull(astRoot0.getEncodedSource());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(true, node0.hasOneChild());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isVarArgs());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(1, node0.getChildCount());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isLocalResultCall());
      assertNotNull(node0);
  }

  @Test
  public void test3()  throws Throwable  {
      int int0 = (-2930);
      AstRoot astRoot0 = new AstRoot(int0);
      assertEquals(0, astRoot0.getFunctionCount());
      assertEquals(-2930, astRoot0.getAbsolutePosition());
      assertEquals(false, astRoot0.hasChildren());
      assertEquals(0, astRoot0.depth());
      assertEquals(1, astRoot0.getLength());
      assertNull(astRoot0.getJsDoc());
      assertEquals(-1, astRoot0.getEncodedSourceEnd());
      assertEquals("136", astRoot0.toString());
      assertEquals(-2930, astRoot0.getPosition());
      assertEquals(-1, astRoot0.getLineno());
      assertEquals(136, astRoot0.getType());
      assertNull(astRoot0.getSourceName());
      assertEquals(-1, astRoot0.getEncodedSourceStart());
      assertEquals(false, astRoot0.isInStrictMode());
      assertEquals(-1, astRoot0.getBaseLineno());
      assertNull(astRoot0.getEncodedSource());
      assertEquals(0, astRoot0.getRegexpCount());
      assertEquals(0, astRoot0.getParamCount());
      assertEquals(-1, astRoot0.getEndLineno());
      assertNotNull(astRoot0);
      
      String string0 = "cCcK {7SY+}HPR6hUxSj";
      Config config0 = null;
      SwitchCase switchCase0 = new SwitchCase(int0);
      assertEquals(true, switchCase0.isDefault());
      assertEquals(0, switchCase0.depth());
      assertEquals("115", switchCase0.toString());
      assertEquals(false, switchCase0.hasChildren());
      assertEquals(-2930, switchCase0.getPosition());
      assertEquals(-1, switchCase0.getLineno());
      assertEquals(115, switchCase0.getType());
      assertEquals(1, switchCase0.getLength());
      assertEquals(-2930, switchCase0.getAbsolutePosition());
      assertNull(switchCase0.getJsDoc());
      assertNotNull(switchCase0);
      
      astRoot0.addChildToBack((com.google.javascript.jscomp.mozilla.rhino.Node) switchCase0);
      assertEquals(true, switchCase0.isDefault());
      assertEquals(0, switchCase0.depth());
      assertEquals("115", switchCase0.toString());
      assertEquals(false, switchCase0.hasChildren());
      assertEquals(-2930, switchCase0.getPosition());
      assertEquals(-1, switchCase0.getLineno());
      assertEquals(115, switchCase0.getType());
      assertEquals(1, switchCase0.getLength());
      assertEquals(-2930, switchCase0.getAbsolutePosition());
      assertNull(switchCase0.getJsDoc());
      assertEquals(0, astRoot0.getFunctionCount());
      assertEquals(-2930, astRoot0.getAbsolutePosition());
      assertEquals(0, astRoot0.depth());
      assertEquals(1, astRoot0.getLength());
      assertEquals(true, astRoot0.hasChildren());
      assertNull(astRoot0.getJsDoc());
      assertEquals(-1, astRoot0.getEncodedSourceEnd());
      assertEquals("136", astRoot0.toString());
      assertEquals(-2930, astRoot0.getPosition());
      assertEquals(-1, astRoot0.getLineno());
      assertEquals(136, astRoot0.getType());
      assertNull(astRoot0.getSourceName());
      assertEquals(-1, astRoot0.getEncodedSourceStart());
      assertEquals(false, astRoot0.isInStrictMode());
      assertEquals(-1, astRoot0.getBaseLineno());
      assertNull(astRoot0.getEncodedSource());
      assertEquals(0, astRoot0.getRegexpCount());
      assertEquals(0, astRoot0.getParamCount());
      assertEquals(-1, astRoot0.getEndLineno());
      
      ErrorCollector errorCollector0 = new ErrorCollector();
      assertNotNull(errorCollector0);
      
      Node node0 = IRFactory.transformTree(astRoot0, string0, config0, (ErrorReporter) errorCollector0);
      assertEquals(0, astRoot0.getFunctionCount());
      assertEquals(-2930, astRoot0.getAbsolutePosition());
      assertEquals(0, astRoot0.depth());
      assertEquals(1, astRoot0.getLength());
      assertEquals(true, astRoot0.hasChildren());
      assertNull(astRoot0.getJsDoc());
      assertEquals(-1, astRoot0.getEncodedSourceEnd());
      assertEquals("136", astRoot0.toString());
      assertEquals(-2930, astRoot0.getPosition());
      assertEquals(-1, astRoot0.getLineno());
      assertEquals(136, astRoot0.getType());
      assertNull(astRoot0.getSourceName());
      assertEquals(-1, astRoot0.getEncodedSourceStart());
      assertEquals(false, astRoot0.isInStrictMode());
      assertEquals(-1, astRoot0.getBaseLineno());
      assertNull(astRoot0.getEncodedSource());
      assertEquals(0, astRoot0.getRegexpCount());
      assertEquals(0, astRoot0.getParamCount());
      assertEquals(-1, astRoot0.getEndLineno());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(-1, node0.getLineno());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isVarArgs());
      assertNotNull(node0);
  }

  @Test
  public void test4()  throws Throwable  {
      int int0 = 23;
      AstRoot astRoot0 = new AstRoot(int0);
      assertEquals(23, astRoot0.getPosition());
      assertEquals(0, astRoot0.depth());
      assertEquals(-1, astRoot0.getEndLineno());
      assertNull(astRoot0.getSourceName());
      assertEquals("136", astRoot0.toString());
      assertNull(astRoot0.getEncodedSource());
      assertEquals(false, astRoot0.isInStrictMode());
      assertEquals(-1, astRoot0.getEncodedSourceStart());
      assertEquals(-1, astRoot0.getBaseLineno());
      assertEquals(23, astRoot0.getAbsolutePosition());
      assertNull(astRoot0.getJsDoc());
      assertEquals(1, astRoot0.getLength());
      assertEquals(136, astRoot0.getType());
      assertEquals(-1, astRoot0.getLineno());
      assertEquals(0, astRoot0.getRegexpCount());
      assertEquals(-1, astRoot0.getEncodedSourceEnd());
      assertEquals(0, astRoot0.getFunctionCount());
      assertEquals(false, astRoot0.hasChildren());
      assertEquals(0, astRoot0.getParamCount());
      assertNotNull(astRoot0);
      
      String string0 = "default:2\n";
      Config config0 = null;
      ErrorCollector errorCollector0 = new ErrorCollector();
      assertNotNull(errorCollector0);
      
      Node node0 = IRFactory.transformTree(astRoot0, string0, config0, (ErrorReporter) errorCollector0);
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(0, node0.getChildCount());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.hasOneChild());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isVarArgs());
      assertEquals(23, astRoot0.getPosition());
      assertEquals(0, astRoot0.depth());
      assertEquals(-1, astRoot0.getEndLineno());
      assertNull(astRoot0.getSourceName());
      assertEquals("136", astRoot0.toString());
      assertNull(astRoot0.getEncodedSource());
      assertEquals(false, astRoot0.isInStrictMode());
      assertEquals(-1, astRoot0.getEncodedSourceStart());
      assertEquals(-1, astRoot0.getBaseLineno());
      assertEquals(23, astRoot0.getAbsolutePosition());
      assertNull(astRoot0.getJsDoc());
      assertEquals(1, astRoot0.getLength());
      assertEquals(136, astRoot0.getType());
      assertEquals(-1, astRoot0.getLineno());
      assertEquals(0, astRoot0.getRegexpCount());
      assertEquals(-1, astRoot0.getEncodedSourceEnd());
      assertEquals(0, astRoot0.getFunctionCount());
      assertEquals(false, astRoot0.hasChildren());
      assertEquals(0, astRoot0.getParamCount());
      assertNotNull(node0);
  }

  @Test
  public void test5()  throws Throwable  {
      int int0 = 16;
      AstRoot astRoot0 = new AstRoot(int0);
      assertEquals(136, astRoot0.getType());
      assertNull(astRoot0.getSourceName());
      assertEquals(1, astRoot0.getLength());
      assertEquals("136", astRoot0.toString());
      assertEquals(-1, astRoot0.getEndLineno());
      assertEquals(0, astRoot0.depth());
      assertEquals(-1, astRoot0.getLineno());
      assertNull(astRoot0.getJsDoc());
      assertEquals(-1, astRoot0.getEncodedSourceEnd());
      assertEquals(-1, astRoot0.getBaseLineno());
      assertEquals(16, astRoot0.getAbsolutePosition());
      assertEquals(false, astRoot0.hasChildren());
      assertEquals(0, astRoot0.getRegexpCount());
      assertEquals(16, astRoot0.getPosition());
      assertEquals(0, astRoot0.getFunctionCount());
      assertEquals(false, astRoot0.isInStrictMode());
      assertEquals(-1, astRoot0.getEncodedSourceStart());
      assertNull(astRoot0.getEncodedSource());
      assertEquals(0, astRoot0.getParamCount());
      assertNotNull(astRoot0);
      
      String string0 = "de!ault:0\n";
      int int1 = (-1169);
      AstRoot astRoot1 = (AstRoot)astRoot0.setType(int1);
      assertFalse(int1 == int0);
      assertFalse(int0 == int1);
      assertSame(astRoot0, astRoot1);
      assertSame(astRoot1, astRoot0);
      assertNull(astRoot0.getSourceName());
      assertEquals(1, astRoot0.getLength());
      assertEquals(-1, astRoot0.getEndLineno());
      assertEquals(0, astRoot0.depth());
      assertEquals(-1, astRoot0.getLineno());
      assertNull(astRoot0.getJsDoc());
      assertEquals(-1, astRoot0.getEncodedSourceEnd());
      assertEquals(-1, astRoot0.getBaseLineno());
      assertEquals(16, astRoot0.getAbsolutePosition());
      assertEquals(false, astRoot0.hasChildren());
      assertEquals("-1169", astRoot0.toString());
      assertEquals(0, astRoot0.getRegexpCount());
      assertEquals(16, astRoot0.getPosition());
      assertEquals(0, astRoot0.getFunctionCount());
      assertEquals(false, astRoot0.isInStrictMode());
      assertEquals(-1169, astRoot0.getType());
      assertEquals(-1, astRoot0.getEncodedSourceStart());
      assertNull(astRoot0.getEncodedSource());
      assertEquals(0, astRoot0.getParamCount());
      assertNull(astRoot1.getSourceName());
      assertEquals(0, astRoot1.getFunctionCount());
      assertEquals(-1169, astRoot1.getType());
      assertEquals(0, astRoot1.getRegexpCount());
      assertNull(astRoot1.getEncodedSource());
      assertEquals(16, astRoot1.getPosition());
      assertEquals(16, astRoot1.getAbsolutePosition());
      assertEquals("-1169", astRoot1.toString());
      assertEquals(-1, astRoot1.getLineno());
      assertNull(astRoot1.getJsDoc());
      assertEquals(1, astRoot1.getLength());
      assertEquals(0, astRoot1.getParamCount());
      assertEquals(0, astRoot1.depth());
      assertEquals(false, astRoot1.hasChildren());
      assertEquals(-1, astRoot1.getEndLineno());
      assertEquals(false, astRoot1.isInStrictMode());
      assertEquals(-1, astRoot1.getEncodedSourceEnd());
      assertEquals(-1, astRoot1.getEncodedSourceStart());
      assertEquals(-1, astRoot1.getBaseLineno());
      assertNotNull(astRoot1);
      
      Config config0 = null;
      ErrorCollector errorCollector0 = new ErrorCollector();
      assertNotNull(errorCollector0);
      
      // Undeclared exception!
      try {
        Node node0 = IRFactory.transformTree(astRoot0, string0, config0, (ErrorReporter) errorCollector0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // -1169
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      int int0 = 16;
      AstRoot astRoot0 = new AstRoot(int0);
      assertEquals(0, astRoot0.depth());
      assertEquals(-1, astRoot0.getEncodedSourceStart());
      assertEquals("136", astRoot0.toString());
      assertNull(astRoot0.getEncodedSource());
      assertEquals(136, astRoot0.getType());
      assertEquals(-1, astRoot0.getBaseLineno());
      assertEquals(-1, astRoot0.getEndLineno());
      assertEquals(0, astRoot0.getParamCount());
      assertNull(astRoot0.getSourceName());
      assertEquals(16, astRoot0.getPosition());
      assertEquals(-1, astRoot0.getLineno());
      assertEquals(false, astRoot0.hasChildren());
      assertEquals(false, astRoot0.isInStrictMode());
      assertEquals(-1, astRoot0.getEncodedSourceEnd());
      assertEquals(16, astRoot0.getAbsolutePosition());
      assertEquals(1, astRoot0.getLength());
      assertNull(astRoot0.getJsDoc());
      assertEquals(0, astRoot0.getFunctionCount());
      assertEquals(0, astRoot0.getRegexpCount());
      assertNotNull(astRoot0);
      
      Label label0 = new Label();
      assertEquals("130", label0.toString());
      assertNull(label0.getName());
      assertEquals(-1, label0.getPosition());
      assertEquals(130, label0.getType());
      assertEquals(1, label0.getLength());
      assertEquals(-1, label0.getAbsolutePosition());
      assertNull(label0.getJsDoc());
      assertEquals(0, label0.depth());
      assertEquals(-1, label0.getLineno());
      assertEquals(false, label0.hasChildren());
      assertNotNull(label0);
      
      astRoot0.addChildrenToBack((com.google.javascript.jscomp.mozilla.rhino.Node) label0);
      assertEquals(0, astRoot0.depth());
      assertEquals(-1, astRoot0.getEncodedSourceStart());
      assertEquals(true, astRoot0.hasChildren());
      assertEquals("136", astRoot0.toString());
      assertNull(astRoot0.getEncodedSource());
      assertEquals(136, astRoot0.getType());
      assertEquals(-1, astRoot0.getBaseLineno());
      assertEquals(-1, astRoot0.getEndLineno());
      assertEquals(0, astRoot0.getParamCount());
      assertNull(astRoot0.getSourceName());
      assertEquals(16, astRoot0.getPosition());
      assertEquals(-1, astRoot0.getLineno());
      assertEquals(false, astRoot0.isInStrictMode());
      assertEquals(-1, astRoot0.getEncodedSourceEnd());
      assertEquals(16, astRoot0.getAbsolutePosition());
      assertEquals(1, astRoot0.getLength());
      assertNull(astRoot0.getJsDoc());
      assertEquals(0, astRoot0.getFunctionCount());
      assertEquals(0, astRoot0.getRegexpCount());
      assertEquals("130", label0.toString());
      assertNull(label0.getName());
      assertEquals(-1, label0.getPosition());
      assertEquals(130, label0.getType());
      assertEquals(1, label0.getLength());
      assertEquals(-1, label0.getAbsolutePosition());
      assertNull(label0.getJsDoc());
      assertEquals(0, label0.depth());
      assertEquals(-1, label0.getLineno());
      assertEquals(false, label0.hasChildren());
      
      String string0 = "dec";
      Config config0 = null;
      ErrorCollector errorCollector0 = new ErrorCollector();
      assertNotNull(errorCollector0);
      
      // Undeclared exception!
      try {
        Node node0 = IRFactory.transformTree(astRoot0, string0, config0, (ErrorReporter) errorCollector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // StringNode: str is null
         //
      }
  }
}