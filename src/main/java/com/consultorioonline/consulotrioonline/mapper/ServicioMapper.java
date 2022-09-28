package com.consultorioonline.consulotrioonline.mapper;

import com.consultorioonline.consulotrioonline.dto.Servicio;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ServicioMapper implements RowMapper<Servicio> {
    @Override
    public Servicio mapRow(ResultSet rs, int rowNum) throws SQLException {
        Servicio servicio = new Servicio();
        servicio.setCod_serv(rs.getInt("cod_serv"));
        servicio.setNom_serv(rs.getString("nom_serv"));
        servicio.setPrec_serv(rs.getFloat("prec_serv"));
        return servicio;
    }
}
