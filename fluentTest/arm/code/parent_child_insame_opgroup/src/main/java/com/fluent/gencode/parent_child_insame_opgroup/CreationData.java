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
 * Data used when creating a dog.
 */
public class CreationData {
    /**
     * This enumerates the possible sources of a dog's creation. Possible
     * values include: 'Import', 'Copy', 'Restore'.
     */
    @JsonProperty(value = "createOption", required = true)
    private DogCreateOption createOption;

    /**
     * If createOption is Import, the Azure Resource Manager identifier of the
     * storage account containing the blob to import as a dog. Required only if
     * the blob is in a different subscription.
     */
    @JsonProperty(value = "storageAccountId")
    private String storageAccountId;

    /**
     * Dog source information.
     */
    @JsonProperty(value = "imageReference")
    private ImageDogReference imageReference;

    /**
     * If createOption is Import, this is the URI of a blob to be imported into
     * a managed dog.
     */
    @JsonProperty(value = "sourceUri")
    private String sourceUri;

    /**
     * If createOption is Copy, this is the ARM id of the source puppy or dog.
     */
    @JsonProperty(value = "sourceResourceId")
    private String sourceResourceId;

    /**
     * Get this enumerates the possible sources of a dog's creation. Possible values include: 'Import', 'Copy', 'Restore'.
     *
     * @return the createOption value
     */
    public DogCreateOption createOption() {
        return this.createOption;
    }

    /**
     * Set this enumerates the possible sources of a dog's creation. Possible values include: 'Import', 'Copy', 'Restore'.
     *
     * @param createOption the createOption value to set
     * @return the CreationData object itself.
     */
    public CreationData withCreateOption(DogCreateOption createOption) {
        this.createOption = createOption;
        return this;
    }

    /**
     * Get if createOption is Import, the Azure Resource Manager identifier of the storage account containing the blob to import as a dog. Required only if the blob is in a different subscription.
     *
     * @return the storageAccountId value
     */
    public String storageAccountId() {
        return this.storageAccountId;
    }

    /**
     * Set if createOption is Import, the Azure Resource Manager identifier of the storage account containing the blob to import as a dog. Required only if the blob is in a different subscription.
     *
     * @param storageAccountId the storageAccountId value to set
     * @return the CreationData object itself.
     */
    public CreationData withStorageAccountId(String storageAccountId) {
        this.storageAccountId = storageAccountId;
        return this;
    }

    /**
     * Get dog source information.
     *
     * @return the imageReference value
     */
    public ImageDogReference imageReference() {
        return this.imageReference;
    }

    /**
     * Set dog source information.
     *
     * @param imageReference the imageReference value to set
     * @return the CreationData object itself.
     */
    public CreationData withImageReference(ImageDogReference imageReference) {
        this.imageReference = imageReference;
        return this;
    }

    /**
     * Get if createOption is Import, this is the URI of a blob to be imported into a managed dog.
     *
     * @return the sourceUri value
     */
    public String sourceUri() {
        return this.sourceUri;
    }

    /**
     * Set if createOption is Import, this is the URI of a blob to be imported into a managed dog.
     *
     * @param sourceUri the sourceUri value to set
     * @return the CreationData object itself.
     */
    public CreationData withSourceUri(String sourceUri) {
        this.sourceUri = sourceUri;
        return this;
    }

    /**
     * Get if createOption is Copy, this is the ARM id of the source puppy or dog.
     *
     * @return the sourceResourceId value
     */
    public String sourceResourceId() {
        return this.sourceResourceId;
    }

    /**
     * Set if createOption is Copy, this is the ARM id of the source puppy or dog.
     *
     * @param sourceResourceId the sourceResourceId value to set
     * @return the CreationData object itself.
     */
    public CreationData withSourceResourceId(String sourceResourceId) {
        this.sourceResourceId = sourceResourceId;
        return this;
    }

}
