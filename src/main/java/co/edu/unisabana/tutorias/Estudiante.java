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
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    public List<Disponibilidad> getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(List<Disponibilidad> disponibilidad) {
        this.disponibilidad = disponibilidad;
    }