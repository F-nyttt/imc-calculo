import java.util.Scanner;

public class IMCCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu peso (kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Informe sua altura (m): ");
        double height = scanner.nextDouble();

        double imc = weight / (height * height);
        System.out.println("O seu IMC é: " + imc);
    }
}