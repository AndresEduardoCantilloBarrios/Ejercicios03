import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        //Ejercicio 10: Media Aritmética

        var scanner = new Scanner(System.in);

        System.out.println("Vamos a ingresar los datos para calcular la media aritmetica");
        System.out.println("Ingrese el numero 1: ");
        var num1 = scanner.nextInt();
        System.out.println("Ingrese el numero 2: ");
        var num2 = scanner.nextInt();
        System.out.println("Ingrese el numero 3: ");
        var num3 = scanner.nextInt();
        
        var mediaAritmetica = ( num1 + num2 + num3 )/3;
        System.out.println("La media Aritmetica es: " + mediaAritmetica);

        scanner.close();

    }
}
