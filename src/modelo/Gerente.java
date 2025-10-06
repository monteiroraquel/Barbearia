package modelo;

public class Gerente extends Funcionario {

    public Gerente() {
    }

    public String toString() {
        return "Gerente:\n" +
                "ID: " + id + "\n" +
                "Nome: " + nome + "\n" +
                "Telefone: " + telefone + "\n" +
                "Email: " + email + "\n" +
                "CPF: " + cpf + "\n" +
                "Endereço: " + endereco + "\n" +
                "Cargo: " + cargo + "\n" +
                "Salário: " + salario;
    }
}
