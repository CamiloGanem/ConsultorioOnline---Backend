package com.consultorioonline.consulotrioonline.mapper;

import com.consultorioonline.consulotrioonline.dto.Tratamientos;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TratamientoMapper implements RowMapper<Tratamientos> {
    @Override
    public Tratamientos mapRow(ResultSet rs, int rowNum) throws SQLException {
        Tratamientos tratamiento = new Tratamientos();
        tratamiento.setCod_trat(rs.getInt("cod_trat"));
        tratamiento.setNom_trat(rs.getString("nom_trat"));
        tratamiento.setPrec_trat(rs.getFloat("prec_trat"));
        return tratamiento;
    }
}
