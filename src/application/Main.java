package application;
import java.util.Scanner;


public class Main {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        int resposta;


        do {
            System.out.println("-------- BEM-VINDO AO NONAME --------");
            System.out.println("1 - Entrar");
            System.out.println("2 - Cadastrar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            resposta = sc.nextInt();
            sc.nextLine();

            String randomName = RandomNameGenerator.generante();


        } while (resposta != 0 );
    }




}
