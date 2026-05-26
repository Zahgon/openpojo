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
package com.openpojo.reflection.java.packageloader;

import java.lang.reflect.Type;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;
import com.openpojo.business.BusinessIdentity;
import com.openpojo.business.annotation.BusinessKey;
import com.openpojo.reflection.java.packageloader.env.JavaClassPathClassLoader;

/**
 * @author oshoukry
 */
public final class Package {

    private static final JavaClassPathClassLoader JAVA_CLASSPATH_CLASS_LOADER = JavaClassPathClassLoader.getInstance();

    @BusinessKey
    private final String packageName;

    public Package(final String packageName) {
        this.packageName = packageName;
    }

    public String getPackageName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isValid() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Set<Type> getTypes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Set<Package> getSubPackages() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private Set<PackageLoader> getPackageLoaders() {
        Set<PackageLoader> packageLoaders = new HashSet<PackageLoader>();
        Set<URL> resources = PackageLoader.getThreadResources(packageName);
        for (URL resource : resources) {
            packageLoaders.add(PackageLoader.getPackageLoaderByURL(resource, packageName));
        }
        return packageLoaders;
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @SuppressWarnings("EqualsWhichDoesntCheckParameterClass")
    public boolean equals(final Object obj) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
