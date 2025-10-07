import servico.GerenciarPessoas;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciarPessoas gerenciador = new GerenciarPessoas();

        gerenciador.cadastrar(scanner); // chama o método de cadastro

        scanner.close();
    }
}
