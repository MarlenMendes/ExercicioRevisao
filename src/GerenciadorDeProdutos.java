 import java.util.List;
    public interface GerenciadorDeProdutos {

        void adicionarProduto(Produto produto);

        void removerProdutoPorNome(String nome);

        List<Produto> listarProdutos();
    }

