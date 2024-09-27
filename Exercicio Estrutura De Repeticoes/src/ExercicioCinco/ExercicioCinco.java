package ExercicioCinco;
import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("Números pares até " + numero + ":");
        for (int i = 0; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
