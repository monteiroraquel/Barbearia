package modelo;

public class Produto {
    private  int id;
    private String nome;
    private String descricao;
    private double preco_custo;
    private double preco_venda;
    private int quantidade_estoque;
    private boolean disponivel;

    public Produto(String nome, String descricao, double preco_custo, double preco_venda, int quantidade_estoque, boolean disponivel) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco_custo = preco_custo;
        this.preco_venda = preco_venda;
        this.quantidade_estoque = quantidade_estoque;
        this.disponivel = quantidade_estoque > 0;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco_custo() {
        return preco_custo;
    }

    public void setPreco_custo(double preco_custo) {
        this.preco_custo = preco_custo;
    }

    public double getPreco_venda() {
        return preco_venda;
    }

    public void setPreco_venda(double preco_venda) {
        this.preco_venda = preco_venda;
    }

    public int getQuantidade_estoque() {
        return quantidade_estoque;
    }

    public void setQuantidade_estoque(int quantidade_estoque) {
        this.quantidade_estoque = quantidade_estoque;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }


    // Metodo toString para exibir o produto formatado
    @Override
    public String toString() {
        return "Produto: " + nome +
            "\nID: " + id +
            "\nDescrição: " + descricao +
            "\nPreço de Custo: R$" + preco_custo +
            "\nPreço de Venda: R$" + preco_venda +
            "\nQuantidade em Estoque: " + quantidade_estoque +
            "\nDisponível: " + (disponivel ? "Sim" : "Não");
    }
}
