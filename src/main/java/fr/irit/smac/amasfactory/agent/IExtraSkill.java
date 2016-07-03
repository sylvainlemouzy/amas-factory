package fr.irit.smac.amasfactory.agent;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "className")
public interface IExtraSkill {

    public void setKnowledge(IKnowledge knowledge);
}
