package com.PicPay.PicPay.repository;

import com.PicPay.PicPay.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
}
