package Abstract;

public abstract class Figura {
    private String color;
    private int numeroVertices;

    public Figura(String color, int numeroVertices) {
        this.color = color;
        this.numeroVertices = numeroVertices;
    }
    
    
    
    public double area(){
        return 0;
    }
    public double perimetro(){
        return 0;
    }
}
