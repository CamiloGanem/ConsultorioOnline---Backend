package com.consultorioonline.consulotrioonline.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Setter
@Getter
public class Usuario {
    private int iden_usua;
    private String email_usua;
    private String pass_usua;
    private String nom_usua;
    private String ape_usua;
    private Date fecnac_usua;
    private String sexo_usua;
    private int tipo_rol;

    public Usuario(int iden_usua, String email_usua, String pass_usua, String nom_usua, String ape_usua, Date fecnac_usua, String sexo_usua, int tipo_rol) {
        this.iden_usua = iden_usua;
        this.email_usua = email_usua;
        this.pass_usua = pass_usua;
        this.nom_usua = nom_usua;
        this.ape_usua = ape_usua;
        this.fecnac_usua = fecnac_usua;
        this.sexo_usua = sexo_usua;
        this.tipo_rol = tipo_rol;
    }

    public Usuario(){}

}


