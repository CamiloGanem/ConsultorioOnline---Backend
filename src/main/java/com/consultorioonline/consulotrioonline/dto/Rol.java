package com.consultorioonline.consulotrioonline.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Rol {
    private int cod_rol;
    private String tipo_rol;

    public Rol(int cod_rol, String tipo_rol) {
        this.cod_rol = cod_rol;
        this.tipo_rol = tipo_rol;
    }

    public Rol(){}

}
