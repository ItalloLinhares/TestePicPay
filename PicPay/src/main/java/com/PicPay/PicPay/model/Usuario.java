package com.PicPay.PicPay.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "TB_LOJISTA")
@Getter
@Setter
public class Usuario {
    private static final long serialVersionUD = 1;

    @Id
    @Column(name = "ID_USUARIO")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long idUsuario;

    @NotBlank
    @JsonProperty("documento")
    @Column(name = "CD_DOCUMENTO")
    public String documento;

    @NotBlank
    @JsonProperty("email")
    @Column(name = "NM_EMAIL")
    public String email;

    @NotBlank
    @JsonProperty("senha")
    @Column(name = "NM_SENHA")
    public String senha;

    @Column(name = "NM_TIPO_CONTA")
    public TipoUsuario tipo;

    @JsonProperty("saldo")
    @Column(name = "NM_SALDO")
    public double saldo;
}

