import java.util.Scanner;

public class Clase01 {
    public static void main(String[] args) throws Exception {
            // Ejercicio1: Implemente un algoritmo que dado un nombre en una variable de tipo cadena, imprima un saludo en consola.

            String nombre = "Cesar Diaz";
            String resultado = saludo(nombre);
            System.out.println(resultado);

            //Ejercicio2: Implemente en un algoritmo que reciba un numero por teclado y cuente cuantas cifras (o digitos) contiene e imprima el mensaje en consola.
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Por favor digite un numero para saber cuantas cifras tiene: ");
            int numero = sc.nextInt();
            int digitos = numeroDigitos(numero);
            System.out.println("El numero tiene " + digitos + " cifras");
            
            //Ejercicio3: Escribe un programa Java que lee un número entero por teclado y obtiene y muestra por pantalla el doble y el triple de ese número

            System.out.println("Por favor digite un numero para saber el doble y el triple de ese numero: ");
            int numero2 = sc.nextInt();
            int x2 = Doble(numero2);
            int x3 = Triple(numero2);
            System.out.println("El doble del numero es: " + x2);
            System.out.println("El triple del numero es: " + x3);
            
            //Ejercicio4: Escribe un programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit La fórmula es F = 32+( 9 * C / 5)

            System.out.println("Por favor digite los grados centigrados para convertirlos en grados Fahrenheit: ");
            int centigrados = sc.nextInt();
            System.out.println(centigrados + " grados centigrados equivalen a " + convertir(centigrados) + " grados Fahrenheit");

            //Ejercicio5: Escribe un programa java que lea una variable de tipo entero y asígnale un valor. A continuación muestra un mensaje indicando si la variable es par o impar Utiliza el operador condicional para resolverlo Ej 14 es par o 15 es impar

            int validarparoimpar = 14;
            System.out.println("El numero "+ validarparoimpar + " es " + esPar_Impar(validarparoimpar));
            validarparoimpar = 15;
            System.out.println("El numero "+ validarparoimpar + " es " + esPar_Impar(validarparoimpar));
            sc.close();
            
    }
    
    public static String saludo(String nombre) {
        return "Hola " + nombre + "!";
    }

    public static int numeroDigitos ( int numero) {
        int cifras =0;
        while (numero !=0) {
            numero /=10;
            cifras++;
        }
        return cifras;
    }

    public static int Doble (int numero2) {
        int doble = numero2*2;
        return doble;
    }

    public static int Triple (int numero2) {
        int triple = numero2 *3;
        return triple;
    }
    
    public static int convertir(int centigrados) {
        int Fahrenheit = 32 + (9*centigrados/5);
        return Fahrenheit;
    }
    public static String esPar_Impar (int validarparoimpar) {
        String paroimpar = validarparoimpar % 2 ==0 ? "par" : "impar";
        return paroimpar;
    }
}