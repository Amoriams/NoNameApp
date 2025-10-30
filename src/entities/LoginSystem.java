package entities;

public class LoginSystem {

    public String user;
    private String  senha;

    public LoginSystem( String user, String senha){

        this.user = user;
        this.senha = senha;
    }
    public String getUser() {
        return user;
    }
    public void setUser (String novoUser){
        this.user = novoUser;
    }


    public String getSenha() {
        return senha;
    }
    public void setSenha (String novaSenha){
        this.senha = novaSenha;
    }



    public String toString(){
        return "OLÁ, " + user + " SEJA BEM-VINDO AO APP NONAME";
    }

/*
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
    */





}
