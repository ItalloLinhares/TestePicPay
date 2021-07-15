package com.PicPay.PicPay.repository;

import com.PicPay.PicPay.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
