package com.PicPay.PicPay.controller;

import com.PicPay.PicPay.model.Transacao;
import com.PicPay.PicPay.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin("*")
@RequestMapping("/v1/api/transacao")
public class TransacaoController {
    @Autowired
    public TransacaoService transacaoService;

    @PostMapping("/criar")
    public Transacao salvarTransacao(@RequestBody @Valid Transacao transacao) {
        return transacaoService.save(transacao);
    }
}
