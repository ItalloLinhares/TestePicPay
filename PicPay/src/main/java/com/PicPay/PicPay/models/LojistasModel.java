package com.PicPay.PicPay.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LojistasModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    int saldo;

    public int getSaldo() {return saldo;}

    public void setSaldo(int saldo) {this.saldo = saldo;}
}
