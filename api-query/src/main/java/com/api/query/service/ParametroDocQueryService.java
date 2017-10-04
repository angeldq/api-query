package com.api.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.api.query.model.ParametroDoc;
import com.api.query.repository.ParametroDocRepository;

@Service
public class ParametroDocQueryService {
	
		@Autowired
		private ParametroDocRepository parametroDocRepository;
		
		public List<ParametroDoc> getAll(){
			
			return  parametroDocRepository.findAll(new Sort(Sort.Direction.ASC,"descripcion"));		
		}
		
			
	
}
