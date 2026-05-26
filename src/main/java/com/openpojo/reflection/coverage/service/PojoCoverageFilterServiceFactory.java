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
package com.openpojo.reflection.coverage.service;

import com.openpojo.log.Logger;
import com.openpojo.log.LoggerFactory;
import com.openpojo.reflection.coverage.CoverageDetector;
import com.openpojo.reflection.coverage.impl.Clover3;
import com.openpojo.reflection.coverage.impl.Clover4;
import com.openpojo.reflection.coverage.impl.Cobertura;
import com.openpojo.reflection.coverage.impl.Jacoco;
import com.openpojo.reflection.coverage.service.impl.DefaultPojoCoverageFilterService;

/**
 * @author oshoukry
 */
public class PojoCoverageFilterServiceFactory {

    private static final CoverageDetector[] KNOWN_COVERAGE_DETECTORS = new CoverageDetector[] { Clover3.getInstance(), Clover4.getInstance(), Cobertura.getInstance(), Jacoco.getInstance() };

    public static PojoCoverageFilterService configureAndGetPojoCoverageFilterService() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static PojoCoverageFilterService createPojoCoverageFilterServiceWith(CoverageDetector coverageDetector) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private PojoCoverageFilterServiceFactory() {
        throw new UnsupportedOperationException(PojoCoverageFilterServiceFactory.class.getName() + " should not be constructed!");
    }
}
