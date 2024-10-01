/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pacienteurgencia.filtros;

import com.pacienteurgencia.clases.Paciente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Crism
 */
public interface Filtro {
    ArrayList<Paciente> procesar(ArrayList<Paciente> paciente);
    
}
