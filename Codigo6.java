import java.util.Scanner; // importar scanner

public class Codigo6 {

    public static void main(String[] args) { // agregar main
        int[] n = new int[20]; // inicio arreglo, corregir

        for (int i=0; i<20; i++) { // completar la actualizacion para la incrementacion al hacer la iteracion
            n[i] = (int)(Math.random()*381) + 20; // obtener numero random
            System.out.print(n[i] + " "); // completar la funcion de impresion de numero
        } // for

        System.out.println("\n¿Qué números quiere resaltar?"); // completar la funcion de impresion
        System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
        Scanner scanner = new Scanner(System.in); // agregar scanner
        int opcion = Integer.parseInt(scanner.nextLine()); 

        int multiplo = (opcion == 1) ? 5 : 7; // corregir operador ternario

        for (int e : n) {
            if (e % multiplo == 0) {
                System.out.print("[" + e + "] "); // imprimir numero con resalte
            } else {
                System.out.print(e + " "); // imprimir numero
            } // for else
        } // for each
        
        scanner.close(); // cerrar scanner
    } // main
} // class Codigo6