package co.edu.unisabana.tutorias;

public class Sesion {
    private int codigo;
    private Estudiante tutor;
    private String dia;
    private String horarioInicio;
    private String horarioFin;

    public Sesion() {
    }

    public Sesion(int codigo, Estudiante tutor, String dia, String horarioInicio, String horarioFin) {
        this.codigo = codigo;
        this.tutor = tutor;
        this.dia = dia;
        this.horarioInicio = horarioInicio;
        this.horarioFin = horarioFin;
    }