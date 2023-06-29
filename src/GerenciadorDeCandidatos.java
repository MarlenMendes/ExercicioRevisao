import java.util.List;

public interface GerenciadorDeCandidatos {

    void adicionarCandidato(Candidato candidato);

    void removerCandidatoPorMatricula(String numeroMatricula);

    List<Candidato> listarCandidatos();

    void removerCandidatoPorInscricao(String numeroInscricao);
}