/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.pacienteurgencia.clases;

/**
 *
 * @author Crism
 */
public enum Triage {
    ATENCION_INMEDIATA(1), 
    EMERGENCIA(2), 
    URGENCIA(3), 
    SEMI_URGENCIA(4), 
    NO_URGENTE(5);
    
    private int valor;
    private Triage(int valor){
        this.valor = valor;
    }
    
    public int getValor(){
        return valor;
    }
}
