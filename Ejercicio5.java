public class Ejercicio5 {
    public static void main(String[] args) {
        //Ejercicio 5: ¿Cuánto te ha costado el ordenador?

        var ordenador = 600;
        var descuento = ( ordenador * 10 ) / 100;
        var pagoTotal = ordenador - descuento;
        System.out.println("El precio total a pagar por el PC Gamer es: " + pagoTotal + " € ");
    }
}
