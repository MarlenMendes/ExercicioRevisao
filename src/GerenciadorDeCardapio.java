import java.util.List;

public interface GerenciadorDeCardapio {

    void adicionarPrato(Prato prato);

    void removerPratoPorNome(String nome);

    List<Prato> listarPratos();
}
