package com.api.query.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import com.api.query.model.ParametroDoc;

public interface ParametroDocRepository extends CrudRepository <ParametroDoc, Long>{

		public List<ParametroDoc> findAll(Sort sort);
		
	  
}
