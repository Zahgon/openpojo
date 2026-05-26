/*
 * Copyright (c) 2010-2018 Osman Shoukry
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.openpojo.reflection.java.packageloader.utils;

import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;
import com.openpojo.reflection.java.Java;
import com.openpojo.reflection.java.load.ClassUtil;

/**
 * @author oshoukry
 */
public class Helper {

    public static boolean isClass(String entry) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static String getFQClassName(String entry) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Set<Type> loadClassesFromGivenPackage(Set<String> classNames, String packageName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Set<String> getSubPackagesOfPackage(Set<String> classNames, String packageName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * This method breaks up a package path into its elements returning the first sub-element only.
     * For example, if packageName is "com" and the JAR file has only one class
     * "com.openpojo.reflection.SomeClass.class", then the return will be set to "com.openpojo".
     *
     * @param parentPackageName
     *     The reference package name.
     * @param subPackageName
     *     The subpackage name.
     * @return A first sub level bellow packageName.
     */
    static String getDirectSubPackageName(final String parentPackageName, final String subPackageName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private Helper() {
        throw new UnsupportedOperationException(Helper.class.getName() + " should not be constructed!");
    }
}
