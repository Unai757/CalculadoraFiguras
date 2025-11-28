import java.util.Scanner;

public class Circulo extends Figura{
private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    Scanner scanner = new Scanner(System.in);
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {

        double area = getRadio()*Math.PI;
    return area;
    }

    @Override
    public double calcularPerimetro() {

        double perimetro = getRadio()*getRadio();
        return perimetro;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }
}
