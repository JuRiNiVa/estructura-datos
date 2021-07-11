import java.util.Scanner;


public class Clase02 {
    public static void main(String[] args) throws Exception {
        //System.out.println(NumerodelaSuerte()); //Ejercicio1
        //System.out.println(Precio()); //Ejercicio2
        //System.out.println(NuevoN()); //Ejercicio3
        //System.out.println(hipotenusa()); //Ejercicio5
        //System.out.println(hipotenusa2()); //Ejercicio5
        //System.out.println(multiplo_10()); //Ejercicio6
        //System.out.println(EsMayuscula()); //Ejercicio7
        //System.out.println(division()); //Ejercicio8
        //System.out.println(Mayor()); //Ejercicio9

        System.out.println(Contador()); //Ejercicio17
    }

    // 1.Programa que pida por teclado la fecha de nacimiento de una persona (día, mes, año) y calcule su número de la suerte.El número de la suerte se calcula sumando el día, mes y año de la fecha de nacimiento y a continuación sumando las cifras obtenidas en la suma.
    //Por ejemplo:Si la fecha de nacimiento es 12/07/1980 Calculamos el número de la suerte así: 12+7+1980 = 1999  1+9+9+9 = 28Número de la suerte: 28

    public static String NumerodelaSuerte() {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("");
        System.out.println("*******************************************************************************************");
        System.out.println("*Este programa calcula el numero de suerte de una persona basado en su fecha de nacimiento*");
        System.out.println("*******************************************************************************************");
        System.out.println("");
        System.out.print("Por favor digite el dia de la fecha de nacimiento: ");
        int dia = sc.nextInt();
        System.out.print("Por favor digite el mes de la fecha de nacimiento: ");
        int mes = sc.nextInt();
        System.out.print("Por favor digite el año de la fecha de nacimiento: ");
        int año = sc.nextInt();
        sc.close();
        int suma = dia+mes+año;
        int num_suerte =0;
        while (suma !=0){
            num_suerte += suma % 10;
            suma /= 10;
        } 
        return "Su numero de la suerte es: " + num_suerte;
    }

    //2. Programa que calcule el precio de venta de un producto conociendo el precio por unidad (sin IVA) del producto, el número de productos vendidos y el porcentaje de IVA aplicado. Los datos anteriores se leerán por teclado.

    public static String Precio() {
        Scanner sc= new Scanner(System.in);
        System.out.println("");
        System.out.println("***************************************************************");
        System.out.println("*Este programa calcula el precio de venta total de un producto*");
        System.out.println("***************************************************************");
        System.out.println("");
        System.out.print("Por favor digite el precio por unidad del producto: ");
        int precio_unidad = sc.nextInt();
        System.out.print("Por favor digite la cantidad de productos vendidos: ");
        int cantidad_productos = sc.nextInt();
        System.out.print("Por favor digite el porcentaje de IVA aplicado (sin el signo %): ");
        double porcentaje_iva = sc.nextDouble()/100;
        sc.close();
        double precio_total = (precio_unidad + (precio_unidad * porcentaje_iva))*cantidad_productos;
        return "El precio de venta del producto es: " + precio_total;
    }

    //3. Programa que lea dos variables enteras N y m y le quite a N sus m últimas cifras. Por ejemplo, si N = 123456 y m = 2 el nuevo valor de N será 1234

    public static String NuevoN() {
        Scanner sc= new Scanner(System.in);
        System.out.println("");
        System.out.println("*********************************************************");
        System.out.println("*Este programa recorta un valor m de cifras del numero N*");
        System.out.println("*********************************************************");
        System.out.println("");
        System.out.print("Por favor digite el numero N: ");
        int N = sc.nextInt();
        System.out.print("Por favor digite el numero m: ");
        int m = sc.nextInt();
        sc.close();
        for (int i=1;i<=m;i++){
            N /= 10;
        } 
        return "El nuevo valor de N es: " + N;
    }

    //4.Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado

    public static String velocidad() {
        
        return "";
    }

    //5. Programa que lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud de la hipotenusa según el teorema de Pitágoras.

    public static String hipotenusa() {
        Scanner sc= new Scanner(System.in);
        System.out.println("");
        System.out.println("*****************************************************************************************************");
        System.out.println("*Este programa calcula la hipotenusa de un triangulo rectandulo basado en las medidas de sus catetos*");
        System.out.println("*****************************************************************************************************");
        System.out.println("");
        System.out.print("Por favor digite la medida del cateto 1: ");
        double cateto1 = sc.nextDouble();
        System.out.print("Por favor digite la medida del cateto2: ");
        double cateto2 = sc.nextDouble();
        sc.close();
        double hip = Math.sqrt(Math.pow(cateto1,2)+Math.pow(cateto2, 2));

        return "La hipotenusa del triangulo rectangulo de catetos " + cateto1 + " y " + cateto2 + " es: " + hip;
    }
    public static String hipotenusa2() {
        Scanner sc= new Scanner(System.in);
        System.out.println("");
        System.out.println("********************************************************************************************************************************");
        System.out.println("*Este programa calcula la hipotenusa de un triangulo rectandulo basado en las medidas de sus catetos mediante un metodo de java*");
        System.out.println("********************************************************************************************************************************");
        System.out.println("");
        System.out.print("Por favor digite la medida del cateto 1: ");
        double cateto1 = sc.nextDouble();
        System.out.print("Por favor digite la medida del cateto2: ");
        double cateto2 = sc.nextDouble();
        sc.close();
        double hip = Math.hypot(cateto1, cateto2);

        return "La hipotenusa del triangulo rectangulo de catetos " + cateto1 + " y " + cateto2 + " es: " + hip;
    }
    
    //6. Programa que lea un número entero y muestre si el número es múltiplo de 10

    public static String multiplo_10() {
        Scanner sc= new Scanner(System.in);
        System.out.println("");
        System.out.println("************************************************************************");
        System.out.println("*Este programa lee un numero entero y determina si es un multiplo de 10*");
        System.out.println("************************************************************************");
        System.out.println("");
        System.out.print("Por favor digite el numero entero que sera validado: ");
        int numero = sc.nextInt();
        String respuesta = numero % 10 == 0 ? "El numero es multiplo de 10" : "El numero no es multiplo de 10";
        sc.close();
        return respuesta;
    }

    //7. Programa que lea un carácter por teclado y compruebe si es una letra mayúscula

    public static String EsMayuscula() {
        Scanner sc= new Scanner(System.in);
        System.out.println("");
        System.out.println("***********************************************************************");
        System.out.println("*Este programa lee un caracacter y determina si es una letra mayuscula*");
        System.out.println("***********************************************************************");
        System.out.println("");
        System.out.print("Por favor digite una letra para ser validada: ");
        char letra = sc.next().charAt(0);
        String respuesta = Character.isUpperCase(letra)  ? "La letra es mayuscula" : "La letra no es mayuscula";
        sc.close();
        return respuesta;
    }

    //8. Programa que lea dos números por teclado y muestre el resultado de la división del primer número por el segundo Se debe comprobar que el divisor no puede ser cero

    public static String division() {
        Scanner sc= new Scanner(System.in);
        System.out.println("");
        System.out.println("******************************************************************************");
        System.out.println("*Este programa realiza la division del primer numero ingresado por el segundo*");
        System.out.println("******************************************************************************");
        System.out.println("");
        System.out.print("Por favor digite el numero que sera dividido: ");
        double dividendo = sc.nextDouble();
        System.out.print("Por favor digite el divisor (debe ser diferente de 0): ");
        double divisor = sc.nextDouble();
        sc.close();
        double resultado = dividendo/divisor;
        return "El resultado de la division es: "+ resultado;
    }

    //9. El programa lee por teclado tres números enteros y calcula y muestra el mayor de los tres //Jnieto: (usé la clase Math.max)

    public static String Mayor() {
        Scanner sc= new Scanner(System.in);
        System.out.println("");
        System.out.println("*****************************************************************");
        System.out.println("*Este programa lee 3 numeros enteros y calcula el mayor de los 3*");
        System.out.println("*****************************************************************");
        System.out.println("");

        System.out.println("Ingresa un numero");
        int num1 = sc.nextInt();
        System.out.println("Ingresa el segundo numero");
        int num2 = sc.nextInt();
        System.out.println("Ingresa el tercer numero");
        int num3 = sc.nextInt();
        sc.close();
        return "El mayor numero es "+Math.max(Math.max(num1,num2),Math.max(num2,num3));
    }

    //10. Programa que lea por teclado tres números enteros H, M, S correspondientes a hora, minutos y segundos respectivamente, y comprueba si la hora que indican es una hora válida



    //11.Programa que lea una variable entera mes y compruebe si el valor corresponde a un mes de 30 días, de 31 o de 28 Supondremos que febrero tiene 28 días Se mostrará además el nombre del mes Se debe comprobar que el valor introducido esté comprendido entre 1 y 12
    
    
    
    //12. Realizar programa que muestre los números del 1 al 100 que no sean múltiplos de 3 utilizando cada una las instrucciones repetitivas while do while for
    
    
    
    // 13. Programa que pase de pesos a dólares y viceversa.


    //14. Mostrar los N primeros términos de la serie de Fibonacci.


    //15. Leer un número N y calcular la suma de los factoriales de los números desde 0 hasta N. 
    
    
    /*16. Programa que muestre en líneas separadas lo siguiente:
        ZYWXVUTSRQPONMLKJIHGFEDCBA
        YWXVUTSRQPONMLKJIHGFEDCBA
        WXVUTSRQPONMLKJIHGFEDCBA
        ...
        DCBA
        CBA
        BA
        A*/


    //17. Mostrar un contador de 5 dígitos. En lugar del dígito 3 se debe mostrar E. 

    public static String Contador() {
        for (int i = 0; i <= 9; i++) { 
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {
                        for (int m = 0; m <= 9; m++) {
                             System.out.print(i != 3 ? i : "E");
                             System.out.print(j != 3 ? j : "E");
                             System.out.print(k != 3 ? k : "E");
                             System.out.print(l != 3 ? l : "E");
                             System.out.println(m != 3 ? m : "E");                                           
                        }
                    }
                }
            }
        }
    return "";
    }
}
