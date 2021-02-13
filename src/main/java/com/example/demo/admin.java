package com.example.demo;

import java.util.List;
import java.util.ArrayList;

public class Admin {

//Gestionar Materias -----------------------------------------------------------------

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

//Editar Assignment

public void editAssignment() {
    

}


//Borrar materias
public static void deleteAssignment(String name){
    
    for(Assignment assignment: assignments) {
        if(assignment.getName().equals(name)) {
            assignments.remove(assignment);
            break;
        }
    }
    
}

 

//Gestionar Teachers ---------------------------------------------------------------------

//Lista de teachers
public static List<Teacher> teachers = new ArrayList<>(); 

//agregar teachers a la lista
public static void addTeacher(String name, String lastName, int dni, boolean active) {
    teachers.add(new Teacher(name,lastName,dni, active));
    
}

public static void showTeachers() {
    for(Teacher teacher:teachers) System.out.println(teacher);
   
}

public void editTeacher() {

}


public static void deleteTeacher(String name) {
    for(Teacher teacher:teachers) { 
        if(teacher.getName().equals(name)) {
            teachers.remove(teacher);
            break;
        }
    
}


}



}

