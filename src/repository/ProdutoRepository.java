package repository;

import exemplo.Produto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProdutoRepository {

    Map<String, Produto> catalogo;

    public ProdutoRepository() {
        this.catalogo = new HashMap<>();
    }

    public void adicionar(Produto p) {
        catalogo.put(p.getId(), p);
    }

    public void remover(String id) {
        catalogo.remove(id);
    }

    public void editar(Produto p) {
        catalogo.replace(p.getId(), p);
    }

    public List<Produto> listar() {
        return catalogo.values().stream().toList();
    }
}
