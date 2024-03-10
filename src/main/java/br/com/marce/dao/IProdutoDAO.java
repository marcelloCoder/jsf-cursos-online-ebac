package br.com.marce.dao;

import java.util.List;

import br.com.marce.dao.generic.IGenericDAO;
import br.com.marce.domain.Produto;

public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}