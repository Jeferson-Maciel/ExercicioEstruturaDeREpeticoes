package ExercicioDois;
import java.util.Random;
import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroRandom = random.nextInt(100) + 1;
        int tentativa;

        do {
            System.out.print("Digite um número: ");
            tentativa = scanner.nextInt();

            if (tentativa > numeroRandom) {
                System.out.println("MENOR");
            } else if (tentativa < numeroRandom) {
                System.out.println("MAIOR");
            }
        } while (tentativa != numeroRandom);

        System.out.println("Parabéns! Você acertou o número.");
    }
}
