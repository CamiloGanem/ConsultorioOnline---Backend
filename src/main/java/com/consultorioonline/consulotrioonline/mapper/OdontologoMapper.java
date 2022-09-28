package com.consultorioonline.consulotrioonline.mapper;

import com.consultorioonline.consulotrioonline.dto.Odontologo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OdontologoMapper implements RowMapper<Odontologo> {
    @Override
    public Odontologo mapRow(ResultSet rs, int rowNum) throws SQLException {
        Odontologo odontologo = new Odontologo();
        odontologo.setIden_odon(rs.getInt("iden_odon"));
        odontologo.setSelfie_odon(rs.getString("selfie_odon"));
        odontologo.setCod_espe_odon(rs.getInt("cod_espe_odon"));
        odontologo.setIden_usua_odon(rs.getInt("iden_usua_odon"));
        return odontologo;
    }
}
