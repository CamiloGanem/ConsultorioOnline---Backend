package com.consultorioonline.consulotrioonline.mapper;

import com.consultorioonline.consulotrioonline.dto.Paciente;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PacienteMapper implements RowMapper<Paciente> {
    @Override
    public Paciente mapRow(ResultSet rs, int rowNum) throws SQLException {
        Paciente paciente = new Paciente();
        paciente.setCod_paci(rs.getInt("cod_paci"));
        paciente.setDirec_paci(rs.getString("direc_paci"));
        paciente.setTele_paci(rs.getString("tele_pac"));
        paciente.setIden_usua_paci(rs.getInt("iden_usua_paci"));
        return paciente;
    }
}
