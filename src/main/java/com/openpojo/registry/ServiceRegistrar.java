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
package com.openpojo.registry;

import com.openpojo.business.BusinessIdentity;
import com.openpojo.random.awt.BufferedImageRandomGenerator;
import com.openpojo.random.collection.AbstractCollectionRandomGenerator;
import com.openpojo.random.collection.CollectionRandomGenerator;
import com.openpojo.random.collection.list.*;
import com.openpojo.random.collection.queue.*;
import com.openpojo.random.collection.set.*;
import com.openpojo.random.generator.security.CredentialsRandomGenerator;
import com.openpojo.random.generator.security.EncryptionKeyRandomGenerator;
import com.openpojo.random.generator.security.KerberosTimeRandomGenerator;
import com.openpojo.random.generator.security.PrincipalNameRandomGenerator;
import com.openpojo.random.generator.time.InstantRandomGenerator;
import com.openpojo.random.generator.time.TimeZoneRandomGenerator;
import com.openpojo.random.generator.time.XMLGregorianCalendarRandomGenerator;
import com.openpojo.random.generator.time.ZoneIdRandomGenerator;
import com.openpojo.random.generator.time.ZonedDateTimeRandomGenerator;
import com.openpojo.random.impl.*;
import com.openpojo.random.map.*;
import com.openpojo.random.service.RandomGeneratorService;
import com.openpojo.random.service.impl.DefaultRandomGeneratorService;
import com.openpojo.reflection.coverage.service.PojoCoverageFilterService;
import com.openpojo.reflection.coverage.service.PojoCoverageFilterServiceFactory;
import com.openpojo.reflection.service.PojoClassLookupService;
import com.openpojo.reflection.service.impl.DefaultPojoClassLookupService;

/**
 * @author oshoukry
 */
public class ServiceRegistrar {

    private PojoCoverageFilterService pojoCoverageFilterService;

    private RandomGeneratorService randomGeneratorService;

    private PojoClassLookupService pojoClassLookupService;

    private ServiceRegistrar() {
        initializePojoCoverageFilterService();
        initializePojoClassLookupService();
        initializeRandomGeneratorService();
    }

    private void initializePojoCoverageFilterService() {
        setPojoCoverageFilterService(PojoCoverageFilterServiceFactory.configureAndGetPojoCoverageFilterService());
    }

    public void initializeRandomGeneratorService() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void initializePojoClassLookupService() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static ServiceRegistrar getInstance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setRandomGeneratorService(final RandomGeneratorService randomGeneratorService) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public RandomGeneratorService getRandomGeneratorService() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PojoClassLookupService getPojoClassLookupService() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PojoCoverageFilterService getPojoCoverageFilterService() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setPojoCoverageFilterService(PojoCoverageFilterService pojoCoverageFilterService) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static class Instance {

        private static final ServiceRegistrar INSTANCE = new ServiceRegistrar();
    }
}
