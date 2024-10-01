/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pacienteurgencia;


import com.pacienteurgencia.clases.Paciente;
import com.pacienteurgencia.filtros.Filtro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Crism
 */
public class Tubo {
    private Filtro filter;

    public Tubo(Filtro filter) {
        this.filter = filter;
    }

    public ArrayList<Paciente> transfer(ArrayList<Paciente> pacientes) {
        return filter.procesar(pacientes);
    }
   
}
