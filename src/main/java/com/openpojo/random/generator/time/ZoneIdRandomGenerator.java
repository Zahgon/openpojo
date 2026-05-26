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
package com.openpojo.random.generator.time;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Set;
import com.openpojo.random.RandomGenerator;
import com.openpojo.reflection.java.load.ClassUtil;
import static com.openpojo.random.generator.time.util.ReflectionHelper.getMethod;
import static com.openpojo.random.generator.time.util.ReflectionHelper.invokeMethod;

/**
 * @author oshoukry
 */
public class ZoneIdRandomGenerator implements RandomGenerator {

    private static final String TYPE = "java.time.ZoneId";

    private static final ZoneIdRandomGenerator INSTANCE = new ZoneIdRandomGenerator();

    private static final Random RANDOM = new Random(System.currentTimeMillis());

    private final Class<?> zoneIdClass;

    public static ZoneIdRandomGenerator getInstance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Collection<Class<?>> getTypes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Object doGenerate(Class<?> type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("unchecked")
    private Object[] getAvailableZones() {
        Method getAvailableZoneIdsMethod = getMethod(zoneIdClass, "getAvailableZoneIds");
        return ((Set<String>) invokeMethod(getAvailableZoneIdsMethod, null)).toArray();
    }

    private Object getZoneIdOf(String availableZone) {
        Method ofMethod = getMethod(zoneIdClass, "of", String.class);
        return invokeMethod(ofMethod, null, availableZone);
    }

    private ZoneIdRandomGenerator() {
        zoneIdClass = ClassUtil.loadClass(TYPE);
    }
}
