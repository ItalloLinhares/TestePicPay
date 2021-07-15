package com.PicPay.PicPay.service.implementation;

import com.PicPay.PicPay.model.TipoUsuario;
import com.PicPay.PicPay.model.Usuario;
import com.PicPay.PicPay.repository.UsuarioRepository;
import com.PicPay.PicPay.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImplementation implements UsuarioService {
    @Autowired
    public UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario findById(Long id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);

        return usuario.orElse(null);

    }

    @Override
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario put(Long id, Usuario novoUsuario) {
        Usuario usuarioAntigo = this.findById(id);

        if (usuarioAntigo != null) {
            usuarioAntigo.setDocumento(novoUsuario.getDocumento());
            usuarioAntigo.setEmail(novoUsuario.getEmail());
            usuarioAntigo.setSenha(novoUsuario.getSenha());

            if (novoUsuario.getTipo().toString().equals("CLIENTE"))
                usuarioAntigo.setTipo(TipoUsuario.CLIENTE);
            else
                usuarioAntigo.setTipo(TipoUsuario.LOJISTA);

            usuarioAntigo.setSaldo(novoUsuario.getSaldo());
        }

        return this.save(usuarioAntigo);
    }
}
