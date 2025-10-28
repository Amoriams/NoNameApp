package application;
import java.util.Scanner;
import entities.Usuario;
import entities.LoginSystem;


public class Main {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        int resposta;
        String user, senha, nome;
        Usuario usuario1;
        Usuario login = new Usuario("admin", "123");

        do {
            System.out.println("-------- BEM-VINDO AO NONAME --------");
            System.out.println("1 - Entrar");
            System.out.println("2 - Cadastrar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            resposta = sc.nextInt();
            sc.nextLine();

            switch (resposta){
                case 1:

                    int tentativas = 3;
                    for (int i = 0; i < tentativas; i++){
                        System.out.println("====== Bem-Vindo de volta ======");
                        System.out.println("Digite suas informações de log-in");
                        System.out.print("User: ");
                        user = sc.nextLine();
                        System.out.print("Senha: ");
                        senha = sc.nextLine();


                        if (user.equals(login.getUserUsuario()) && senha.equals(login.getSenha())){
                            System.out.println("*ENTRA NO APP*");
                        } else {
                            tentativas--;
                            System.out.println("User ou senha incorreto. Tente novamente.");
                            System.out.println("Tentativas restantes: " + tentativas);
                        }

                    }
                    if (tentativas == 0){
                        System.out.println("Acesso bloqueado. Número de tentativas excedidos.");
                    }

                    break;

                case 2:
                    System.out.println("====== CADASTRO ======");
                    System.out.print("Digite seu nome: ");
                    nome = sc.nextLine();
                    System.out.print("Tem algum user em mente: ");
                    char cadastroUser = sc.next().charAt(0);
                    if (cadastroUser == 's' ){
                        System.out.print("Digite seu user: ");
                        String User = sc.nextLine();
                        sc.nextLine();
                        System.out.print("Digite sua senha: ");
                        senha = sc.nextLine();
                        usuario1 = new Usuario(nome, senha);
                    }else {
                        String randomName = RandomNameGenerator.generante();
                        System.out.print("Digite sua senha: ");
                        senha = sc.nextLine();
                        usuario1 = new Usuario(nome, senha);
                    }

                break;

                default:
                    System.out.println("Opção inválida. tente novamente!");
            }

        } while (resposta != 0 );
    }




}
