import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        //Ejercicio 9: Conversión de Temperaturas

        var scanner = new Scanner(System.in);

        System.out.println("Convertidor de temperaturas Celsius a Fahrenheit" );
        System.out.println("Ingrese la temperatura Celsius: " );
        var celsius1 = scanner.nextInt();
        var Fahrenheit1 = ( celsius1 * ( 9/5d )) + 32;
        System.out.println(" La formula es: Celsius * 9/5 + 32 ");
        System.out.println("El resultado es: " + Fahrenheit1);
        
        System.out.println("Convertidor de temperaturas Celsius a Kelvin" );
        System.out.println("Ingrese la temperatura Celsius: " );
        var celsius2 = scanner.nextInt();
        var Kelvin1 = celsius2 + 273.15;
        System.out.println(" La formula es: Celsius + 273.15 ");
        System.out.println("El resultado es: " + Kelvin1);



        scanner.close();
    }
}
