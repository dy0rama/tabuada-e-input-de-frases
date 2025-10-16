import java.util.Scanner;

public class TabuadaExercicio {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo ao programa de tabuadas. Escolha a tabuada desejada (do 1 ao 10)");
        int tabuadaDesejada = sc.nextInt();
        int numeroDeMultiplicacoes = 0;
        int multiplicador = 0;
        int resultado;

        if (tabuadaDesejada >= 1 && tabuadaDesejada <= 10){
            System.out.println("Segue a tabuada do " + tabuadaDesejada + ":");
            while (multiplicador < 11){
                resultado = tabuadaDesejada * multiplicador;
                multiplicador++;
                System.out.println(tabuadaDesejada + " * " + numeroDeMultiplicacoes + " = " + resultado);
                numeroDeMultiplicacoes++;
            }
        }else {
            System.out.println("Somente tabuadas do 1 ao 10");
        }
        sc.close();
    }
}
