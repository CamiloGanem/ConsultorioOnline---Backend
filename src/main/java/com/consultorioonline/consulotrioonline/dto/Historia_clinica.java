package com.consultorioonline.consulotrioonline.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Setter
@Getter
public class Historia_clinica {
    private int cod_hist;
    private String motivo_hist;
    private String histmedica_hist;
    private Date fecha_hist;
    private String eextraoral_hist;
    private String eintraoral_hist;
    private int cod_trat_hist;
    private int cod_paci_hist;
    private int iden_odon_hist;

    public Historia_clinica(int cod_hist, String motivo_hist, String histmedica_hist, Date fecha_hist, String eextraoral_hist, String eintraoral_hist, int cod_trat_hist, int cod_paci_hist, int iden_odon_hist) {
        this.cod_hist = cod_hist;
        this.motivo_hist = motivo_hist;
        this.histmedica_hist = histmedica_hist;
        this.fecha_hist = fecha_hist;
        this.eextraoral_hist = eextraoral_hist;
        this.eintraoral_hist = eintraoral_hist;
        this.cod_trat_hist = cod_trat_hist;
        this.cod_paci_hist = cod_paci_hist;
        this.iden_odon_hist = iden_odon_hist;
    }

    public Historia_clinica(){}
}
