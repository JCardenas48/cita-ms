package com.citasms.citas_ms.models;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Cita {
    @Id
    private String idCita;
    private String pacienteId;
    private String profesionalId;
    private Date fecha;
    private String especialidad;

    public Cita(String idCita, String pacienteId, String profesionalId, Date fecha, String especialidad) {
        this.idCita = idCita;
        this.pacienteId = pacienteId;
        this.profesionalId = profesionalId;
        this.fecha = fecha;
        this.especialidad = especialidad;
    }

    public String getIdCita() {
        return idCita;
    }

    public void setIdCita(String idCita) {
        this.idCita = idCita;
    }

    public String getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(String pacienteId) {
        this.pacienteId = pacienteId;
    }

    public String getProfesionalId() {
        return profesionalId;
    }

    public void setProfesionalId(String profesionalId) {
        this.profesionalId = profesionalId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}

