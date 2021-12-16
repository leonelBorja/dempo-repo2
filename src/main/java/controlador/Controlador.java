package controlador;

import modelo.Persona;
import vista.Vista;

public class Controlador {
    public static void main(String[] args) {

        Persona persona = new Persona();
        Vista vista = new Vista();
        persona.setNombreDeUsuario(vista.dato("Nombre y Apellido"));
        persona.setCelular(vista.dato("Celular"));
        persona.setEdad(vista.dato("Edad"));
        vista.mostrar(persona.getNombreDeUsuario(), persona.getCelular(), persona.getEdad());


    }
}
