package fixtures.custombaseuri.moreoptions;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;

/** Initializes a new instance of the AutoRestParameterizedCustomHostTestClient type. */
public final class AutoRestParameterizedCustomHostTestClient {
    /** The subscription id with value 'test12'. */
    private final String subscriptionId;

    /**
     * Gets The subscription id with value 'test12'.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /** A string value that is used as a global part of the parameterized host. Default value 'host'. */
    private final String dnsSuffix;

    /**
     * Gets A string value that is used as a global part of the parameterized host. Default value 'host'.
     *
     * @return the dnsSuffix value.
     */
    public String getDnsSuffix() {
        return this.dnsSuffix;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The Paths object to access its operations. */
    private final Paths paths;

    /**
     * Gets the Paths object to access its operations.
     *
     * @return the Paths object.
     */
    public Paths getPaths() {
        return this.paths;
    }

    /** Initializes an instance of AutoRestParameterizedCustomHostTestClient client. */
    AutoRestParameterizedCustomHostTestClient(String subscriptionId, String dnsSuffix) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                subscriptionId,
                dnsSuffix);
    }

    /**
     * Initializes an instance of AutoRestParameterizedCustomHostTestClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    AutoRestParameterizedCustomHostTestClient(HttpPipeline httpPipeline, String subscriptionId, String dnsSuffix) {
        this.httpPipeline = httpPipeline;
        this.subscriptionId = subscriptionId;
        this.dnsSuffix = dnsSuffix;
        this.paths = new Paths(this);
    }
}
