package com.api.query.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import com.api.query.model.Moneda;

public interface MonedaRepository extends CrudRepository <Moneda, Long>{

		public List<Moneda> findAll(Sort sort);
		public List<Moneda> findByIdioma(int i, Sort sort);		
	  
}
