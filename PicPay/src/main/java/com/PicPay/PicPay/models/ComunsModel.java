package com.PicPay.PicPay.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class ComunsModel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    int saldo; //= 100;
//    ComunsModel(){
//        saldo = 100;
//    }

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public int getSaldo() {return saldo;}

    public void setSaldo(int saldo) {this.saldo = saldo;}


}
