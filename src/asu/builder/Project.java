package asu.builder;

public class Project {

	private String projectDept;
	private String projectName;
	private String projectEmail;
	private String projectSupervisor;
	private String projectDescription;
	private String projectGroup;

	public Project(String projectDept, String projectName, String projectEmail, String projectSupervisor, String projectDescription, String projectGroup) {
		this.projectDept = projectDept;
		this.projectName = projectName;
		this.projectEmail = projectEmail;
		this.projectSupervisor = projectSupervisor;
		this.projectDescription = projectDescription;
		this.projectGroup = projectGroup;
	}

	public Project() {
	}

	public String getProjectDept() {
		return projectDept;
	}

	public void setProjectDept(String projectDept) {
		this.projectDept = projectDept;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectEmail() {
		return projectEmail;
	}

	public void setProjectEmail(String projectEmail) {
		this.projectEmail = projectEmail;
	}

	public String getProjectSupervisor() {
		return projectSupervisor;
	}

	public void setProjectSupervisor(String projectSupervisor) {
		this.projectSupervisor = projectSupervisor;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public void setProjectGroup(String projectGroup) {
		this.projectGroup = projectGroup;
	}

	public String getProjectGroup() {
		return projectGroup;
	}

	@Override
	public String toString() {
		return "Проект{" +
				"projectDept='" + projectDept + '\'' +
				", projectName='" + projectName + '\'' +
				", projectEmail='" + projectEmail + '\'' +
				", projectSupervisor='" + projectSupervisor + '\'' +
				", projectDescription='" + projectDescription + '\'' +
				", projectGroup='" + projectGroup + '\'' +
				'}';
	}
}
