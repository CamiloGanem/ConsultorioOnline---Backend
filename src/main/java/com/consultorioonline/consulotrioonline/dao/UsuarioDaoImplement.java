package com.consultorioonline.consulotrioonline.dao;

import com.consultorioonline.consulotrioonline.dto.Usuario;
import com.consultorioonline.consulotrioonline.mapper.UsuarioMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UsuarioDaoImplement implements UsuarioDao{

    private static final String SELECTALL = "SELECT * FROM usuarios";
    private static final String SELECTBYID = "SELECT * FROM usuarios WHERE iden_usua = ?";
    private static final String INSERT = "INSERT INTO usuarios (iden_usua, email_usua, pass_usua," +
                                         " nom_usua, ape_usua, fecnac_usua, sexo_usua, tipo_rol)" +
                                         " VALUE(?,?,?,?,?,?,?,?)";
    private static final String UPDATE = "UPDATE usuarios SET email_usua=?, pass_usua=?, nom_usua=?, " +
                                         "ape_usua=?, fecnac_usua=?, sexo_usua=?, tipo_rol=? " +
                                         "WHERE iden_usua = ?";

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Usuario> findAll() {
        return jdbcTemplate.query(SELECTALL, new UsuarioMapper());
    }

    @Override
    public Usuario findById(int iden) {
        return jdbcTemplate.queryForObject(SELECTBYID, new UsuarioMapper(), iden);
    }

    @Override
    public void save(Usuario usuario) {
        jdbcTemplate.update(INSERT, usuario.getIden_usua(), usuario.getEmail_usua(), usuario.getPass_usua()
                                  , usuario.getNom_usua(), usuario.getApe_usua(), usuario.getFecnac_usua()
                                  , usuario.getSexo_usua(), usuario.getTipo_rol());
    }

    @Override
    public void edit(Usuario usuario) {
        jdbcTemplate.update(UPDATE, usuario.getEmail_usua(), usuario.getPass_usua()
                                  , usuario.getNom_usua(), usuario.getApe_usua(), usuario.getFecnac_usua()
                                  , usuario.getSexo_usua(), usuario.getTipo_rol(),
                                    usuario.getIden_usua());
    }
}
