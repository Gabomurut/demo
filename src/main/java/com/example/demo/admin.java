package com.example.demo;



public class admin {

//Gestionar Materias

public Assignment newAssignment(String name, String schedule, String teacher, int maxStudents) { 
   Assignment assignment = new Assignment(name, schedule, teacher, maxStudents);

   return assignment;

}


public void editAssignmentName(Assignment assignment, String name) {
    assignment.setName(name);

}

public void editAssignmentSchedule(Assignment assignment, String schedule) {
    assignment.setSchedule(schedule);

}

public void editAssignmentTeacher(Assignment assignment, String teacher) {
    assignment.setTeacher(teacher);

}

public void editAssignmentMaxStudents(Assignment assignment, int maxStudents) {
    assignment.setMaxStudents(maxStudents);

}

public void deleteAssignment() {



}



//Gestionar Teachers

public Teacher newTeacher(String name, String lastName, int dni, boolean active) {
    Teacher teacher = new Teacher(name, lastName, dni, active);
    
    return teacher;


}


public void editTeacherName(Teacher teacher, String name) {
    teacher.setName(name);

}

public void editTeacherLastName(Teacher teacher, String lastName) {
    teacher.setLastName(lastName);

}

public void editTeacherDni(Teacher teacher, int dni) {
    teacher.setDni(dni);

}

public void editTeacherActive(Teacher teacher, boolean active) {
    teacher.setActive(active);

}


public void deleteTeacher() {



}


}





