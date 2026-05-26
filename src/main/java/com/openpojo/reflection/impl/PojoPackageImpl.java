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
package com.openpojo.reflection.impl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import com.openpojo.log.utils.MessageFormatter;
import com.openpojo.reflection.PojoClass;
import com.openpojo.reflection.PojoClassFilter;
import com.openpojo.reflection.PojoPackage;
import com.openpojo.reflection.exception.ReflectionException;
import com.openpojo.reflection.java.Java;
import com.openpojo.reflection.java.load.ClassUtil;
import com.openpojo.reflection.java.packageloader.Package;

/**
 * This class represents the abstraction of a JAVA Package as PojoPackageImpl.
 *
 * @author oshoukry
 */
class PojoPackageImpl implements PojoPackage {

    private final String packageName;

    private final PojoClass packageInfoPojoClass;

    private final Package jdkPackage;

    public String getName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    PojoPackageImpl(final String packageName) {
        if (packageName == null) {
            throw new IllegalArgumentException("PackageName can not be null");
        }
        this.packageName = packageName;
        jdkPackage = new Package(packageName);
        if (!jdkPackage.isValid()) {
            throw ReflectionException.getInstance(MessageFormatter.format("Package [{0}] is not valid", packageName));
        }
        Class<?> infoClass = ClassUtil.loadClass(packageName + Java.PACKAGE_DELIMITER + Java.PACKAGE_INFO);
        if (infoClass != null) {
            packageInfoPojoClass = PojoClassFactory.getPojoClass(infoClass);
        } else {
            packageInfoPojoClass = null;
        }
    }

    public List<PojoClass> getPojoClasses() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<PojoClass> getPojoClasses(final PojoClassFilter filter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<PojoPackage> getPojoSubPackages() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public <T extends Annotation> T getAnnotation(final Class<T> annotationClass) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<? extends Annotation> getAnnotations() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
