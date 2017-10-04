package com.api.query.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.api.query.model.DominioDoc;
import com.api.query.repository.DominioDocRepository;


@Service
public class DominioDocQueryService {
	
		@Autowired
		private DominioDocRepository dominioDocRepository;
		
		public List<DominioDoc> getAll(){
			
			return  dominioDocRepository.findAll(new Sort(Sort.Direction.ASC,"iddominio"));		
		}
		
		public List<DominioDoc> getAllByParam(long id){
			return dominioDocRepository.findByIdparam(id,new Sort(Sort.Direction.ASC,"descripcion"));
		}

}
