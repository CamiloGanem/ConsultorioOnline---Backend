package com.consultorioonline.consulotrioonline.dao;

import com.consultorioonline.consulotrioonline.dto.Usuario;

import java.util.List;

public interface UsuarioDao {
    public List<Usuario> findAll();
    public Object findById(int iden);
    public void save(Usuario usuario);
    public void edit(Usuario usuario);
}
