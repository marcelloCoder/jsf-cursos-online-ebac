package br.com.marce.dao;

import java.util.List;

import br.com.marce.dao.generic.IGenericDAO;
import br.com.marce.domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}