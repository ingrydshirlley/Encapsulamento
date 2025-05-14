package br.fiap.loja.model;

public class Cliente {
    //atributos
    protected String nome;
    protected String cpf;
    protected boolean ativo;

    //metodos
    public void exibirDados(){
        System.out.println(nome + " " + cpf + " " + formatarDado());
    }

    private String formatarDado() {
        if (ativo){
            return "Ativo";
        } else {
            return "Inativo";
        }
    }


    //metodos getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public boolean isAtivo() {
        return ativo;
    }
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
