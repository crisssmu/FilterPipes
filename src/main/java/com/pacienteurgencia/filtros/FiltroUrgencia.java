/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pacienteurgencia.filtros;

import com.pacienteurgencia.clases.Paciente;
import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author Crism
 */
public class FiltroUrgencia implements Filtro {
    private ArrayList<Paciente> adultosMayores = new ArrayList<>();
    private ArrayList<Paciente> urgencias = new ArrayList<>();
    
    @Override
    public ArrayList<Paciente> procesar(ArrayList<Paciente> paciente) {
        for (Paciente paci : paciente) {
            if(paci.getEdad()>=60){
                adultosMayores.add(paci);
            } else {
                urgencias.add(paci);
              
            }
        } return null;
    }

    /**
     * @return the adultosMayores
     */
    public ArrayList<Paciente> getAdultosMayores() {
        return adultosMayores;
    }

    /**
     * @return the urgentes
     */
    public ArrayList<Paciente> getUrgencias() {
        return urgencias;
    }
    
    
    

   
   
    
    
}
