/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Dec 11 23:08:56 GMT 2014
 */

package com.google.javascript.jscomp.parsing;

import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;

public class IRFactoryEvoSuite_branch_Test_scaffolding {

  @org.junit.Rule 
  public org.junit.rules.Timeout globalTimeout = new org.junit.rules.Timeout(6000); 

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 5000);
  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    resetClasses(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("java.vm.vendor", "Oracle Corporation"); 
    java.lang.System.setProperty("java.specification.version", "1.7"); 
            java.lang.System.setProperty("java.home", "/usr/local/packages6/java/jdk1.7.0_55/jre"); 
    java.lang.System.setProperty("user.dir", "/scratch/ac1gf/Closure/84/5/run_evosuite.pl_10401_1418338696"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
            java.lang.System.setProperty("awt.toolkit", "sun.awt.X11.XToolkit"); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("file.separator", "/"); 
        java.lang.System.setProperty("java.awt.graphicsenv", "sun.awt.X11GraphicsEnvironment"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.awt.printerjob", "sun.print.PSPrinterJob"); 
    java.lang.System.setProperty("java.class.path", "/data/ac1gf/defects4j/framework/projects/lib/evosuite.jar:/scratch/ac1gf/Closure/84/5/run_evosuite.pl_10401_1418338696/build/classes:/scratch/ac1gf/Closure/84/5/run_evosuite.pl_10401_1418338696/lib/ant-launcher.jar:/scratch/ac1gf/Closure/84/5/run_evosuite.pl_10401_1418338696/lib/ant.jar:/scratch/ac1gf/Closure/84/5/run_evosuite.pl_10401_1418338696/lib/args4j.jar:/scratch/ac1gf/Closure/84/5/run_evosuite.pl_10401_1418338696/lib/caja-r4314.jar:/scratch/ac1gf/Closure/84/5/run_evosuite.pl_10401_1418338696/lib/guava.jar:/scratch/ac1gf/Closure/84/5/run_evosuite.pl_10401_1418338696/lib/json.jar:/scratch/ac1gf/Closure/84/5/run_evosuite.pl_10401_1418338696/lib/jsr305.jar:/scratch/ac1gf/Closure/84/5/run_evosuite.pl_10401_1418338696/lib/junit.jar:/scratch/ac1gf/Closure/84/5/run_evosuite.pl_10401_1418338696/lib/libtrunk_rhino_parser_jarjared.jar:/scratch/ac1gf/Closure/84/5/run_evosuite.pl_10401_1418338696/lib/protobuf-java.jar"); 
    java.lang.System.setProperty("java.class.version", "51.0"); 
        java.lang.System.setProperty("java.endorsed.dirs", "/usr/local/packages6/java/jdk1.7.0_55/jre/lib/endorsed"); 
    java.lang.System.setProperty("java.ext.dirs", "/usr/local/packages6/java/jdk1.7.0_55/jre/lib/ext:/usr/java/packages/lib/ext"); 
    java.lang.System.setProperty("java.library.path", "lib"); 
    java.lang.System.setProperty("java.runtime.name", "Java(TM) SE Runtime Environment"); 
    java.lang.System.setProperty("java.runtime.version", "1.7.0_55-b13"); 
    java.lang.System.setProperty("java.specification.name", "Java Platform API Specification"); 
    java.lang.System.setProperty("java.specification.vendor", "Oracle Corporation"); 
        java.lang.System.setProperty("java.vendor", "Oracle Corporation"); 
    java.lang.System.setProperty("java.vendor.url", "http://java.oracle.com/"); 
    java.lang.System.setProperty("java.version", "1.7.0_55"); 
    java.lang.System.setProperty("java.vm.info", "mixed mode"); 
    java.lang.System.setProperty("java.vm.name", "Java HotSpot(TM) 64-Bit Server VM"); 
    java.lang.System.setProperty("java.vm.specification.name", "Java Virtual Machine Specification"); 
    java.lang.System.setProperty("java.vm.specification.vendor", "Oracle Corporation"); 
    java.lang.System.setProperty("java.vm.specification.version", "1.7"); 
    java.lang.System.setProperty("java.vm.version", "24.55-b03"); 
    java.lang.System.setProperty("line.separator", "\n"); 
    java.lang.System.setProperty("os.arch", "amd64"); 
    java.lang.System.setProperty("os.name", "Linux"); 
    java.lang.System.setProperty("os.version", "2.6.32-431.23.3.el6.x86_64"); 
    java.lang.System.setProperty("path.separator", ":"); 
    java.lang.System.setProperty("user.country", "GB"); 
    java.lang.System.setProperty("user.home", "/home/ac1gf"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ac1gf"); 
    java.lang.System.setProperty("user.timezone", "Europe/Guernsey"); 
                          }

  private static void initializeClasses() {
    org.evosuite.runtime.ClassStateSupport.initializeClasses(IRFactoryEvoSuite_branch_Test_scaffolding.class.getClassLoader() ,
      "com.google.common.collect.Iterators$1",
      "com.google.javascript.rhino.jstype.VoidType",
      "com.google.javascript.jscomp.mozilla.rhino.JavaAdapter",
      "com.google.javascript.jscomp.mozilla.rhino.Function",
      "com.google.common.collect.Iterators$3",
      "com.google.common.collect.Iterators$2",
      "com.google.common.collect.Iterators$7",
      "com.google.common.collect.Iterators$6",
      "com.google.common.collect.EmptyImmutableSet",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ScriptNode",
      "com.google.javascript.jscomp.mozilla.rhino.ast.Label",
      "com.google.javascript.jscomp.mozilla.rhino.ast.RegExpLiteral",
      "com.google.javascript.jscomp.mozilla.rhino.ClassShutter",
      "com.google.javascript.jscomp.mozilla.rhino.Scriptable",
      "com.google.javascript.jscomp.mozilla.rhino.ast.DestructuringForm",
      "com.google.javascript.jscomp.mozilla.rhino.tools.shell.Runner",
      "com.google.common.collect.SingletonImmutableMap",
      "com.google.common.collect.Lists",
      "com.google.javascript.jscomp.mozilla.rhino.ast.AstNode$DebugPrintVisitor",
      "com.google.javascript.jscomp.mozilla.rhino.MemberBox",
      "com.google.common.io.PatternFilenameFilter",
      "com.google.javascript.jscomp.mozilla.rhino.NativeMath",
      "com.google.common.collect.AbstractIterator",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ExpressionStatement",
      "com.google.common.base.Predicates$1",
      "com.google.javascript.jscomp.mozilla.rhino.BoundFunction",
      "com.google.javascript.jscomp.mozilla.rhino.Node$PropListItem",
      "com.google.javascript.rhino.jstype.UnresolvedTypeExpression",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ErrorNode",
      "com.google.javascript.jscomp.mozilla.rhino.ast.PropertyGet",
      "com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement",
      "com.google.javascript.jscomp.mozilla.rhino.BeanProperty",
      "com.google.common.base.Predicates$ObjectPredicate",
      "com.google.javascript.jscomp.mozilla.rhino.ast.Comment",
      "com.google.common.collect.RegularImmutableList",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ForLoop",
      "com.google.javascript.rhino.JSDocInfo$TypePosition",
      "com.google.javascript.jscomp.mozilla.rhino.NativeGlobal",
      "com.google.javascript.jscomp.mozilla.rhino.NativeNumber",
      "com.google.javascript.jscomp.mozilla.rhino.NativeJavaObject",
      "com.google.javascript.jscomp.mozilla.rhino.Delegator",
      "com.google.javascript.jscomp.mozilla.rhino.Synchronizer",
      "com.google.javascript.rhino.Node$SiblingNodeIterable",
      "com.google.javascript.jscomp.mozilla.rhino.debug.DebuggableObject",
      "com.google.javascript.jscomp.mozilla.rhino.ast.VariableInitializer",
      "com.google.javascript.jscomp.mozilla.rhino.ast.WithStatement",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.collect.EmptyImmutableMap",
      "com.google.javascript.rhino.JSDocInfo",
      "com.google.javascript.jscomp.mozilla.rhino.IdFunctionObject",
      "com.google.common.collect.ImmutableSet$TransformedImmutableSet",
      "com.google.javascript.rhino.JSDocInfo$Marker",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ObjectProperty",
      "com.google.javascript.rhino.jstype.NoType",
      "com.google.javascript.jscomp.mozilla.rhino.NativeGenerator",
      "com.google.javascript.jscomp.mozilla.rhino.optimizer.Codegen",
      "com.google.javascript.jscomp.mozilla.rhino.PolicySecurityController",
      "com.google.javascript.jscomp.mozilla.rhino.ast.UnaryExpression",
      "com.google.javascript.jscomp.mozilla.rhino.ScriptRuntime$NoSuchMethodShim",
      "com.google.javascript.jscomp.mozilla.rhino.xml.XMLLib$Factory",
      "com.google.javascript.jscomp.mozilla.rhino.NativeCall",
      "com.google.javascript.jscomp.mozilla.rhino.Callable",
      "com.google.javascript.jscomp.mozilla.rhino.ContextListener",
      "com.google.javascript.jscomp.mozilla.rhino.ObjToIntMap",
      "com.google.javascript.jscomp.mozilla.rhino.ast.NumberLiteral",
      "com.google.javascript.jscomp.parsing.Annotation",
      "com.google.javascript.rhino.jstype.UnionType",
      "com.google.javascript.jscomp.mozilla.rhino.ast.AstNode",
      "com.google.javascript.jscomp.mozilla.rhino.ErrorReporter",
      "com.google.javascript.rhino.Node$SideEffectFlags",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo",
      "com.google.javascript.jscomp.mozilla.rhino.debug.Debugger",
      "com.google.javascript.jscomp.mozilla.rhino.ast.InfixExpression",
      "com.google.javascript.jscomp.mozilla.rhino.ast.XmlDotQuery",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ParseProblem",
      "com.google.javascript.rhino.RhinoException",
      "com.google.javascript.jscomp.mozilla.rhino.Node$NodeIterator",
      "com.google.javascript.jscomp.mozilla.rhino.xml.XMLLib$Factory$1",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ContinueStatement",
      "com.google.common.collect.Iterators",
      "com.google.javascript.jscomp.mozilla.rhino.ast.SwitchCase",
      "com.google.javascript.jscomp.mozilla.rhino.ast.XmlMemberGet",
      "com.google.javascript.jscomp.mozilla.rhino.ast.XmlFragment",
      "com.google.javascript.rhino.jstype.NullType",
      "com.google.javascript.rhino.SourcePosition",
      "com.google.javascript.jscomp.mozilla.rhino.Interpreter",
      "com.google.javascript.jscomp.mozilla.rhino.IdScriptableObject",
      "com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot",
      "com.google.javascript.jscomp.mozilla.rhino.ast.BreakStatement",
      "com.google.javascript.jscomp.mozilla.rhino.Context$ClassShutterSetter",
      "com.google.javascript.rhino.jstype.ParameterizedType",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ConditionalExpression",
      "com.google.javascript.rhino.EvaluatorException",
      "com.google.javascript.jscomp.parsing.IRFactory",
      "com.google.javascript.jscomp.mozilla.rhino.ast.NewExpression",
      "com.google.javascript.jscomp.mozilla.rhino.NativeObject",
      "com.google.javascript.jscomp.mozilla.rhino.EvaluatorException",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ArrayComprehension",
      "com.google.javascript.jscomp.mozilla.rhino.ast.KeywordLiteral",
      "com.google.javascript.jscomp.mozilla.rhino.ast.VariableDeclaration",
      "com.google.javascript.jscomp.mozilla.rhino.ast.Jump",
      "com.google.javascript.rhino.jstype.TernaryValue",
      "com.google.javascript.jscomp.mozilla.rhino.WrapFactory",
      "com.google.javascript.jscomp.mozilla.rhino.LazilyLoadedCtor",
      "com.google.javascript.jscomp.mozilla.rhino.Icode",
      "com.google.javascript.jscomp.mozilla.rhino.NativeJavaClass",
      "com.google.javascript.jscomp.parsing.IRFactory$1",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.Lists$AbstractListWrapper",
      "com.google.javascript.rhino.jstype.EnumType",
      "com.google.javascript.rhino.JSDocInfo$StringPosition",
      "com.google.javascript.jscomp.mozilla.rhino.ast.FunctionCall",
      "com.google.javascript.jscomp.mozilla.rhino.ast.Yield",
      "com.google.javascript.rhino.FunctionNode",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.javascript.jscomp.mozilla.rhino.NativeJavaTopPackage",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.javascript.jscomp.mozilla.rhino.BaseFunction",
      "com.google.javascript.jscomp.mozilla.rhino.xml.XMLObject",
      "com.google.javascript.jscomp.mozilla.rhino.NativeArray$2",
      "com.google.javascript.jscomp.mozilla.rhino.json.JsonParser$ParseException",
      "com.google.javascript.jscomp.mozilla.rhino.NativeArray$1",
      "com.google.javascript.rhino.jstype.ValueType",
      "com.google.javascript.jscomp.mozilla.rhino.JavaMembers",
      "com.google.javascript.jscomp.mozilla.rhino.Kit",
      "com.google.javascript.jscomp.mozilla.rhino.ast.Assignment",
      "com.google.javascript.jscomp.mozilla.rhino.NativeJavaConstructor",
      "com.google.javascript.jscomp.mozilla.rhino.debug.DebuggableScript",
      "com.google.javascript.jscomp.mozilla.rhino.Wrapper",
      "com.google.javascript.jscomp.mozilla.rhino.NativeContinuation",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ArrayLiteral",
      "com.google.javascript.jscomp.mozilla.rhino.ast.XmlElemRef",
      "com.google.javascript.rhino.jstype.IndexedType",
      "com.google.common.collect.Maps",
      "com.google.javascript.jscomp.mozilla.rhino.jdk13.VMBridge_jdk13",
      "com.google.common.base.Predicates$AndPredicate",
      "com.google.javascript.jscomp.mozilla.rhino.ScriptRuntime",
      "com.google.common.collect.ImmutableEnumSet",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ThrowStatement",
      "com.google.javascript.jscomp.mozilla.rhino.ast.XmlRef",
      "com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot$1",
      "com.google.javascript.jscomp.mozilla.rhino.WrappedException",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ElementGet",
      "com.google.javascript.rhino.jstype.FunctionPrototypeType",
      "com.google.javascript.jscomp.mozilla.rhino.ast.StringLiteral",
      "com.google.javascript.jscomp.mozilla.rhino.ast.LetNode",
      "com.google.javascript.jscomp.mozilla.rhino.NativeIterator$WrappedJavaIterator",
      "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher",
      "com.google.common.base.CharMatcher$And",
      "com.google.javascript.rhino.jstype.ErrorFunctionType",
      "com.google.javascript.rhino.JSTypeExpression",
      "com.google.common.base.CharMatcher$11",
      "com.google.javascript.jscomp.mozilla.rhino.NativeError",
      "com.google.common.base.CharMatcher$12",
      "com.google.common.base.CharMatcher$10",
      "com.google.common.base.CharMatcher$15",
      "com.google.common.base.CharMatcher$13",
      "com.google.common.base.CharMatcher$14",
      "com.google.common.base.Joiner$2",
      "com.google.javascript.jscomp.mozilla.rhino.ast.FunctionNode$Form",
      "com.google.common.base.Joiner$1",
      "com.google.common.collect.RegularImmutableMap$Values",
      "com.google.javascript.jscomp.mozilla.rhino.ast.DoLoop",
      "com.google.javascript.rhino.jstype.JSTypeRegistry",
      "com.google.javascript.jscomp.mozilla.rhino.Token$CommentType",
      "com.google.common.base.Predicates",
      "com.google.javascript.jscomp.mozilla.rhino.ClassCache",
      "com.google.javascript.rhino.ErrorReporter",
      "com.google.javascript.jscomp.mozilla.rhino.tools.ToolErrorReporter",
      "com.google.javascript.jscomp.mozilla.rhino.Arguments",
      "com.google.javascript.jscomp.mozilla.rhino.ast.FunctionNode",
      "com.google.javascript.jscomp.mozilla.rhino.ContextFactory",
      "com.google.javascript.jscomp.mozilla.rhino.InterpretedFunction",
      "com.google.javascript.jscomp.mozilla.rhino.ast.NodeVisitor",
      "org.mozilla.classfile.ClassFileWriter$ClassFileFormatException",
      "com.google.javascript.rhino.jstype.AllType",
      "com.google.javascript.jscomp.mozilla.rhino.DefaultErrorReporter",
      "com.google.javascript.rhino.Node$StringNode",
      "com.google.javascript.rhino.jstype.UnknownType",
      "com.google.javascript.jscomp.mozilla.rhino.ast.XmlLiteral",
      "com.google.javascript.jscomp.mozilla.rhino.GeneratedClassLoader",
      "com.google.javascript.jscomp.parsing.Config",
      "com.google.javascript.jscomp.mozilla.rhino.ScriptRuntime$MessageProvider",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.javascript.rhino.jstype.BooleanLiteralSet",
      "com.google.common.collect.Sets$SetView",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ObjectLiteral",
      "com.google.javascript.jscomp.mozilla.rhino.NativeWith",
      "com.google.javascript.jscomp.mozilla.rhino.ScriptRuntime$DefaultMessageProvider",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.javascript.rhino.jstype.TemplateType",
      "com.google.common.collect.Lists$RandomAccessListWrapper",
      "com.google.javascript.rhino.jstype.NumberType",
      "com.google.javascript.jscomp.mozilla.rhino.ast.Loop",
      "com.google.javascript.jscomp.mozilla.rhino.ContinuationPending",
      "com.google.javascript.jscomp.mozilla.rhino.ContextFactory$GlobalSetter",
      "com.google.javascript.jscomp.mozilla.rhino.NativeGenerator$GeneratorClosedException",
      "com.google.javascript.jscomp.mozilla.rhino.EcmaError",
      "com.google.common.collect.BiMap",
      "com.google.common.base.CharMatcher$LookupTable",
      "com.google.javascript.jscomp.parsing.TypeSafeDispatcher",
      "com.google.javascript.jscomp.mozilla.rhino.ast.XmlExpression",
      "com.google.javascript.jscomp.mozilla.rhino.ast.XmlString",
      "com.google.common.collect.RegularImmutableMap$KeySet",
      "com.google.javascript.jscomp.mozilla.rhino.ContextAction",
      "com.google.common.collect.Iterators$12",
      "com.google.common.collect.Iterators$11",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation",
      "com.google.javascript.rhino.Node$PropListItem",
      "com.google.common.collect.Hashing",
      "com.google.javascript.jscomp.mozilla.rhino.SecurityController",
      "com.google.javascript.rhino.jstype.StaticScope",
      "com.google.javascript.jscomp.mozilla.rhino.UniqueTag",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.javascript.jscomp.mozilla.rhino.NativeJSON",
      "com.google.javascript.jscomp.mozilla.rhino.NativeBoolean",
      "com.google.javascript.rhino.Token",
      "com.google.javascript.jscomp.mozilla.rhino.debug.DebugFrame",
      "com.google.javascript.jscomp.mozilla.rhino.Evaluator",
      "com.google.common.collect.ImmutableCollection$EmptyImmutableCollection",
      "com.google.javascript.rhino.jstype.JSType$2",
      "com.google.javascript.rhino.jstype.JSType$1",
      "com.google.javascript.rhino.jstype.ProxyObjectType",
      "com.google.common.base.Predicates$ContainsPatternPredicate",
      "com.google.javascript.jscomp.mozilla.rhino.PolicySecurityController$SecureCaller",
      "com.google.common.collect.Lists$TransformingSequentialList",
      "com.google.javascript.rhino.Node$NumberNode",
      "com.google.javascript.jscomp.mozilla.rhino.NativeIterator",
      "com.google.javascript.jscomp.mozilla.rhino.ast.EmptyExpression",
      "com.google.common.base.Predicate",
      "com.google.common.collect.Iterators$13",
      "com.google.common.collect.ImmutableCollection",
      "com.google.javascript.rhino.jstype.ArrowType",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ParenthesizedExpression",
      "com.google.common.collect.Iterators$14",
      "com.google.javascript.jscomp.mozilla.rhino.ContextFactory$Listener",
      "com.google.javascript.jscomp.mozilla.rhino.RegExpProxy",
      "com.google.javascript.jscomp.mozilla.rhino.ImporterTopLevel",
      "com.google.javascript.jscomp.mozilla.rhino.ast.SwitchStatement",
      "com.google.javascript.rhino.jstype.ObjectType",
      "com.google.javascript.jscomp.mozilla.rhino.NativeString",
      "com.google.javascript.jscomp.mozilla.rhino.ObjToIntMap$Iterator",
      "com.google.javascript.jscomp.parsing.JsDocInfoParser",
      "com.google.javascript.jscomp.mozilla.rhino.ast.CatchClause",
      "com.google.javascript.jscomp.mozilla.rhino.NativeJavaMethod",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.javascript.rhino.Node$NodeMismatch",
      "com.google.javascript.jscomp.mozilla.rhino.JavaScriptException",
      "com.google.common.collect.Lists$StringAsImmutableList",
      "com.google.javascript.jscomp.mozilla.rhino.NativeFunction",
      "com.google.common.base.CharMatcher$Or",
      "com.google.javascript.jscomp.mozilla.rhino.Script",
      "com.google.javascript.rhino.jstype.StringType",
      "com.google.javascript.jscomp.mozilla.rhino.RefCallable",
      "com.google.common.collect.Sets$CartesianSet",
      "com.google.javascript.jscomp.mozilla.rhino.NativeJavaArray",
      "com.google.common.collect.Lists$Partition",
      "com.google.javascript.rhino.jstype.StaticSlot",
      "com.google.javascript.rhino.Kit",
      "com.google.common.base.Predicates$InstanceOfPredicate",
      "com.google.javascript.jscomp.mozilla.rhino.jdk15.VMBridge_jdk15",
      "com.google.javascript.rhino.JSDocInfo$1",
      "com.google.common.collect.PeekingIterator",
      "org.mozilla.classfile.ClassFileWriter",
      "com.google.javascript.rhino.jstype.JSType$TypePair",
      "com.google.javascript.jscomp.mozilla.rhino.ScriptableObject$Slot",
      "com.google.javascript.rhino.jstype.EnumElementType",
      "com.google.common.base.Function",
      "com.google.common.base.CharMatcher$3",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.base.CharMatcher$2",
      "com.google.common.collect.ImmutableEntry",
      "com.google.javascript.rhino.jstype.NamedType",
      "com.google.common.base.CharMatcher$5",
      "com.google.common.base.CharMatcher$4",
      "com.google.common.collect.Collections2",
      "com.google.common.base.CharMatcher$7",
      "com.google.javascript.jscomp.mozilla.rhino.ast.Name",
      "com.google.common.base.CharMatcher$6",
      "com.google.javascript.jscomp.mozilla.rhino.ast.Symbol",
      "com.google.common.base.CharMatcher$9",
      "com.google.common.base.CharMatcher$8",
      "com.google.javascript.jscomp.mozilla.rhino.FunctionObject",
      "com.google.javascript.jscomp.mozilla.rhino.ScriptableObject",
      "com.google.javascript.jscomp.mozilla.rhino.NativeJavaPackage",
      "com.google.common.base.CharMatcher$1",
      "com.google.javascript.rhino.Node",
      "com.google.common.collect.Sets",
      "com.google.common.base.Joiner",
      "com.google.javascript.jscomp.mozilla.rhino.Node",
      "com.google.javascript.rhino.jstype.BooleanType",
      "com.google.javascript.jscomp.mozilla.rhino.NativeDate",
      "com.google.javascript.rhino.jstype.InstanceObjectType",
      "com.google.javascript.jscomp.mozilla.rhino.ScriptableObject$GetterSlot",
      "com.google.common.collect.ImmutableMap",
      "com.google.javascript.jscomp.mozilla.rhino.ast.WhileLoop",
      "com.google.javascript.jscomp.mozilla.rhino.Context",
      "com.google.javascript.jscomp.mozilla.rhino.IdFunctionCall",
      "com.google.javascript.jscomp.mozilla.rhino.ObjArray",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ParseProblem$Type",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "com.google.javascript.rhino.jstype.PrototypeObjectType",
      "com.google.common.base.Preconditions",
      "com.google.javascript.jscomp.mozilla.rhino.ConstProperties",
      "com.google.javascript.jscomp.mozilla.rhino.ScriptRuntime$1",
      "com.google.javascript.jscomp.mozilla.rhino.IdScriptableObject$PrototypeValues",
      "com.google.javascript.jscomp.mozilla.rhino.ast.LabeledStatement",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ReturnStatement",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ErrorCollector",
      "com.google.javascript.rhino.jstype.RecordType",
      "com.google.common.collect.MapDifference",
      "com.google.common.base.Predicates$CompositionPredicate",
      "com.google.javascript.jscomp.mozilla.rhino.RhinoException",
      "com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement",
      "com.google.javascript.rhino.jstype.NoObjectType",
      "com.google.javascript.rhino.jstype.PrototypeObjectType$Property",
      "com.google.common.base.Predicates$OrPredicate",
      "com.google.javascript.rhino.Node$AncestorIterable",
      "com.google.javascript.jscomp.mozilla.rhino.Token",
      "com.google.javascript.jscomp.mozilla.rhino.Undefined",
      "com.google.common.base.CharMatcher",
      "com.google.common.collect.RegularImmutableMap$LinkedEntry",
      "com.google.common.collect.Lists$1",
      "com.google.javascript.rhino.jstype.Visitor",
      "com.google.javascript.rhino.JSDocInfo$Visibility",
      "com.google.common.collect.Lists$2",
      "com.google.javascript.jscomp.mozilla.rhino.ast.XmlPropRef",
      "com.google.javascript.jscomp.mozilla.rhino.ast.IdeErrorReporter",
      "com.google.javascript.rhino.jstype.FunctionType$Kind",
      "com.google.javascript.jscomp.mozilla.rhino.NativeArray",
      "com.google.common.base.Predicates$InPredicate",
      "com.google.common.collect.RegularImmutableMap$EntrySet",
      "com.google.javascript.jscomp.mozilla.rhino.ast.Block",
      "com.google.javascript.jscomp.mozilla.rhino.ScriptRuntime$IdEnumeration",
      "com.google.javascript.rhino.SimpleErrorReporter",
      "com.google.common.collect.Sets$3",
      "com.google.common.collect.Sets$2",
      "com.google.javascript.jscomp.mozilla.rhino.xml.XMLLib",
      "com.google.common.collect.Sets$1",
      "com.google.javascript.jscomp.mozilla.rhino.ast.Scope",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.javascript.jscomp.mozilla.rhino.NativeScript",
      "com.google.common.collect.ImmutableSet$ArrayImmutableSet",
      "com.google.javascript.rhino.testing.EmptyScope",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ForInLoop",
      "com.google.javascript.jscomp.mozilla.rhino.NativeIterator$StopIteration",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ArrayComprehensionLoop",
      "com.google.javascript.rhino.jstype.JSTypeNative",
      "com.google.javascript.rhino.ScriptOrFnNode",
      "com.google.javascript.rhino.jstype.FunctionType",
      "com.google.javascript.rhino.Node$FileLevelJsDocBuilder",
      "com.google.common.base.Predicates$IsEqualToPredicate",
      "com.google.common.collect.Lists$RandomAccessPartition",
      "com.google.common.collect.Maps$EntryTransformer",
      "com.google.javascript.jscomp.mozilla.rhino.VMBridge",
      "com.google.javascript.jscomp.mozilla.rhino.FieldAndMethods",
      "com.google.common.base.Predicates$NotPredicate"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.reset.ClassResetter.getInstance().setClassLoader(IRFactoryEvoSuite_branch_Test_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.ClassStateSupport.resetClasses(
      "com.google.javascript.jscomp.mozilla.rhino.Token$CommentType",
      "com.google.common.collect.Collections2",
      "com.google.javascript.jscomp.mozilla.rhino.Node",
      "com.google.javascript.jscomp.mozilla.rhino.ast.AstNode",
      "com.google.javascript.jscomp.mozilla.rhino.ContextFactory",
      "com.google.javascript.jscomp.mozilla.rhino.Kit",
      "com.google.javascript.jscomp.mozilla.rhino.ScriptableObject$Slot",
      "com.google.javascript.jscomp.mozilla.rhino.ScriptableObject",
      "com.google.javascript.jscomp.mozilla.rhino.ScriptRuntime",
      "com.google.javascript.jscomp.mozilla.rhino.optimizer.Codegen",
      "com.google.javascript.jscomp.mozilla.rhino.Icode",
      "com.google.javascript.jscomp.mozilla.rhino.Interpreter",
      "com.google.javascript.jscomp.mozilla.rhino.Context",
      "com.google.javascript.jscomp.mozilla.rhino.VMBridge",
      "com.google.javascript.jscomp.mozilla.rhino.DefaultErrorReporter",
      "com.google.common.collect.Maps",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.Hashing",
      "com.google.javascript.jscomp.parsing.Annotation",
      "com.google.common.collect.ImmutableCollection$EmptyImmutableCollection",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.Iterators",
      "com.google.javascript.rhino.Node",
      "com.google.javascript.rhino.Node$NumberNode",
      "com.google.javascript.rhino.Node$StringNode",
      "com.google.javascript.rhino.Token",
      "com.google.javascript.rhino.Node$PropListItem",
      "com.google.javascript.rhino.JSDocInfo",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo",
      "com.google.javascript.jscomp.mozilla.rhino.BaseFunction",
      "com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement",
      "com.google.common.collect.EmptyImmutableSet",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ArrayLiteral",
      "com.google.javascript.jscomp.mozilla.rhino.ast.FunctionCall",
      "com.google.javascript.jscomp.mozilla.rhino.ast.SwitchStatement",
      "com.google.javascript.jscomp.mozilla.rhino.ast.AstNode$DebugPrintVisitor",
      "com.google.javascript.jscomp.mozilla.rhino.Token",
      "com.google.javascript.jscomp.mozilla.rhino.ast.FunctionNode",
      "com.google.javascript.jscomp.mozilla.rhino.ast.FunctionNode$Form",
      "com.google.javascript.rhino.Kit",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.javascript.jscomp.mozilla.rhino.UniqueTag",
      "com.google.javascript.jscomp.mozilla.rhino.Scriptable",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ParseProblem$Type",
      "com.google.javascript.jscomp.mozilla.rhino.ast.ObjectLiteral",
      "com.google.javascript.jscomp.mozilla.rhino.ImporterTopLevel",
      "com.google.javascript.jscomp.mozilla.rhino.ObjArray",
      "com.google.javascript.jscomp.mozilla.rhino.ClassCache",
      "com.google.javascript.jscomp.mozilla.rhino.IdScriptableObject$PrototypeValues",
      "com.google.javascript.jscomp.mozilla.rhino.IdFunctionObject",
      "com.google.javascript.jscomp.mozilla.rhino.NativeObject",
      "com.google.javascript.jscomp.mozilla.rhino.NativeError",
      "com.google.javascript.jscomp.mozilla.rhino.NativeGlobal",
      "com.google.javascript.jscomp.mozilla.rhino.Undefined",
      "com.google.javascript.jscomp.mozilla.rhino.NativeArray",
      "com.google.javascript.jscomp.mozilla.rhino.NativeString",
      "com.google.javascript.jscomp.mozilla.rhino.NativeBoolean",
      "com.google.javascript.jscomp.mozilla.rhino.NativeNumber",
      "com.google.javascript.jscomp.mozilla.rhino.NativeDate",
      "com.google.javascript.jscomp.mozilla.rhino.NativeMath",
      "com.google.javascript.jscomp.mozilla.rhino.NativeJSON",
      "com.google.javascript.jscomp.mozilla.rhino.NativeWith",
      "com.google.javascript.jscomp.mozilla.rhino.NativeCall",
      "com.google.javascript.jscomp.mozilla.rhino.NativeScript",
      "com.google.javascript.jscomp.mozilla.rhino.NativeIterator",
      "com.google.javascript.jscomp.mozilla.rhino.NativeGenerator",
      "com.google.javascript.jscomp.mozilla.rhino.NativeIterator$StopIteration",
      "com.google.javascript.jscomp.mozilla.rhino.LazilyLoadedCtor",
      "com.google.javascript.jscomp.mozilla.rhino.ScriptableObject$GetterSlot",
      "com.google.javascript.jscomp.mozilla.rhino.JavaAdapter",
      "com.google.javascript.jscomp.mozilla.rhino.NativeJavaObject",
      "com.google.javascript.jscomp.mozilla.rhino.NativeContinuation",
      "com.google.javascript.jscomp.mozilla.rhino.NativeJavaPackage",
      "com.google.javascript.jscomp.mozilla.rhino.NativeJavaClass"
    );
  }
}
