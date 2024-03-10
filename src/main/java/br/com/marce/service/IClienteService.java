package br.com.marce.service;

import java.util.List;

import br.com.marce.domain.Cliente;
import br.com.marce.exceptions.DAOException;
import br.com.marce.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}