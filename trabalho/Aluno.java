package trabalho;

import java.util.ArrayList;
import java.util.List;

class Aluno {
    private String nome;
    private List<Disciplina> disciplinas;

    public Aluno(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public String getNome() {
        return this.nome;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void limparDisciplinas() {
        disciplinas.clear();
    }
}