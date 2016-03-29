/*
 * Copyright (C) 2014 Saúl Díaz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sefford.common.interfaces;

/**
 * Loggable interface to share beteeen
 *
 * @author Saul Diaz <sefford@gmail.com>
 */
public interface Loggable {

    /**
     * Logs a debug log to the Logger.
     *
     * @param tag     Logger identification.
     * @param message Message to log.
     */
    void d(String tag, String message);

    /**
     * Prints a performance log in case the user wants to check how their code is performing.
     * <p>
     * Sometimes a developer needs to know how much time their code is taking. This is a
     * utility API to encapsulate a method to know how long a code snippet is taking.
     *
     * @param tag          Logger identification.
     * @param delegateName Name of the delegate to measure performance.
     * @param start        Start referencing time to measure.
     */
    void printPerformanceLog(String tag, String delegateName, long start);

    /**
     * Logs a error log to the Logger
     *
     * @param tag       Logging tag identifier
     * @param message   Message to log to the logger
     * @param exception Exception to pass to the logger
     */
    void e(String tag, String message, Throwable exception);

}
