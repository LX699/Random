package GuardarClases;

import experimental.*;
import java.io.Serializable;

public class Wea implements Serializable{
    private String nombre;

    public Wea(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        String info = "\n";
        info+= "nombre de la wea : " + this.nombre + "\n";
        
        return info;
    }
    
    
}
