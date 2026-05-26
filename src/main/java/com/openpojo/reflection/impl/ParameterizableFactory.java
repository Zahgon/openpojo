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

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import com.openpojo.reflection.Parameterizable;
import com.openpojo.reflection.java.type.Resolver;

/**
 * @author oshoukry
 */
public class ParameterizableFactory {

    public static Parameterizable getInstance(Type type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static class ParameterizableImpl implements Parameterizable {

        private final Type type;

        public ParameterizableImpl(Type type) {
            this.type = type;
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
    }

    private ParameterizableFactory() {
        throw new UnsupportedOperationException(ParameterizableFactory.class.getName() + " should not be constructed!");
    }
}
