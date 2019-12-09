package br.com.digitalhouse;

import java.util.Date;

public class Aula {
    private Materia materia;
    private int horaInicio;
    private int horaFim;

    public Aula(Materia materia, int horaInicio, int horaFim) {
        this.materia = materia;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(int horaFim) {
        this.horaFim = horaFim;
    }
}
