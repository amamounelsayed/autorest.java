/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.lro.implementation;

import com.microsoft.azure.v2.AzureEnvironment;
import com.microsoft.azure.v2.AzureProxy;
import com.microsoft.azure.v2.AzureServiceClient;
import com.microsoft.rest.v2.credentials.ServiceClientCredentials;
import com.microsoft.rest.v2.http.HttpPipeline;
import fixtures.lro.AutoRestLongRunningOperationTestService;
import fixtures.lro.LRORetrys;
import fixtures.lro.LROs;
import fixtures.lro.LROSADs;
import fixtures.lro.LROsCustomHeaders;
import io.reactivex.annotations.NonNull;

/**
 * Initializes a new instance of the AutoRestLongRunningOperationTestService type.
 */
public final class AutoRestLongRunningOperationTestServiceImpl extends AzureServiceClient implements AutoRestLongRunningOperationTestService {
    /**
     * The preferred language for the response.
     */
    private String acceptLanguage;

    /**
     * Gets The preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets The preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself.
     */
    public AutoRestLongRunningOperationTestServiceImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /**
     * The retry timeout in seconds for Long Running Operations. Default value is 30.
     */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself.
     */
    public AutoRestLongRunningOperationTestServiceImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /**
     * Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     */
    private boolean generateClientRequestId;

    /**
     * Gets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself.
     */
    public AutoRestLongRunningOperationTestServiceImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The LROs object to access its operations.
     */
    private LROs lROs;

    /**
     * Gets the LROs object to access its operations.
     *
     * @return the LROs object.
     */
    public LROs lROs() {
        return this.lROs;
    }

    /**
     * The LRORetrys object to access its operations.
     */
    private LRORetrys lRORetrys;

    /**
     * Gets the LRORetrys object to access its operations.
     *
     * @return the LRORetrys object.
     */
    public LRORetrys lRORetrys() {
        return this.lRORetrys;
    }

    /**
     * The LROSADs object to access its operations.
     */
    private LROSADs lROSADs;

    /**
     * Gets the LROSADs object to access its operations.
     *
     * @return the LROSADs object.
     */
    public LROSADs lROSADs() {
        return this.lROSADs;
    }

    /**
     * The LROsCustomHeaders object to access its operations.
     */
    private LROsCustomHeaders lROsCustomHeaders;

    /**
     * Gets the LROsCustomHeaders object to access its operations.
     *
     * @return the LROsCustomHeaders object.
     */
    public LROsCustomHeaders lROsCustomHeaders() {
        return this.lROsCustomHeaders;
    }

    /**
     * Initializes an instance of AutoRestLongRunningOperationTestService client.
     *
     * @param credentials the management credentials for Azure.
     */
    public AutoRestLongRunningOperationTestServiceImpl(@NonNull ServiceClientCredentials credentials) {
        this(AzureProxy.createDefaultPipeline(AutoRestLongRunningOperationTestServiceImpl.class, credentials));
    }

    /**
     * Initializes an instance of AutoRestLongRunningOperationTestService client.
     *
     * @param credentials the management credentials for Azure.
     * @param azureEnvironment The environment that requests will target.
     */
    public AutoRestLongRunningOperationTestServiceImpl(@NonNull ServiceClientCredentials credentials, @NonNull AzureEnvironment azureEnvironment) {
        this(AzureProxy.createDefaultPipeline(AutoRestLongRunningOperationTestServiceImpl.class, credentials), azureEnvironment);
    }

    /**
     * Initializes an instance of AutoRestLongRunningOperationTestService client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public AutoRestLongRunningOperationTestServiceImpl(@NonNull HttpPipeline httpPipeline) {
        this(httpPipeline, null);
    }

    /**
     * Initializes an instance of AutoRestLongRunningOperationTestService client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param azureEnvironment The environment that requests will target.
     */
    public AutoRestLongRunningOperationTestServiceImpl(@NonNull HttpPipeline httpPipeline, @NonNull AzureEnvironment azureEnvironment) {
        super(httpPipeline, azureEnvironment);
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.lROs = new LROsImpl(this);
        this.lRORetrys = new LRORetrysImpl(this);
        this.lROSADs = new LROSADsImpl(this);
        this.lROsCustomHeaders = new LROsCustomHeadersImpl(this);
    }
}
