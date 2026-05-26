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
package com.openpojo.reflection.utils;

import java.util.Arrays;

/**
 * @author oshoukry
 */
public class ObjectToString {

    public static String toString(Object o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static ObjectToStringHandler getHandler(Object o) {
        if (o == null)
            return new ObjectToStringHandler() {

                public String toString(Object o) {
                    throw new UnsupportedOperationException("STUB: not implemented");
                }
            };
        if (!o.getClass().isArray())
            return new ObjectToStringHandler() {

                public String toString(Object o) {
                    throw new UnsupportedOperationException("STUB: not implemented");
                }
            };
        // Array handling
        // Since Java has no way of auto-boxing an array of primitives, each must be examined independently.
        Class<?> componentType = o.getClass().getComponentType();
        if (componentType == byte.class)
            return new ObjectToStringHandler() {

                public String toString(Object o) {
                    throw new UnsupportedOperationException("STUB: not implemented");
                }
            };
        if (componentType == char.class)
            return new ObjectToStringHandler() {

                public String toString(Object o) {
                    throw new UnsupportedOperationException("STUB: not implemented");
                }
            };
        if (componentType == short.class)
            return new ObjectToStringHandler() {

                public String toString(Object o) {
                    throw new UnsupportedOperationException("STUB: not implemented");
                }
            };
        if (componentType == int.class)
            return new ObjectToStringHandler() {

                public String toString(Object o) {
                    throw new UnsupportedOperationException("STUB: not implemented");
                }
            };
        if (componentType == long.class)
            return new ObjectToStringHandler() {

                public String toString(Object o) {
                    throw new UnsupportedOperationException("STUB: not implemented");
                }
            };
        if (componentType == float.class)
            return new ObjectToStringHandler() {

                public String toString(Object o) {
                    throw new UnsupportedOperationException("STUB: not implemented");
                }
            };
        if (componentType == double.class)
            return new ObjectToStringHandler() {

                public String toString(Object o) {
                    throw new UnsupportedOperationException("STUB: not implemented");
                }
            };
        if (componentType == boolean.class)
            return new ObjectToStringHandler() {

                public String toString(Object o) {
                    throw new UnsupportedOperationException("STUB: not implemented");
                }
            };
        return new ObjectToStringHandler() {

            public String toString(Object o) {
                throw new UnsupportedOperationException("STUB: not implemented");
            }
        };
    }

    interface ObjectToStringHandler {

        String toString(Object o);
    }

    private ObjectToString() {
        throw new UnsupportedOperationException(ObjectToString.class.getName() + " should not be constructed!");
    }
}
