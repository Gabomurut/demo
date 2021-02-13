package com.example.demo;

import java.util.List;

import org.apache.catalina.valves.rewrite.RewriteValve;

import java.util.ArrayList;

public class Admin {

//Gestionar Materias


//Lista de materias
public static List<Assignment> assignments = new ArrayList<>(); 

//Agregar materia a la lista
public static void addAssignment(String name, String schedule, String teacher, int maxStudents) {
    assignments.add(new Assignment(name,schedule,teacher,maxStudents));
    
}

//Mostrar materias
public static void showAssignments() {
    for(Assignment assignment:assignments) System.out.println(assignment);
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

//Borrar materias
public static void deleteAssignment(int position) {

    assignments.remove(position);

}




//Gestionar Teachers

//Lista de teachers
public static List<Teacher> teachers = new ArrayList<>(); 

//agregar teachers a la lista
public static void addTeacher(String name, String lastName, int dni, boolean active) {
    teachers.add(new Teacher(name,lastName,dni, active));
    
}

public static void showTeachers() {
    for(Teacher teacher:teachers) System.out.println(teacher);
   
}

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


public static void deleteTeacher(int position) {

        teachers.remove(position);
    
}


}





