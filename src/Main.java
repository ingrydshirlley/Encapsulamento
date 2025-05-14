//public: de qualquer outra classe.
//default: somente dentro do mesmo pacote (sem modificador)
//protected: dentro do mesmo pacote e por subclasses, mesmo que em pacotes diferentes

import br.fiap.loja.model.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("ingryd");
        System.out.println(cliente.getNome());
        cliente.exibirDados();
    }
}
