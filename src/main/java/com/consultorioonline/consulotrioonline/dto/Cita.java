package com.consultorioonline.consulotrioonline.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.sql.Time;

@Getter
@Setter
public class Cita {
    private int cod_cita;
    private Date fecha_cita;
    private Time hora_cita;
    private String estado_cita;
    private int iden_odon_cita;
    private int cod_paci_cita;
    private int cod_serv_cita;

    public Cita(int cod_cita, Date fecha_cita, Time hora_cita, String estado_cita, int iden_odon_cita, int cod_paci_cita, int cod_serv_cita) {
        this.cod_cita = cod_cita;
        this.fecha_cita = fecha_cita;
        this.hora_cita = hora_cita;
        this.estado_cita = estado_cita;
        this.iden_odon_cita = iden_odon_cita;
        this.cod_paci_cita = cod_paci_cita;
        this.cod_serv_cita = cod_serv_cita;
    }

    public Cita(){}

}
