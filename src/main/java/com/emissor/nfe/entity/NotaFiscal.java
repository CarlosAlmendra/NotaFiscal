package com.emissor.nfe.entity;

import com.emissor.nfe.dto.NotaFiscalDTO;
import jakarta.persistence.*;
import org.springframework.beans.BeanUtils;

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

    public NotaFiscal(){}

    public NotaFiscal(NotaFiscalDTO entity) {
        BeanUtils.copyProperties(entity, this);
    }

    public Long getIdNotaFiscal() {
        return idNotaFiscal;
    }

    public Integer getcUF() {
        return cUF;
    }

    public void setcUF(Integer cUF) {
        this.cUF = cUF;
    }

    public Integer getcNF() {
        return cNF;
    }

    public void setcNF(Integer cNF) {
        this.cNF = cNF;
    }

    public String getNatOp() {
        return natOp;
    }

    public void setNatOp(String natOp) {
        this.natOp = natOp;
    }

    public Integer getMod() {
        return mod;
    }

    public void setMod(Integer mod) {
        this.mod = mod;
    }

    public Integer getSerie() {
        return serie;
    }

    public void setSerie(Integer serie) {
        this.serie = serie;
    }

    public Integer getNnf() {
        return nnf;
    }

    public void setNnf(Integer nnf) {
        this.nnf = nnf;
    }

    public Date getDhEmi() {
        return dhEmi;
    }

    public void setDhEmi(Date dhEmi) {
        this.dhEmi = dhEmi;
    }

    public Date getDhSaiEnt() {
        return dhSaiEnt;
    }

    public void setDhSaiEnt(Date dhSaiEnt) {
        this.dhSaiEnt = dhSaiEnt;
    }

    public Integer getTpNf() {
        return tpNf;
    }

    public void setTpNf(Integer tpNf) {
        this.tpNf = tpNf;
    }

    public Integer getIdDest() {
        return idDest;
    }

    public void setIdDest(Integer idDest) {
        this.idDest = idDest;
    }

    public Integer getcMunFG() {
        return cMunFG;
    }

    public void setcMunFG(Integer cMunFG) {
        this.cMunFG = cMunFG;
    }

    public Integer getTpImp() {
        return tpImp;
    }

    public void setTpImp(Integer tpImp) {
        this.tpImp = tpImp;
    }

    public Integer getTpEmis() {
        return tpEmis;
    }

    public void setTpEmis(Integer tpEmis) {
        this.tpEmis = tpEmis;
    }

    public Integer getcDV() {
        return cDV;
    }

    public void setcDV(Integer cDV) {
        this.cDV = cDV;
    }

    public Integer getFinNFe() {
        return finNFe;
    }

    public void setFinNFe(Integer finNFe) {
        this.finNFe = finNFe;
    }

    public Integer getIndFinal() {
        return indFinal;
    }

    public void setIndFinal(Integer indFinal) {
        this.indFinal = indFinal;
    }

    public Integer getIndPres() {
        return indPres;
    }

    public void setIndPres(Integer indPres) {
        this.indPres = indPres;
    }

    public Integer getIndIntermed() {
        return indIntermed;
    }

    public void setIndIntermed(Integer indIntermed) {
        this.indIntermed = indIntermed;
    }

    public Integer getProcEmi() {
        return procEmi;
    }

    public void setProcEmi(Integer procEmi) {
        this.procEmi = procEmi;
    }

    public String getVerProc() {
        return verProc;
    }

    public void setVerProc(String verProc) {
        this.verProc = verProc;
    }
}
