import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        //Ejercicio 7: Calculadora Básica
        
           var scanner = new Scanner(System.in);

        System.out.println("Ingrese valor 1" );
        var valor1 = scanner.nextInt();
        System.out.println("Ingrese valor 2" );
        var valor2 = scanner.nextInt();

        var multiplicar = valor1 * valor2;
        var sumar = valor1 + valor2;
        var restar = valor1 - valor2;
        var dividir = valor1 / valor2;
        System.out.println("la multiplicación de " + valor1 + " y " + valor2 +" es: " + multiplicar );
        System.out.println("la suma de " + valor1 + " y " + valor2 +" es: " + sumar );
        System.out.println("la resta de " + valor1 + " y " + valor2 +" es: " + restar );
        System.out.println("la división de " + valor1 + " y " + valor2 +" es: " + dividir );

        scanner.close();

    }
}
