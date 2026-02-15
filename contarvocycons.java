import java.util.Scanner;

public class contarvocycons {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palabra;
        int vocales = 0;
        int consonantes = 0;

        System.out.print("Ingrese una palabra en minusculas: ");
        palabra = sc.nextLine();

        for(int i = 0; i < palabra.length(); i++){

            char letra = palabra.charAt(i);

            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                vocales++;
            } else {
                consonantes++;
            }
        }

        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);

        sc.close();
    }
}

