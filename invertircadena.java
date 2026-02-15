import java.util.Scanner;

public class invertircadena {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String texto;
        String invertido = "";

        System.out.print("Ingrese un texto: ");
        texto = sc.nextLine();

        for(int i = texto.length() - 1; i >= 0; i--){
            invertido += texto.charAt(i);
        }

        System.out.println("Texto invertido: " + invertido);

        sc.close();
    }
}
