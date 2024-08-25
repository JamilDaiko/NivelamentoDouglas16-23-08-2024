import java.util.Scanner;

// 1 Escreva um programa para ler valores ( valide para não aparecer
// valores iguais) e escreva o maior deles.

public class comparacaoMaiorNumeroEntre5Valores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer MaiorValor,maiorPosicao;

        System.out.println("Informe o primeiro numero: ");
        Integer num1 = sc.nextInt();
        MaiorValor = num1;
        maiorPosicao = 1;

        System.out.println("Informe o segundo numero: ");
        Integer num2 = sc.nextInt();
        if(num2 > MaiorValor){
            MaiorValor = num2;
            maiorPosicao = 2;
        }

        System.out.println("Informe o terceiro numero: ");
        Integer num3 = sc.nextInt();
        if(num3 > MaiorValor){
            MaiorValor = num3;
            maiorPosicao = 3;
        }
        System.out.println("informe o quarto numero: ");
        Integer num4 = sc.nextInt();
        if(num4 > MaiorValor){
            MaiorValor = num4;
            maiorPosicao = 4;
        }
        System.out.println("Informe o quinto numero: ");
        Integer num5 = sc.nextInt();
        if(num5 > MaiorValor){
            MaiorValor = num5;
            maiorPosicao = 5;
        }

        System.out.println("O maior valor informado foi: "+MaiorValor+" e a maior posição foi a"+maiorPosicao);


        }
    }

