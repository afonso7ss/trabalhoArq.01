# trabalhoArq.01
O código começa com a definição de duas classes principais: Disciplina e Aluno. A classe Disciplina representa uma disciplina na escola, enquanto a classe Aluno representa um aluno que está matriculado na escola. Cada aluno pode ter várias disciplinas associadas a ele.

Em seguida, temos a classe EscolaFacade, que é um padrão de design conhecido como Facade. Essa classe atua como uma fachada para ocultar a complexidade do sistema subjacente. Ela oferece métodos simples para adicionar alunos, remover alunos, adicionar disciplinas e listar alunos, enquanto gerencia a lógica mais complexa nos bastidores.

No método main da classe Main, o programa começa exibindo as disciplinas disponíveis e permitindo que o usuário as adicione. Em seguida, ele entra em um loop infinito onde o usuário pode escolher diferentes opções, como adicionar um aluno, remover um aluno, listar os alunos matriculados ou atualizar as disciplinas de um aluno específico.

Quando o usuário escolhe a opção de atualizar as disciplinas de um aluno, o programa solicita o nome do aluno e, em seguida, permite que o usuário selecione as novas disciplinas que o aluno irá cursar. Essas disciplinas são então atualizadas para o aluno selecionado usando o método atualizarDisciplinasAluno da classe EscolaFacade.

No geral, o código é uma implementação simples de um sistema de gestão escolar que utiliza o padrão de design Facade para simplificar a interação do usuário e ocultar a complexidade do sistema subjacente.
