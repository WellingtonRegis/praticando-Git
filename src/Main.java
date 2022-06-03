import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite seu nome :");
        String nome = sc.next();
        System.out.println("Digite sua idade :");
        int idade = sc.nextInt();
        System.out.println("Digite seu email :");
        String email = sc.next();

        System.out.println("Você digitou o nome: " + nome + " Sua idade é: " + idade + " Seu email é: " + email);
    }
}
