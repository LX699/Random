package Abstract;

public class Circulo extends Figura {

    private int radio;
    private int diametro;

    public Circulo(int radio, int diametro, String color, int numeroVertices) {
        super(color, numeroVertices);
        this.radio = radio;
        this.diametro = diametro;
    }

    @Override
    public double area() {
        return 2 * Math.PI * this.radio;
    }

    @Override
    public double perimetro() {
        return Math.PI* (Math.pow(radio,2));
    }

}
