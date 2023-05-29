package co.edu.unisabana.tutorias;

public class Disponibilidad {
    private String dia;
    private String horario;

    public Disponibilidad() {
    }

    public Disponibilidad(String dia, String horario) {
        this.dia = dia;
        this.horario = horario;
    }
    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}