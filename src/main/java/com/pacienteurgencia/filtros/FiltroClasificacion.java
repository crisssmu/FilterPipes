/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pacienteurgencia.filtros;

import com.pacienteurgencia.clases.Paciente;
import com.pacienteurgencia.clases.Triage;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Crism
 */
public class FiltroClasificacion implements Filtro{
    private ArrayList<Paciente> urgencias = new ArrayList<>();
    private ArrayList<Paciente> citas = new ArrayList<>();
    @Override
    public ArrayList<Paciente> procesar(ArrayList<Paciente> paciente) {
        for (Paciente paci : paciente) {
            switch(paci.getTriage()){
                case Triage.ATENCION_INMEDIATA: urgencias.add(paci);break;
                case Triage.EMERGENCIA: urgencias.add(paci);break;
                case Triage.URGENCIA: urgencias.add(paci);break;
                case Triage.SEMI_URGENCIA: urgencias.add(paci); break;
                case Triage.NO_URGENTE: citas.add(paci);break;
            } 
        }
        return null;
    }

    /**
     * @return the urgencias
     */
    public ArrayList<Paciente> getUrgencias() {
        return urgencias;
    }

    /**
     * @return the citas
     */
    public ArrayList<Paciente> getCitas() {
        return citas;
    }
   

    
  
      
}
