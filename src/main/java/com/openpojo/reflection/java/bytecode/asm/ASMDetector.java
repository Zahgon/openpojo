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

import com.openpojo.reflection.PojoClass;
import com.openpojo.reflection.impl.PojoClassFactory;
import com.openpojo.reflection.java.load.ClassUtil;
import com.openpojo.reflection.java.packageloader.reader.JarFileReader;
import com.openpojo.reflection.java.version.Version;
import com.openpojo.reflection.java.version.VersionFactory;
import static com.openpojo.reflection.java.version.VersionFactory.getImplementationVersion;

/**
 * @author oshoukry
 */
public class ASMDetector {

    public static final String ASM_CLASS_NAME = "org.objectweb.asm.ClassWriter";

    private static final String VERSION_MANIFEST_KEY_FALLBACK = "Bundle-Version";

    private ASMDetector() {
    }

    public static ASMDetector getInstance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isASMLoaded() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Version getVersion() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Version getBundleVersion(Class<?> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static class Instance {

        private static final ASMDetector INSTANCE = new ASMDetector();
    }
}
