package br.com.marce.service;

import java.util.List;

import br.com.marce.domain.Produto;
import br.com.marce.services.generic.IGenericService;

public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}