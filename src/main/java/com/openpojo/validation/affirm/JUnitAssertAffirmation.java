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
package com.openpojo.validation.affirm;

import com.openpojo.business.BusinessIdentity;
import com.openpojo.reflection.exception.ReflectionException;
import com.openpojo.reflection.java.load.ClassUtil;
import static org.junit.Assert.*;

/**
 * @author oshoukry
 */
public class JUnitAssertAffirmation extends AbstractAffirmation implements Affirmation {

    static {
        if (!ClassUtil.isClassLoaded("org.junit.Assert"))
            throw ReflectionException.getInstance("org.junit.Assert class not found");
    }

    private JUnitAssertAffirmation() {
    }

    public void fail(final String message) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void affirmTrue(final String message, final boolean condition) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void affirmFalse(final String message, final boolean condition) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void affirmNotNull(final String message, final Object object) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void affirmNull(final String message, final Object object) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void affirmEquals(final String message, final Object expected, final Object actual) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void affirmSame(String message, Object first, Object second) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
