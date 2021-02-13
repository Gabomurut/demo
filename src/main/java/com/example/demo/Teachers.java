package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Teachers {


    public static List< Teacher > all() {
        List< Teacher > teachers = new ArrayList<>();
        teachers.add(new Teacher("Juan", "Aurelio", 1234, true));
        teachers.add(new Teacher("Marcelo", "Lopez", 2222, true));
        teachers.add(new Teacher("Jhon", "Smith", 3333, false));
               
        return teachers;


    }

    public static void showTeachers() {
        List< Teacher > teachers = Teachers.all();
        for (Teacher teacher:teachers) System.out.println(teacher);
       
    }



}