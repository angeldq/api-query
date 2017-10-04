package com.api.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.api.query.model.TipoDocumento;
import com.api.query.repository.TipoDocumentoRepository;

@Service
public class TipoDocumentoQueryService {
	
	@Autowired
	TipoDocumentoRepository tipoDocumentoRepository;
	
	public List<TipoDocumento> getAll(){
		return tipoDocumentoRepository.findAll(new Sort(Sort.Direction.ASC,"codigo"));
	}
	
	public List<TipoDocumento> getAllByIdioma(int i){
		return tipoDocumentoRepository.findByIdioma(i, new Sort(Sort.Direction.ASC,"codigo"));
	}
}
