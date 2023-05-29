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
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Estudiante getTutor() {
        return tutor;
    }

    public void setTutor(Estudiante tutor) {
        this.tutor = tutor;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public String getHorarioFin() {
        return horarioFin;
    }

    public void setHorarioFin(String horarioFin) {
        this.horarioFin = horarioFin;
    }
}