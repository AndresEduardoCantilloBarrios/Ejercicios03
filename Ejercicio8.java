import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        // Ejercicio 8: Área y Perímetro de un Rectángulo

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del rectángulo: ");
        double longitud = scanner.nextDouble();
        System.out.print("Ingrese el ancho del rectángulo: ");
        double ancho = scanner.nextDouble();

        // Calcular el área y el perímetro
        double area = longitud * ancho;
        double perimetro = 2 * (longitud + ancho);

        System.out.printf("El área del rectángulo es: %s ", area);
        System.out.printf("El perímetro del rectángulo es: %s ", perimetro);
    }
}
