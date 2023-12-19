/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.low.level.api.fir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations")
@TestDataPath("$PROJECT_ROOT")
public class OutOfContentRootLazyTypeAnnotationsTestGenerated extends AbstractOutOfContentRootLazyTypeAnnotationsTest {
    @Test
    public void testAllFilesPresentInLazyResolveTypeAnnotations() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations"), Pattern.compile("^(.+)\\.(kt)$"), null, true);
    }

    @Nested
    @TestMetadata("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/class")
    @TestDataPath("$PROJECT_ROOT")
    public class Class {
        @Test
        public void testAllFilesPresentInClass() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/class"), Pattern.compile("^(.+)\\.(kt)$"), null, true);
        }

        @Test
        @TestMetadata("classAnnotationsInLocalClass.kt")
        public void testClassAnnotationsInLocalClass() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/class/classAnnotationsInLocalClass.kt");
        }

        @Test
        @TestMetadata("delegateFieldWithAnnotationClash.kt")
        public void testDelegateFieldWithAnnotationClash() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/class/delegateFieldWithAnnotationClash.kt");
        }

        @Test
        @TestMetadata("delegatedFieldNestedNameClashAndAnnotations.kt")
        public void testDelegatedFieldNestedNameClashAndAnnotations() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/class/delegatedFieldNestedNameClashAndAnnotations.kt");
        }

        @Test
        @TestMetadata("delegatedFieldNestedNameClashWithNestedTypesAndAnnotations.kt")
        public void testDelegatedFieldNestedNameClashWithNestedTypesAndAnnotations() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/class/delegatedFieldNestedNameClashWithNestedTypesAndAnnotations.kt");
        }

        @Test
        @TestMetadata("nestedClassAsAnnotationArgument.kt")
        public void testNestedClassAsAnnotationArgument() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/class/nestedClassAsAnnotationArgument.kt");
        }

        @Test
        @TestMetadata("nestedClassAsAnnotationArgument2.kt")
        public void testNestedClassAsAnnotationArgument2() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/class/nestedClassAsAnnotationArgument2.kt");
        }

        @Test
        @TestMetadata("parameterTypeCollisionAndAnnotations.kt")
        public void testParameterTypeCollisionAndAnnotations() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/class/parameterTypeCollisionAndAnnotations.kt");
        }

        @Test
        @TestMetadata("qualifiedNestedClassAsAnnotationArgument.kt")
        public void testQualifiedNestedClassAsAnnotationArgument() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/class/qualifiedNestedClassAsAnnotationArgument.kt");
        }

        @Test
        @TestMetadata("qualifiedNestedClassAsAnnotationArgument2.kt")
        public void testQualifiedNestedClassAsAnnotationArgument2() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/class/qualifiedNestedClassAsAnnotationArgument2.kt");
        }

        @Test
        @TestMetadata("superTypeCallNameClashWithAnnotation.kt")
        public void testSuperTypeCallNameClashWithAnnotation() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/class/superTypeCallNameClashWithAnnotation.kt");
        }

        @Test
        @TestMetadata("superTypeCallNameClashWithAnnotationImplicitConstructor.kt")
        public void testSuperTypeCallNameClashWithAnnotationImplicitConstructor() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/class/superTypeCallNameClashWithAnnotationImplicitConstructor.kt");
        }

        @Test
        @TestMetadata("superTypeCallNestedNameClashWithAnnotation.kt")
        public void testSuperTypeCallNestedNameClashWithAnnotation() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/class/superTypeCallNestedNameClashWithAnnotation.kt");
        }

        @Test
        @TestMetadata("superTypeCallNestedNameClashWithAnnotationImplicitConstructor.kt")
        public void testSuperTypeCallNestedNameClashWithAnnotationImplicitConstructor() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/class/superTypeCallNestedNameClashWithAnnotationImplicitConstructor.kt");
        }
    }

    @Nested
    @TestMetadata("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/constructor")
    @TestDataPath("$PROJECT_ROOT")
    public class Constructor {
        @Test
        public void testAllFilesPresentInConstructor() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/constructor"), Pattern.compile("^(.+)\\.(kt)$"), null, true);
        }

        @Test
        @TestMetadata("call.kt")
        public void testCall() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/constructor/call.kt");
        }

        @Test
        @TestMetadata("callWithConstructor.kt")
        public void testCallWithConstructor() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/constructor/callWithConstructor.kt");
        }

        @Test
        @TestMetadata("reference.kt")
        public void testReference() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/constructor/reference.kt");
        }

        @Test
        @TestMetadata("referenceWithConstructor.kt")
        public void testReferenceWithConstructor() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/constructor/referenceWithConstructor.kt");
        }

        @Test
        @TestMetadata("secondaryConstructor.kt")
        public void testSecondaryConstructor() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/constructor/secondaryConstructor.kt");
        }
    }

    @Nested
    @TestMetadata("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/delegate")
    @TestDataPath("$PROJECT_ROOT")
    public class Delegate {
        @Test
        public void testAllFilesPresentInDelegate() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/delegate"), Pattern.compile("^(.+)\\.(kt)$"), null, true);
        }

        @Test
        @TestMetadata("delegateFieldWithAnnotationClash.kt")
        public void testDelegateFieldWithAnnotationClash() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/delegate/delegateFieldWithAnnotationClash.kt");
        }

        @Test
        @TestMetadata("delegateWithExplicitType.kt")
        public void testDelegateWithExplicitType() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/delegate/delegateWithExplicitType.kt");
        }

        @Test
        @TestMetadata("delegateWithExplicitTypeUnavailable.kt")
        public void testDelegateWithExplicitTypeUnavailable() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/delegate/delegateWithExplicitTypeUnavailable.kt");
        }

        @Test
        @TestMetadata("delegateWithImplicitType.kt")
        public void testDelegateWithImplicitType() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/delegate/delegateWithImplicitType.kt");
        }

        @Test
        @TestMetadata("delegateWithImplicitTypeUnavailable.kt")
        public void testDelegateWithImplicitTypeUnavailable() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/delegate/delegateWithImplicitTypeUnavailable.kt");
        }

        @Test
        @TestMetadata("delegatedFieldNestedName.kt")
        public void testDelegatedFieldNestedName() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/delegate/delegatedFieldNestedName.kt");
        }

        @Test
        @TestMetadata("delegatedFieldNestedNameClashAndAnnotations.kt")
        public void testDelegatedFieldNestedNameClashAndAnnotations() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/delegate/delegatedFieldNestedNameClashAndAnnotations.kt");
        }

        @Test
        @TestMetadata("delegatedFieldNestedNameClashWithNestedTypesAndAnnotations.kt")
        public void testDelegatedFieldNestedNameClashWithNestedTypesAndAnnotations() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/delegate/delegatedFieldNestedNameClashWithNestedTypesAndAnnotations.kt");
        }

        @Test
        @TestMetadata("field.kt")
        public void testField() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/delegate/field.kt");
        }

        @Test
        @TestMetadata("propertyWithExplicitType.kt")
        public void testPropertyWithExplicitType() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/delegate/propertyWithExplicitType.kt");
        }

        @Test
        @TestMetadata("propertyWithExplicitTypeUnavailable.kt")
        public void testPropertyWithExplicitTypeUnavailable() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/delegate/propertyWithExplicitTypeUnavailable.kt");
        }

        @Test
        @TestMetadata("propertyWithImplicitType.kt")
        public void testPropertyWithImplicitType() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/delegate/propertyWithImplicitType.kt");
        }

        @Test
        @TestMetadata("propertyWithImplicitTypeUnavailable.kt")
        public void testPropertyWithImplicitTypeUnavailable() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/delegate/propertyWithImplicitTypeUnavailable.kt");
        }
    }

    @Nested
    @TestMetadata("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/errorType")
    @TestDataPath("$PROJECT_ROOT")
    public class ErrorType {
        @Test
        public void testAllFilesPresentInErrorType() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/errorType"), Pattern.compile("^(.+)\\.(kt)$"), null, true);
        }

        @Test
        @TestMetadata("errorType.kt")
        public void testErrorType() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/errorType/errorType.kt");
        }

        @Test
        @TestMetadata("nestedErrorReturnType.kt")
        public void testNestedErrorReturnType() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/errorType/nestedErrorReturnType.kt");
        }
    }

    @Nested
    @TestMetadata("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function")
    @TestDataPath("$PROJECT_ROOT")
    public class Function {
        @Test
        public void testAllFilesPresentInFunction() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function"), Pattern.compile("^(.+)\\.(kt)$"), null, true);
        }

        @Test
        @TestMetadata("component1TypeCollisionAndAnnotations.kt")
        public void testComponent1TypeCollisionAndAnnotations() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/component1TypeCollisionAndAnnotations.kt");
        }

        @Test
        @TestMetadata("copyTypeCollisionAndAnnotations.kt")
        public void testCopyTypeCollisionAndAnnotations() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/copyTypeCollisionAndAnnotations.kt");
        }

        @Test
        @TestMetadata("delegatedFieldNestedNameClashAndAnnotationsAsConstructor.kt")
        public void testDelegatedFieldNestedNameClashAndAnnotationsAsConstructor() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/delegatedFieldNestedNameClashAndAnnotationsAsConstructor.kt");
        }

        @Test
        @TestMetadata("delegatedFieldNestedNameClashWithNestedTypesAndAnnotationsAsConstructor.kt")
        public void testDelegatedFieldNestedNameClashWithNestedTypesAndAnnotationsAsConstructor() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/delegatedFieldNestedNameClashWithNestedTypesAndAnnotationsAsConstructor.kt");
        }

        @Test
        @TestMetadata("explicitType.kt")
        public void testExplicitType() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/explicitType.kt");
        }

        @Test
        @TestMetadata("generatedComponentN.kt")
        public void testGeneratedComponentN() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/generatedComponentN.kt");
        }

        @Test
        @TestMetadata("generatedCopy.kt")
        public void testGeneratedCopy() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/generatedCopy.kt");
        }

        @Test
        @TestMetadata("implicitType.kt")
        public void testImplicitType() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/implicitType.kt");
        }

        @Test
        @TestMetadata("implicitTypeUnavailable.kt")
        public void testImplicitTypeUnavailable() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/implicitTypeUnavailable.kt");
        }

        @Test
        @TestMetadata("localFunction.kt")
        public void testLocalFunction() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/localFunction.kt");
        }

        @Test
        @TestMetadata("localFunctionImplicitType.kt")
        public void testLocalFunctionImplicitType() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/localFunctionImplicitType.kt");
        }

        @Test
        @TestMetadata("superTypeCallNameClashWithAnnotation.kt")
        public void testSuperTypeCallNameClashWithAnnotation() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/superTypeCallNameClashWithAnnotation.kt");
        }

        @Test
        @TestMetadata("superTypeCallNameClashWithAnnotationImplicitConstructor.kt")
        public void testSuperTypeCallNameClashWithAnnotationImplicitConstructor() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/superTypeCallNameClashWithAnnotationImplicitConstructor.kt");
        }

        @Test
        @TestMetadata("superTypeCallNestedNameClashWithAnnotation.kt")
        public void testSuperTypeCallNestedNameClashWithAnnotation() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/superTypeCallNestedNameClashWithAnnotation.kt");
        }

        @Test
        @TestMetadata("superTypeCallNestedNameClashWithAnnotationImplicitConstructor.kt")
        public void testSuperTypeCallNestedNameClashWithAnnotationImplicitConstructor() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/superTypeCallNestedNameClashWithAnnotationImplicitConstructor.kt");
        }

        @Test
        @TestMetadata("typeParameterAnnotations.kt")
        public void testTypeParameterAnnotations() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/typeParameterAnnotations.kt");
        }

        @Test
        @TestMetadata("typeParameterAnnotationsInLocalClass.kt")
        public void testTypeParameterAnnotationsInLocalClass() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/typeParameterAnnotationsInLocalClass.kt");
        }

        @Test
        @TestMetadata("typePropagationFromFunctionWithInaccessibleAnnotationArgument.kt")
        public void testTypePropagationFromFunctionWithInaccessibleAnnotationArgument() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/typePropagationFromFunctionWithInaccessibleAnnotationArgument.kt");
        }

        @Test
        @TestMetadata("typePropagationFromPropertyWithInaccessibleAnnotationArgument.kt")
        public void testTypePropagationFromPropertyWithInaccessibleAnnotationArgument() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/typePropagationFromPropertyWithInaccessibleAnnotationArgument.kt");
        }
    }

    @Nested
    @TestMetadata("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property")
    @TestDataPath("$PROJECT_ROOT")
    public class Property {
        @Test
        public void testAllFilesPresentInProperty() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property"), Pattern.compile("^(.+)\\.(kt)$"), null, true);
        }

        @Test
        @TestMetadata("constructorParameter.kt")
        public void testConstructorParameter() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property/constructorParameter.kt");
        }

        @Test
        @TestMetadata("explicitType.kt")
        public void testExplicitType() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property/explicitType.kt");
        }

        @Test
        @TestMetadata("generatedPropertyFromConstructor.kt")
        public void testGeneratedPropertyFromConstructor() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property/generatedPropertyFromConstructor.kt");
        }

        @Test
        @TestMetadata("implicitType.kt")
        public void testImplicitType() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property/implicitType.kt");
        }

        @Test
        @TestMetadata("implicitTypeInLocalClass.kt")
        public void testImplicitTypeInLocalClass() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property/implicitTypeInLocalClass.kt");
        }

        @Test
        @TestMetadata("implicitTypeUnavailable.kt")
        public void testImplicitTypeUnavailable() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property/implicitTypeUnavailable.kt");
        }

        @Test
        @TestMetadata("localDelegatedPropertyWithPropagatedType.kt")
        public void testLocalDelegatedPropertyWithPropagatedType() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property/localDelegatedPropertyWithPropagatedType.kt");
        }

        @Test
        @TestMetadata("localDelegatedPropertyWithPropagatedTypeUnavailable.kt")
        public void testLocalDelegatedPropertyWithPropagatedTypeUnavailable() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property/localDelegatedPropertyWithPropagatedTypeUnavailable.kt");
        }

        @Test
        @TestMetadata("localPropertyWithExplicitType.kt")
        public void testLocalPropertyWithExplicitType() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property/localPropertyWithExplicitType.kt");
        }

        @Test
        @TestMetadata("localPropertyWithPropagatedType.kt")
        public void testLocalPropertyWithPropagatedType() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property/localPropertyWithPropagatedType.kt");
        }

        @Test
        @TestMetadata("localPropertyWithPropagatedTypeUnavailable.kt")
        public void testLocalPropertyWithPropagatedTypeUnavailable() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property/localPropertyWithPropagatedTypeUnavailable.kt");
        }

        @Test
        @TestMetadata("propertyTypeCollisionAndAnnotations.kt")
        public void testPropertyTypeCollisionAndAnnotations() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property/propertyTypeCollisionAndAnnotations.kt");
        }

        @Test
        @TestMetadata("typeParameterAnnotationsInLocalClass.kt")
        public void testTypeParameterAnnotationsInLocalClass() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property/typeParameterAnnotationsInLocalClass.kt");
        }
    }

    @Nested
    @TestMetadata("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/substitutionOverride")
    @TestDataPath("$PROJECT_ROOT")
    public class SubstitutionOverride {
        @Test
        public void testAllFilesPresentInSubstitutionOverride() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/substitutionOverride"), Pattern.compile("^(.+)\\.(kt)$"), null, true);
        }

        @Test
        @TestMetadata("constructor.kt")
        public void testConstructor() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/substitutionOverride/constructor.kt");
        }

        @Test
        @TestMetadata("constructorCallSite.kt")
        public void testConstructorCallSite() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/substitutionOverride/constructorCallSite.kt");
        }

        @Test
        @TestMetadata("function.kt")
        public void testFunction() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/substitutionOverride/function.kt");
        }

        @Test
        @TestMetadata("functionUnavailable.kt")
        public void testFunctionUnavailable() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/substitutionOverride/functionUnavailable.kt");
        }

        @Test
        @TestMetadata("implicitFunction.kt")
        public void testImplicitFunction() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/substitutionOverride/implicitFunction.kt");
        }

        @Test
        @TestMetadata("implicitFunctionUnavailable.kt")
        public void testImplicitFunctionUnavailable() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/substitutionOverride/implicitFunctionUnavailable.kt");
        }

        @Test
        @TestMetadata("implicitProperty.kt")
        public void testImplicitProperty() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/substitutionOverride/implicitProperty.kt");
        }

        @Test
        @TestMetadata("implicitPropertyAndReceiver.kt")
        public void testImplicitPropertyAndReceiver() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/substitutionOverride/implicitPropertyAndReceiver.kt");
        }

        @Test
        @TestMetadata("implicitPropertyUnavailable.kt")
        public void testImplicitPropertyUnavailable() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/substitutionOverride/implicitPropertyUnavailable.kt");
        }

        @Test
        @TestMetadata("property.kt")
        public void testProperty() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/substitutionOverride/property.kt");
        }

        @Test
        @TestMetadata("propertyUnavailable.kt")
        public void testPropertyUnavailable() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/substitutionOverride/propertyUnavailable.kt");
        }
    }

    @Nested
    @TestMetadata("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/syntheticProperty")
    @TestDataPath("$PROJECT_ROOT")
    public class SyntheticProperty {
        @Test
        public void testAllFilesPresentInSyntheticProperty() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/syntheticProperty"), Pattern.compile("^(.+)\\.(kt)$"), null, true);
        }

        @Test
        @TestMetadata("getterAndSetterWithExplicitReturnType.kt")
        public void testGetterAndSetterWithExplicitReturnType() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/syntheticProperty/getterAndSetterWithExplicitReturnType.kt");
        }

        @Test
        @TestMetadata("getterWithExplicitReturnType.kt")
        public void testGetterWithExplicitReturnType() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/syntheticProperty/getterWithExplicitReturnType.kt");
        }

        @Test
        @TestMetadata("getterWithImplicitReturnType.kt")
        public void testGetterWithImplicitReturnType() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/syntheticProperty/getterWithImplicitReturnType.kt");
        }
    }

    @Nested
    @TestMetadata("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/typeAlias")
    @TestDataPath("$PROJECT_ROOT")
    public class TypeAlias {
        @Test
        public void testAllFilesPresentInTypeAlias() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/typeAlias"), Pattern.compile("^(.+)\\.(kt)$"), null, true);
        }

        @Test
        @TestMetadata("insideFunction.kt")
        public void testInsideFunction() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/typeAlias/insideFunction.kt");
        }

        @Test
        @TestMetadata("insideFunctionComplex.kt")
        public void testInsideFunctionComplex() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/typeAlias/insideFunctionComplex.kt");
        }

        @Test
        @TestMetadata("nestedAliasWithNestedAnnotationInLocalClass.kt")
        public void testNestedAliasWithNestedAnnotationInLocalClass() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/typeAlias/nestedAliasWithNestedAnnotationInLocalClass.kt");
        }

        @Test
        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/typeAlias/simple.kt");
        }

        @Test
        @TestMetadata("withMissedArguments.kt")
        public void testWithMissedArguments() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/typeAlias/withMissedArguments.kt");
        }
    }
}
