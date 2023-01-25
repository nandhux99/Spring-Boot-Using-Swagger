package com.example.project.Project;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.project.Project.entity.Projects;
import com.example.project.Project.repository.ProjRepository;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2

public class ProjectApplication implements CommandLineRunner {
	@Autowired
	ProjRepository projRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Projects p1 = new Projects(1, "Nandhuu", "DataScience");
		Projects p2 = new Projects(2, "Babuu", "Automation");
		Projects p3 = new Projects(3, "Kumarr", "Java");
		projRepository.proj.addAll(Arrays.asList(p1, p2, p3));

	}

}
