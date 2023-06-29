import java.util.ArrayList;
import java.util.List;

public class Prato {

    private String nome;
    private List<Ingrediente> ingredientes;

    public Prato(String nome) {
        this.nome = nome;
        this.ingredientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    @Override
    public String toString() {
        return "Prato{" +
                "nome='" + nome + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}