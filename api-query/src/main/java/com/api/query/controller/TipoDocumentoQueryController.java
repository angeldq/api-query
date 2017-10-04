package com.api.query.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.query.model.TipoDocumento;
import com.api.query.service.TipoDocumentoQueryService;

@RestController
public class TipoDocumentoQueryController {

	@Autowired
	private TipoDocumentoQueryService tipoDocumentoQueryService;
	
	@RequestMapping(method=RequestMethod.GET,value=("/tipodocumento") )
	public List<TipoDocumento> getAllTipoDocumento(){
		return tipoDocumentoQueryService.getAll();		
	}
	
	@RequestMapping(method=RequestMethod.GET,value=("/tipodocumento/{i}"))
	public List<TipoDocumento> getAllByIdioma(@PathVariable int i){
		return tipoDocumentoQueryService.getAllByIdioma(i);
	}
}
