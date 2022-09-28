package com.consultorioonline.consulotrioonline.mapper;

import com.consultorioonline.consulotrioonline.dto.Cita;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CitaMapper implements RowMapper<Cita> {
    @Override
    public Cita mapRow(ResultSet rs, int rowNum) throws SQLException {
        Cita cita = new Cita();
        cita.setCod_cita(rs.getInt("cod_cita"));
        cita.setFecha_cita(rs.getDate("fecha_cita"));
        cita.setHora_cita(rs.getTime("hora_cita"));
        cita.setEstado_cita(rs.getString("estado_cita"));
        cita.setIden_odon_cita(rs.getInt("iden_odon_cita"));
        cita.setCod_paci_cita(rs.getInt("cod_paci_cita"));
        cita.setCod_serv_cita(rs.getInt("cod_serv_cita"));
        return null;
    }
}
