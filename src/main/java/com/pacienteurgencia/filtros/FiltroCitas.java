/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pacienteurgencia.filtros;

import com.pacienteurgencia.clases.Paciente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Crism
 */
public class FiltroCitas implements Filtro{
   private ArrayList<Paciente> citasProgramadas = new ArrayList<>();
   private ArrayList<Paciente> ninos = new ArrayList<>();
   private ArrayList<Paciente> otros = new ArrayList<>();

    @Override
    public ArrayList<Paciente> procesar(ArrayList<Paciente> paciente) {
        for (Paciente paci : paciente) {
            if(paci.getEdad()<18){
                ninos.add(paci);
            } else {
                otros.add(paci);
            }
        }
        citasProgramadas.addAll(ninos);
        citasProgramadas.addAll(otros);
        return citasProgramadas;
    }


    

 
   
   
    
}
