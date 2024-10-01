/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pacienteurgencia.clases;

import java.util.ArrayList;

/**
 *
 * @author Crism
 */
public class Paciente implements Comparable<Paciente>{
    
    private String nombre;  
    private int edad;
    private Triage triage;
    private Atencion atencion;
    

    public Paciente() {
    }

    public Paciente(String nombre, int edad, Triage triage, Atencion atencion) {
        this.nombre = nombre;
        this.edad = edad;
        this.triage = triage;
        this.atencion = atencion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @return the triage
     */
    public Triage getTriage() {
        return triage;
    }

    /**
     * @return the atencion
     */
    public Atencion getAtencion() {
        return atencion;
    }

    @Override
    public int compareTo(Paciente paciente) {
        return Integer.compare(this.triage.getValor(), paciente.getTriage().getValor());
    }

}
