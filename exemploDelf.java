import java.util.Scanner;

public class exemploDelf {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        int numeroInteiro = prompt.nextInt();

        if (numeroInteiro%2 == 0) {
            System.out.println("O numero "+numeroInteiro+" é um numero par");
        } else {
            System.out.println("O numero "+numeroInteiro+" é um numero impar");
        }

    }
}
