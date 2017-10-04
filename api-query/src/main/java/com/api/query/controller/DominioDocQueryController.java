package com.api.query.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.query.model.DominioDoc;
import com.api.query.service.DominioDocQueryService;

@RestController
public class DominioDocQueryController {
	
	@Autowired
	private DominioDocQueryService dominioDocQueryService;
	
	@RequestMapping (method=RequestMethod.GET,value="/dominiodoc")
	public List<DominioDoc> getAllDominioDoc(){
		return dominioDocQueryService.getAll();				
	}
	
	@RequestMapping (method=RequestMethod.GET,value="/dominiodoc/{id}")
	public List<DominioDoc> getAllDominioByParam(@PathVariable long id){
		return dominioDocQueryService.getAllByParam(id);
	}
	
}
