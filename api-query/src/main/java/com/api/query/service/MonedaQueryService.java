package com.api.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.api.query.model.Moneda;
import com.api.query.repository.MonedaRepository;

@Service
public class MonedaQueryService {
	
		@Autowired
		private MonedaRepository monedaRepository;
		
		public List<Moneda> getAll(){
			
			return  monedaRepository.findAll(new Sort(Sort.Direction.ASC,"codigo"));		
		}
		
		public List<Moneda> getAllByIdioma(int i){
			return monedaRepository.findByIdioma(i,new Sort(Sort.Direction.ASC,"codigo"));
		}
	
	
}
