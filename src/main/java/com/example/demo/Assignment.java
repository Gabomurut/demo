package com.example.demo;

public class Assignment {

    private String name;
    private String schedule;
    private String teacher;
    private int maxStudents;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    public Assignment(String name, String schedule, String teacher, int maxStudents) {
        this.name = name;
        this.schedule = schedule;
        this.teacher = teacher;
        this.maxStudents = maxStudents;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "name='" + name + '\'' +
                ", schedule='" + schedule + '\'' +
                ", professor ='" + teacher + '\'' +
                ", availability=" + maxStudents +
                '}';
    }
    


   
}
