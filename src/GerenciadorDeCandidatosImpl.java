import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class GerenciadorDeCandidatosImpl implements GerenciadorDeCandidatos {

    private List<Candidato> candidatos = new ArrayList<>();

    @Override
    public void adicionarCandidato(Candidato candidato) {
        candidatos.add(candidato);
    }

    @Override
    public void removerCandidatoPorMatricula(String numeroMatricula) {
        Iterator<Candidato> iterator = candidatos.iterator();
        while (iterator.hasNext()) {
            Candidato candidato = iterator.next();
            if (candidato.getNumeroMatricula().equals(numeroMatricula)) {
                iterator.remove();
                return;
            }
        }
    }

    @Override
    public List<Candidato> listarCandidatos() {
        return candidatos;
    }

    @Override
    public void removerCandidatoPorInscricao(String numeroInscricao) {

    }
}
