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
package com.openpojo.random.generator.security;

import com.openpojo.random.RandomGenerator;
import com.openpojo.reflection.PojoClass;
import com.openpojo.reflection.construct.InstanceFactory;
import java.util.*;
import static com.openpojo.random.RandomFactory.getRandomValue;
import static com.openpojo.reflection.impl.PojoClassFactory.getPojoClass;
import static com.openpojo.reflection.java.load.ClassUtil.loadClass;

/**
 * @author oshoukry
 */
public class CredentialsRandomGenerator implements RandomGenerator {

    private static final String TYPE = "sun.security.krb5.Credentials";

    private static final CredentialsRandomGenerator INSTANCE = new CredentialsRandomGenerator();

    private final Class<?> credentialsClass;

    private CredentialsRandomGenerator() {
        credentialsClass = loadClass(TYPE);
    }

    public static RandomGenerator getInstance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Collection<Class<?>> getTypes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Object doGenerate(Class<?> type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
