package com.consultorioonline.consulotrioonline.services;

import com.consultorioonline.consulotrioonline.dto.Usuario;

import java.util.List;

public interface UsuarioService {
    public List<Usuario> findAll();
    public Usuario findById(int iden);
    public void save(Usuario usuario);
    public void edit(Usuario usuario);
}
