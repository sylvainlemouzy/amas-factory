package fr.irit.smac.amasfactory.util.deserializer;

import java.io.IOException;
import java.io.InputStream;

import fr.irit.smac.amasfactory.IInfrastructure;
import fr.irit.smac.amasfactory.agent.IInfrastructureAgent;

/**
 * The Interface IAmasFactoryDeserializer exposes a method to create a multi-agent
 * system from a configuration file.
 */
@FunctionalInterface
public interface IAmasFactoryDeserializer {

    /**
     * Deserialize the infrastructure.
     *
     * @param <A>
     *            the generic type
     * @param <M>
     *            the generic type
     * @param configuration
     *            the configuration
     * @return the i infrastructure
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public <A extends IInfrastructureAgent<M>, M> IInfrastructure<A, M> deserializeInfrastructure(InputStream configuration)
        throws IOException;
}