package com.consultorioonline.consulotrioonline.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Paciente {
    private int cod_paci;
    private String direc_paci;
    private String tele_paci;
    private int iden_usua_paci;

    public Paciente(int cod_paci, String direc_paci, String tele_paci, int iden_usua_paci) {
        this.cod_paci = cod_paci;
        this.direc_paci = direc_paci;
        this.tele_paci = tele_paci;
        this.iden_usua_paci = iden_usua_paci;
    }

    public Paciente(){}

}
