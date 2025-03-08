package com.emissor.nfe.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table (name = "NOTA_FISCAL")
public class NotaFiscal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_NOTA_FISCAL")
    private Long idNotaFiscal;

    @Column(name = "IDE_CUF", nullable = false, length = 2)
    private Integer cUF;

    @Column(name = "IDE_CNF", nullable = false, length = 8)
    private Integer cNF;

    @Column(name = "IDE_NATOP", nullable = false, scale = 60)
    private String natOp;

    @Column(name = "IDE_MOD", nullable = false, length = 2)
    private Integer mod;

    @Column(name = "IDE_SERIE", nullable = false, scale = 3)
    private Integer serie;

    @Column(name = "IDE_NNF", nullable = false, length = 9)
    private Integer nnf;

    @Column(name = "IDE_DHEMI", nullable = false)
    private Date dhEmi;

    @Column(name = "IDE_DHSAIENT")
    private Date dhSaiEnt;

    @Column(name = "IDE_TPNF", nullable = false, length = 1)
    private Integer tpNf;

    @Column(name = "IDE_IDDEST", nullable = false, length = 1)
    private Integer idDest;

    @Column(name = "IDE_CMUNFG", nullable = false, length = 7)
    private Integer cMunFG;

    @Column(name = "IDE_TPIMP", nullable = false, length = 1)
    private Integer tpImp;

    @Column(name = "IDE_TPEMIS", nullable = false, length = 1)
    private Integer tpEmis;

    @Column(name = "IDE_CDV", nullable = false, length = 1)
    private Integer cDV;

    @Column(name = "IDE_FINNFE", nullable = false, length = 1)
    private Integer finNFe;

    @Column(name = "IDE_INDFINAL", nullable = false, length = 1)
    private Integer indFinal;

    @Column(name = "IDE_INDPRES", nullable = false, length = 1)
    private Integer indPres;

    @Column(name = "IDE_INDINTERMED", length = 1)
    private Integer indIntermed;

    @Column(name = "IDE_PROCEMI", nullable = false, length = 1)
    private Integer procEmi;

    @Column(name = "IDE_VERPROC", nullable = false, scale = 20)
    private String verProc;

    @OneToMany(mappedBy = "notaFiscal", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<NotaFiscalProdutos> notaFiscalProdutosList;

}
