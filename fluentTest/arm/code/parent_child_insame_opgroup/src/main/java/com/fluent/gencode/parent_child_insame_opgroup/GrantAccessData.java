/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.fluent.gencode.parent_child_insame_opgroup;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data used for requesting a SAS.
 */
public class GrantAccessData {
    /**
     * Possible values include: 'None', 'Read'.
     */
    @JsonProperty(value = "access", required = true)
    private AccessLevel access;

    /**
     * Time duration in seconds until the SAS access expires.
     */
    @JsonProperty(value = "durationInSeconds", required = true)
    private int durationInSeconds;

    /**
     * Get possible values include: 'None', 'Read'.
     *
     * @return the access value
     */
    public AccessLevel access() {
        return this.access;
    }

    /**
     * Set possible values include: 'None', 'Read'.
     *
     * @param access the access value to set
     * @return the GrantAccessData object itself.
     */
    public GrantAccessData withAccess(AccessLevel access) {
        this.access = access;
        return this;
    }

    /**
     * Get time duration in seconds until the SAS access expires.
     *
     * @return the durationInSeconds value
     */
    public int durationInSeconds() {
        return this.durationInSeconds;
    }

    /**
     * Set time duration in seconds until the SAS access expires.
     *
     * @param durationInSeconds the durationInSeconds value to set
     * @return the GrantAccessData object itself.
     */
    public GrantAccessData withDurationInSeconds(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
        return this;
    }

}
