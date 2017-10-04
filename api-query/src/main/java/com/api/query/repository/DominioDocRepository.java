package com.api.query.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import com.api.query.model.DominioDoc;

public interface DominioDocRepository extends CrudRepository <DominioDoc,Long >{

		public List<DominioDoc> findAll(Sort sort);
		public List<DominioDoc> findByIdparam(long id,Sort sort);
		  
}
 