package trabalho;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EscolaFacade facade = new EscolaFacade();
        Scanner scanner = new Scanner(System.in);

        List<Disciplina> disciplinas = facade.getDisciplinas();
        System.out.println("Digite o nome das disciplinas disponíveis (digite 'fim' para terminar):");
        String nomeDisciplina;
        while (true ){
           nomeDisciplina = scanner.next();
        	
        	facade.adicionarDisciplina(nomeDisciplina);
        	if(nomeDisciplina.equals("fim")) {
        		break;
        	}
        }

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar Aluno");
            System.out.println("2. Remover Aluno");
            System.out.println("3. Listar Alunos");
            System.out.println("0. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do aluno (ou 'fim' para sair):");
                    String nomeAluno = scanner.next();
                    if (nomeAluno.equals("fim")) {
                        System.out.println("Encerrando o programa...");
                        scanner.close();
                        System.exit(0);
                    }
                    System.out.println("Selecione as disciplinas que o aluno irá fazer (digite o número da disciplina, 'fim' para terminar):");
                  
                    for (int i = 0; i < disciplinas.size(); i++) {
                        System.out.println((i+1) + ". " + disciplinas.get(i).getNome());
                    }
                    List<Disciplina> disciplinasAluno = new ArrayList<>();
                    int escolha;
                    while (!((escolha = scanner.nextInt()) == 0)) {
                        if (escolha > 0 && escolha <= disciplinas.size()) {
                            disciplinasAluno.add(disciplinas.get(escolha - 1));
                        }
                        System.out.println("Digite o número da próxima disciplina (ou 0 para terminar):");
                    }
                    facade.adicionarAluno(nomeAluno, disciplinasAluno);
                    break;
                case 2:
                    System.out.println("Digite o nome do aluno que deseja remover:");
                    String alunoRemover = scanner.next();
                    facade.removerAluno(alunoRemover);
                    break;
                case 3:
                    facade.listarAlunos();
                    break;
                case 4:
                    System.out.println("Digite o nome do aluno para atualizar suas disciplinas:");
                    String alunoAtualizar = scanner.next();
                    List<Aluno> alunos = facade.getAlunos();
                    Aluno aluno = null;
                    for (Aluno a : alunos) {
                        if (a.getNome().equals(alunoAtualizar)) {
                            aluno = a;
                            break;
                        }
                    }
                    if (aluno != null) {
                        System.out.println("Selecione as novas disciplinas que o aluno irá fazer (digite o número da disciplina, 'fim' para terminar):");
                        for (int i = 0; i < disciplinas.size(); i++) {
                            System.out.println((i+1) + ". " + disciplinas.get(i).getNome());
                        }
                        List<Disciplina> novasDisciplinas = new ArrayList<>();
                        int escolhaDisciplina;
                        while (!((escolhaDisciplina = scanner.nextInt()) == 0)) {
                            if (escolhaDisciplina > 0 && escolhaDisciplina <= disciplinas.size()) {
                                novasDisciplinas.add(disciplinas.get(escolhaDisciplina - 1));
                            }
                            System.out.println("Digite o número da próxima disciplina (ou 0 para terminar):");
                        }
                        facade.atualizarDisciplinasAluno(aluno, novasDisciplinas);
                    } else {
                        System.out.println("Aluno não encontrado!");
                    }
                    break;    
                case 0:
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
