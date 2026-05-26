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
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import com.openpojo.reflection.PojoClass;
import com.openpojo.reflection.PojoField;
import com.openpojo.reflection.PojoMethod;
import com.openpojo.reflection.PojoPackage;
import com.openpojo.reflection.exception.ReflectionException;
import com.openpojo.reflection.java.Java;
import com.openpojo.reflection.java.packageloader.impl.URLToFileSystemAdapter;
import com.openpojo.reflection.utils.ToStringHelper;

/**
 * This class is the default implementation for the PojoClass Interface, created through the PojoClassFactory.
 *
 * @author oshoukry
 */
public class PojoClassImpl implements PojoClass {

    private final String name;

    private final Class<?> clazz;

    private final List<PojoField> pojoFields;

    private final List<PojoMethod> pojoMethods;

    public PojoClassImpl(final Class<?> clazz, final List<PojoField> pojoFields, final List<PojoMethod> pojoMethods) {
        this.clazz = clazz;
        this.name = clazz.getName();
        this.pojoFields = Collections.unmodifiableList(pojoFields);
        this.pojoMethods = Collections.unmodifiableList(pojoMethods);
    }

    public boolean isInterface() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isAbstract() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isConcrete() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isEnum() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isArray() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isFinal() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isSynthetic() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<PojoField> getPojoFields() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<PojoField> getPojoFieldsAnnotatedWith(Class<? extends Annotation> annotation) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<PojoMethod> getPojoMethods() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<PojoMethod> getPojoMethodsAnnotatedWith(Class<? extends Annotation> annotation) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<PojoMethod> getPojoConstructors() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PojoClass getEnclosingClass() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public <T extends Annotation> T getAnnotation(final Class<T> annotationClass) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<? extends Annotation> getAnnotations() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean extendz(final Class<?> type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isNestedClass() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isStatic() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void copy(final Object from, final Object to) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Class<?> getClazz() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String toString(final Object instance) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PojoClass getSuperClass() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<PojoClass> getInterfaces() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PojoPackage getPackage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getSourcePath() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(final Object other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isPrivate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isPackagePrivate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isProtected() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isPublic() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
