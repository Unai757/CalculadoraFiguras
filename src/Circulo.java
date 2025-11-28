import java.util.Scanner;

/***
 * Creamos la clase figura que extiende de figura
 */
public class Circulo extends Figura{
private double radio;

    /***
     *
     * @param radio el radio del circulo
     */
    public Circulo(double radio) {
        this.radio = radio;
        /***
         * Con este if comprobamos que ningun numero este debajo del 0 para que no se pueda añadir numeros negativos
         */

        if (radio < 0) {
            throw new IllegalArgumentException("El radio no debe negativo");
        }

    }

    /***
     * Hacemos el constructor del circulo
     */

    Scanner scanner = new Scanner(System.in);
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    /***
     *
     *  Hacemos el metodo de calcularArea() haciendo la formula del perimetro que es (2*base)+(2*altura);
     */
    @Override
    public double calcularArea() {

        double area = getRadio()*Math.PI;
    return area;
    }
    /***
     *
     *  Hacemos el metodo de calcularPerimetro() haciendo la formula del perimetro que es 2*pi*radio
     */
    @Override
    public double calcularPerimetro() {

        double perimetro = 2*Math.PI*getRadio();
        return perimetro;
    }

    /***
     *
     * @return Hacemos este toString para que muestre la informacion bien y estructuralmente
     */
    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                "Area=" + calcularArea() +
                ", Perimetro=" + calcularPerimetro() +

                '}';

    }
}
