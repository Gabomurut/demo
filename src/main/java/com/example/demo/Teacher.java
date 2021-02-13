package com.example.demo;

public class Teacher {

    private String name;
    private String lastName;
    private int dni;
    private boolean active;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
		this.active = active;
	}

    public Teacher(String name, String lastName, int dni, boolean active) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.active = active;
    }

   @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", lastname='" + lastName + '\'' +
                ", DNI ='" + dni+ '\'' +
                ", active=" + active +
                '}';
    }

   

}
