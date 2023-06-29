public class Candidato {

    private String numeroMatricula;
    private double nota;

    public Candidato(String numeroMatricula, double nota) {
        this.numeroMatricula = numeroMatricula;
        this.nota = nota;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "numeroMatricula='" + numeroMatricula + '\'' +
                ", nota=" + nota +
                '}';
    }
}