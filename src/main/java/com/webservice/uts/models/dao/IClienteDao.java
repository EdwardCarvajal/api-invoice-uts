package com.webservice.uts.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.webservice.uts.models.entites.Cliente;
import com.webservice.uts.models.entites.Region;

import java.util.List;


public interface IClienteDao extends CrudRepository<Cliente,Long> {
	
	@Query("from Region")
	public List<Region> findAllRegiones();
}