package modelo;

public class Funcionario extends Pessoa{

    protected String cargo;
    protected double salario;
    protected String login;
    protected int senha;
    private static int contador = 1;



    public Funcionario(String cargo, double salario, String login, int senha, int id, String nome, String cpf, String telefone, String email, String endereco) {
        super( nome, cpf, telefone, email, endereco);
        this.cargo = cargo;
        this.salario = salario;
        this.login = login;
        this.senha = senha;
    }

    @Override
    protected int gerarId() {
        return contador++;
    }

    public int getId(){ return id; }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }


    public String toString() {
        return "Funcionario:\n" +
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
