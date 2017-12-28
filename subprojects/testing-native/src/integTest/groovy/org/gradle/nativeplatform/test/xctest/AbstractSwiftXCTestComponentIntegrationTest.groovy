/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.nativeplatform.test.xctest

import org.gradle.language.swift.AbstractSwiftComponentIntegrationTest
import org.gradle.nativeplatform.fixtures.app.SourceFileElement
import org.gradle.nativeplatform.fixtures.app.Swift3Test

abstract class AbstractSwiftXCTestComponentIntegrationTest extends AbstractSwiftComponentIntegrationTest {
    @Override
    protected String getComponentUnderTestDsl() {
        return "xctest"
    }

    @Override
    SourceFileElement getSwift3Component() {
        return new Swift3Test()
    }

    @Override
    String getTaskNameToAssembleDevelopmentBinary() {
        return "test"
    }

    @Override
    List<String> getTasksToAssembleDevelopmentBinary() {
        return [":compileTestSwift", ":linkTest", ":installTest", ":xcTest"]
    }
}
