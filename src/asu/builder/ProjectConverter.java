package asu.builder;

// ConcreteBuilder
public class ProjectConverter extends NodeConverter {
	private Project project;
	public ProjectConverter(){
		this.project=new Project();
	}
	@Override
	public void ReadProject(String projectname) {
		project.setProjectName(projectname);
	}

	public void ReadSupervisor(String supervisorName){
		project.setProjectSupervisor(supervisorName);
	}
	public void ReadEmail(String email){
		project.setProjectEmail(email);
	}
	public void ReadDescription(String description){
		project.setProjectDescription(description);
	}

	@Override
	public void ReadDepartment(String department) {
		project.setProjectDept(department);
	}

	 @Override
	 public void ReadGroup(String group) {
		 project.setProjectGroup(group);
	  }

	  public Project printProject() {

		  Project project1 = new Project(project.getProjectName(), project.getProjectEmail(),project.getProjectSupervisor(), project.getProjectDescription(), project.getProjectDept(), project.getProjectGroup());

		  return project1;
	}
}
