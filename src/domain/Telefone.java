package domain;

import java.util.ArrayList;
import java.util.List;

public class Telefone implements ITelefone {
    private List<Integer> contatos = new ArrayList<>();

    @Override
    public void ligar(int numero) {
        System.out.println("ligando para o numero: "+numero);
    }

    @Override
    public void adicionarContato(int numero) {
        System.out.println("adicionando a lista de contatos");
        this.contatos.add(numero);
    }
}
