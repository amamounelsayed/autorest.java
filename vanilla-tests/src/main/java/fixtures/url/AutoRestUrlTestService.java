package fixtures.url;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;

/** Initializes a new instance of the AutoRestUrlTestService type. */
public final class AutoRestUrlTestService {
    /** A string value 'globalItemStringPath' that appears in the path. */
    private final String globalStringPath;

    /**
     * Gets A string value 'globalItemStringPath' that appears in the path.
     *
     * @return the globalStringPath value.
     */
    public String getGlobalStringPath() {
        return this.globalStringPath;
    }

    /** should contain value null. */
    private final String globalStringQuery;

    /**
     * Gets should contain value null.
     *
     * @return the globalStringQuery value.
     */
    public String getGlobalStringQuery() {
        return this.globalStringQuery;
    }

    /** server parameter. */
    private final String host;

    /**
     * Gets server parameter.
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

    /** The Queries object to access its operations. */
    private final Queries queries;

    /**
     * Gets the Queries object to access its operations.
     *
     * @return the Queries object.
     */
    public Queries getQueries() {
        return this.queries;
    }

    /** The PathItems object to access its operations. */
    private final PathItems pathItems;

    /**
     * Gets the PathItems object to access its operations.
     *
     * @return the PathItems object.
     */
    public PathItems getPathItems() {
        return this.pathItems;
    }

    /** Initializes an instance of AutoRestUrlTestService client. */
    AutoRestUrlTestService(String globalStringPath, String globalStringQuery, String host) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                globalStringPath,
                globalStringQuery,
                host);
    }

    /**
     * Initializes an instance of AutoRestUrlTestService client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    AutoRestUrlTestService(HttpPipeline httpPipeline, String globalStringPath, String globalStringQuery, String host) {
        this.httpPipeline = httpPipeline;
        this.globalStringPath = globalStringPath;
        this.globalStringQuery = globalStringQuery;
        this.host = host;
        this.paths = new Paths(this);
        this.queries = new Queries(this);
        this.pathItems = new PathItems(this);
    }
}
