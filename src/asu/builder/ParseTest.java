package asu.builder;

import java.util.ArrayList;

public class ParseTest {


	public static void main(String[] args) {

		ArrayList<Project> projects;
		NodeConverter projectbuilder = new ProjectConverter();
		DocReader reader = new DocReader(projectbuilder, "projects.xml");

		projects = reader.build();

		for (Project project : projects) {
			System.out.println(project);
		}

				
	}

}
