package com.example.demo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {



	public static void main(String[] args) {
		
		SpringApplication.run(DemoApplication.class, args);

		//Validaciones 
		
		Admin.addTeacher("Juan", "Aurelio", 1234, true);
		Admin.addTeacher("Marcelo", "Lopez", 2222, true);
		Admin.addTeacher("Jhon", "Smith", 3333, false);
		Admin.addAssignment("matematica", "tarde", "moreno", 40);
		Admin.addAssignment("algebra", "mañana", "Fitz", 30);
		Admin.showAssignments();
		Admin.showTeachers();
		Admin.deleteAssignment("matematica");
		Admin.deleteTeacher("Jhon");
		Admin.showAssignments();
		Admin.showTeachers();
		Student.doAssignment("algebra");
	}

}
