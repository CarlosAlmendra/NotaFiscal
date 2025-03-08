package com.emissor.nfe.dto;

import com.emissor.nfe.entity.NotaFiscal;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.persistence.Column;
import org.springframework.beans.BeanUtils;

import java.util.Date;

public class NotaFiscalDTO {

    private Long idNotaFiscal;
    private Integer cUF;
    private Integer cNF;
    private String natOp;
    private Integer mod;
    private Integer serie;
    private Integer nnf;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date dhEmi;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date dhSaiEnt;

    private Integer tpNf;
    private Integer idDest;
    private Integer cMunFG;
    private Integer tpImp;
    private Integer tpEmis;
    private Integer cDV;
    private Integer finNFe;
    private Integer indFinal;
    private Integer indPres;
    private Integer indIntermed;
    private Integer procEmi;
    private String verProc;

    public NotaFiscalDTO() {}

    public NotaFiscalDTO(NotaFiscal entity) {
        BeanUtils.copyProperties(entity, this);
    }

    public Long getIdNotaFiscal() {
        return idNotaFiscal;
    }

    public void setIdNotaFiscal(Long idNotaFiscal) {
        this.idNotaFiscal = idNotaFiscal;
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
