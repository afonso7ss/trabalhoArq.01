# trabalhoArq.01
O código começa com a definição de duas classes principais: Disciplina e Aluno. A classe Disciplina representa uma disciplina na escola, enquanto a classe Aluno representa um aluno que está matriculado na escola. Cada aluno pode ter várias disciplinas associadas a ele.

Em seguida, temos a classe EscolaFacade, que é um padrão de design conhecido como Facade. Essa classe atua como uma fachada para ocultar a complexidade do sistema subjacente. Ela oferece métodos simples para adicionar alunos, remover alunos, adicionar disciplinas e listar alunos, enquanto gerencia a lógica mais complexa nos bastidores.

No método main da classe Main(*cliente*), o programa inicia exibindo um menu de opções para o usuário. Primeiramente, ele permite que o usuário adicione disciplinas disponíveis digitando seus nomes. Após isso, o programa entra em um loop infinito onde o usuário pode escolher diferentes opções:

  Adicionar Aluno: O usuário pode inserir o nome de um aluno e selecionar as disciplinas que esse aluno irá cursar.

  Remover Aluno: O usuário pode inserir o nome de um aluno para removê-lo da lista de alunos matriculados.

  Listar Alunos: O programa exibe uma lista de todos os alunos matriculados, juntamente com as disciplinas que cada um está cursando.

  Atualizar Disciplinas de Aluno: O usuário pode escolher um aluno específico e atualizar as disciplinas que ele está cursando, selecionando as novas disciplinas desejadas.

Essa estrutura permite uma interação simples e intuitiva com o sistema de gestão escolar, proporcionando ao usuário opções claras para gerenciar alunos e disciplinas
Quando o usuário escolhe a opção de atualizar as disciplinas de um aluno, o programa solicita o nome do aluno e, em seguida, permite que o usuário selecione as novas disciplinas que o aluno irá cursar. Essas disciplinas são então atualizadas para o aluno selecionado usando o método atualizarDisciplinasAluno da classe EscolaFacade.

No geral, o código é uma implementação simples de um sistema de gestão escolar que utiliza o padrão de design Facade para simplificar a interação do usuário e ocultar a complexidade do sistema subjacente.
