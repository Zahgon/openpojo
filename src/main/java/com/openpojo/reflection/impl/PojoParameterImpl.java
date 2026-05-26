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
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import com.openpojo.reflection.PojoParameter;
import com.openpojo.reflection.java.type.Resolver;

/**
 * @author oshoukry
 */
public class PojoParameterImpl implements PojoParameter {

    private final Type type;

    private final List<? extends Annotation> annotations;

    public PojoParameterImpl(Type type, Annotation[] annotations) {
        this.type = type;
        List<Annotation> tmpAnnotations = new ArrayList<Annotation>();
        if (annotations != null) {
            for (Annotation entry : annotations) {
                if (entry != null)
                    tmpAnnotations.add(entry);
            }
        }
        this.annotations = Collections.unmodifiableList(tmpAnnotations);
    }

    public List<? extends Annotation> getAnnotations() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("unchecked")
    public <T extends Annotation> T getAnnotation(Class<T> annotationClass) {
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

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
