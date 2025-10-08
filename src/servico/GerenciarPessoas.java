    package servico;

    import modelo.Cliente;
    import modelo.Funcionario;
    import modelo.Gerente;
    import org.json.JSONArray;
    import org.json.JSONObject;
    import utils.JSONUtils;

    import java.util.List;
    import java.util.Scanner;


    public class GerenciarPessoas {

        private static final String CAMINHO_CLIENTES = "src/Repositorio/clientes.json";
        private static final String CAMINHO_FUNCIONARIOS = "src/Repositorio/Funcionarios.json";
        private static final String CAMINHO_GERENTE = "src/Repositorio/Gerente.json";

        // Listas para armazenar os dados das pessoas em memória
        private List<Cliente> clientes;
        private List<Funcionario> funcionarios;
        private List<Gerente> gerentes;

        /**
         * Construtor da classe GerenciarPessoas.
         *
         * Ao ser chamado, ele:
         * 1. Inicializa as listas de clientes, funcionários e gerentes.
         * 2. Lê os dados dos arquivos JSON correspondentes.
         */
        public GerenciarPessoas() {

            // Lê os arquivos JSON e carrega os dados (por enquanto, só lê)
            JSONArray dadosClientes = JSONUtils.lerArquivo(CAMINHO_CLIENTES);
            JSONArray dadosFuncionarios = JSONUtils.lerArquivo(CAMINHO_FUNCIONARIOS);
            JSONArray dadosGerente = JSONUtils.lerArquivo(CAMINHO_GERENTE);

        }


        /**
         * Gera um novo ID único com base nos dados já existentes no arquivo JSON.
         *
         * @param caminho Caminho do arquivo JSON (clientes, funcionários ou gerentes)
         * @return Um novo ID inteiro (último ID + 1)
         **/
        private int gerarId(String caminho) {
            // Lê os dados existentes do arquivo JSON
            JSONArray dados = JSONUtils.lerArquivo(caminho);

            int maiorId = 0;

            // Percorre todos os objetos do JSON para encontrar o maior ID já usado
            for (int i = 0; i < dados.length(); i++) {
                JSONObject obj = dados.getJSONObject(i);
                int idAtual = obj.getInt("id");

                if (idAtual > maiorId) {
                    maiorId = idAtual;
                }
            }

            // Retorna o próximo ID disponível
            return maiorId + 1;
        }


        /**
         * Cadastra uma nova pessoa (Cliente, Funcionário ou Gerente) e salva em seu
         * respectivo arquivo JSON.
         */
        public void cadastrar(Scanner scanner) {

            System.out.println(
                    "=====================================\n" +
                            "       CADASTRO DE PESSOAS           \n" +
                            "=====================================\n" +
                            "1 - Cliente\n" +
                            "2 - Funcionário\n" +
                            " 3 - Gerente\n" +
                            "-------------------------------------\n" +
                            "Digite sua opção: "
            );

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do Scanner

            JSONObject novaPessoa = new JSONObject();
            String caminhoArquivo = "";

            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o CPF: ");
            String cpf = scanner.nextLine();

            System.out.print("Digite o telefone: ");
            String telefone = scanner.nextLine();

            System.out.print("Digite o email: ");
            String email = scanner.nextLine();

            System.out.print("Digite o endereço: ");
            String endereco = scanner.nextLine();

            switch (opcao) {
                case 1:
                    // CLIENTE
                    caminhoArquivo = CAMINHO_CLIENTES;
                    novaPessoa.put("id", gerarId(caminhoArquivo));
                    novaPessoa.put("tipo", "Cliente");
                    break;

                case 2:
                    // FUNCIONÁRIO
                    caminhoArquivo = CAMINHO_FUNCIONARIOS;

                    System.out.print("Digite o cargo: ");
                    String cargo = scanner.nextLine();

                    System.out.print("Digite o salário: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Digite o login: ");
                    String login = scanner.nextLine();

                    System.out.print("Digite a senha (apenas números): ");
                    int senha = scanner.nextInt();
                    scanner.nextLine();

                    novaPessoa.put("id", gerarId(caminhoArquivo));
                    novaPessoa.put("tipo", "Funcionario");
                    novaPessoa.put("cargo", cargo);
                    novaPessoa.put("salario", salario);
                    novaPessoa.put("login", login);
                    novaPessoa.put("senha", senha);
                    break;
                case 3:
                    // GERENTE
                    caminhoArquivo = CAMINHO_GERENTE; // pode ser o mesmo arquivo, ou outro se preferir

                    System.out.print("Digite o cargo: ");
                    String cargoG = scanner.nextLine();

                    System.out.print("Digite o salário: ");
                    double salarioG = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Digite o login: ");
                    String loginG = scanner.nextLine();

                    System.out.print("Digite a senha (apenas números): ");
                    int senhaG = scanner.nextInt();
                    scanner.nextLine();

                    novaPessoa.put("id", gerarId(caminhoArquivo));
                    novaPessoa.put("tipo", "Gerente");
                    novaPessoa.put("cargo", cargoG);
                    novaPessoa.put("salario", salarioG);
                    novaPessoa.put("login", loginG);
                    novaPessoa.put("senha", senhaG);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    return;
            }
            // dados comuns a todos os tipos
            novaPessoa.put("nome", nome);
            novaPessoa.put("cpf", cpf);
            novaPessoa.put("telefone", telefone);
            novaPessoa.put("email", email);
            novaPessoa.put("endereco", endereco);

            // le o arquivo existente e adiciona o novo registro
            JSONArray pessoas = JSONUtils.lerArquivo(caminhoArquivo);
            pessoas.put(novaPessoa);

            // salva no arquivo
            JSONUtils.salvarArquivo(caminhoArquivo, pessoas);

            System.out.println("\n Pessoa cadastrada com sucesso!");

        }



    }


