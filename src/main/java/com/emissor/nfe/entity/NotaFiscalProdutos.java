package com.emissor.nfe.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "NOTA_FISCAL_PRODUTOS")
public class NotaFiscalProdutos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_NF_PRODUTOS")
    private Long idNfProdutos;

    @ManyToOne
    @JoinColumn(name = "ID_NOTA_FISCAL", referencedColumnName = "ID_NOTA_FISCAL")
    private NotaFiscal notaFiscal;

    @Column(name = "PROD_CPROD", nullable = false, scale = 60)
    private String prodCprod;

    @Column(name = "PROD_CEAN", nullable = false, scale = 14)
    private String prodCean;

    @Column(name = "PROD_XPROD", nullable = false, columnDefinition = "TEXT", scale = 120)
    private String prodXprod;

    @Column(name = "PROD_NCM", nullable = false, scale = 8)
    private String prodNcm;

    @Column(name = "PROD_NVE", scale = 6)
    private String prodNve;

    @Column(name = "PROD_CEST", nullable = false, length = 7)
    private Integer prodCest;

    @Column(name = "PROD_INDESCALA", scale = 1)
    private Integer prodIndEscala;

    @Column(name = "PROD_CNPJFAB", length = 14)
    private Integer prodCnpjFab;

    @Column(name = "PROD_CBENEF", scale = 10)
    private String prodCbenef;

    @Column(name = "PROD_EXTIPI", scale = 3)
    private Integer prodExtipi;

    @Column(name = "PROD_CFOP", nullable = false, length = 4)
    private Integer prodCfop;

    @Column(name = "PROD_UCOM", nullable = false, scale = 6)
    private String prodUcom;

    @Column(name = "PROD_QCOM", nullable = false, scale = 11)
    private Double prodQcom;

    @Column(name = "PROD_VUNCOM", nullable = false, scale = 11)
    private Double prodVunCom;

    @Column(name = "PROD_VPROD", nullable = false, scale = 6)
    private Double prodVprod;

    @Column(name = "PROD_CEANTRIB", nullable = false, scale = 14)
    private String prodCeanTrib;

    @Column(name = "PROD_UTRIB", nullable = false, scale = 6)
    private String prodUtrib;

    @Column(name = "PROD_QTRIB", nullable = false, scale = 11)
    private Double prodQtrib;

    @Column(name = "PROD_VUNTRIB", nullable = false, scale = 11)
    private Double prodVunTrib;

    @Column(name = "PROD_VFRETE", nullable = false, scale = 15)
    private Double prodVfrete;

    @Column(name = "PROD_VSEG", nullable = false, scale = 15)
    private Double prodVseg;

    @Column(name = "PROD_VDESC", nullable = false, scale = 15)
    private Double prodVdesc;

    @Column(name = "PROD_VOUTRO", nullable = false, scale = 15)
    private Double prodVoutro;

    @Column(name = "PROD_INDTOT", nullable = false, length = 1)
    private Integer prodIndtot;
}
