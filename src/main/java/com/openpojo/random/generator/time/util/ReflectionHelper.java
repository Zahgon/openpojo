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
package com.openpojo.random.generator.time.util;

import java.lang.reflect.Method;
import com.openpojo.random.exception.RandomGeneratorException;

/**
 * @author oshoukry
 */
public class ReflectionHelper {

    public static Object invokeMethod(Method method, Object instance, Object... params) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Method getMethod(Class<?> onClass, String methodName, Class<?>... types) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private ReflectionHelper() {
        throw new UnsupportedOperationException(ReflectionHelper.class.getName() + " should not be constructed!");
    }
}
