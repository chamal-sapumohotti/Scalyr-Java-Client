/*
 * Scalyr client library
 * Copyright 2012 Scalyr, Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.scalyr.api.logs;

/**
 * Tracks a span initiated by a method such as Events.start().
 */
public class Span {
  /**
   * nanotime() timestamp of the start event.
   */
  final long startTime;
  
  /**
   * Severity of the start event.
   */
  final Severity severity;
  
  Span(long startTime, Severity severity) {
    this.startTime = startTime;
    this.severity = severity;
  }
}
