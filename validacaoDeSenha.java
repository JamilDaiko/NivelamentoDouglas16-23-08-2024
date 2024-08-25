import java.util.Scanner;

public class validacaoDeSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final Integer senhaCorreta = 12345, quantidadeMaximaTentativas = 3;
        Integer senhaDigitada = 0, quantidadeTentativas = 0;

        do {
            System.out.println("Digite seu senha: ");
            senhaDigitada = sc.nextInt();
            if (!senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Senha incorreta!");
                quantidadeTentativas++;
            }

        } while (!senhaDigitada.equals(senhaCorreta) && quantidadeTentativas < quantidadeMaximaTentativas);

        if (quantidadeTentativas.equals(quantidadeMaximaTentativas)) {
            System.out.println("Sua conta esta bloqueada por errar mais de" + quantidadeMaximaTentativas + " tentativas");
        }else{
            System.out.println("senha correta");
        }
    }
}
