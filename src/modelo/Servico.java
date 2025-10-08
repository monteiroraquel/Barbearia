/**
package modelo;

public class Servico {
    protected int id;
    protected String descricao;
    protected double valor;

    public static Servico[] estacoes = {
            new Servico(1, "Estação 1 - Lavagem e Secador", 50.0),
            new Servico(2, "Estação 2 - Corte / Barba", 40.0),
            new Servico(3, "Estação 3 - Corte / Barba", 40.0)
    };

    public Servico(int id, String descricao, double valor) {
        this.id = id;
        this.descricao=descricao;
        this.valor=valor;
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public static void listarEstacoes() {
        System.out.println("Estações de Trabalho");
        for (Servico s : estacoes) {
            System.out.println("ID: " + s.getId() + " | " + s.getDescricao() + " | Valor: R$ " + s.getValor());
        }
}
**/