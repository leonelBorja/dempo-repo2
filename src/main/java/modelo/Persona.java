package modelo;

public class Persona {
    private String nombreDeUsuario, celular, edad ;

    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombreDeUsuario='" + nombreDeUsuario + '\'' +
                ", celular='" + celular + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }
}
