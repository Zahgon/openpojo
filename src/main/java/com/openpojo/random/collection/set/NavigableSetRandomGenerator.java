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
package com.openpojo.random.collection.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;
import com.openpojo.random.collection.util.BaseCollectionRandomGenerator;
import com.openpojo.random.util.Helper;
import com.openpojo.reflection.java.load.ClassUtil;

/**
 * @author oshoukry
 */
public class NavigableSetRandomGenerator extends BaseCollectionRandomGenerator {

    private static final String TYPE = "java.util.NavigableSet";

    private static final NavigableSetRandomGenerator INSTANCE = new NavigableSetRandomGenerator();

    public static NavigableSetRandomGenerator getInstance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Collection<Class<?>> getTypes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected Collection getBasicInstance(Class<?> type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private NavigableSetRandomGenerator() {
    }
}
