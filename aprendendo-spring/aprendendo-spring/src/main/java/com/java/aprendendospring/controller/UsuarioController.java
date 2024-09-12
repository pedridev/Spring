package com.java.aprendendospring.controller;

import com.java.aprendendospring.business.UsuarioService;
import com.java.aprendendospring.infrastructure.entity.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;


    @PostMapping
    public ResponseEntity<Usuario> salvaUsuario(@RequestBody Usuario usuario) {
        return ResponseEntity.ok(usuarioService.salvaUsuario(usuario));
    }



}
