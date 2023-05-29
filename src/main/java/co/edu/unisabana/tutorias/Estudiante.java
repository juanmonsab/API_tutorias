package co.edu.unisabana.tutorias;

import java.util.List;
import java.util.Objects;

public class Estudiante {
    private int codigo;
    private String nombre;
    private String facultad;
    private String programa;
    private int semestre;
    private List<String> habilidades;
    private List<Disponibilidad> disponibilidad;

    // Constructor vacío
    public Estudiante() {
    }

    // Constructor con parámetros
    public Estudiante(int codigo, String nombre, String facultad, String programa, int semestre, List<String> habilidades, List<Disponibilidad> disponibilidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.facultad = facultad;
        this.programa = programa;
        this.semestre = semestre;
        this.habilidades = habilidades;
        this.disponibilidad = disponibilidad;
    }