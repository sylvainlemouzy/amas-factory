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
package fr.irit.smac.amasfactory.infrastructure;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import fr.irit.smac.amasfactory.impl.ShutdownRuntimeException;

/**
 * The Interface IInfrastructure exposes methods to get some services.
 *
 * @param <T>
 *            the services
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "className")
public interface IInfrastructure<T> {

    /**
     * Starts the services.
     */
    public void start();

    /**
     * Shutdown the services.
     *
     * @throws ShutdownRuntimeException
     *             the shutdown runtime exception
     */
    public void shutdown() throws ShutdownRuntimeException;

    public T getServices();

    public void setServices(T services);

}
