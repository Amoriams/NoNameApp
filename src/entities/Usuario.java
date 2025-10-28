package entities;

public class Usuario {
    private String userUsuario;
    private String senha;

    public Usuario(String nomeUsuario, String senha){
        this.userUsuario = nomeUsuario;
        this.senha = senha;
    }

    public String getUserUsuario() {
        return userUsuario;
    }
    public String getSenha (){
        return senha;
    }

    public void setUserUsuario(String userUsuario){
        this.userUsuario = userUsuario;
    }

    public void setSenha (String senha){
        this.senha = senha;
    }

}
