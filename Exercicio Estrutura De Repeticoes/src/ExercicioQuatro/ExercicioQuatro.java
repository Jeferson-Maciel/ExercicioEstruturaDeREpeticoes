package ExercicioQuatro;
import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maiorDe18 = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();

            if (idade > 18) {
                maiorDe18++;
            }
        }

        System.out.println("Total de pessoas com idade maior que 18 anos: " + maiorDe18);
    }
}
