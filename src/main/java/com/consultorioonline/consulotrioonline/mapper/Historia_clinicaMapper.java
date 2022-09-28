package com.consultorioonline.consulotrioonline.mapper;

import com.consultorioonline.consulotrioonline.dto.Historia_clinica;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Historia_clinicaMapper implements RowMapper<Historia_clinica> {
    @Override
    public Historia_clinica mapRow(ResultSet rs, int rowNum) throws SQLException {
        Historia_clinica historia = new Historia_clinica();
        historia.setCod_hist(rs.getInt("cod_hist"));
        historia.setMotivo_hist(rs.getString("motivo_hist"));
        historia.setHistmedica_hist(rs.getString("histmedica_hist"));
        historia.setFecha_hist(rs.getDate("fecha_hist"));
        historia.setEextraoral_hist(rs.getString("eextraoral_hist"));
        historia.setEintraoral_hist(rs.getString("eintraoral_hist"));
        historia.setCod_trat_hist(rs.getInt("cod_trat_hist"));
        historia.setCod_paci_hist(rs.getInt("cod_paci_hist"));
        historia.setIden_odon_hist(rs.getInt("iden_odon_hist"));
        return historia;
    }
}
