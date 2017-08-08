package br.com.caelum.tarefas.dao;

import java.util.List;

import br.com.caelum.tarefas.modelo.Tarefa;

public interface TarefaDao {

	public Tarefa buscaPorId(Long id);
	
	public List<Tarefa> lista();
	
	public void adiciona(Tarefa t);
	
	public void altera(Tarefa t);
	
	public void remove(Tarefa t);
	
	public void finaliza(Long id);
}
