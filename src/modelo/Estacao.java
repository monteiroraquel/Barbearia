package modelo;


/**
 * Representa uma estação de atendimento da barbearia.
 * Cada estação pode ser usada para diferentes tipos de serviços,
 * como corte ou lavagem.
 */
public class Estacao {

        /**
         * Enum que define os tipos possíveis de estação.
         */
        public enum TipoEstacao {
            CORTE,
            LAVAGEM}// Tipos de estação

    private int id;            // Identificador da estação
    private TipoEstacao tipo;         // Tipo da estação
    private boolean disponivel;// Indica se a estação está ocupada
    private Servico servico_atual;

    public Estacao(TipoEstacao tipo, boolean disponivel, Servico servico_atual) {
        this.tipo = tipo;
        this.disponivel = true;
        this.servico_atual = null;
    }

    public int getId() {
        return id;
    }

    public TipoEstacao getTipo() {
        return tipo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public Servico getServico_atual() {
        return servico_atual;
    }

    /**
     * Define o serviço atualmente em execução nesta estação.
     * <p>
     * Quando um serviço é atribuído, a estação é automaticamente marcada
     * como ocupada (disponivel = false). Quando o serviço é removido
     * (ou seja, o valor passado é {@code null}), a estação volta a ser
     * considerada disponível (disponivel = true).
     *
     * @param servico_atual o serviço que está sendo executado nesta estação,
     *                     ou {@code null} se a estação estiver livre.
     */
    public void setServicoAtual(Servico servico_atual) {
        this.servico_atual = servico_atual;
        this.disponivel = (servico_atual == null);
    }

    @Override
    public String toString() {
        return  "\n===== Estação =====" +
                "\nID: " + id +
                "\nTipo: " + tipo +
                "\nDisponível: " + (disponivel ? "Sim" : "Não") +
                (servico_atual != null ?
                        "\nServiço Atual: " + servico_atual.getDescricao()
                         : "\nServiço Atual: Nenhum") +
               "\nDisponível: " + disponivel;
    }
}
