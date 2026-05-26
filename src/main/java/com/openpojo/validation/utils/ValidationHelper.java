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

import java.util.List;
import com.openpojo.log.Logger;
import com.openpojo.log.LoggerFactory;
import com.openpojo.reflection.PojoClass;
import com.openpojo.reflection.PojoField;
import com.openpojo.reflection.construct.InstanceFactory;
import com.openpojo.reflection.java.bytecode.asm.ASMNotLoadedException;
import com.openpojo.validation.impl.DefaultValidator;
import com.openpojo.validation.rule.Rule;
import com.openpojo.validation.test.Tester;

/**
 * This Validation helper utility class will carry the collection of common
 * tasks performed by various validation tasks.
 *
 * @author oshoukry
 */
public final class ValidationHelper {

    /**
     * Return true if the PojoField is marked as static and is final.
     *
     * @param fieldEntry
     *     The field to test.
     * @return True if the field was declared static final, false otherwise.
     */
    public static boolean isStaticFinal(final PojoField fieldEntry) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * This helper method is responsible for creating an instance of a PojoClass.
     * This method will favor the most basic constructor in terms of parameters.
     * <br>
     * Example: if you have two constructors one with no parameters and one with some parameters
     * This method will invoke the one without parameters.
     *
     * @param pojoClass
     *     The class to instantiate.
     * @return An Instance of the class.
     */
    public static Object getBasicInstance(final PojoClass pojoClass) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * This helper method is responsible for creating an instance of a PojoClass.
     * This method will favor the most complete constructor in terms of parameters.
     * <br>
     * Example: if you have two constructors one with no parameters and one with some parameters
     * This method will invoke the one with some parameters.
     *
     * @param pojoClass
     *     The class to instantiate.
     * @return An Instance of the class.
     */
    public static Object getMostCompleteInstance(final PojoClass pojoClass) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void runValidation(PojoClass pojoClass, List<Rule> rules, List<Tester> testers) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private ValidationHelper() {
        throw new UnsupportedOperationException(ValidationHelper.class.getName() + " should not be constructed!");
    }
}
