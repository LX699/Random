package Abstract;

public class Triangulo extends Figura{
    private String tipo;
    private double base;
    private double altura;
    private double lado1;
    private double lado2;

    public Triangulo(String tipo, double base, double altura, double lado1, double lado2, String color, int numeroVertices) {
        super(color, numeroVertices);
        this.tipo = tipo;
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    



    @Override
    public double area() {
        return this.base+this.lado1+this.lado2;
    }

    @Override
    public double perimetro() {
        return (this.base*this.altura)/2;
    }
    
    
    
}
