
package modelo;

public class Cliente extends Pessoa{

    private static int contador = 1;

    public Cliente( String nome, String cpf, String telefone, String email, String endereco) {
        super( nome, cpf, telefone, email, endereco);
    }

    @Override
    protected int gerarId() {
        return contador++;
    }

    public String toString() {
        return  "\nId:" + getId() +
                "\nNome: " + getNome() +
                "\nCpf: " + getCpf() +
                "\nTelefone: " + getTelefone() +
                "\nEmail: " + getEmail() +
                "\nEndereco: " + getEndereco();
    }
}

