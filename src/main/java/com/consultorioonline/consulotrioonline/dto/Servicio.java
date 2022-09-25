package com.consultorioonline.consulotrioonline.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Servicio {
    private int cod_serv;
    private String nom_serv;
    private float prec_serv;

    public Servicio(int cod_serv, String nom_serv, float prec_serv) {
        this.cod_serv = cod_serv;
        this.nom_serv = nom_serv;
        this.prec_serv = prec_serv;
    }

    public Servicio(){}

}
