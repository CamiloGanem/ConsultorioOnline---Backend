package com.consultorioonline.consulotrioonline.mapper;

import com.consultorioonline.consulotrioonline.dto.Especializacion;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EspecializacionMapper implements RowMapper<Especializacion> {
    @Override
    public Especializacion mapRow(ResultSet rs, int rowNum) throws SQLException {
        Especializacion espe = new Especializacion();
        espe.setCod_espe(rs.getInt("cod_espe"));
        espe.setNom_espe(rs.getString("nom_espe"));
        return espe;
    }
}
