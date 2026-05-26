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
package com.openpojo.cache.impl;

import java.util.Map;
import java.util.WeakHashMap;
import com.openpojo.cache.CacheStorage;

/**
 * This simple implementation of CacheStorage uses WeakHashMap as the underlying storage mechanism and only well suited
 * for temporal short bursts of cache are needed and GC removal of cached items is acceptable.
 *
 * @author oshoukry
 */
public class WeakHashMapCacheStorage<T> implements CacheStorage<T> {

    private final Map<String, T> repository = new WeakHashMap<String, T>();

    public void clear() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("RedundantStringConstructorCall")
    public void add(String name, T value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public T get(String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
