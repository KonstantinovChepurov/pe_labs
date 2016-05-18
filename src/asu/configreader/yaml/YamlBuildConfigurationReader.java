package asu.configreader.yaml;
// Factory method - concrete product 1
import net.sourceforge.yamlbeans.YamlException;
import net.sourceforge.yamlbeans.YamlReader;
import asu.configreader.domain.BuildConfig;
import asu.configreader.domain.ConfigRealization;
import asu.configreader.domain.Project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class YamlBuildConfigurationReader implements ConfigRealization {

	private YamlReader yamlReader;

	public YamlBuildConfigurationReader(String fileName) {
		try {
			yamlReader = new YamlReader(new FileReader(new File(fileName)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public YamlBuildConfigurationReader() {

	}

	public BuildConfig getBuildConfig() {
		BuildConfig config = null;
		try {
			config = yamlReader.read(BuildConfig.class);
			
		} catch (YamlException e) {
			e.printStackTrace();
		}

		return config;
	}

	@Override
	public Project getProject() {
		BuildConfig config = null;
		try {
			config = yamlReader.read(BuildConfig.class);

		} catch (YamlException e) {
			e.printStackTrace();
		}

		return config.getProject();

	}
}
