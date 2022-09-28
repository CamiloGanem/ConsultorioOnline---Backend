package com.consultorioonline.consulotrioonline.mapper;

import com.consultorioonline.consulotrioonline.dto.Usuario;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioMapper implements RowMapper<Usuario> {
    @Override
    public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
        Usuario usuario = new Usuario();
        usuario.setIden_usua(rs.getInt("iden_usua"));
        usuario.setEmail_usua(rs.getString("email_usua"));
        usuario.setPass_usua(rs.getString("pass_usua"));
        usuario.setNom_usua(rs.getString("nom_usua"));
        usuario.setApe_usua(rs.getString("ape_usua"));
        usuario.setFecnac_usua(rs.getDate("fecnac_usua"));
        usuario.setSexo_usua(rs.getString("sexo_usua"));
        usuario.setTipo_rol(rs.getInt("tipo_rol"));
        return usuario;
    }
}
