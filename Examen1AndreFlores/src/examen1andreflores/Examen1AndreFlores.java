package examen1andreflores;

import java.util.Scanner;

public class Examen1AndreFlores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opc;
        do {
            System.out.println(" Bienvenido al menu de mi examen");
            System.out.println("Ingrese una opcion. 1) Ejercicio de palabras. 2) Salir");
            opc = entrada.nextInt();
            if (opc == 1) {

                String cadenaResp = "";
                System.out.println("ingrese su primera cadena");
                entrada.nextLine();
                String cadenaOriginal = entrada.nextLine();
                System.out.println("ingrese la segunda cadena");
                String cadenaNueva = entrada.nextLine();
                palabras(cadenaOriginal, cadenaNueva, cadenaResp);

            }// fin if 
            else if (opc == 2) {
                System.out.println(" usted escogio la opcion 2) Salir, gracias por usar mi programa.");

            }

        } while (opc != 2);// fin while

    } //fin main

    public static String palabras(String cadenaOriginal, String cadenaNueva, String cadenaResp) {
        Scanner entrada = new Scanner(System.in);

        if (cadenaOriginal.equalsIgnoreCase(cadenaNueva)) {
            for (int i = 0; i < cadenaOriginal.length(); i++) {
                cadenaResp += cadenaOriginal.charAt(i);
            }
            for (int i = cadenaNueva.length() - 1; i >= 0; i--) {
                cadenaResp += cadenaNueva.charAt(i);
            }
            System.out.println(" la cadena nueva es: " + cadenaResp);
        } // fin if
        else if (!cadenaOriginal.equalsIgnoreCase(cadenaNueva) && cadenaOriginal.length() == cadenaNueva.length()) {
            if (cadenaOriginal.length() == cadenaNueva.length()) {
                for (int i = 0; i < cadenaOriginal.length(); i++) {

                    cadenaResp += cadenaOriginal.charAt(i);
                    cadenaResp += cadenaNueva.charAt(i);
                }
                System.out.println("la nueva cadena es: " + cadenaResp);
            } // fin if
            else {
                System.out.println("las cadenas no tienen la misma longitud.");
            }
        } // fin else if 
        else if (!cadenaOriginal.equalsIgnoreCase(cadenaNueva) && cadenaOriginal.length() != cadenaNueva.length()) {
            cadenaResp = cadenaOriginal + cadenaNueva;
            System.out.println("la nueva cadena es: " + cadenaResp);
        } // fin else if
        return cadenaResp;
    }

} // fin class 
