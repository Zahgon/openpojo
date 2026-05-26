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
package com.openpojo.validation.utils;

import java.util.ArrayList;
import java.util.List;
import com.openpojo.business.identity.IdentityHandler;

/**
 * @author oshoukry
 */
public class IdentityHandlerStub implements IdentityHandler {

    private Boolean areEqualReturn;

    private Integer hashCodeReturn;

    private String toStringReturn;

    private Object instance1;

    private Object instance2;

    private List<Object> instances = new ArrayList<Object>();

    public IdentityHandlerStub(Object... instances) {
        if (instances != null)
            for (Object instance : instances) if (instance != null)
                this.instances.add(instance);
    }

    public boolean handlerFor(final Object object) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void validate(final Object object) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setAreEqualReturn(final Boolean areEqualReturn) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Boolean getAreEqualReturn() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean areEqual(final Object first, final Object second) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setHashCodeReturn(final Integer hashCodeReturn) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Integer getHashCodeReturn() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int generateHashCode(final Object object) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setToStringReturn(String toStringReturn) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getToStringReturn() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String toString(final Object object) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
