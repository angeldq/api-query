package com.api.query.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.query.model.ParametroDoc;
import com.api.query.service.ParametroDocQueryService;

@RestController
public class ParametroDocQueryController {
	
	@Autowired
	private ParametroDocQueryService parametroDocQueryService;
	
	@RequestMapping (method=RequestMethod.GET,value="/parametrodoc")
	public List<ParametroDoc> getAllParametroDoc(){
		return parametroDocQueryService.getAll();				
	}
	
}
