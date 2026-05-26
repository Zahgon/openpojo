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
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import com.openpojo.reflection.PojoClass;
import com.openpojo.reflection.PojoField;
import com.openpojo.reflection.PojoMethod;
import com.openpojo.reflection.exception.ReflectionException;
import com.openpojo.reflection.java.type.Resolver;
import com.openpojo.reflection.utils.ToStringHelper;

/**
 * This is the default implementation for PojoField Interface.
 * This is an immutable object and is not supposed to be created directly.
 * see {@link PojoClassFactory}
 *
 * @author oshoukry
 */
class PojoFieldImpl implements PojoField {

    private final Field field;

    private final PojoMethod fieldGetter;

    private final PojoMethod fieldSetter;

    PojoFieldImpl(final Field field) {
        this.field = field;
        this.field.setAccessible(true);
        fieldGetter = PojoMethodFactory.getFieldGetter(field);
        fieldSetter = PojoMethodFactory.getFieldSetter(field);
    }

    public Object get(final Object instance) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void set(final Object instance, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean hasGetter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PojoMethod getGetter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Object invokeGetter(final Object instance) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean hasSetter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PojoMethod getSetter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PojoClass getDeclaringPojoClass() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void invokeSetter(final Object instance, final Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Class<?> getType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isParameterized() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<Type> getParameterTypes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public <T extends Annotation> T getAnnotation(final Class<T> annotationClass) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<? extends Annotation> getAnnotations() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isPrimitive() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isFinal() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isStatic() {
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

    public boolean isTransient() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isVolatile() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isSynthetic() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isArray() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String toString(final Object instance) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
