/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.konan.test.blackbox;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.junit.jupiter.api.Tag;
import org.jetbrains.kotlin.konan.test.blackbox.support.group.FirPipeline;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateNativeTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("native/native.tests/testData/klib/dump-signatures")
@TestDataPath("$PROJECT_ROOT")
@Tag("frontend-fir")
@FirPipeline()
public class FirNativeKlibDumpMetadataSignaturesTestGenerated extends AbstractNativeKlibDumpMetadataSignaturesTest {
    @Test
    public void testAllFilesPresentInDump_signatures() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("native/native.tests/testData/klib/dump-signatures"), Pattern.compile("^([^_](.+)).(kt|def)$"), null, true);
    }

    @Test
    @TestMetadata("callables.kt")
    public void testCallables() throws Exception {
        runTest("native/native.tests/testData/klib/dump-signatures/callables.kt");
    }

    @Test
    @TestMetadata("imported_declarations.kt")
    public void testImported_declarations() throws Exception {
        runTest("native/native.tests/testData/klib/dump-signatures/imported_declarations.kt");
    }

    @Test
    @TestMetadata("imported_from_cinterop.kt")
    public void testImported_from_cinterop() throws Exception {
        runTest("native/native.tests/testData/klib/dump-signatures/imported_from_cinterop.kt");
    }

    @Test
    @TestMetadata("imported_from_cinterop.lib.def")
    public void testImported_from_cinterop_lib() throws Exception {
        runTest("native/native.tests/testData/klib/dump-signatures/imported_from_cinterop.lib.def");
    }

    @Test
    @TestMetadata("just_cinterop_c.def")
    public void testJust_cinterop_c() throws Exception {
        runTest("native/native.tests/testData/klib/dump-signatures/just_cinterop_c.def");
    }

    @Test
    @TestMetadata("just_cinterop_objc.def")
    public void testJust_cinterop_objc() throws Exception {
        runTest("native/native.tests/testData/klib/dump-signatures/just_cinterop_objc.def");
    }

    @Test
    @TestMetadata("type_parameters.kt")
    public void testType_parameters() throws Exception {
        runTest("native/native.tests/testData/klib/dump-signatures/type_parameters.kt");
    }

    @Test
    @TestMetadata("visibility.kt")
    public void testVisibility() throws Exception {
        runTest("native/native.tests/testData/klib/dump-signatures/visibility.kt");
    }
}
