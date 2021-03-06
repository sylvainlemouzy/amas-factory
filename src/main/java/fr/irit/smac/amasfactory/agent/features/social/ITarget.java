/*
 * #%L
 * amas-factory
 * %%
 * Copyright (C) 2015 - 2016 IRIT - SMAC Team and Brennus Analytics
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */
package fr.irit.smac.amasfactory.agent.features.social;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * An agent owning a target knows the agentTarget of this entity. It can send
 * messages to this agentTarget. A portTarget can be defined. The portTarget is
 * a port of the receiver agent. It means that the sender agent can send values
 * directly of this port. Furthermore, a portSource can be defined. The
 * portSource is a port of the sender agent. It means that the receiver agent
 * will be able to send values to the sender agent on this port. The value is
 * the data the agent can send.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "className")
public interface ITarget {
    /**
     * @return the id of the target agent
     */
    public String getAgentId();

    /**
     * @return the id of the port of the target agent
     */
    public String getPortTarget();

    /**
     * @return the id of the port supposed to receive the value of the target
     *         agent
     */
    public String getPortSource();
}
