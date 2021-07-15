package com.PicPay.PicPay.controller;

import com.PicPay.PicPay.model.Usuario;
import com.PicPay.PicPay.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/v1/api/usuario")
public class UsuarioController {
    @Autowired
    public UsuarioService usuarioService;

    @GetMapping("/listar")
    public List<Usuario> listarUsuarios() {
        return usuarioService.findAll();
    }

    @GetMapping("/listar/{id}")
    public Usuario listarUsuarioPorId(@PathVariable("id") Long id) {
        return usuarioService.findById(id);
    }

    @PostMapping("/criar")
    public Usuario salvarUsuario(@RequestBody @Valid Usuario usuario) {
        return usuarioService.save(usuario);
    }

    @PatchMapping("/atualizar/{id}")
    public Usuario atualizarUsuario(@RequestBody Usuario novoUsuario,
                                    @PathVariable("id") Long id) {
        return usuarioService.put(id, novoUsuario);
    }

}
