package com.api.query.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import com.api.query.model.TipoDocumento;

public interface TipoDocumentoRepository extends CrudRepository<TipoDocumento, Long>{
	
	public List<TipoDocumento> findAll(Sort sort);
	public List<TipoDocumento> findByIdioma(int i,Sort sort);
	
	
}
