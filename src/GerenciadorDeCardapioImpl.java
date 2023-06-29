
    import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

    public class GerenciadorDeCardapioImpl implements GerenciadorDeCardapio {

        private List<Prato> pratos = new ArrayList<>();

        @Override
        public void adicionarPrato(Prato prato) {
            pratos.add(prato);
        }

        @Override
        public void removerPratoPorNome(String nome) {
            Iterator<Prato> iterator = pratos.iterator();
            while (iterator.hasNext()) {
                Prato prato = iterator.next();
                if (prato.getNome().equals(nome)) {
                    iterator.remove();
                    return;
                }
            }
        }

        @Override
        public List<Prato> listarPratos() {
            return pratos;
        }
    }

