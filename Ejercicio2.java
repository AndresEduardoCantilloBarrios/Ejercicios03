public class Ejercicio2 {
    public static void main(String[] args) {
        //Ejercicio 2: ¿Ves algún error en el precio?
        //Pernil Iberic D'Engreix Llen, 100Gr = 5,95€
        //¿Es correcto afirmar que el precio por 1Kg = 29,75€?
        //1Kg = 1000Gr (100*10)

        var peso100gr  = 5.95;
        var peso1kg = peso100gr * 10;
        System.out.printf("Dado el precio del producto por 100gr: " + peso100gr + " El precio por 1kg es: " + peso1kg);

        //Dando la operacion como resultado 29,75€ se afirma que el precio que el vendedor da es incorrecto.
    }
}
