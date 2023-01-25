package com.example.project.Project.entity;

public class Projects {
	private int projectId;
	private String name;
	private String course;

	public Projects() {
		super();

	}

	public Projects(int projectId, String name, String course) {
		super();
		this.projectId = projectId;
		this.name = name;
		this.course = course;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
}
