import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1, num2;
        int opcion;

        System.out.println("=== CALCULADORA ===");

        System.out.print("Ingrese el primer numero: ");
        num1 = sc.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        num2 = sc.nextDouble();

        System.out.println("\nSeleccione la operacion:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.print("Opcion: ");
        opcion = sc.nextInt();

        switch(opcion){

            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;

            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;

            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;

            case 4:
                if(num2 != 0)
                    System.out.println("Resultado: " + (num1 / num2));
                else
                    System.out.println("No se puede dividir por cero");
                break;

            default:
                System.out.println("Opcion invalida");
        }

        sc.close();
    }
}
