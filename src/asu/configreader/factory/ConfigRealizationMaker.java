package asu.configreader.factory;


import asu.configreader.domain.ConfigRealization;

public interface ConfigRealizationMaker {

    ConfigRealization createConfig(String filename);
}
