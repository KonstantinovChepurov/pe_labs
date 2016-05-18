package asu.configreader.factory;


import asu.configreader.domain.ConfigRealization;
import asu.configreader.yaml.YamlBuildConfigurationReader;

public class YAMLBuildConfigurationMaker implements ConfigRealizationMaker{
    @Override
    public ConfigRealization createConfig(String filename) {
        return new YamlBuildConfigurationReader(filename);
    }
}
