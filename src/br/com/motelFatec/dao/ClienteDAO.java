package br.com.motelFatec.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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
	    
	
	}

