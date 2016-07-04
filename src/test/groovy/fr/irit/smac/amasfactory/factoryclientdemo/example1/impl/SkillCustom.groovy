package fr.irit.smac.amasfactory.factoryclientdemo.example1.impl

import fr.irit.smac.amasfactory.agent.impl.Skill
import fr.irit.smac.amasfactory.factoryclientdemo.example1.EMyFeature
import fr.irit.smac.amasfactory.factoryclientdemo.example1.IKnowledgeCustom
import fr.irit.smac.amasfactory.factoryclientdemo.example1.ISkillCustom

class SkillCustom extends Skill implements ISkillCustom{

    public void increment() {
        
        IKnowledgeCustom e = this.knowledge
        e.setCount(e.count +1)
    }
}