package br.com.motelFatec.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.motelFatec.model.Cliente;

@Repository
public class ClienteDAO {
	

	    @PersistenceContext
	    private EntityManager manager;

	    @Transactional
	    public void gravar(Cliente cliente) {
	        manager.persist(cliente);
	    }
	    
	    public boolean consultar(Cliente cliente){
	    	return manager.contains(cliente);
	    }
	  
	    public Cliente buscar (Long cpf){
	    	Query query = manager.createQuery("select c from Cliente c where c.cpf=" + cpf);
	    	Cliente clienteDB = (Cliente) query.getSingleResult();
	    	return clienteDB;
	    }

	    
	    
	    
	
	}

