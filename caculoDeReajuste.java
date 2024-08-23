import java.util.Scanner;

public class caculoDeReajuste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        //quem ganha ate 1412 - reajuste de 12%
        //quem ganha ate 3000 - reajuste de 9%
        //quem ganha ate 5000 - reajuste de 5%
        //quem ganha mais de 5000 - sem reajuste

        if(salario <= 1412){
          salario = salario*0.12 + salario;
        } else if(salario <= 3000){
            salario = salario*0.09 + salario;
        } else if(salario <= 5000){
            salario = salario*0.05 + salario;
        }else{
             salario = salario
        }

        System.out.println("Novo salario: R$"+ salario);

    }
}
