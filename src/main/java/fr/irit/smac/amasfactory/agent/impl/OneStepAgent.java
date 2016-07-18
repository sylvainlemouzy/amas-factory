package fr.irit.smac.amasfactory.agent.impl;

import fr.irit.smac.amasfactory.agent.IKnowledge;
import fr.irit.smac.amasfactory.agent.ISkill;
import fr.irit.smac.amasfactory.agent.features.ICommonFeatures;
import fr.irit.smac.libs.tooling.scheduling.IAgentStrategy;

public abstract class OneStepAgent<F extends ICommonFeatures, K extends IKnowledge, S extends ISkill<K>>
    extends Agent<F, K, S>implements IAgentStrategy {

}