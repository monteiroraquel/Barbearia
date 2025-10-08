
package modelo;

import java.time.LocalTime;

public class Servico {
    private int id;
    private String descricao;
    private double valor;
    private LocalTime duracao;
    private Estacao estacao_necessaria;


    public Servico(String descricao, double valor, LocalTime duracao, Estacao estacao_necessaria) {
        this.descricao = descricao;
        this.valor = valor;
        this.duracao = duracao;
        this.estacao_necessaria = estacao_necessaria;
    }

    public int getId() {
        return id;
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

    public LocalTime getDuracao() {
        return duracao;
    }

    public void setDuracao(LocalTime duracao) {
        this.duracao = duracao;
    }

    public Estacao getEstacao_necessaria() {
        return estacao_necessaria;
    }

    public void setEstacao_necessaria(Estacao estacao_necessaria) {
        this.estacao_necessaria = estacao_necessaria;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                "\nDescrição: " + descricao +
                "\nValor: R$ " + valor +
                "\nTipo de estação: " + estacao_necessaria;
    }
}