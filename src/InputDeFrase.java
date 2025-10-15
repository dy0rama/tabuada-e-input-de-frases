import java.util.Scanner;

public class InputDeFrase {
    static void main(){
        Scanner sc = new Scanner(System.in);

        int opcaoUsuario;

        do {
            System.out.println("Bem vindo ao nosso programa de input de frases. Caso deseje continuar, digite 1. Ou digite 2 para sair do programa: ");

            while (!sc.hasNextInt()){
                System.out.println("Somente números nesse campo - 1(continuar) ou 2(sair):");
                sc.next();
            }

            opcaoUsuario = sc.nextInt();

            if (opcaoUsuario == 1){
                Input();
            } else if (opcaoUsuario != 2) {
                System.out.println("Opção inválida.");
            }else {
                System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado.");
            }
        }while (opcaoUsuario != 2);
    }



    public static void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua frase:");
        String frase = sc.nextLine();
        System.out.println("Sua frase foi imprimida: " + frase);
    }
}
