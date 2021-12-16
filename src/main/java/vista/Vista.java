package vista;

import java.util.Scanner;

public class Vista {
    Scanner leer = new Scanner(System.in);

    public String dato(String palabra){
        System.out.println("Escriba su "+palabra);
        String dato = leer.nextLine();
        return dato;

    }

    public void mostrar(String nombre, String celular, String edad){
        System.out.println("Bienvenido señor(a) "+nombre+", es un placer para nosotros contar con una persona de "
                +edad+" años."+"\n"+ "Próximamente nos comunicaremos con usted al numero "+celular+".\n"+ "Feliz día");

    }
}
