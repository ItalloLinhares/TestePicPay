package com.PicPay.PicPay.service;

import com.PicPay.PicPay.model.Transacao;

import java.util.List;

public interface TransacaoService {
    List<Transacao> findAll();
    Transacao findById(Long id);
    Transacao save(Transacao transacao);
}
