package com.emissor.nfe.services;

import com.emissor.nfe.dto.NotaFiscalDTO;
import com.emissor.nfe.entity.NotaFiscal;
import com.emissor.nfe.repository.NotaFiscalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;

@Service
public class NotaFiscalService {

    @Autowired
    NotaFiscalRepository repository;

    @Transactional(readOnly = true)
    public NotaFiscalDTO getNotaFiscalById(Long id) {
        try {
            return new NotaFiscalDTO(repository.findById(id).get());

        } catch (NoSuchElementException e){
            throw new IllegalArgumentException("Não foi possivel encontrar uma nota fiscal com o ID: " + id);
        }
    }

    @Transactional
    public void addNotaFiscal(NotaFiscalDTO dto) {
        NotaFiscal notaFiscal = new NotaFiscal(dto);
        repository.save(notaFiscal);
    }

}
