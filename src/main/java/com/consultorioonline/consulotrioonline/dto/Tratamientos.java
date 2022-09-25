package com.consultorioonline.consulotrioonline.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Tratamientos {
    private int cod_trat;
    private String nom_trat;
    private float prec_trat;

    public Tratamientos(int cod_trat, String nom_trat, float prec_trat) {
        this.cod_trat = cod_trat;
        this.nom_trat = nom_trat;
        this.prec_trat = prec_trat;
    }

    public Tratamientos(){}

}
