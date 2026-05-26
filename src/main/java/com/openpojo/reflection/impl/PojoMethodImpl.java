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
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.openpojo.reflection.PojoMethod;
import com.openpojo.reflection.PojoParameter;
import com.openpojo.reflection.exception.ReflectionException;

/**
 * @author oshoukry
 */
public class PojoMethodImpl implements PojoMethod {

    private final AccessibleObject accessibleObject;

    PojoMethodImpl(final Method method) {
        this((AccessibleObject) method);
    }

    PojoMethodImpl(final Constructor<?> constructor) {
        this((AccessibleObject) constructor);
    }

    private PojoMethodImpl(final AccessibleObject accessibleObject) {
        this.accessibleObject = accessibleObject;
    }

    private void allowAccessibility() {
        accessibleObject.setAccessible(true);
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

    public Object invoke(final Object instance, final Object... parameters) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<PojoParameter> getPojoParameters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isFinal() {
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

    public boolean isStatic() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isSynthetic() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isConstructor() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isAbstract() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Type[] getGenericParameterTypes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Class<?>[] getParameterTypes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private Type[] getConstructorGenericParameterTypes(Constructor<?> asConstructor, Class<?>[] parameterClasses) {
        Type[] genericParameterTypes = asConstructor.getGenericParameterTypes();
        Class<?> declaringClass = asConstructor.getDeclaringClass();
        genericParameterTypes = bug_5087240_workaround(declaringClass, genericParameterTypes, parameterClasses);
        return genericParameterTypes;
    }

    /**
     * See: http://bugs.java.com/view_bug.do?bug_id=5087240
     */
    private Type[] bug_5087240_workaround(Class<?> clazz, Type[] genericParameterTypes, Class<?>[] parameterClasses) {
        Type[] fixedGenericParameterType = genericParameterTypes;
        if (isNestedNonStaticClass(clazz) && missingSyntheticParameter(genericParameterTypes, parameterClasses)) {
            fixedGenericParameterType = new Type[parameterClasses.length];
            fixedGenericParameterType[0] = parameterClasses[0];
            System.arraycopy(genericParameterTypes, 0, fixedGenericParameterType, 1, genericParameterTypes.length);
        }
        return fixedGenericParameterType;
    }

    private boolean missingSyntheticParameter(Type[] genericParameterTypes, Class<?>[] parameterClasses) {
        return (genericParameterTypes.length + 1) == parameterClasses.length;
    }

    private boolean isNestedNonStaticClass(Class<?> clazz) {
        return clazz.getEnclosingClass() != null && !Modifier.isStatic(clazz.getModifiers());
    }

    public Class<?> getReturnType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private Method getAsMethod() {
        return (Method) accessibleObject;
    }

    private int getModifiers() {
        if (isConstructor()) {
            return getAsConstructor().getModifiers();
        }
        return getAsMethod().getModifiers();
    }

    private Constructor<?> getAsConstructor() {
        return (Constructor<?>) accessibleObject;
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
