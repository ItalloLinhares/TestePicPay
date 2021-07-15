package com.PicPay.PicPay.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "TB_TRANSACAO")
@Getter
@Setter
public class Transacao {
    private static final long serialVersionUD = 1;

    @Id
    @JsonProperty("id")
    @Column(name = "ID_TRANSACAO")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long idTransacao;

    @OneToOne
    @JoinColumn(name="ID_PAGADOR", nullable = false)
    @JsonProperty("pagador")
    public Usuario pagador;

    @OneToOne
    @JoinColumn(name="ID_RECEPTOR", nullable = false)
    @JsonProperty("receptor")
    public Usuario receptor;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    @Column(name = "DT_TRANSACAO")
    @JsonProperty("data_transacao")
    public LocalDate dataTransacao;

    @NotNull
    @JsonProperty("valor")
    @Column(name = "VL_TRANSACAO")
    public double valor;

    @Lob
    @JsonProperty("descricao")
    @Column(name = "NM_DESCRICAO")
    public String descricao;
}
