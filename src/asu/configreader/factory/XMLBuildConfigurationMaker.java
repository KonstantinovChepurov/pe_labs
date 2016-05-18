package asu.configreader.factory;


import asu.configreader.domain.ConfigRealization;
import asu.configreader.xml.XMLBuildConfigurationReader;

public class XMLBuildConfigurationMaker implements ConfigRealizationMaker{


    @Override
    public ConfigRealization createConfig(String filename) {
        return new XMLBuildConfigurationReader(filename);
    }
}
