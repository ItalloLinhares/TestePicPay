package com.PicPay.PicPay.service;

import com.PicPay.PicPay.model.Usuario;

import java.util.List;

public interface UsuarioService {
    List<Usuario> findAll();
    Usuario findById(Long id);
    Usuario save(Usuario user);
    Usuario put(Long id, Usuario novoUsuario);
}
