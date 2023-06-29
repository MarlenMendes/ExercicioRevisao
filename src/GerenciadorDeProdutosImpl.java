import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

class GerenciadorDeProdutosImpl implements GerenciadorDeProdutos {

    private List<Produto> produtos = new ArrayList<>();

    @Override
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public void removerProdutoPorNome(String nome) {
        Iterator<Produto> iterator = produtos.iterator();
        while (iterator.hasNext()) {
            Produto produto = iterator.next();
            if (produto.getNome().equals(nome)) {
                iterator.remove();
                return;
            }
        }
    }

    @Override
    public List<Produto> listarProdutos() {
        return produtos;
    }
}

