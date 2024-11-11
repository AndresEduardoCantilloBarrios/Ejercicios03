public class Ejercicio1 {

    public static void main(String[] args) {
        // Ejercicio 1: 6/2(1+2)

        var num1 = 6;
        var num2 = 2;
        var num3 = 1;

        var num4 = num1 / num2 * (num3+num2);
        System.out.println("Operacion: " + num1 + "/" + num2 + "(" + num3 + "+" + num2 + ")");
        System.out.printf("Resultado: %s", num4);

        //El resultado acertado de la operacion es 9
        //la calcualdora dio como resultado 1, debido a que multiplico 2 por el resultado del parentesis que es 3, dando como resultado 6, y dividio 6 en 6, el resultado es 1, recordando  que cuando hay operaciones con igual precedencia se realizan de izquierdaa derecha 
    }
}