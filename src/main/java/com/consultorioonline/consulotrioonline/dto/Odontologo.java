package com.consultorioonline.consulotrioonline.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Odontologo {
    private int iden_odon;
    private String selfie_odon;
    private int cod_espe_odon;
    private int iden_usua_odon;

    public Odontologo(int iden_odon, String selfie_odon, int cod_espe_odon, int iden_usua_odon) {
        this.iden_odon = iden_odon;
        this.selfie_odon = selfie_odon;
        this.cod_espe_odon = cod_espe_odon;
        this.iden_usua_odon = iden_usua_odon;
    }

    public Odontologo(){}

}
