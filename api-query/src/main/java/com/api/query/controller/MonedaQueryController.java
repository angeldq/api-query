package com.api.query.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.query.model.Moneda;
import com.api.query.service.MonedaQueryService;

@RestController
public class MonedaQueryController {
	
	@Autowired
	private MonedaQueryService monedaQueryService;
	
	@RequestMapping (method=RequestMethod.GET,value="/moneda")
	public List<Moneda> getAllMoneda(){
		return monedaQueryService.getAll();				
	}
	@RequestMapping (method=RequestMethod.GET,value="/moneda/{i}")
	public List<Moneda> getAllMonedaByIdioma(@PathVariable int i){
		return monedaQueryService.getAllByIdioma(i);
	}

}
