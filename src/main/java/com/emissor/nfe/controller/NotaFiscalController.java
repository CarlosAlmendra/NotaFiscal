package com.emissor.nfe.controller;

import com.emissor.nfe.dto.NotaFiscalDTO;
import com.emissor.nfe.entity.NotaFiscal;
import com.emissor.nfe.services.NotaFiscalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/notafiscal")
public class NotaFiscalController {

    @Autowired
    private NotaFiscalService notaFiscalService;

    @GetMapping(value = "/{id}")
    public NotaFiscalDTO getNotaFiscalById(@PathVariable Long id) {
        return notaFiscalService.getNotaFiscalById(id);
    }

    @PostMapping(value = "/addNew")
    public void addNotaFiscal(@RequestBody NotaFiscalDTO nf) {
        notaFiscalService.addNotaFiscal(nf);
    }

}
