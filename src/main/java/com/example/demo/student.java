package com.example.demo;

public class student {

//Listar Materias -----------------------------------------

public void listAssignments(){
    Admin.showAssignments();
}

//Info de la materia 

public void infoAssignments() {


}

// Inscripción en la materia

public void doAssignment(Assignment assignment) {
    assignment.setMaxStudents(assignment.getMaxStudents()-1);

}


}
