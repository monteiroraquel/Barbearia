import modelo.Cliente; // importa sua classe Cliente


    public static void main(String[] args) { // método main correto
        Cliente c1 = new Cliente("Ana", "123.456.789-00", "99999-1111", "ana@email.com", "Rua A, 100");
        Cliente c2 = new Cliente("Bruno", "987.654.321-00", "98888-2222", "bruno@email.com", "Rua B, 200");

        System.out.println(c1.getId() + " - " + c1.getNome() + " - " + c1.getCpf());
        System.out.println(c2.getId() + " - " + c2.getNome() + " - " + c2.getCpf());

        // Alterando atributos
        c1.setTelefone("11111-2222");
        System.out.println(c1.getNome() + " - Novo telefone: " + c1.getTelefone());
    }

