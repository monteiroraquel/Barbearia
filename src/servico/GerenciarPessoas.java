package servico;

import modelo.Cliente;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class GerenciarPessoas {



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
        scanner.nextLine();

        switch (opcao) {
            case 1:
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

                Cliente c = new Cliente(nome, cpf, telefone, email, endereco);


                JSONObject clienteJson = new JSONObject();
                clienteJson.put("id", c.gerarId());
                clienteJson.put("nome", c.getNome());
                clienteJson.put("cpf", c.getCpf());
                clienteJson.put("telefone", c.getTelefone());
                clienteJson.put("email", c.getEmail());
                clienteJson.put("endereco", c.getEndereco());

                JSONArray clientesArray;
                try {
                    String conteudo = new String(Files.readAllBytes(Paths.get("src/Repositório/Clientes.json")));
                    clientesArray = new JSONArray(conteudo); // pega os clientes já existentes
                } catch (IOException e) {
                    clientesArray = new JSONArray(); // arquivo não existe, cria novo
                }

// Adiciona o novo cliente
                clientesArray.put(clienteJson);

// Salva no arquivo
                try (FileWriter file = new FileWriter("src/Repositório/Clientes.json")) {
                    file.write(clientesArray.toString(4));
                } catch (IOException e) {
                    e.printStackTrace();
                }

                System.out.println("Cliente cadastrado com sucesso!");

                break;
            case 2:
                // criar Funcionário
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

    }



}


