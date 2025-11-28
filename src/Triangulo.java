/***
 * Creamos la clase triangulo que extiende de figura
 */
public class Triangulo extends Figura{
    private int  baset;
    private int alturat;
    private int lado1;


    /***
     *
     * @param baset la base del triangulo.
     * @param alturat la altura del triangulo.
     * @param lado1 El lado que nos falta del triangulo para calcular el perimetro.
     *              Creamos el constructor de la clase triangulo.
     */
    public Triangulo(int baset, int alturat, int lado1) {
        this.baset = baset;
        this.alturat = alturat;
        this.lado1 = lado1;
        if (baset < 0 || alturat < 0 || lado1 < 0) {
            throw new IllegalArgumentException("La base y la altura no pueden ser un numero negativo");
        }

    }

    /***
     *
     * @return Creamos los getters y setters.
     */
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


    /***
     *
     * @return Creamos la clase calcularPerimetro para que la calcule sumando los ladois del triangulo.
     */
    @Override
    public double calcularPerimetro() {
        double perimetro = getBaset()+ getAlturat()+ getLado1();
        return perimetro;
    }
    /***
     *
     * @return Creamos la clase calculararea para que la calcule sumando base por altura entre 2.
     */
    @Override
    public double calcularArea() {
        double area = (getBaset()+getAlturat()/2);
        return area;
    }

    /***
     *
     * @return Creamos la clase toString() para mostrar la informacion.
     */
    @Override
    public String toString() {
        return "Triangulo{" +
                "baset=" + baset +
                ", alturat=" + alturat +
                ", lado1=" + lado1 +
                "Area=" + calcularArea() +
                ", Perimetro=" + calcularPerimetro() +
                '}';
    }
}
