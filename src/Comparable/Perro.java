package Comparable;

public class Perro implements Comparable<Perro> {

    private String nombre;
    private int patitas;
    private int edad;

    @Override
    public boolean isIgual(Perro objeto) {
     
        return (this.edad==objeto.edad && this.patitas==objeto.patitas && this.nombre.equals(objeto.nombre));
    }

    @Override
    public String isMayor(Perro objeto) {
        return "n";
    }

    @Override
    public String isMenor(Perro objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

   