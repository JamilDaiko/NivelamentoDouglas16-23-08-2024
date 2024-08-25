import javax.swing.*;
import java.util.Scanner;

public class comparacaoMaiorNumeroEntre5ValoresComArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final Integer quantidade = 5;
        Integer numeros[] = new  Integer[quantidade];
        Integer maiorValor = 0, maiorPosicao = 0;

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Informe o "+(i+1)+" valor:");
            numeros[i] = sc.nextInt();

            if (numeros[i] == 0) {
                maiorValor = numeros[i];
                maiorPosicao = i+1;
            }else if (numeros[i] > maiorValor) {
                maiorValor = numeros[i];
                maiorPosicao = i+1;
            }
        }
        System.out.print("\nOs valores recebidos foram:");
        for (int i = 0; i < quantidade; i++) {
            System.out.print((i+1)+ " Posiçao ="+numeros[i]);
        }

        System.out.println("\nO maior valor é "+maiorValor+"é");

    }
}
