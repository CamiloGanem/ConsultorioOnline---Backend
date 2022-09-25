package com.consultorioonline.consulotrioonline.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Especializacion {
    private int cod_espe;
    private String nom_espe;

    public Especializacion(int cod_espe, String nom_espe) {
        this.cod_espe = cod_espe;
        this.nom_espe = nom_espe;
    }

    public Especializacion(){}

}
