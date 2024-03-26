package trabalho;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//import java.util.Scanner;

class EscolaFacade {
    private List<Aluno> alunos;
    private List<Disciplina> disciplinas;

    public EscolaFacade() {
        this.alunos = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
    }

    public void adicionarAluno(String nome, List<Disciplina> disciplinasAluno) {
        Aluno aluno = new Aluno(nome);
        for (Disciplina disciplina : disciplinasAluno) {
            aluno.adicionarDisciplina(disciplina);
        }
        alunos.add(aluno);
        System.out.println("Aluno adicionado com sucesso!");
    }

    public void removerAluno(String nomeAluno) {
        Iterator<Aluno> iterator = alunos.iterator();
        while (iterator.hasNext()) {
            Aluno aluno = iterator.next();
            if (aluno.getNome().equals(nomeAluno)) {
                iterator.remove();
                System.out.println("Aluno removido com sucesso!");
                return;
            }
        }
        System.out.println("Aluno não encontrado!");
    }

    public void adicionarDisciplina(String nomeDisciplina) {
        Disciplina disciplina = new Disciplina(nomeDisciplina);
        this.disciplinas.add(disciplina);
        System.out.println("Disciplina adicionada com sucesso!");
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Disciplina> getDisciplinas() {
        return this.disciplinas;
    }

    public void listarAlunos() {
        System.out.println("Lista de Alunos:");
        for (Aluno aluno : alunos) {
            System.out.println("- " + aluno.getNome());
            List<Disciplina> disciplinasAluno = aluno.getDisciplinas();
            if (!disciplinasAluno.isEmpty()) {
                System.out.println("  Disciplinas:");
                for (Disciplina disciplina : disciplinasAluno) {
                    System.out.println("    - " + disciplina.getNome());
                }
            }
        }
    }

    public void atualizarDisciplinasAluno(Aluno aluno, List<Disciplina> novasDisciplinas) {
        aluno.limparDisciplinas(); // Limpa as disciplinas antigas do aluno
        for (Disciplina disciplina : novasDisciplinas) {
            aluno.adicionarDisciplina(disciplina); // Adiciona as novas disciplinas ao aluno
        }
        System.out.println("Disciplinas do aluno atualizadas com sucesso!");
    }
}