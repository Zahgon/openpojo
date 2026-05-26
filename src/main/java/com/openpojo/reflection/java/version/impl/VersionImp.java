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
package com.openpojo.reflection.java.version.impl;

import java.util.List;
import com.openpojo.reflection.java.version.Version;
import com.openpojo.reflection.java.version.VersionParser;

/**
 * @author oshoukry
 */
public class VersionImp implements Version {

    private final String version;

    private final List<Integer> parts;

    public VersionImp(String version) {
        this.version = version;
        parts = VersionParser.getVersionParts(version);
    }

    public String getVersion() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("ReturnOfNull")
    public Integer getPart(int idx) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int compareTo(Version right) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
