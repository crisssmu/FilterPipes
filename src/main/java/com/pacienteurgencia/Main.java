package com.pacienteurgencia;

import com.pacienteurgencia.clases.Atencion;
import com.pacienteurgencia.clases.Paciente;
import com.pacienteurgencia.clases.Triage;
import com.pacienteurgencia.filtros.FiltroCitas;
import com.pacienteurgencia.filtros.FiltroClasificacion;
import com.pacienteurgencia.filtros.Filtro;
import com.pacienteurgencia.filtros.FiltroUrgencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Cristina", 20, Triage.URGENCIA, Atencion.URGENCIAS);
        Paciente paciente2 = new Paciente("Jorge", 65, Triage.EMERGENCIA, Atencion.URGENCIAS);
        Paciente paciente3 = new Paciente("Ana", 35, Triage.NO_URGENTE, Atencion.CITAS_PROGRAMADAS);
        Paciente paciente4 = new Paciente("Luis", 80, Triage.ATENCION_INMEDIATA, Atencion.URGENCIAS);
        Paciente paciente5 = new Paciente("Maria", 45, Triage.SEMI_URGENCIA, Atencion.CITAS_PROGRAMADAS);
        Paciente paciente6 = new Paciente("Pedro", 70, Triage.EMERGENCIA, Atencion.URGENCIAS);
        Paciente paciente7 = new Paciente("Sofia", 30, Triage.URGENCIA, Atencion.URGENCIAS);
        Paciente paciente8 = new Paciente("Carlos", 90, Triage.NO_URGENTE, Atencion.CITAS_PROGRAMADAS);
        Paciente paciente9 = new Paciente("Laura", 50, Triage.SEMI_URGENCIA, Atencion.URGENCIAS);
        Paciente paciente10 = new Paciente("Andres", 15, Triage.NO_URGENTE, Atencion.CITAS_PROGRAMADAS);
        Paciente paciente11 = new Paciente("Fernando", 25, Triage.SEMI_URGENCIA, Atencion.URGENCIAS);
        Paciente paciente12 = new Paciente("Isabel", 72, Triage.ATENCION_INMEDIATA, Atencion.URGENCIAS);
        Paciente paciente13 = new Paciente("Nicolas", 55, Triage.URGENCIA, Atencion.URGENCIAS);
        Paciente paciente14 = new Paciente("Clara", 40, Triage.NO_URGENTE, Atencion.CITAS_PROGRAMADAS);
        Paciente paciente15 = new Paciente("Valeria", 60, Triage.EMERGENCIA, Atencion.URGENCIAS);
        Paciente paciente16 = new Paciente("Juan", 33, Triage.URGENCIA, Atencion.URGENCIAS);
        Paciente paciente17 = new Paciente("Carmen", 85, Triage.SEMI_URGENCIA, Atencion.CITAS_PROGRAMADAS);
        Paciente paciente18 = new Paciente("Gonzalo", 45, Triage.NO_URGENTE, Atencion.CITAS_PROGRAMADAS);
        Paciente paciente19 = new Paciente("Paula", 23, Triage.ATENCION_INMEDIATA, Atencion.URGENCIAS);
        Paciente paciente20 = new Paciente("Ramiro", 38, Triage.URGENCIA, Atencion.URGENCIAS);

        ArrayList<Paciente> pacientes = new ArrayList<>();

        pacientes.add(paciente1);
        pacientes.add(paciente2);
        pacientes.add(paciente3);
        pacientes.add(paciente4);
        pacientes.add(paciente5);
        pacientes.add(paciente6);
        pacientes.add(paciente7);
        pacientes.add(paciente8);
        pacientes.add(paciente9);
        pacientes.add(paciente10);
        pacientes.add(paciente11);
        pacientes.add(paciente12);
        pacientes.add(paciente13);
        pacientes.add(paciente14);
        pacientes.add(paciente15);
        pacientes.add(paciente16);
        pacientes.add(paciente17);
        pacientes.add(paciente18);
        pacientes.add(paciente19);
        pacientes.add(paciente20);
        //Definir filtros

        FiltroClasificacion filterClasificacion = new FiltroClasificacion();
        FiltroUrgencia filterUrgencia = new FiltroUrgencia();
        FiltroCitas filterCitas = new FiltroCitas();

        FiltroCitas filterninos = new FiltroCitas();
        FiltroUrgencia filterAdultoMayor = new FiltroUrgencia();

        //Crear tubos
        Tubo clasificarPipes = new Tubo(filterClasificacion);
        Tubo urgenciaPipes = new Tubo(filterUrgencia);
        Tubo citasPipes = new Tubo(filterCitas);

        //Pasar los datos a traves de los filtros
        filterClasificacion.procesar(pacientes);
        filterUrgencia.procesar(filterClasificacion.getUrgencias());

        //Filtro urgencia
        FiltroUrgencia filterUrgenciasPersonas = new FiltroUrgencia();
        filterUrgenciasPersonas.procesar(filterClasificacion.getUrgencias());

        //Listas
        ArrayList<Paciente> citas = citasPipes.transfer(filterClasificacion.getCitas());
        ArrayList<Paciente> urgencias = filterUrgenciasPersonas.getUrgencias();
        ArrayList<Paciente> adultosMayores = filterUrgenciasPersonas.getAdultosMayores();

        System.out.println("-----Citas------");
        for (Paciente p : citas) {
            System.out.println("=================");
            System.out.println("Primer nombre: " + p.getNombre());
            System.out.println("Edad: " + p.getEdad());
            System.out.println("Triage: " + p.getTriage());
            System.out.println("Atencion: " + p.getAtencion());
            System.out.println("=================");
        }
        System.out.println("-------------------");

        System.out.println("-----Urgencia[Adulto Mayor]------");
        for (Paciente p : adultosMayores) {
            System.out.println("=================");
            System.out.println("Primer nombre: " + p.getNombre());
            System.out.println("Edad: " + p.getEdad());
            System.out.println("Triage: " + p.getTriage());
            System.out.println("Atencion: " + p.getAtencion());
            System.out.println("=================");
        }
        System.out.println("-------------------");
        Collections.sort(urgencias);
        System.out.println("-----Urgencia[Normal]------");
        for (Paciente p : urgencias) {
            System.out.println("=================");
            System.out.println("Primer nombre: " + p.getNombre());
            System.out.println("Edad: " + p.getEdad());
            System.out.println("Triage: " + p.getTriage());
            System.out.println("Atencion: " + p.getAtencion());
            System.out.println("=================");
        }
        System.out.println("-------------------");
    }
}
