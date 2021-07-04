package com.PicPay.PicPay.controllers;

import com.PicPay.PicPay.dto.Saldo;
import com.PicPay.PicPay.models.ComunsModel;
import com.PicPay.PicPay.repository.ComunsRepository;
import com.PicPay.PicPay.repository.LojistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
    @Autowired
    private ComunsRepository cr;
//
//    @Autowired
//    private LojistaRepository lr;

    @RequestMapping(value = "/comuns", method = RequestMethod.GET)
    public String comuns(Model comunsModel){
        ComunsModel comum = new ComunsModel();
//        comum.setSaldo(100);
        comunsModel.addAttribute("comum", comum);



        return "comuns";
    }
    @RequestMapping(value = "/lojistas", method = RequestMethod.GET)
    public String lojistas(){
        return "lojistas";
    }

    @GetMapping("aumentaSaldo")
    public String aumentaSaldo(ComunsModel saldo){
//        ComunsModel comum = new ComunsModel();
//        String saldoParaAumentar = saldo.saldoAumento;
//        comum.setSaldo(saldoParaAumentar);
//        cr.atualizaSaldo(saldo.saldoAumento);

        cr.save(saldo);
        return"comuns";
    }
}
