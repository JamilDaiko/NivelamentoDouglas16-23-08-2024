import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe as horas : ");
        int horas = sc.nextInt();
        System.out.println("Informe as minutos: ");
        int minutos = sc.nextInt();
        System.out.println("Informe as segundos: ");
        int segundos = sc.nextInt();

        int resultado;
        horas= horas*60*60;
        minutos= minutos*60;
        resultado= horas+minutos+segundos;

        System.out.println("Segundos: " +resultado);
    }
}
