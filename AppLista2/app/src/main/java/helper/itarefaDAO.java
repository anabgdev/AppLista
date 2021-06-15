package helper;

import java.util.List;

import model.Tarefa;

public interface itarefaDAO {

    public boolean salvar (Tarefa tarefa);
    public boolean att (Tarefa tarefa);
    public boolean deletar (Tarefa tarefa);
    public List<Tarefa> listar ();
}
