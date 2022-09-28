package com.consultorioonline.consulotrioonline.mapper;

import com.consultorioonline.consulotrioonline.dto.Rol;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RolMapper implements RowMapper<Rol> {
    @Override
    public Rol mapRow(ResultSet rs, int rowNum) throws SQLException {
        Rol rol = new Rol();
        rol.setCod_rol(rs.getInt("cod_rol"));
        rol.setTipo_rol(rs.getString("tipo_rol"));
        return rol;
    }
}
