package fixtures.custombaseuri;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;

/** Initializes a new instance of the AutoRestParameterizedHostTestClient type. */
public final class AutoRestParameterizedHostTestClient {
    /** A string value that is used as a global part of the parameterized host. */
    private final String host;

    /**
     * Gets A string value that is used as a global part of the parameterized host.
     *
     * @return the host value.
     */
    public String getHost() {
        return this.host;
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

    /** Initializes an instance of AutoRestParameterizedHostTestClient client. */
    AutoRestParameterizedHostTestClient(String host) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                host);
    }

    /**
     * Initializes an instance of AutoRestParameterizedHostTestClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    AutoRestParameterizedHostTestClient(HttpPipeline httpPipeline, String host) {
        this.httpPipeline = httpPipeline;
        this.host = host;
        this.paths = new Paths(this);
    }
}
