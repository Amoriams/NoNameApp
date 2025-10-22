package entities;

public class LoginSystem {

    private String nome;
    public String user;
    private final String  senha;

    public LoginSystem(String nome, String user, String senha){
        this.nome = nome;
        this.user = user;
        this.senha = senha;
    }

    public LoginSystem (String nome, String senha){
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(){
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }





}
