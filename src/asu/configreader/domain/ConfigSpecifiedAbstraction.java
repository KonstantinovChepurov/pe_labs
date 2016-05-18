package asu.configreader.domain;

// Уточненная Абстракция
public class ConfigSpecifiedAbstraction {

    protected ConfigRealization configRealization;

    public ConfigSpecifiedAbstraction(ConfigRealization configRealization) {
        this.configRealization = configRealization;
    }

    public Project getProject() {
        return configRealization.getProject();
    }
}
