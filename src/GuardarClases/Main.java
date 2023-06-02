package GuardarClases;

import experimental.*;
import java.io.File;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Wea> weas =new ArrayList();
        Guardado guard = new Guardado();
        //llenar(weas);
        
        File archivo = new File("Weas.bin");
        if (archivo.exists()) {
            weas = (ArrayList<Wea>) guard.recuperarObjeto("Weas");
        }
        
        
        //guard.guardarObjeto("Weas", weas);
        
        weas.add(new Wea("hola"));
        guard.guardarObjeto("Weas", weas);
        weas = (ArrayList<Wea>) guard.recuperarObjeto("Weas");

        
        leer(weas);
    }
    public static void llenar(ArrayList<Wea> weas){
        
        for (int i = 0; i < 30; i++) {
            String eso = "Wea N° : " +(i) ;
            Wea wea = new Wea(eso);
            weas.add(wea);
        }
    }
    
    public static void leer(ArrayList<Wea> weas){
        weas.forEach(e -> {
            System.out.println(e);
        });
    }
    

}
