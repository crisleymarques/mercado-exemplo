import exemplo.Lote;
import exemplo.Produto;
import repository.ProdutoRepository;

import java.util.List;

public class Sistema {

	public static void main(String[] args) {
		
		Produto produto = new Produto("Leite", "Parmalat");
		Lote lote = new Lote(produto, 10L);

		ProdutoRepository repository = new ProdutoRepository();
		repository.adicionar(produto);
		List<Produto> lista = repository.listar();

		System.out.println("Repositório de Produtos: ");
		for (Produto p : lista) {
			System.out.println(p.toString());
		}

		System.out.println(produto);
		System.out.println(lote);
	}
}
