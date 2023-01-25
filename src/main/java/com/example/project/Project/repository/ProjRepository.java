package com.example.project.Project.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.project.Project.entity.Projects;

@Repository
public class ProjRepository {

	public List<Projects> proj = new ArrayList<Projects>();

	public List<Projects> getAll() {
		return proj;
	}

	public List<Projects> add(Projects project) {
		proj.add(project);
		return proj;
	}

	public List<Projects> edit(Projects project) {
		proj.stream().filter(e -> e.getProjectId() == project.getProjectId()).forEach(e -> {
			e.setCourse(project.getCourse());
			e.setName(project.getName());
		});
		return proj;
	}

	public List<Projects> delete(int projectId) {
		proj.remove(projectId - 1);
		return proj;
	}

}
