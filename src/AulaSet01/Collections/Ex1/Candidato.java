package AulaSet01.Collections.Ex1;

public class Candidato {
    private double notaTecnica;
    private int anosExperiencia;
    private String nome;

    public Candidato(double notaTecnica, int anosExperiencia, String nome) {
        this.notaTecnica = notaTecnica;
        this.anosExperiencia = anosExperiencia;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Candidato {" +
                "notaTecnica= " + notaTecnica +
                ", anosExperiencia= " + anosExperiencia +
                ", nome= " + nome +
                '}';
    }

    public double getNotaTecnica() {
        return notaTecnica;
    }

    public void setNotaTecnica(double notaTecnica) {
        this.notaTecnica = notaTecnica;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
