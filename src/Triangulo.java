public class Triangulo extends Figura{
    private int  baset;
    private int alturat;
    private int lado1;



    public Triangulo(int baset, int alturat, int lado1) {
        this.baset = baset;
        this.alturat = alturat;
        this.lado1 = lado1;

    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }


    public int getBaset() {
        return baset;
    }

    public void setBaset(int baset) {
        this.baset = baset;
    }

    public int getAlturat() {
        return alturat;
    }

    public void setAlturat(int alturat) {
        this.alturat = alturat;
    }



    @Override
    public double calcularPerimetro() {
        double perimetro = getBaset()+ getAlturat()+ getLado1();
        return perimetro;
    }

    @Override
    public double calcularArea() {
        double area = (getBaset()+getAlturat()/2);
        return area;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "baset=" + baset +
                ", alturat=" + alturat +
                ", lado1=" + lado1 +
                '}';
    }
}
