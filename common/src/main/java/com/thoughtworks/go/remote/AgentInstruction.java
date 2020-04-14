/*
 * Copyright 2020 ThoughtWorks, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.thoughtworks.go.remote;

import java.io.Serializable;

public class AgentInstruction implements Serializable {
    private final boolean shouldCancelJob;
    private final boolean shouldForceCancelJob;

    public AgentInstruction(boolean shouldCancelJob) {
        this(shouldCancelJob, false);
    }

    public AgentInstruction(boolean shouldCancelJob, boolean shouldForceCancelJob) {
        this.shouldCancelJob = shouldCancelJob;
        this.shouldForceCancelJob = shouldForceCancelJob;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AgentInstruction that = (AgentInstruction) o;

        if (shouldCancelJob != that.shouldCancelJob) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return (shouldCancelJob ? 1 : 0);
    }

    public boolean shouldCancelJob() {
        return shouldCancelJob;
    }

    public boolean shouldForceCancel() {
        return shouldForceCancelJob;
    }
}
