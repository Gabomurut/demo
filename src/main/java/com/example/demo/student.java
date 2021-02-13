package com.example.demo;

public class Student {

//Listar Materias -----------------------------------------

public void listAssignments(){
    Admin.showAssignments();
}

//Info de la materia 

public void infoAssignments() {


}

// Inscripción en la materia

public static void doAssignment(String name) {
    for(Assignment assignment : Admin.assignments) {
        if(assignment.getName().equals(name)) {
            assignment.setMaxStudents(assignment.getMaxStudents()-1);
            System.out.println("Inscripto en Algebra");
            
        }
    }
}


}
