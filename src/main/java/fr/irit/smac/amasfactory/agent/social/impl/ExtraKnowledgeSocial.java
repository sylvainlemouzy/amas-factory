package fr.irit.smac.amasfactory.agent.social.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

import fr.irit.smac.amasfactory.agent.impl.ExtraKnowledge;
import fr.irit.smac.amasfactory.agent.social.IExtraKnowledgeSocial;
import fr.irit.smac.amasfactory.agent.social.IPort;
import fr.irit.smac.amasfactory.agent.social.ITarget;
import fr.irit.smac.amasfactory.message.IMessage;
import fr.irit.smac.amasfactory.message.PortOfTargetMessage;
import fr.irit.smac.amasfactory.message.ValuePortMessage;
import fr.irit.smac.libs.tooling.messaging.IMsgBox;

public class ExtraKnowledgeSocial extends ExtraKnowledge implements IExtraKnowledgeSocial {

    private static final long serialVersionUID = -1275792665094626055L;

    @JsonProperty
    private Set<ITarget> targetSet;

    @JsonProperty
    protected Map<String, IPort> portMap;

    @JsonProperty
    private Class<?> outputType;

    @JsonProperty
    private Object outputValue;

    protected Collection<ValuePortMessage> sendToTargetMessageCollection;

    private Collection<PortOfTargetMessage> sendPortToTargetMessageCollection;

    protected IMsgBox<IMessage> msgBox;

    /**
     * Instantiates the knowledge of an agent.
     */
    public ExtraKnowledgeSocial() {

        this.targetSet = new HashSet<>();
        this.portMap = new HashMap<>();
        this.sendToTargetMessageCollection = new ArrayList<>();
        this.sendPortToTargetMessageCollection = new ArrayList<>();
    }

    @Override
    public void setTargetSet(Set<ITarget> targetSet) {
        this.targetSet = targetSet;
    }

    @Override
    public Set<ITarget> getTargetSet() {
        return targetSet;
    }

    @Override
    public Map<String, IPort> getPortMap() {
        return this.portMap;
    }

    @Override
    public Class<?> getOutputType() {
        return outputType;
    }

    @Override
    public Object getOutputValue() {
        return this.outputValue;
    }

    @Override
    public void setOutputValue(Object outputValue) {
        this.outputValue = outputValue;
    }

    @Override
    public Collection<ValuePortMessage> getValuePortMessageCollection() {
        return sendToTargetMessageCollection;
    }

    @Override
    public Collection<PortOfTargetMessage> getPortOfTargetMessageCollection() {
        return sendPortToTargetMessageCollection;
    }

    public void setMsgBox(IMsgBox<IMessage> msgBox) {
        this.msgBox = msgBox;
    }

    public IMsgBox<IMessage> getMsgBox() {
        return this.msgBox;
    }
}