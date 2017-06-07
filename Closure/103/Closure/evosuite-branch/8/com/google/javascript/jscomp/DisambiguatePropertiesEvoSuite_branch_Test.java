/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:02:31 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ConcreteType;
import com.google.javascript.jscomp.DisambiguateProperties;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.SemanticReverseAbstractInterpreter;
import com.google.javascript.jscomp.TightenTypes;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.NamedType;
import com.google.javascript.rhino.jstype.StringType;
import java.util.List;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class DisambiguatePropertiesEvoSuite_branch_Test extends DisambiguatePropertiesEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertNotNull(compiler0);
      
      DisambiguateProperties<JSType> disambiguateProperties0 = DisambiguateProperties.forJSTypeSystem(compiler0);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertNotNull(disambiguateProperties0);
      
      String string0 = "xDCJ#";
      GoogleCodingConvention googleCodingConvention0 = new GoogleCodingConvention();
      assertEquals("goog.abstractMethod", googleCodingConvention0.getAbstractMethodName());
      assertEquals("goog.exportSymbol", googleCodingConvention0.getExportSymbolFunction());
      assertEquals("goog.exportProperty", googleCodingConvention0.getExportPropertyFunction());
      assertNull(googleCodingConvention0.getDelegateSuperclassName());
      assertEquals("goog.global", googleCodingConvention0.getGlobalObject());
      assertNotNull(googleCodingConvention0);
      
      TightenTypes tightenTypes0 = new TightenTypes(compiler0);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertNotNull(tightenTypes0);
      
      JSTypeRegistry jSTypeRegistry0 = tightenTypes0.getTypeRegistry();
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertNotNull(jSTypeRegistry0);
      
      SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter0 = new SemanticReverseAbstractInterpreter(googleCodingConvention0, jSTypeRegistry0);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals("goog.abstractMethod", googleCodingConvention0.getAbstractMethodName());
      assertEquals("goog.exportSymbol", googleCodingConvention0.getExportSymbolFunction());
      assertEquals("goog.exportProperty", googleCodingConvention0.getExportPropertyFunction());
      assertNull(googleCodingConvention0.getDelegateSuperclassName());
      assertEquals("goog.global", googleCodingConvention0.getGlobalObject());
      assertNotNull(semanticReverseAbstractInterpreter0);
      
      JSTypeNative jSTypeNative0 = JSTypeNative.STRING_TYPE;
      StringType stringType0 = (StringType)semanticReverseAbstractInterpreter0.getNativeType(jSTypeNative0);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals("goog.abstractMethod", googleCodingConvention0.getAbstractMethodName());
      assertEquals("goog.exportSymbol", googleCodingConvention0.getExportSymbolFunction());
      assertEquals("goog.exportProperty", googleCodingConvention0.getExportPropertyFunction());
      assertNull(googleCodingConvention0.getDelegateSuperclassName());
      assertEquals("goog.global", googleCodingConvention0.getGlobalObject());
      assertEquals(false, stringType0.isAllType());
      assertEquals(false, stringType0.isFunctionType());
      assertEquals(false, stringType0.isVoidType());
      assertEquals(false, stringType0.isTemplateType());
      assertEquals(BooleanLiteralSet.BOTH, stringType0.getPossibleToBooleanOutcomes());
      assertEquals(false, stringType0.isNamedType());
      assertEquals(true, stringType0.matchesObjectContext());
      assertEquals("string", stringType0.toString());
      assertEquals(false, stringType0.isResolved());
      assertEquals(false, stringType0.isRecordType());
      assertEquals(false, stringType0.isUnionType());
      assertEquals(true, stringType0.isStringValueType());
      assertEquals(false, stringType0.isEmptyType());
      assertEquals(true, stringType0.matchesNumberContext());
      assertEquals(false, stringType0.isNumberValueType());
      assertEquals(false, stringType0.isNullType());
      assertEquals(false, stringType0.isNoType());
      assertEquals(true, stringType0.matchesStringContext());
      assertEquals(false, stringType0.isBooleanValueType());
      assertEquals(false, stringType0.isNoObjectType());
      assertNotNull(stringType0);
      
      JSType jSType0 = disambiguateProperties0.getTypeWithProperty(string0, stringType0);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals("goog.abstractMethod", googleCodingConvention0.getAbstractMethodName());
      assertEquals("goog.exportSymbol", googleCodingConvention0.getExportSymbolFunction());
      assertEquals("goog.exportProperty", googleCodingConvention0.getExportPropertyFunction());
      assertNull(googleCodingConvention0.getDelegateSuperclassName());
      assertEquals("goog.global", googleCodingConvention0.getGlobalObject());
      assertEquals(false, stringType0.isAllType());
      assertEquals(false, stringType0.isFunctionType());
      assertEquals(false, stringType0.isVoidType());
      assertEquals(false, stringType0.isTemplateType());
      assertEquals(BooleanLiteralSet.BOTH, stringType0.getPossibleToBooleanOutcomes());
      assertEquals(false, stringType0.isNamedType());
      assertEquals(true, stringType0.matchesObjectContext());
      assertEquals("string", stringType0.toString());
      assertEquals(false, stringType0.isResolved());
      assertEquals(false, stringType0.isRecordType());
      assertEquals(false, stringType0.isUnionType());
      assertEquals(true, stringType0.isStringValueType());
      assertEquals(false, stringType0.isEmptyType());
      assertEquals(true, stringType0.matchesNumberContext());
      assertEquals(false, stringType0.isNumberValueType());
      assertEquals(false, stringType0.isNullType());
      assertEquals(false, stringType0.isNoType());
      assertEquals(true, stringType0.matchesStringContext());
      assertEquals(false, stringType0.isBooleanValueType());
      assertEquals(false, stringType0.isNoObjectType());
      assertNull(jSType0);
  }

  @Test
  public void test1()  throws Throwable  {
      byte byte0 = (byte)0;
      Compiler compiler0 = new Compiler();
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertNotNull(compiler0);
      
      DisambiguateProperties<JSType> disambiguateProperties0 = DisambiguateProperties.forJSTypeSystem(compiler0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertNotNull(disambiguateProperties0);
      
      String string0 = "Enums must contain at least one value.";
      TightenTypes tightenTypes0 = new TightenTypes(compiler0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertNotNull(tightenTypes0);
      
      JSTypeRegistry jSTypeRegistry0 = tightenTypes0.getTypeRegistry();
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertNotNull(jSTypeRegistry0);
      
      NamedType namedType0 = new NamedType(jSTypeRegistry0, string0, string0, (int) byte0, (int) byte0);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, namedType0.isResolved());
      assertEquals(false, namedType0.isNoObjectType());
      assertEquals("Enums must contain at least one value.", namedType0.getReferenceName());
      assertEquals("Enums must contain at least one value.", namedType0.toString());
      assertEquals(false, namedType0.isNativeObjectType());
      assertEquals(true, namedType0.hasReferenceName());
      assertEquals(true, namedType0.isNamedType());
      assertEquals(false, namedType0.isNoType());
      assertEquals(false, namedType0.isFunctionType());
      assertEquals(false, namedType0.isEmptyType());
      assertEquals(false, namedType0.isAllType());
      assertEquals(false, namedType0.isVoidType());
      assertEquals(false, namedType0.isRecordType());
      assertEquals(true, namedType0.isNominalType());
      assertEquals(false, namedType0.isNumberValueType());
      assertEquals(false, namedType0.isStringValueType());
      assertEquals(BooleanLiteralSet.TRUE, namedType0.getPossibleToBooleanOutcomes());
      assertEquals(false, namedType0.isBooleanValueType());
      assertEquals(false, namedType0.hasCachedValues());
      assertEquals(false, namedType0.isTemplateType());
      assertEquals(false, namedType0.isNullType());
      assertEquals(false, namedType0.isUnionType());
      assertNotNull(namedType0);
      
      EnumType enumType0 = jSTypeRegistry0.createEnumType(string0, (JSType) namedType0);
      assertEquals(false, enumType0.isNumberValueType());
      assertEquals(false, enumType0.isEmptyType());
      assertEquals(true, enumType0.matchesObjectContext());
      assertEquals(false, enumType0.isNamedType());
      assertEquals(false, enumType0.isStringValueType());
      assertEquals(false, enumType0.isUnionType());
      assertEquals(false, enumType0.isNullType());
      assertEquals(BooleanLiteralSet.TRUE, enumType0.getPossibleToBooleanOutcomes());
      assertEquals(false, enumType0.isBooleanValueType());
      assertEquals(false, enumType0.matchesNumberContext());
      assertEquals(false, enumType0.isNoObjectType());
      assertEquals(false, enumType0.isVoidType());
      assertEquals(false, enumType0.isAllType());
      assertEquals(false, enumType0.isRecordType());
      assertEquals(false, enumType0.isFunctionType());
      assertEquals(true, enumType0.matchesStringContext());
      assertEquals(false, enumType0.isNoType());
      assertEquals(true, enumType0.isEnumType());
      assertEquals(false, enumType0.isResolved());
      assertEquals(false, enumType0.isTemplateType());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, namedType0.isResolved());
      assertEquals(false, namedType0.isNoObjectType());
      assertEquals("Enums must contain at least one value.", namedType0.getReferenceName());
      assertEquals("Enums must contain at least one value.", namedType0.toString());
      assertEquals(false, namedType0.isNativeObjectType());
      assertEquals(true, namedType0.hasReferenceName());
      assertEquals(true, namedType0.isNamedType());
      assertEquals(false, namedType0.isNoType());
      assertEquals(false, namedType0.isFunctionType());
      assertEquals(false, namedType0.isEmptyType());
      assertEquals(false, namedType0.isAllType());
      assertEquals(false, namedType0.isVoidType());
      assertEquals(false, namedType0.isRecordType());
      assertEquals(true, namedType0.isNominalType());
      assertEquals(false, namedType0.isNumberValueType());
      assertEquals(false, namedType0.isStringValueType());
      assertEquals(BooleanLiteralSet.TRUE, namedType0.getPossibleToBooleanOutcomes());
      assertEquals(false, namedType0.isBooleanValueType());
      assertEquals(false, namedType0.hasCachedValues());
      assertEquals(false, namedType0.isTemplateType());
      assertEquals(false, namedType0.isNullType());
      assertEquals(false, namedType0.isUnionType());
      assertNotNull(enumType0);
      
      EnumElementType enumElementType0 = enumType0.getElementsType();
      assertEquals(false, enumType0.isNumberValueType());
      assertEquals(false, enumType0.isEmptyType());
      assertEquals(true, enumType0.matchesObjectContext());
      assertEquals(false, enumType0.isNamedType());
      assertEquals(false, enumType0.isStringValueType());
      assertEquals(false, enumType0.isUnionType());
      assertEquals(false, enumType0.isNullType());
      assertEquals(BooleanLiteralSet.TRUE, enumType0.getPossibleToBooleanOutcomes());
      assertEquals(false, enumType0.isBooleanValueType());
      assertEquals(false, enumType0.matchesNumberContext());
      assertEquals(false, enumType0.isNoObjectType());
      assertEquals(false, enumType0.isVoidType());
      assertEquals(false, enumType0.isAllType());
      assertEquals(false, enumType0.isRecordType());
      assertEquals(false, enumType0.isFunctionType());
      assertEquals(true, enumType0.matchesStringContext());
      assertEquals(false, enumType0.isNoType());
      assertEquals(true, enumType0.isEnumType());
      assertEquals(false, enumType0.isResolved());
      assertEquals(false, enumType0.isTemplateType());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(true, enumElementType0.isEnumElementType());
      assertEquals(false, enumElementType0.isNamedType());
      assertEquals(false, enumElementType0.isNullType());
      assertEquals(BooleanLiteralSet.TRUE, enumElementType0.getPossibleToBooleanOutcomes());
      assertEquals(false, enumElementType0.isFunctionType());
      assertEquals(false, enumElementType0.isStringValueType());
      assertEquals(false, enumElementType0.isNoObjectType());
      assertEquals(false, enumElementType0.isNoType());
      assertEquals("Enums must contain at least one value.", enumElementType0.getReferenceName());
      assertEquals(false, enumElementType0.isRecordType());
      assertEquals(false, enumElementType0.isUnionType());
      assertEquals(false, enumElementType0.isTemplateType());
      assertEquals(false, enumElementType0.hasCachedValues());
      assertEquals(true, enumElementType0.hasReferenceName());
      assertEquals(false, enumElementType0.isNativeObjectType());
      assertEquals(false, enumElementType0.isEmptyType());
      assertEquals(false, enumElementType0.isVoidType());
      assertEquals(false, enumElementType0.isNumberValueType());
      assertEquals(false, enumElementType0.isAllType());
      assertEquals(false, enumElementType0.isBooleanValueType());
      assertEquals(false, enumElementType0.isResolved());
      assertEquals(true, enumElementType0.isNominalType());
      assertEquals(false, namedType0.isResolved());
      assertEquals(false, namedType0.isNoObjectType());
      assertEquals("Enums must contain at least one value.", namedType0.getReferenceName());
      assertEquals("Enums must contain at least one value.", namedType0.toString());
      assertEquals(false, namedType0.isNativeObjectType());
      assertEquals(true, namedType0.hasReferenceName());
      assertEquals(true, namedType0.isNamedType());
      assertEquals(false, namedType0.isNoType());
      assertEquals(false, namedType0.isFunctionType());
      assertEquals(false, namedType0.isEmptyType());
      assertEquals(false, namedType0.isAllType());
      assertEquals(false, namedType0.isVoidType());
      assertEquals(false, namedType0.isRecordType());
      assertEquals(true, namedType0.isNominalType());
      assertEquals(false, namedType0.isNumberValueType());
      assertEquals(false, namedType0.isStringValueType());
      assertEquals(BooleanLiteralSet.TRUE, namedType0.getPossibleToBooleanOutcomes());
      assertEquals(false, namedType0.isBooleanValueType());
      assertEquals(false, namedType0.hasCachedValues());
      assertEquals(false, namedType0.isTemplateType());
      assertEquals(false, namedType0.isNullType());
      assertEquals(false, namedType0.isUnionType());
      assertNotNull(enumElementType0);
      
      EnumElementType enumElementType1 = (EnumElementType)disambiguateProperties0.getTypeWithProperty(string0, enumElementType0);
      assertEquals(false, enumType0.isNumberValueType());
      assertEquals(false, enumType0.isEmptyType());
      assertEquals(true, enumType0.matchesObjectContext());
      assertEquals(false, enumType0.isNamedType());
      assertEquals(false, enumType0.isStringValueType());
      assertEquals(false, enumType0.isUnionType());
      assertEquals(false, enumType0.isNullType());
      assertEquals(BooleanLiteralSet.TRUE, enumType0.getPossibleToBooleanOutcomes());
      assertEquals(false, enumType0.isBooleanValueType());
      assertEquals(false, enumType0.matchesNumberContext());
      assertEquals(false, enumType0.isNoObjectType());
      assertEquals(false, enumType0.isVoidType());
      assertEquals(false, enumType0.isAllType());
      assertEquals(false, enumType0.isRecordType());
      assertEquals(false, enumType0.isFunctionType());
      assertEquals(true, enumType0.matchesStringContext());
      assertEquals(false, enumType0.isNoType());
      assertEquals(true, enumType0.isEnumType());
      assertEquals(false, enumType0.isResolved());
      assertEquals(false, enumType0.isTemplateType());
      assertEquals("Enums must contain at least one value.", enumElementType1.getReferenceName());
      assertEquals(false, enumElementType1.isNamedType());
      assertEquals(true, enumElementType1.isNominalType());
      assertEquals(false, enumElementType1.isNativeObjectType());
      assertEquals(false, enumElementType1.isStringValueType());
      assertEquals(false, enumElementType1.isTemplateType());
      assertEquals(false, enumElementType1.isUnionType());
      assertEquals(false, enumElementType1.isAllType());
      assertEquals(true, enumElementType1.isEnumElementType());
      assertEquals(false, enumElementType1.isRecordType());
      assertEquals(false, enumElementType1.hasCachedValues());
      assertEquals(true, enumElementType1.hasReferenceName());
      assertEquals(false, enumElementType1.isBooleanValueType());
      assertEquals(false, enumElementType1.isNoObjectType());
      assertEquals(false, enumElementType1.isFunctionType());
      assertEquals(false, enumElementType1.isNumberValueType());
      assertEquals(false, enumElementType1.isEmptyType());
      assertEquals(false, enumElementType1.isNoType());
      assertEquals(false, enumElementType1.isNullType());
      assertEquals(false, enumElementType1.isResolved());
      assertEquals(BooleanLiteralSet.TRUE, enumElementType1.getPossibleToBooleanOutcomes());
      assertEquals(false, enumElementType1.isVoidType());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(true, enumElementType0.isEnumElementType());
      assertEquals(false, enumElementType0.isNamedType());
      assertEquals(false, enumElementType0.isNullType());
      assertEquals(BooleanLiteralSet.TRUE, enumElementType0.getPossibleToBooleanOutcomes());
      assertEquals(false, enumElementType0.isFunctionType());
      assertEquals(false, enumElementType0.isStringValueType());
      assertEquals(false, enumElementType0.isNoObjectType());
      assertEquals(false, enumElementType0.isNoType());
      assertEquals("Enums must contain at least one value.", enumElementType0.getReferenceName());
      assertEquals(false, enumElementType0.isRecordType());
      assertEquals(false, enumElementType0.isUnionType());
      assertEquals(false, enumElementType0.isTemplateType());
      assertEquals(false, enumElementType0.hasCachedValues());
      assertEquals(true, enumElementType0.hasReferenceName());
      assertEquals(false, enumElementType0.isNativeObjectType());
      assertEquals(false, enumElementType0.isEmptyType());
      assertEquals(false, enumElementType0.isVoidType());
      assertEquals(false, enumElementType0.isNumberValueType());
      assertEquals(false, enumElementType0.isAllType());
      assertEquals(false, enumElementType0.isBooleanValueType());
      assertEquals(false, enumElementType0.isResolved());
      assertEquals(true, enumElementType0.isNominalType());
      assertEquals(false, namedType0.isResolved());
      assertEquals(false, namedType0.isNoObjectType());
      assertEquals("Enums must contain at least one value.", namedType0.getReferenceName());
      assertEquals("Enums must contain at least one value.", namedType0.toString());
      assertEquals(false, namedType0.isNativeObjectType());
      assertEquals(true, namedType0.hasReferenceName());
      assertEquals(true, namedType0.isNamedType());
      assertEquals(false, namedType0.isNoType());
      assertEquals(false, namedType0.isFunctionType());
      assertEquals(false, namedType0.isEmptyType());
      assertEquals(false, namedType0.isAllType());
      assertEquals(false, namedType0.isVoidType());
      assertEquals(false, namedType0.isRecordType());
      assertEquals(true, namedType0.isNominalType());
      assertEquals(false, namedType0.isNumberValueType());
      assertEquals(false, namedType0.isStringValueType());
      assertEquals(BooleanLiteralSet.TRUE, namedType0.getPossibleToBooleanOutcomes());
      assertEquals(false, namedType0.isBooleanValueType());
      assertEquals(false, namedType0.hasCachedValues());
      assertEquals(false, namedType0.isTemplateType());
      assertEquals(false, namedType0.isNullType());
      assertEquals(false, namedType0.isUnionType());
      assertSame(enumElementType1, enumElementType0);
      assertSame(enumElementType0, enumElementType1);
      assertNotNull(enumElementType1);
  }

  @Test
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertNotNull(compiler0);
      
      TightenTypes tightenTypes0 = new TightenTypes(compiler0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertNotNull(tightenTypes0);
      
      DisambiguateProperties<ConcreteType> disambiguateProperties0 = DisambiguateProperties.forConcreteTypeSystem(compiler0, tightenTypes0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertNotNull(disambiguateProperties0);
      
      String string0 = "!Sg4-SR>v{&x+c?";
      ConcreteType concreteType0 = ConcreteType.ALL;
      assertNotNull(concreteType0);
      
      ConcreteType concreteType1 = disambiguateProperties0.getTypeWithProperty(string0, concreteType0);
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertNull(concreteType1);
  }

  @Test
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertNotNull(compiler0);
      
      DisambiguateProperties<JSType> disambiguateProperties0 = DisambiguateProperties.forJSTypeSystem(compiler0);
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertNotNull(disambiguateProperties0);
      
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      assertNotNull(simpleErrorReporter0);
      
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry((ErrorReporter) simpleErrorReporter0);
      assertNotNull(jSTypeRegistry0);
      
      Stack<JSType> stack0 = new Stack<JSType>();
      assertEquals(10, stack0.capacity());
      assertEquals(0, stack0.size());
      assertEquals(true, stack0.isEmpty());
      assertEquals("[]", stack0.toString());
      assertEquals(true, stack0.empty());
      assertNotNull(stack0);
      
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) stack0);
      assertEquals(10, stack0.capacity());
      assertEquals(0, stack0.size());
      assertEquals(true, stack0.isEmpty());
      assertEquals("[]", stack0.toString());
      assertEquals(true, stack0.empty());
      assertEquals(false, node0.hasChildren());
      assertEquals(83, node0.getType());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(-1, node0.getCharno());
      assertNotNull(node0);
      
      disambiguateProperties0.process(node0, node0);
      assertEquals(10, stack0.capacity());
      assertEquals(0, stack0.size());
      assertEquals(true, stack0.isEmpty());
      assertEquals("[]", stack0.toString());
      assertEquals(true, stack0.empty());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, node0.hasChildren());
      assertEquals(83, node0.getType());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(-1, node0.getCharno());
  }
}