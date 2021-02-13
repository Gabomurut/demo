package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Assignments {

    public static List< Assignment > all() {
        List< Assignment > assginments = new ArrayList<>();
        assginments.add(new Assignment("Matematicas", "tarde", "Romano", 30));
        assginments.add(new Assignment("Filosofía", "tarde", "Lopez", 20));
        assginments.add(new Assignment("Sociales", "mañana", "Smith", 45));
               
        return assginments;

    }

    public static void showAssginments() {
        List< Assignment > assginments = Assignments.all();
        for (Assignment assignment:assginments) System.out.println(assignment);
       
    }
    
}
