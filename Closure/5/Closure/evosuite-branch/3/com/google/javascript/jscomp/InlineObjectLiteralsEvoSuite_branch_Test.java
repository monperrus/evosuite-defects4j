/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:41:12 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.common.base.Supplier;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ErrorManager;
import com.google.javascript.jscomp.InlineObjectLiterals;
import com.google.javascript.jscomp.MessageFormatter;
import com.google.javascript.jscomp.PrintStreamErrorManager;
import com.google.javascript.rhino.Node;
import java.io.PrintStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockRuntimeException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class InlineObjectLiteralsEvoSuite_branch_Test extends InlineObjectLiteralsEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      int int0 = (-1832);
      Node node0 = new Node(int0);
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isFor());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isFalse());
      assertEquals(-1832, node0.getType());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isFunction());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(-1, node0.getSourcePosition());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isSetterDef());
      assertNull(node0.getSourceFileName());
      assertEquals(0, node0.getSideEffectFlags());
      assertNotNull(node0);
      
      MessageFormatter messageFormatter0 = null;
      PrintStream printStream0 = null;
      PrintStreamErrorManager printStreamErrorManager0 = new PrintStreamErrorManager(messageFormatter0, printStream0);
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertNotNull(printStreamErrorManager0);
      
      Compiler compiler0 = new Compiler((ErrorManager) printStreamErrorManager0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertNotNull(compiler0);
      
      Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertNotNull(supplier0);
      
      InlineObjectLiterals inlineObjectLiterals0 = new InlineObjectLiterals(compiler0, supplier0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertNotNull(inlineObjectLiterals0);
      
      // Undeclared exception!
      try {
        inlineObjectLiterals0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //
      }
  }
}