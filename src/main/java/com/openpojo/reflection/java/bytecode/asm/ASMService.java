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
package com.openpojo.reflection.java.bytecode.asm;

import com.openpojo.cache.CacheStorage;
import com.openpojo.cache.CacheStorageFactory;
import com.openpojo.log.Logger;
import com.openpojo.log.LoggerFactory;
import com.openpojo.reflection.exception.ReflectionException;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

/**
 * @author oshoukry
 */
public class ASMService {

    private SimpleClassLoader simpleClassLoader = new SimpleClassLoader();

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private CacheStorage<Class<?>> alreadyGeneratedClasses = CacheStorageFactory.getPersistentCacheStorage();

    private ASMService() {
    }

    public static ASMService getInstance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public <T> Class<? extends T> createSubclassFor(Class<T> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("unchecked")
    public <T> Class<? extends T> createSubclassFor(Class<T> clazz, SubClassDefinition subClassDefinition) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private byte[] getSubClassByteCode(SubClassDefinition subClassDefinition) {
        ClassReader classReader = subClassDefinition.getClassReader();
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        classReader.accept(new SubClassCreator(cw, subClassDefinition.getGeneratedClassNameAsJDKPath()), 0);
        cw.visitEnd();
        return cw.toByteArray();
    }

    private static class Instance {

        private static final ASMService INSTANCE = new ASMService();
    }
}
