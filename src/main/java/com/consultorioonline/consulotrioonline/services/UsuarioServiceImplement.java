package com.consultorioonline.consulotrioonline.services;

import com.consultorioonline.consulotrioonline.dao.UsuarioDao;
import com.consultorioonline.consulotrioonline.dto.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImplement implements UsuarioService{

    @Autowired
    UsuarioDao usuarioDao;

    @Override
    public List<Usuario> findAll() {
        return usuarioDao.findAll();
    }

    @Override
    public Usuario findById(int iden) {
        return usuarioDao.findById(iden);
    }

    @Override
    public void save(Usuario usuario) {
        usuarioDao.save(usuario);
    }

    @Override
    public void edit(Usuario usuario) {
        usuarioDao.edit(usuario);
    }
}
