import java.util.Scanner;

import javafx.scene.shape.Line;

public class ExamenFinal {
    public static void main(String[] args) {
        
       // Actividad 1

       System.out.println("Suma de un numero y su triple");
       Scanner Suma = new Scanner(System.in);
       int n1 = Suma.nextInt();
       int resultado = n1 + (n1*3);
       System.out.println("El resultado es: " + resultado);

       System.out.println("Doble de un numero menos cinco");
       Scanner Doble = new Scanner(System.in);
       Double n2 = Doble.nextDouble();
       Double Resultado = (n2*2)-5;
       System.out.println("El resultado es: " + Resultado);

       System.out.println("Mitad de un numero mas su cuadrado");
       Scanner Mitad = new Scanner(System.in);
       Double n3 = Mitad.nextDouble();
       Double resultadO = (n3/2)+(n3*n3);
       System.out.println("El resultado es: " + resultadO);

       System.out.println("Suma de un numero, su doble y su triple");
       Scanner Suma2 = new Scanner(System.in);
       int n4 = Suma2.nextInt();
       int resulTado = n4+(n4*2)+(n4*3);
       System.out.println("El resultado es: " + resulTado);
       
       //Actividad 2

       Scanner scanner = new Scanner(System.in);
       boolean salir = false;

       do{
        System.out.println("Ingresa una opcion");

       System.out.println("[1] Calcular promedio ");
       System.out.println("[2] Saludar por tu nombre ");
       System.out.println("[3] Di hola mundo ");
       System.out.println("[4] Salir ");

       int menu = scanner.nextInt();

       switch (menu) {
        case 1:
            System.out.println("Calcular el Promedio");
            System.out.println("Ingresa la cantidad de numeros a promediar");
            int cantidad = scanner.nextInt();
    
            double sumas = 0;
    
            for (int i = 1; i <= cantidad; i++) {
                System.out.print("Ingrese el número " + i + ": ");
                double numero = scanner.nextDouble();
                sumas = sumas + numero;
            }
    
            double promedio = sumas / cantidad;
    
            System.out.println("El promedio de los numeros ingresados es: " + promedio);

            break;

        case 2:
            System.out.println("Ingresa tu nombre");
            String nombre = scanner.next();
            System.out.println("Bienvenid@ " + nombre);
        break;

        case 3:
            System.out.println("Hola Mundo");
        break;

        case 4:
        System.out.println("Saliendo del programa...");
        salir = true;
        break;

        default:
        System.out.println("Opcion no valida");
            break;
       }
    } while (!salir);
        
    }
    
}