package fr.irit.smac.amasfactory.factoryclientdemo.example2;

import com.fasterxml.jackson.annotation.JsonValue;

public enum EMyExtraKnowledgeSkill {
    CUSTOM("custom");

    private String name;

    private EMyExtraKnowledgeSkill(final String name) {
        this.name = name;
    }

    @JsonValue
    public String getName() {
        return name;
    }
}
