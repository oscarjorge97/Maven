package com.oyataco.model;

public class Persona {

    private int id;
    private String nombres;
    private int edad;


    //Getter&Setter


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Override
    public String toString() {
        return id+": "+nombres+" "+ edad+"years old";
    }
}
