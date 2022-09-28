package com.consultorioonline.consulotrioonline.controller;

import com.consultorioonline.consulotrioonline.dto.Usuario;
import com.consultorioonline.consulotrioonline.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/usuarios/getAll")
    public ResponseEntity<List<Usuario>> getAllUsers(){
        return ResponseEntity.ok(usuarioService.findAll());
    }

    @GetMapping("/usuarios/get/{iden}")
    public ResponseEntity<Usuario> getById(@PathVariable int iden){
        return ResponseEntity.ok(usuarioService.findById(iden));
    }

    @PostMapping(path = "/usuarios/create")
    public ResponseEntity<Usuario> createUser(@RequestBody Usuario usuario){
        usuarioService.save(usuario);
        return ResponseEntity.ok(usuario);
    }

    @PutMapping("/usuarios/edit")
    public ResponseEntity<Usuario> updateUser(@RequestBody Usuario usuario){
        usuarioService.edit(usuario);
        return ResponseEntity.ok(usuario);
    }
}
