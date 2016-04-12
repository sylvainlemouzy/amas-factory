package fr.irit.smac.amasfactory;

import java.io.InputStream;

import fr.irit.smac.amasfactory.agent.IInfrastructureAgent;

public interface IAmasFactory
{    
    public <A extends IInfrastructureAgent<M>,M> IInfrastructure<A,M> createInfrastructure(InputStream configuration);
}