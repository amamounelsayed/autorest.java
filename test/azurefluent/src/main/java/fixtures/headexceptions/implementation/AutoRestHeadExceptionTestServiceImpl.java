/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.headexceptions.implementation;

import com.microsoft.azure.v2.AzureServiceClient;
import com.microsoft.rest.v2.credentials.ServiceClientCredentials;

/**
 * Initializes a new instance of the AutoRestHeadExceptionTestServiceImpl class.
 */
public class AutoRestHeadExceptionTestServiceImpl extends AzureServiceClient {


    /**
     * Gets or sets the preferred language for the response.
     */
    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public AutoRestHeadExceptionTestServiceImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /**
     * Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public AutoRestHeadExceptionTestServiceImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /**
     * When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     */
    private boolean generateClientRequestId;

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public AutoRestHeadExceptionTestServiceImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The HeadExceptionsInner object to access its operations.
     */
    private HeadExceptionsInner headExceptions;

    /**
     * Gets the HeadExceptionsInner object to access its operations.
     * @return the HeadExceptionsInner object.
     */
    public HeadExceptionsInner headExceptions() {
        return this.headExceptions;
    }

    /**
     * Initializes an instance of AutoRestHeadExceptionTestService client.
     *
     * @param credentials the management credentials for Azure
     */
    public AutoRestHeadExceptionTestServiceImpl(ServiceClientCredentials credentials) {
        this(AzureProxy.defaultPipeline(AutoRestHeadExceptionTestServiceImpl.class, credentials));
    }

    /**
     * Initializes an instance of AutoRestHeadExceptionTestService client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public AutoRestHeadExceptionTestServiceImpl(HttpPipeline httpPipeline) {
        super(httpPipeline);
        initialize();
    }

    protected void initialize() {
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.headExceptions = new HeadExceptionsInner(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s)", super.userAgent(), "AutoRestHeadExceptionTestService", "1.0.0");
    }
}
