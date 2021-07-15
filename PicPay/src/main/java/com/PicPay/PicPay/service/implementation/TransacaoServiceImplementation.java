package com.PicPay.PicPay.service.implementation;

import com.PicPay.PicPay.model.Transacao;
import com.PicPay.PicPay.model.Usuario;
import com.PicPay.PicPay.repository.TransacaoRepository;
import com.PicPay.PicPay.service.TransacaoService;
import com.PicPay.PicPay.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransacaoServiceImplementation implements TransacaoService {
    @Autowired
    public TransacaoRepository transacaoRepository;
    @Autowired
    public UsuarioService usuarioService;

    @Override
    public List<Transacao> findAll() {
        return transacaoRepository.findAll();
    }

    @Override
    public Transacao findById(Long id) {
        if (transacaoRepository.findById(id).isPresent()) {
            return transacaoRepository.findById(id).get();
        } else {
            return null;
        }
    }

    @Override
    public Transacao save(Transacao transacao) {
        Usuario pagador = transacao.pagador;
        Usuario receptor = transacao.receptor;

        if (pagador.getTipo().toString().equals("LOJISTA") && receptor.getTipo().toString().equals("LOJISTA")) {
            return null;
        }

        pagador.setSaldo(pagador.getSaldo() - transacao.getValor());
        receptor.setSaldo(receptor.getSaldo() + transacao.getValor());

        usuarioService.put(pagador.getIdUsuario(), pagador);
        usuarioService.put(receptor.getIdUsuario(), receptor);

        return transacaoRepository.save(transacao);
    }
}
